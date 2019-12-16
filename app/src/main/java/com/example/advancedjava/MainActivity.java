package com.example.advancedjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logCatButton = (Button) findViewById(R.id.logCatButton);
        logCatButton.setOnClickListener(this);

        Button toastButton = (Button) findViewById(R.id.toastButton);
        toastButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == R.id.logCatButton)
        {
            Log.i("INFO RIGHT HERE", "Hi, I'm in NHS,\n Model UN,\n Engineering Society,\n CSHS.");
        }
        else if(view.getId() == R.id.toastButton)
        {
            Toast.makeText(MainActivity.this, "I am President of Model UN", Toast.LENGTH_LONG).show();
        }

    }
}
