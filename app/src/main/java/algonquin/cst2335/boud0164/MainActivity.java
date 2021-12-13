package algonquin.cst2335.boud0164;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w( TAG, "In onCreate() - Loading Widgets" );
        Button loginButton = findViewById(R.id.button);
        EditText emailEditText = findViewById(R.id.EmailAddress);

        SharedPreferences prefs = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String email =  prefs.getString("email", "");
        emailEditText.setText(email);

        loginButton.setOnClickListener( clk-> {

            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("email", emailEditText.getText().toString());
            editor.apply();

            Intent nextPage = new Intent( MainActivity.this, SecondActivity.class);
            nextPage.putExtra( "EmailAddress", emailEditText.getText().toString() );
            startActivity( nextPage);
        } );
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.w( TAG, "In onStart() - The application is now visible on screen" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( TAG, "In onResume() - The application is now responding to user input" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( TAG, "In onPause() - The application no longer responds to user input" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( TAG, "In onStop() - The application is no longer visibl" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( TAG, "In onDestroy() - Any memory used by the application is freed" );
    }
}
