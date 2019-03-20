package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saberi(View v)
    {
        TextView b1 = (TextView) findViewById(R.id.broj1);
        TextView b2 = (TextView) findViewById(R.id.broj2);

        double br1 = 0, br2 = 0;


        try
       {
           br1 = Double.parseDouble(b1.getText().toString());
           br2 = Double.parseDouble(b2.getText().toString());

           ((TextView)findViewById(R.id.rezultat)).setText(String.valueOf(br1+br2));

        } catch (NumberFormatException e)
        {
            Toast.makeText(this, "Unesite oba broja!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
