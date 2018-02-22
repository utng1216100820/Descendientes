package mx.edu.utng.dloza.descendientes;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.support.v4.util.Pair;
import android.support.v7.widget.Toolbar;
import android.view.Menu;



public class Galeria extends  AppCompatActivity implements AdapterView.OnItemClickListener {
private GridView gridView;
private AdaptadorImage adaptador;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        usarToolbar();

        gridView =  findViewById(R.id.grid);
        adaptador = new AdaptadorImage(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
        }

private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
        }

@Override
public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
        return true;
        }

        return super.onOptionsItemSelected(item);
        }

@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Image item = (Image) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, ActivityDetalle.class);
        intent.putExtra(ActivityDetalle.EXTRA_PARAM_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

        ActivityOptionsCompat activityOptions =
        ActivityOptionsCompat.makeSceneTransitionAnimation(
        this,
        new Pair<View, String>(view.findViewById(R.id.imagen_coche),
        ActivityDetalle.VIEW_NAME_HEADER_IMAGE)
        );

        ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
        startActivity(intent);
        }
}
