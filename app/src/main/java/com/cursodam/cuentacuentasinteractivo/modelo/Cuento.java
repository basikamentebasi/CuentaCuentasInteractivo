package com.cursodam.cuentacuentasinteractivo.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cuento {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    //COLUMNAS
    protected Integer id;
    protected String titulo;
    protected String sinopsis;
    protected int imagen;
    //TABLAS 1:N
    protected List<Escena> escenas;

    public Cuento() {
        this.id = ID_GENERATOR.getAndIncrement(); // Asigna un ID único automáticamente
        this.titulo="";
        this.sinopsis= "";
        this.escenas= new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public List<Escena> getEscenas() {
        return escenas;
    }

    public void setEscenas(List<Escena> escenas) {
        this.escenas = escenas;
    }
}
