package com.cursodam.cuentacuentasinteractivo.modelo.historias;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.Decision;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.Arrays;

public class LaAventuraDeTobyElConejo extends Cuento {

    public LaAventuraDeTobyElConejo() {
        id = 2;
        titulo = "La aventura de Toby el conejo";
        sinopsis = "Toby el conejo sale de su madriguera en busca de una gran aventura en el bosque.";
        imagen = R.drawable.toby_conejo;

        Escena escena1 = escenaInicio();
        Escena escena2 = escenaCaminoDividido();
        Escena escena3 = escenaRiachuelo();
        Escena escena4 = escenaPuente();
        Escena escena5 = escenaMisterio();
        Escena escena6 = escenaFinal();
        Escena escena7 = escenaEncuentroAmigable();
        Escena escena8 = escenaBosqueEncantado();
        Escena escena9 = escenaDespedida();

        escenas.add(escena1);
        escenas.add(escena2);
        escenas.add(escena3);
        escenas.add(escena4);
        escenas.add(escena5);

        escenas.add(escena7);
        escenas.add(escena8);
        escenas.add(escena6);
        escenas.add(escena9);
    }

    public Escena escenaInicio() {
        Escena escena = new Escena();
        escena.setNombre("Toby sale de su madriguera");
        escena.setTextoPreambulo("Toby, el pequeño conejo, siente curiosidad por lo que hay más allá de su hogar y decide salir a explorar el bosque.");
        escena.setDesenlace("Toby da saltos de emoción mientras avanza hacia el bosque.");
        escena.setImagen(R.drawable.toby_saliendo);
        return escena;
    }

    public Escena escenaCaminoDividido() {
        Decision decision = new Decision("Toby encuentra un cruce de caminos. ¿Por dónde debe continuar?", Arrays.asList("Izquierda", "Derecha", "Recto"), Arrays.asList("El camino está lleno de espinas.", "El camino está muy oscuro.", "El camino parece seguro y soleado."));

        Escena escena = new Escena();
        escena.setNombre("El cruce de caminos");
        escena.setTextoPreambulo("Toby encuentra un cruce con tres caminos distintos.");
        escena.setDecision(decision);
        escena.setDesenlace("Toby decide seguir, avanzando por el camino soleado.");
        escena.setImagen(R.drawable.cruce_caminos);
        return escena;
    }

    public Escena escenaRiachuelo() {
        Escena escena = new Escena();
        escena.setNombre("El riachuelo");
        escena.setTextoPreambulo("Toby encuentra un riachuelo que parece muy ancho para saltarlo.");
        escena.setDesenlace("Toby sigue la corriente del riachuelo hasta encontrar un lugar más angosto para cruzar.");
        escena.setImagen(R.drawable.riachuelo);
        return escena;
    }

    public Escena escenaPuente() {
        Decision decision = new Decision("Toby encuentra un puente viejo. ¿Qué hará?", Arrays.asList("Cruzar rápidamente", "Cruzar con los ojos cerrados y sin mirar", "Cruzar con cuidado"), Arrays.asList("El puente casi se rompe.", "Toby casi se cae al río.", "Toby cruza sin problemas."));

        Escena escena = new Escena();
        escena.setNombre("El viejo puente");
        escena.setTextoPreambulo("Toby se encuentra un viejo puente de madera para cruzar el riachuelo.");
        escena.setDecision(decision);
        escena.setDesenlace("Toby logra llegar al otro lado del puente, listo para continuar su aventura.");
        escena.setImagen(R.drawable.puente);
        return escena;
    }

    public Escena escenaMisterio() {
        Escena escena = new Escena();
        escena.setNombre("La sombra misteriosa");
        escena.setTextoPreambulo("Toby ve una sombra misteriosa entre los árboles.");
        escena.setDesenlace("La sombra resulta ser su amiga, la ardilla Rita, que estaba recogiendo bellotas.");
        escena.setImagen(R.drawable.sombra_misteriosa);
        return escena;
    }

    public Escena escenaEncuentroAmigable() {
        Escena escena = new Escena();
        escena.setNombre("El encuentro amigable");
        escena.setTextoPreambulo("Toby se encuentra con un grupo de conejos que también están explorando el bosque.");
        escena.setDesenlace("Toby se une a ellos y pasan un rato agradable explorando juntos.");
        escena.setImagen(R.drawable.encuentro_amigable);
        return escena;
    }

    public Escena escenaBosqueEncantado() {
        Decision decision = new Decision("Toby llega a una parte del bosque que parece encantada. ¿Qué debería hacer?", Arrays.asList("Seguir caminando como si nada", "Seguir su instinto", "Buscar ayuda"), Arrays.asList("Toby descubre un claro mágico lleno de flores brillantes.", "Toby rodea la parte encantada y encuentra un sendero seguro.", "Toby busca ayuda y Rita, la ardilla, lo acompaña para explorar juntos."));

        Escena escena = new Escena();
        escena.setNombre("El bosque encantado");
        escena.setTextoPreambulo("Toby llega a una parte del bosque donde todo parece diferente, con luces y sonidos mágicos.");
        escena.setDecision(decision);
        escena.setDesenlace("Juntos, Toby y Rita descubren que el claro está lleno de bellotas y deciden recolectarlas.");
        escena.setImagen(R.drawable.bosque_encantado);
        return escena;
    }

    public Escena escenaDespedida() {
        Escena escena = new Escena();
        escena.setNombre("La despedida");
        escena.setTextoPreambulo("Después de una larga y divertida aventura, Toby decide que es momento de regresar a casa.");
        escena.setDesenlace("Toby se despide de sus amigos y promete volver a explorar el bosque muy pronto.");
        escena.setImagen(R.drawable.despedida);
        return escena;
    }

    public Escena escenaFinal() {
        Escena escena = new Escena();
        escena.setNombre("El regreso");
        escena.setTextoPreambulo("Después de una larga aventura, Toby decide regresar a casa.");
        escena.setDesenlace("Toby vuelve a su madriguera, feliz por las nuevas experiencias vividas y por la aventura que compartió con Rita.");
        escena.setImagen(R.drawable.toby_regresa);
        return escena;
    }

    @Override
    public int getImagen() {
        return R.drawable.toby_conejo;
    }
}
