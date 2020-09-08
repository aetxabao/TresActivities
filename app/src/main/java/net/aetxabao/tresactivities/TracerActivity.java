package net.aetxabao.tresactivities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TracerActivity extends AppCompatActivity {

    String msg = "Traza";

    /* Cuando se crea la primera vez*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(msg, "Create");
    }

    /* Cuando se va a hacer visible*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "Start");
    }

    /* Cuando ya es visible*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "Resume");
    }

    /* Cuando otra actividad toma el foco*/
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "Pause");
    }

    /* Cuando la actividad deja de ser visible*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "Stop");
    }

    /* Justo antes de ser destruida*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "Destroy");
    }

}
