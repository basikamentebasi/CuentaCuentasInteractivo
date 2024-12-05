package com.cursodam.cuentacuentasinteractivo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cursodam.cuentacuentasinteractivo.adapter.CuentoAdapter;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.LaAventuraDeTobyElConejo;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.RicitosDeOro;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.AventuraDeLila;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.LaBusquedaDeMielDeBruno;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridViewCuentos);

        // Simula una lista de cuentos
        List<Cuento> cuentos = new ArrayList<>();
        cuentos.add(new RicitosDeOro());
        cuentos.add(new LaAventuraDeTobyElConejo());
        cuentos.add(new AventuraDeLila());
        cuentos.add(new LaBusquedaDeMielDeBruno()); // Añade más cuentos según necesites

        CuentoAdapter adapter = new CuentoAdapter(this, cuentos);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id) -> {
            Cuento cuento = cuentos.get(position);
            Intent intent = new Intent(MainActivity.this, CuentoActivity.class);
            intent.putExtra("cuentoId", cuento.getId());
            startActivity(intent);
        });
    }
}