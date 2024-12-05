package com.cursodam.cuentacuentasinteractivo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.List;

public class EscenaAdapter extends BaseAdapter {
    private Context context;
    private List<Escena> escenas;

    public EscenaAdapter(Context context, List<Escena> escenas) {
        this.context = context;
        this.escenas = escenas;
    }

    @Override
    public int getCount() {
        return escenas.size();
    }

    @Override
    public Object getItem(int position) {
        return escenas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.escena_item, parent, false);
        }

        Escena escena = escenas.get(position);

        // Configura el nombre de la escena
        TextView textNombreEscena = convertView.findViewById(R.id.textNombreEscena);
        textNombreEscena.setText(escena.getNombre());

        return convertView;
    }
}

