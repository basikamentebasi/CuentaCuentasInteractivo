package com.cursodam.cuentacuentasinteractivo.modelo.historias;

import com.cursodam.cuentacuentasinteractivo.R;
import com.cursodam.cuentacuentasinteractivo.modelo.Cuento;
import com.cursodam.cuentacuentasinteractivo.modelo.Decision;
import com.cursodam.cuentacuentasinteractivo.modelo.Escena;

import java.util.Arrays;

public class LaBusquedaDeMielDeBruno extends Cuento {

    public LaBusquedaDeMielDeBruno() {
        id = 4;
        titulo = "La búsqueda de miel de Bruno";
        sinopsis = "Bruno, un oso aventurero, se embarca en una misión para encontrar la miel perfecta.";
        imagen = R.drawable.bruno_buscando_miel;

        Escena escena1 = escenaInicio();
        Escena escena2 = escenaBosqueProfundo();
        Escena escena3 = escenaTresArboles();
        Escena escena4 = escenaTresPiedras();
        Escena escena5 = escenaColmenaGigante();
        Escena escena6 = escenaClaroDelBosque();
        Escena escena7 = escenaCuevaOscura();
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

    public Escena escenaInicio() {
        Escena escena = new Escena();
        escena.setNombre("Bruno comienza su búsqueda");
        escena.setTextoPreambulo("Bruno, el oso, sale de su cueva temprano en la mañana para buscar miel.");
        escena.setDesenlace("Con mucha energía, Bruno se dirige hacia el bosque profundo.");
        escena.setImagen(R.drawable.bruno_inicio);
        return escena;
    }

    public Escena escenaBosqueProfundo() {
        Decision decision = new Decision("Bruno encuentra tres caminos en el bosque. ¿Cuál tomará?",
                Arrays.asList("Camino izquierdo", "Camino recto", "Camino derecho"),
                Arrays.asList("El camino está lleno de espinas.", "Bruno encuentra un árbol hueco lleno de abejas.", "El camino lleva a un hermoso claro del bosque."));

        Escena escena = new Escena();
        escena.setNombre("Los tres caminos");
        escena.setTextoPreambulo("En medio del bosque, Bruno se encuentra con tres caminos diferentes.");
        escena.setDecision(decision);
        escena.setDesenlace("Bruno elige un camino y sigue adelante con esperanza.");
        escena.setImagen(R.drawable.bosque_caminos);
        return escena;
    }

    public Escena escenaTresArboles() {
        Decision decision = new Decision("Bruno encuentra tres árboles, cada uno con un panal de miel. ¿Cuál debería probar?",
                Arrays.asList("Árbol alto", "Árbol mediano", "Árbol pequeño"),
                Arrays.asList("El panal está lleno de abejas agresivas.", "Bruno prueba la miel, pero está muy amarga.", "El panal está a la altura perfecta y la miel es deliciosa."));

        Escena escena = new Escena();
        escena.setNombre("Los tres árboles con miel");
        escena.setTextoPreambulo("Bruno se acerca a tres árboles, cada uno con un panal de miel colgando.");
        escena.setDecision(decision);
        escena.setDesenlace("Bruno encuentra la miel perfecta y sigue adelante en su aventura.");
        escena.setImagen(R.drawable.arboles_miel);
        return escena;
    }

    public Escena escenaTresPiedras() {
        Decision decision = new Decision("Bruno necesita cruzar el río y ve tres piedras. ¿Cuál debería usar primero?",
                Arrays.asList("Piedra grande", "Piedra mediana", "Piedra pequeña"),
                Arrays.asList("La piedra es resbalosa y Bruno casi cae.", "La piedra se hunde y Bruno se moja un poco.", "La piedra es perfecta para apoyarse."));

        Escena escena = new Escena();
        escena.setNombre("Cruzar el río");
        escena.setTextoPreambulo("Bruno se encuentra con un río que necesita cruzar.");
        escena.setDecision(decision);
        escena.setDesenlace("Con mucho cuidado, Bruno cruza el río y sigue su camino.");
        escena.setImagen(R.drawable.rio_piedras);
        return escena;
    }

    public Escena escenaColmenaGigante() {
        Escena escena = new Escena();
        escena.setNombre("La colmena gigante");
        escena.setTextoPreambulo("Bruno encuentra una colmena gigante colgando de un árbol.");
        escena.setDesenlace("Bruno decide tomar un poco de miel, pero tiene que ser cuidadoso para no molestar a las abejas.");
        escena.setImagen(R.drawable.colmena_gigante);
        return escena;
    }

    public Escena escenaClaroDelBosque() {
        Escena escena = new Escena();
        escena.setNombre("El claro del bosque");
        escena.setTextoPreambulo("Bruno llega a un claro en el bosque, donde el sol brilla y hay muchas flores.");
        escena.setDesenlace("Bruno descansa un poco, disfrutando del paisaje antes de continuar.");
        escena.setImagen(R.drawable.claro_bosque);
        return escena;
    }

    public Escena escenaCuevaOscura() {
        Escena escena = new Escena();
        escena.setNombre("La cueva oscura");
        escena.setTextoPreambulo("Bruno encuentra una cueva oscura y se siente curioso sobre lo que podría haber dentro.");
        escena.setDesenlace("Bruno entra con cuidado y encuentra algunos frutos silvestres antes de salir.");
        escena.setImagen(R.drawable.cueva_oscura);
        return escena;
    }

    public Escena escenaFinal() {
        Escena escena = new Escena();
        escena.setNombre("El regreso a casa");
        escena.setTextoPreambulo("Después de un día de aventuras, Bruno decide regresar a casa con su miel.");
        escena.setDesenlace("Bruno vuelve a su cueva, cansado pero feliz con la miel que encontró.");
        escena.setImagen(R.drawable.bruno_regreso);
        return escena;
    }

    @Override
    public int getImagen() {
        return R.drawable.bruno_buscando_miel;
    }
}
