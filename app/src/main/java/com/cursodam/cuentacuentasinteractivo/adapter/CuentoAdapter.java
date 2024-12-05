package com.cursodam.cuentacuentasinteractivo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;

import java.util.List;

public class CuentoAdapter extends BaseAdapter {
    private Context context;
    private List<Cuento> cuentos;

    public CuentoAdapter(Context context, List<Cuento> cuentos) {
        this.context = context;
        this.cuentos = cuentos;
    }

    @Override
    public int getCount() {
        return cuentos.size();
    }

    @Override
    public Object getItem(int position) {
        return cuentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cuentos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cuento_item, parent, false);
        }

        Cuento cuento = cuentos.get(position);

        // Referencias a las vistas
        TextView titulo = convertView.findViewById(R.id.textTituloCuentoItem);
        ImageView imagen = convertView.findViewById(R.id.imageCuentoItem);

        // Configura el título
        titulo.setText(cuento.getTitulo());

        // Configura la imagen
        try {
            int resourceId = cuento.getImagen();
            imagen.setImageResource(resourceId); // Carga imagen local
        } catch (NumberFormatException e) {
            // Si no es local, puedes cargarla con Glide
            Glide.with(context)
                    .load(cuento.getImagen())
                    .placeholder(R.drawable.ic_placeholder_image)
                    .error(R.drawable.ic_error_image)
                    .into(imagen);
        }

        return convertView;
    }
}
