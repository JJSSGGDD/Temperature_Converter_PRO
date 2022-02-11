package com.example.temperatureconverterpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText celsius, fahrenheit, kelvin, rankine, reaumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsius = (EditText) findViewById(R.id.txt_celsius);
        fahrenheit = (EditText) findViewById(R.id.txt_fahrenheit);
        kelvin = (EditText) findViewById(R.id.txt_kelvin);
        rankine = (EditText) findViewById(R.id.txt_rankine);
        reaumur = (EditText) findViewById(R.id.txt_reaumur);
    }
     public void calcular(View view) {

         String celsius_string = celsius.getText().toString();
         String fahrenheit_string = fahrenheit.getText().toString();
         String kelvin_string = kelvin.getText().toString();
         String rankine_string = rankine.getText().toString();
         String reaumur_string = reaumur.getText().toString();

         if (TextUtils.isEmpty(celsius_string) || TextUtils.isEmpty(fahrenheit_string) || TextUtils.isEmpty(kelvin_string) || TextUtils.isEmpty(rankine_string) || TextUtils.isEmpty(reaumur_string){

         } else {

             if (!TextUtils.isEmpty(celsius_string)) {

                 double celsius_double = Double.parseDouble(celsius.getText().toString());

                 double resultado_fahrenheit = ((celsius_double * (1.8)) + 32);
                 fahrenheit.setText(String.format("%.2f", resultado_fahrenheit));

                 double resultado_fahrenheit = ((celsius_double * (1.8)) + 32);
                 fahrenheit.setText(String.format("%.2f", resultado_fahrenheit));

                 double resultado_fahrenheit = ((celsius_double * (1.8)) + 32);
                 fahrenheit.setText(String.format("%.2f", resultado_fahrenheit));

                 double resultado_fahrenheit = ((celsius_double * (1.8)) + 32);
                 fahrenheit.setText(String.format("%.2f", resultado_fahrenheit));
             }
         }
     }

    public void borrar(View view){

        celsius.setText("");
        fahrenheit.setText("");
        kelvin.setText("");
        rankine.setText("");
        reaumur.setText("");

        Toast.makeText(this, "Deleted data", Toast.LENGTH_SHORT).show();
    }
}


