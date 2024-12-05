package com.cursodam.cuentacuentasinteractivo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.adapter.DecisionAdapter;
import com.cursodam.cuentacuentasinteractivo.modelo.Decision;

import android.content.Intent;
import android.widget.Button;

import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.List;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EscenaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escena);

        // Referencias a los elementos de la UI
        ImageView imageEscena = findViewById(R.id.imageEscena);
        TextView nombreEscena = findViewById(R.id.textNombreEscena);
        TextView textoPreambulo = findViewById(R.id.textPreambulo);
        ListView listViewDecisiones = findViewById(R.id.listViewDecisiones);
        TextView textoDesenlace = findViewById(R.id.textDesenlace);
        Button btnSiguienteEscena = findViewById(R.id.btnSiguienteEscena);

        // Recogemos los datos enviados desde el Intent
        List<Escena> listaEscenas = (List<Escena>) getIntent().getSerializableExtra("listaEscenas");
        int indiceEscenaActual = getIntent().getIntExtra("indiceEscenaActual", 0);

        // Obtenemos la escena actual
        Escena escenaActual = listaEscenas.get(indiceEscenaActual);

        // Configura la imagen de la escena actual usando Glide
        Glide.with(this)
                .load(escenaActual.getImagen()) // Carga el recurso local de la escena
                .placeholder(R.drawable.ic_placeholder_image) // Imagen de carga
                .error(R.drawable.ic_error_image) // Imagen de error
                .into(imageEscena);

        // Configura los datos de la escena
        nombreEscena.setText(escenaActual.getNombre());
        textoPreambulo.setText(escenaActual.getTextoPreambulo());

        Decision decision = escenaActual.getDecision();

        if (decision != null) {
            // Si la escena tiene decisiones, muestra el ListView
            listViewDecisiones.setVisibility(View.VISIBLE);
            DecisionAdapter adapter = new DecisionAdapter(
                    this,
                    decision.getChoices(),
                    decision.getAnswers()
            );
            listViewDecisiones.setAdapter(adapter);

            // Maneja la selección de ítems en el ListView
            listViewDecisiones.setOnItemClickListener((parent, view, position, id) -> {
                // Muestra el answer para el intento actual
                adapter.showAnswer(position);

                // Si se han completado todos los intentos, habilita el botón
                if (adapter.todosLosIntentosCompletados()) {
                    textoDesenlace.setText(escenaActual.getDesenlace());
                    textoDesenlace.setVisibility(View.VISIBLE);

                    if (indiceEscenaActual < listaEscenas.size() - 1) {
                        btnSiguienteEscena.setText("Siguiente Escena");
                    } else {
                        btnSiguienteEscena.setText("Finalizar");
                    }
                    btnSiguienteEscena.setEnabled(true);
                }
            });
        } else {
            // Si no hay decisiones, oculta el ListView y muestra directamente el desenlace
            listViewDecisiones.setVisibility(View.GONE);
            textoDesenlace.setText(escenaActual.getDesenlace());
            textoDesenlace.setVisibility(View.VISIBLE);
            btnSiguienteEscena.setEnabled(true);

            if (indiceEscenaActual < listaEscenas.size() - 1) {
                btnSiguienteEscena.setText("Siguiente Escena");
            } else {
                btnSiguienteEscena.setText("Finalizar");
            }
        }

        // Configura el botón para navegar a la siguiente escena o finalizar
        btnSiguienteEscena.setOnClickListener(v -> {
            if (indiceEscenaActual < listaEscenas.size() - 1) {
                // Avanza a la siguiente escena
                Intent intent = new Intent(EscenaActivity.this, EscenaActivity.class);
                intent.putExtra("listaEscenas", (java.io.Serializable) listaEscenas);
                intent.putExtra("indiceEscenaActual", indiceEscenaActual + 1);
                startActivity(intent);
            } else {
                // Finaliza y regresa a la actividad del cuento
                Intent intent = new Intent(EscenaActivity.this, CuentoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}






