package com.cursodam.cuentacuentasinteractivo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.cursodam.cuentacuentasinteractivo.adapter.EscenaAdapter;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.RicitosDeOro;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import com.cursodam.cuentacuentasinteractivo.modelo.historias.LaAventuraDeTobyElConejo;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.AventuraDeLila;
import com.cursodam.cuentacuentasinteractivo.modelo.historias.LaBusquedaDeMielDeBruno;



public class CuentoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuento);

        ImageView imageCuento = findViewById(R.id.imageCuento);
        TextView tituloCuento = findViewById(R.id.textTitulo);
        TextView sinopsisCuento = findViewById(R.id.textSinopsis);
        ListView listViewEscenas = findViewById(R.id.listViewEscenas);
        Button btnIniciar = findViewById(R.id.btnIniciar);

        // Lista de cuentos
        List<Cuento> cuentos = new ArrayList<>();
        cuentos.add(new RicitosDeOro());
        cuentos.add(new LaAventuraDeTobyElConejo());
        cuentos.add(new AventuraDeLila());
        cuentos.add(new LaBusquedaDeMielDeBruno());

        // Obtén el ID del cuento desde el intent
        int cuentoId = getIntent().getIntExtra("cuentoId", -1);

        // Busca el cuento correspondiente
        Cuento cuentoSeleccionado = null;
        for (Cuento cuento : cuentos) {
            if (cuento.getId() == cuentoId) {
                cuentoSeleccionado = cuento;
                break;
            }
        }

        // Si no se encuentra el cuento, salir
        if (cuentoSeleccionado == null) {
            finish();
            return;
        }

        // Configurar la vista del cuento seleccionado
        Glide.with(this)
                .load(cuentoSeleccionado.getImagen())
                .placeholder(R.drawable.ic_placeholder_image)
                .error(R.drawable.ic_error_image)
                .skipMemoryCache(true) // Deshabilita la caché en memoria
                .diskCacheStrategy(DiskCacheStrategy.NONE) // Deshabilita la caché en disco
                .into(imageCuento);

        tituloCuento.setText(cuentoSeleccionado.getTitulo());
        sinopsisCuento.setText(cuentoSeleccionado.getSinopsis());

        // Configurar las escenas (si las tiene)
        List<Escena> escenas = cuentoSeleccionado.getEscenas();
        EscenaAdapter adapter = new EscenaAdapter(this, escenas);
        listViewEscenas.setAdapter(adapter);

        // Listener para iniciar el cuento en la primera escena
        btnIniciar.setOnClickListener(v -> {
            if (!escenas.isEmpty()) {
                Intent intent = new Intent(CuentoActivity.this, EscenaActivity.class);
                intent.putExtra("listaEscenas", (java.io.Serializable) escenas);
                intent.putExtra("indiceEscenaActual", 0);
                startActivity(intent);
            }
        });
    }
}



