package com.cursodam.cuentacuentasinteractivo.modelo;

import java.io.Serializable;

public class Escena implements Serializable {

    //COLUMNAS
    private String nombre;
    private String textoPreambulo;
    private String desenlace;
    protected int imagen;
    //TABLA 1:1
    private Decision decision;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTextoPreambulo() {
        return textoPreambulo;
    }

    public void setTextoPreambulo(String textoPreambulo) {
        this.textoPreambulo = textoPreambulo;
    }

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }

    public String getDesenlace() {
        return desenlace;
    }

    public void setDesenlace(String desenlace) {
        this.desenlace = desenlace;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
