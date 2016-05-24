package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton2,boton3;
    EditText caja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz1);

        boton2 = (Button)this.findViewById(R.id.boton2);
      //  boton2.setOnClickListener(this);
        boton3 = (Button)this.findViewById(R.id.boton3);
        /*
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
*/
        caja = (EditText)this.findViewById(R.id.caja1);

        caja.setText("Prueba");
        int x = 8;
        x = x + 1;
        Log.v("mensaje ", ""+x);
    }
    void metodo1(View v){
        /*
        Log.v("mensaje","Botón presionado");
        Toast toast;
        toast = Toast.makeText(this,"Mensaje...",Toast.LENGTH_LONG);
        toast.show();
        */
        if(v==boton2){
            Toast toast;
            toast = Toast.makeText(this,"Boton2...",Toast.LENGTH_LONG);
            toast.show();
        }
        if(v==boton3)
        {
            Toast toast;
            toast = Toast.makeText(this,"Boton3...",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public void onClick(View v) {
        Log.v("mensaje","Botón presionado 2");
    }
}
