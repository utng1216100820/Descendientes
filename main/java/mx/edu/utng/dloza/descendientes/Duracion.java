package mx.edu.utng.dloza.descendientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Duracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duracion);
    }
    public void formularioDuracion(View view) {
        startActivity(new Intent(this, FormularioDuracion.class));
        //finish();
    }
}
