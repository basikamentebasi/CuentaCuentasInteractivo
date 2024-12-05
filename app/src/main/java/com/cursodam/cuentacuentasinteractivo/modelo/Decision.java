package com.cursodam.cuentacuentasinteractivo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Decision implements Serializable { // Implementa Serializable
    private String question;
    private List<String> choices;
    private List<String> answers;
    private int intentos;

    public Decision() {
        question = "";
        choices = new ArrayList<>();
        answers = new ArrayList<>();
        intentos = 0;
    }

    public Decision(String question, List<String> choices, List<String> answers) {
        this.question = question;
        this.choices = choices;
        this.answers = answers;
        intentos = 0;
    }

    // Getters y setters
    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
