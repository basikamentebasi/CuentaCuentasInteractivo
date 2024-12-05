package com.cursodam.cuentacuentasinteractivo.modelo.historias;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.Decision;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.Arrays;

public class AventuraDeLila extends Cuento {

    public AventuraDeLila() {
        id = 3;
        titulo = "La aventura de Lila la zorrita";
        sinopsis = "Lila, una curiosa zorrita, se embarca en una emocionante aventura en el bosque.";
        imagen = R.drawable.lila_zorrita;

        Escena escena1 = escenaInicio();
        Escena escena2 = escenaBosqueEncantado();
        Escena escena3 = escenaTresCaminos();
        Escena escena4 = escenaRioRocoso();
        Escena escena5 = escenaTresFlores();
        Escena escena6 = escenaCuevaDelBosque();
        Escena escena7 = escenaArbolFrutal();
        Escena escena8 = escenaEncuentroAmigable();
        Escena escena9 = escenaBosqueLlenoDeColores();
        Escena escena10 = escenaFinal();

        escenas.add(escena1);
        escenas.add(escena2);
        escenas.add(escena3);
        escenas.add(escena4);
        escenas.add(escena5);
        escenas.add(escena6);
        escenas.add(escena7);
        escenas.add(escena8);
        escenas.add(escena9);
        escenas.add(escena10);
    }

    public Escena escenaInicio() {
        Escena escena = new Escena();
        escena.setNombre("Lila comienza su aventura");
        escena.setTextoPreambulo("Lila, la zorrita, sale de su madriguera con la curiosidad de explorar el bosque.");
        escena.setDesenlace("Con mucho entusiasmo, Lila se adentra en el bosque encantado.");
        escena.setImagen(R.drawable.lila_saliendo);
        return escena;
    }

    public Escena escenaBosqueEncantado() {
        Escena escena = new Escena();
        escena.setNombre("El bosque encantado");
        escena.setTextoPreambulo("Lila se encuentra en un bosque encantado lleno de árboles altos y luces misteriosas.");
        escena.setDesenlace("Lila decide seguir las luces, que la guían más profundamente en el bosque.");
        escena.setImagen(R.drawable.lila_colores);
        return escena;
    }

    public Escena escenaTresCaminos() {
        Decision decision = new Decision("Lila se encuentra con tres caminos. ¿Cuál debería tomar?",
                Arrays.asList("Camino izquierdo", "Camino recto", "Camino derecho"),
                Arrays.asList("El camino lleva a un lago oscuro y profundo.", "El camino está bloqueado por una gran roca.", "Lila encuentra un hermoso campo de flores."));

        Escena escena = new Escena();
        escena.setNombre("Los tres caminos");
        escena.setTextoPreambulo("Lila llega a una bifurcación con tres caminos, cada uno con un aspecto diferente.");
        escena.setDecision(decision);
        escena.setDesenlace("Lila elige un camino y sigue adelante con valentía.");
        escena.setImagen(R.drawable.cruce_camino);
        return escena;
    }

    public Escena escenaRioRocoso() {
        Decision decision = new Decision("Lila necesita cruzar un río rocoso. ¿Qué piedra usará primero?",
                Arrays.asList("Piedra grande", "Piedra mediana", "Piedra pequeña"),
                Arrays.asList("La piedra está muy resbaladiza.", "La piedra casi hace que Lila pierda el equilibrio.", "La piedra es estable y segura."));

        Escena escena = new Escena();
        escena.setNombre("El río rocoso");
        escena.setTextoPreambulo("Lila se encuentra con un río lleno de piedras y necesita cruzarlo.");
        escena.setDecision(decision);
        escena.setDesenlace("Con cuidado, Lila logra cruzar el río sin mojarse.");
        escena.setImagen(R.drawable.rio_rocosa);
        return escena;
    }

    public Escena escenaTresFlores() {
        Decision decision = new Decision("Lila ve tres flores brillantes y quiere oler una. ¿Cuál elegirá?",
                Arrays.asList("Flor roja", "Flor azul", "Flor amarilla"),
                Arrays.asList("La flor tiene un olor muy fuerte.", "La flor está llena de abejas.", "La flortiene un aroma suave y agradable."));

        Escena escena = new Escena();
        escena.setNombre("Las tres flores");
        escena.setTextoPreambulo("Lila se encuentra con tres flores coloridas en medio del bosque.");
        escena.setDecision(decision);
        escena.setDesenlace("Después de oler la flor, Lila se siente más relajada y continúa su camino.");
        escena.setImagen(R.drawable.tres_flores);
        return escena;
    }

    public Escena escenaCuevaDelBosque() {
        Escena escena = new Escena();
        escena.setNombre("La cueva del bosque");
        escena.setTextoPreambulo("Lila descubre una cueva misteriosa en medio del bosque.");
        escena.setDesenlace("Con valentía, Lila entra y encuentra algunas bayas que decide llevar consigo.");
        escena.setImagen(R.drawable.cueva_oscura);
        return escena;
    }

    public Escena escenaArbolFrutal() {
        Decision decision = new Decision("Lila encuentra un árbol lleno de frutas. ¿Qué fruta debería probar?",
                Arrays.asList("Manzana roja", "Pera verde", "Ciruela morada"),
                Arrays.asList("La fruta está un poco ácida.", "La fruta está demasiado blanda.", "La fruta está madura y deliciosa."));

        Escena escena = new Escena();
        escena.setNombre("El árbol frutal");
        escena.setTextoPreambulo("Lila se encuentra con un árbol lleno de frutas jugosas.");
        escena.setDecision(decision);
        escena.setDesenlace("Después de probar la fruta, Lila se siente llena de energía para continuar.");
        escena.setImagen(R.drawable.arbol_gigante);
        return escena;
    }

    public Escena escenaEncuentroAmigable() {
        Escena escena = new Escena();
        escena.setNombre("Encuentro amigable");
        escena.setTextoPreambulo("Lila se encuentra con un grupo de conejos amistosos en el claro del bosque.");
        escena.setDesenlace("Lila juega un rato con ellos antes de seguir su camino.");
        escena.setImagen(R.drawable.ayuda_amigos);
        return escena;
    }

    public Escena escenaBosqueLlenoDeColores() {
        Escena escena = new Escena();
        escena.setNombre("El bosque lleno de colores");
        escena.setTextoPreambulo("Lila llega a una parte del bosque donde los árboles tienen hojas de muchos colores brillantes.");
        escena.setDesenlace("Lila se siente maravillada por la belleza del bosque y decide descansar un momento para disfrutar del paisaje.");
        escena.setImagen(R.drawable.bosque_colores);
        return escena;
    }

    public Escena escenaFinal() {
        Escena escena = new Escena();
        escena.setNombre("El regreso de Lila");
        escena.setTextoPreambulo("Después de un largo día de aventuras, Lila decide regresar a casa.");
        escena.setDesenlace("Lila vuelve a su madriguera, feliz por todas las cosas nuevas que descubrió en el bosque.");
        escena.setImagen(R.drawable.lila_regreso);
        return escena;
    }

    @Override
    public int getImagen() {
        return R.drawable.lila_zorrita;
    }
}
