package mx.edu.utng.dloza.descendientes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void audioguia(View view) {
        startActivity(new Intent(this, AudioGuia.class));
        //finish();
    }
    public void comentarios(View view) {
        startActivity(new Intent(this, Comentarios.class));
        //finish();
    }
    public void costoboletos(View view) {
        startActivity(new Intent(this, CostoBoletos.class));
        //finish();
    }
    public void duracion(View view) {
        startActivity(new Intent(this, Duracion.class));
        //finish();
    }
    public void galeria(View view) {
        startActivity(new Intent(this, Galeria.class));
        //finish();
    }
    public void lenguajes(View view) {
        startActivity(new Intent(this, Lenguages.class));
        //finish();
    }
}
