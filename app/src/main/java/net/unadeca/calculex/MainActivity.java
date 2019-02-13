package net.unadeca.calculex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;
    Button but1, but2, but3, but4, but5;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vaiables definidas de la parte de arriba y asociamos elemento

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        resultado = findViewById(R.id.resultado);


        //crear evento "click"
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num1.setText("");
            num2.setText("");
            resultado.setText("");
            }
        });


       ;

        }

    @Override
    public void onClick(View v) {

        //pasar de texto a entero
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);



        int rpsta=0;


        switch (v.getId()){
            case R.id.but1:
                rpsta=entero1+entero2;
                break;

                case R.id.but2:
                    rpsta=entero1-entero2;
                    break;

            case R.id.but3:
                rpsta=entero1*entero2;
                break;

            case R.id.but4:
                rpsta=entero1/entero2;
                break;



            }



            //concanetacion de la respuesta de arriba pasando de entero a pantalla
            resultado.setText(""+rpsta);
        }

    }


