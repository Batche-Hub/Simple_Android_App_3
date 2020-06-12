package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplication2.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("msg", "Méthode onCreate (Main Activity) activée");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "Méthode onDestroy (Main Activity) activée");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "Méthode onPause (Main Activity) activée.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "Méthode onStop (Main Activity) activée");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "Méthode onResume (Main Activity) activée");
    }


    public void sendMessage(View view){
        Intent intent =  new Intent(this, DisplayMessageActivity.class);
        EditText emailText = (EditText) findViewById(R.id.email);
        String message = emailText.getText().toString();

        System.out.println(message);

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Log.d("msg", "Méthode sendMessage() (Main Activity) activée");
    }

    public void deleteFieldsConnexion(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText emailText = (EditText) findViewById(R.id.email);
        emailText.setText("");

        EditText passwordText = (EditText) findViewById(R.id.motDePasse);
        passwordText.setText("");

        Log.d("msg", "Méthode deleteFieldsConnexion() (Main Activity) activée");
    }

}
