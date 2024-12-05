package com.cursodam.cuentacuentasinteractivo.modelo.historias;


import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.Decision;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.Arrays;
public class RicitosDeOro extends Cuento {

    public RicitosDeOro() {
        id = 1;
        titulo = "Ricitos de oro y los 3 ositos";
        sinopsis = "Ricitos de oro y los 3 ositos viviendo aventuras";
        imagen = R.drawable.ricitos_de_oro;

        Escena escena1 = escenaOsosMarchan();
        Escena escena2 = escenaEncuentraCasa();
        Escena escena3 = escenaTazones();
        Escena escena4 = escenaExploracionIntermedia();
        Escena escena5 = escenaSillas();
        Escena escena6 = escenaDescansoIntermedio();
        Escena escena7 = escenaCamas();
        Escena escena8 = escenaFinal();

        escenas.add(escena1);
        escenas.add(escena2);
        escenas.add(escena3);
        escenas.add(escena4);
        escenas.add(escena5);
        escenas.add(escena6);
        escenas.add(escena7);
        escenas.add(escena8);
    }

    public Escena escenaEncuentraCasa() {
        Escena escena = new Escena();
        escena.setNombre("Ricitos encuentra la casa");
        escena.setTextoPreambulo("Ricitos de Oro, paseando por el bosque, encuentra una casa que le llama la atención.");
        escena.setDesenlace("Ricitos decide entrar para explorar.");
        escena.setImagen(R.drawable.ricitos_encuentra_la_casa);
        return escena;
    }

    public Escena escenaOsosMarchan() {
        Escena escena = new Escena();
        escena.setNombre("Los osos se marchan");
        escena.setTextoPreambulo("Los tres osos deciden salir a pasear mientras su sopa se enfría.");
        escena.setDesenlace("Mientras los osos están fuera, Ricitos de Oro llega a la casa.");
        escena.setImagen(R.drawable.los_osos_se_marchan);
        return escena;
    }

    public Escena escenaTazones() {
        Decision decision = new Decision("Ricitos de Oro se encuentra con tres tazones de sopa. ¿Cuál probará?", Arrays.asList("El de la izquierda", "El del centro", "El de la derecha"), Arrays.asList("Está demasiado frío.", "Está demasiado caliente.", "¡Está perfecto!"));

        Escena escena = new Escena();
        escena.setNombre("Los tres tazones");
        escena.setTextoPreambulo("Ricitos de Oro ha entrado en la casa y encuentra tres tazones de sopa sobre la mesa.");
        escena.setDecision(decision);
        escena.setDesenlace("Después de probar el tazón perfecto, Ricitos de Oro continúa explorando la casa.");
        escena.setImagen(R.drawable.tazones);
        return escena;
    }

    public Escena escenaExploracionIntermedia() {
        Escena escena = new Escena();
        escena.setNombre("Ricitos sigue explorando");
        escena.setTextoPreambulo("Después de probar los tazones, Ricitos camina por la sala observando todo con curiosidad.");
        escena.setDesenlace("Encuentra unas sillas y decide probarlas.");
        escena.setImagen(R.drawable.sillas);
        return escena;
    }

    public Escena escenaSillas() {
        Decision decision = new Decision("Ricitos de Oro ve tres sillas de diferentes tamaños. ¿Cuál probará?", Arrays.asList("La silla grande", "La silla mediana", "La silla pequeña"), Arrays.asList("Es demasiado dura.", "Es demasiado blanda.", "¡Es perfecta!"));

        Escena escena = new Escena();
        escena.setNombre("Las tres sillas");
        escena.setTextoPreambulo("Ricitos de Oro entra a la sala y ve tres sillas: una grande, una mediana y una pequeña.");
        escena.setDecision(decision);
        escena.setDesenlace("Después de sentarse en la silla perfecta, esta se rompe, y Ricitos de Oro decide seguir explorando.");
        escena.setImagen(R.drawable.sillas);
        return escena;
    }

    public Escena escenaDescansoIntermedio() {
        Escena escena = new Escena();
        escena.setNombre("Ricitos se siente cansada");
        escena.setTextoPreambulo("Ricitos de Oro siente que la exploración le ha dado sueño.");
        escena.setDesenlace("Decide buscar un lugar donde descansar.");
        escena.setImagen(R.drawable.camas);
        return escena;
    }

    public Escena escenaCamas() {
        Decision decision = new Decision("Finalmente, Ricitos de Oro encuentra tres camas. ¿En cuál se acostará?", Arrays.asList("La cama grande", "La cama mediana", "La cama pequeña"), Arrays.asList("Es demasiado dura.", "Es demasiado blanda.", "¡Es perfecta!"));

        Escena escena = new Escena();
        escena.setNombre("Las tres camas");
        escena.setTextoPreambulo("Ricitos de Oro está cansada y sube al dormitorio, donde encuentra tres camas.");
        escena.setDecision(decision);
        escena.setDesenlace("Ricitos de Oro se acuesta en la cama perfecta y se queda profundamente dormida.");
        escena.setImagen(R.drawable.camas);
        return escena;
    }

    public Escena escenaFinal() {
        Escena escena = new Escena();
        escena.setNombre("Ricitos se encuentra con los osos");
        escena.setTextoPreambulo("Ricitos de Oro despierta al escuchar ruido y ve que los osos han regresado a su casa.");
        escena.setDesenlace("Asustada, Ricitos de Oro huye rápidamente al bosque y no regresa.");
        escena.setImagen(R.drawable.fin);
        return escena;
    }

    @Override
    public int getImagen() {
        return R.drawable.ricitos_de_oro;
    }
}
