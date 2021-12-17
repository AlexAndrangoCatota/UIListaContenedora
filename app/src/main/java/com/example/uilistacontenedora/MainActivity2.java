package com.example.uilistacontenedora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.uilistacontenedora.model.adaptadorNoticias;
import com.example.uilistacontenedora.model.noticias;

public class MainActivity2 extends AppCompatActivity {

    public noticias[] noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        noticias = new noticias[]{
        new noticias("Noticia 1", "SubNoticia Contenido  Contenido Contenido Contenido  1"),
        new noticias("Noticia 2", "SubNoticia Contenido  Contenido Contenido Contenido  2"),
        new noticias("Noticia 3", "SubNoticia Contenido  Contenido Contenido Contenido  3"),
        new noticias("Noticia 4", "SubNoticia Contenido  Contenido Contenido Contenido  4")};

        adaptadorNoticias adaptadornoticias = new adaptadorNoticias(this, noticias);
        ListView lstOpciones = (ListView)findViewById(R.id.lstListaNoticias);
        lstOpciones.setAdapter(adaptadornoticias);


    }
}