package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Log.d("msg", "Méthode onCreate (Display Message Activity) activée");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.emailUtilisateur);
        textView.setText(message);

        System.out.println(message+" connecté");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "Méthode onDestroy (Display Message Activity) activée");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "Méthode onPause (Display Message Activity) activée.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "Méthode onStop (Display Message Activity) activée");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "Méthode onResume (Display Message Activity) activée");
    }
}
