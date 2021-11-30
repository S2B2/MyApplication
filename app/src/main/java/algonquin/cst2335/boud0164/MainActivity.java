package algonquin.cst2335.boud0164;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview);
        Button mybutton = findViewById(R.id.mybutton);
        EditText myedit = findViewById(R.id.myedittext);
        CheckBox checkBox = findViewById(R.id.check);
        RadioButton radioButton = findViewById(R.id.radio);
        Switch sw = findViewById(R.id.switch1);
        ImageView myimage = findViewById( R.id.myimage);
        ImageButton ib = findViewById(R.id.button3);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editString = myedit.getText().toString();
                mybutton.setOnClickListener(vw -> {
                    mytext.setText("Your edit text has: " + myedit.getText());
                });
            }
        });
        sw.setOnCheckedChangeListener((b, c) -> {
            Context context = getApplicationContext();
            CharSequence text = "You clicked on the Switch and it is now:" + c;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        });

        checkBox.setOnCheckedChangeListener((b, c) -> {
            Context context = getApplicationContext();
            CharSequence text = "You clicked on the Checkbox and it is now:" + c;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        });

        radioButton.setOnCheckedChangeListener((b, c) -> {
            Context context = getApplicationContext();
            CharSequence text = "You clicked on the Radiobutton and it is now:" + c;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


        });
        ib.setOnClickListener( (vw) -> {
            int width = vw.getWidth();

            int height = vw.getHeight();

            Context context = getApplicationContext();
            CharSequence text = "The width = " + width + " and height = " + height ;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        });


    }
}