package algonquin.cst2335.boud0164;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview);
        Button mybutton = findViewById(R.id.mybutton);
        EditText myedit = findViewById(R.id.myedittext);
        String editString = myedit.getText().toString();
        myedit.setText("Your edit text has: " + editString);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myedit.setText("Your edit text has: " + editString);
            }
        });

        CheckBox checkBox = findViewById(R.id.check);


        RadioButton radioButton = findViewById(R.id.radio);
        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(( button, onOrOff) -> {
            radioButton.setChecked(onOrOff);
        });

        checkBox.setOnCheckedChangeListener(( b, c) -> {
           if (c)
               radioButton.setChecked(true);
           else
               radioButton.setChecked(false);
        });


    }
}