package com.cursodam.cuentacuentasinteractivo.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;

import java.util.HashMap;
import java.util.List;

public class DecisionAdapter extends BaseAdapter {
    private Context context;
    private List<String> choices;
    private List<String> answers;
    private int intentos = 0; // Controla el intento actual
    private HashMap<Integer, Integer> answeredMap; // Mapea la posición con el intento mostrado

    // Colores accesibles según WCAG
    private final String COLOR_ROJO = "#D32F2F"; // Rojo accesible (intentos intermedios)
    private final String COLOR_VERDE = "#2E7D32"; // Verde accesible (último intento)
    private final String COLOR_TEXTO_NORMAL = "#000000"; // Texto normal
    private final String COLOR_SECUNDARIO = "#757575"; // Texto apagado o placeholder

    public DecisionAdapter(Context context, List<String> choices, List<String> answers) {
        this.context = context;
        this.choices = choices;
        this.answers = answers;
        this.answeredMap = new HashMap<>(); // Inicializa el mapa vacío
    }

    @Override
    public int getCount() {
        return choices.size();
    }

    @Override
    public Object getItem(int position) {
        return choices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.decision_item, parent, false);
        }

        TextView textChoice = convertView.findViewById(R.id.textChoice);
        TextView textAnswer = convertView.findViewById(R.id.textAnswer);

        // Configura el texto de la elección
        textChoice.setText(choices.get(position));
        textChoice.setTextColor(Color.parseColor(COLOR_TEXTO_NORMAL)); // Texto normal siempre negro

        // Configura el texto del answer
        if (answeredMap.containsKey(position)) {
            int intento = answeredMap.get(position); // Obtiene el intento asociado a esta posición
            textAnswer.setText(answers.get(intento)); // Muestra el answer del intento correspondiente

            // Cambia el color del texto si es el último intento
            if (intento == answers.size() - 1) {
                textAnswer.setTextColor(Color.parseColor(COLOR_VERDE)); // Último intento: verde accesible
            } else {
                textAnswer.setTextColor(Color.parseColor(COLOR_ROJO)); // Otros intentos: rojo accesible
            }

            textAnswer.setVisibility(View.VISIBLE);
        } else {
            textAnswer.setText("Selecciona una opción"); // Placeholder cuando aún no se seleccionó
            textAnswer.setTextColor(Color.parseColor(COLOR_SECUNDARIO)); // Color secundario
            textAnswer.setVisibility(View.GONE);
        }

        return convertView;
    }

    // Método para registrar la posición seleccionada y asociarla al intento actual
    public void showAnswer(int position) {
        if (!answeredMap.containsKey(position) && intentos < answers.size()) {
            answeredMap.put(position, intentos); // Asocia esta posición al intento actual
            intentos++; // Incrementa el contador de intentos
            notifyDataSetChanged(); // Actualiza la lista
        }
    }

    // Verifica si ya se completaron todos los intentos
    public boolean todosLosIntentosCompletados() {
        return intentos >= answers.size();
    }
}






