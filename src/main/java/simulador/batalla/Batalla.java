package simulador.batalla;

import simulador.entrenador.Entrenador;

public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private int turno;
    
    public Batalla(Entrenador entrenador1,Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        turno = 0;
    }
    public void iniciarBatalla(){
        System.out.println("Batalla iniciada entre" + entrenador1.nombre + "y" + entrenador2.nombre);
    }
    public void siguienteTurno(){
        turno++;
        System.out.println("Turno" + turno);
    }
    public void luchar(){
        while(entrenador1.getPokemon().getSalud()>0 && entrenador2.getPokemon().getSalud()>0){
            siguienteTurno();
            entrenador1.getPokemon().atacar(entrenador2.getPokemon());
            System.out.println(entrenador2.getPokemon().nombre + "tiene" + entrenador2.getPokemon().getSalud() + "puntos de vida.");
            if (entrenador2.getPokemon().getSalud()>0){
                entrenador2.getPokemon().atacar(entrenador1.getPokemon());
                System.out.println(entrenador1.getPokemon().nombre + "tiene" + entrenador1.getPokemon().getSalud() + "puntos de vida");
            }
        }
        if (entrenador1.getPokemon().getSalud()>0){
            System.out.println(entrenador1.nombre+"ganó la batalla.");
        }
    }
}

