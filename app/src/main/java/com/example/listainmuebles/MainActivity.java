package com.example.listainmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        generarVista();
    }

    public void cargarDatos(){

        lista.add(new Inmueble(R.drawable.casa,"El Volcán",120000));
        lista.add(new Inmueble(R.drawable.departamento,"San Luis",95000));
        lista.add(new Inmueble(R.drawable.departamento2,"La Punta",78000));

    }

    public void generarVista(){

        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv=findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }
}
