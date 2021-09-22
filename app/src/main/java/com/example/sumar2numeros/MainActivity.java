package com.example.sumar2numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //capturamos

        Button btn_sumar = findViewById(R.id.btn_sumar);
        TextView txtresultado = findViewById(R.id.txtResultado);
        EditText n1 = findViewById(R.id.n1);
        EditText n2 = findViewById(R.id.n2);

        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());

                int suma=nu1+nu2;
                txtresultado.setText("La suma de "+nu1+" + "+n2+" es : "+suma);
            }
        });
    }
}