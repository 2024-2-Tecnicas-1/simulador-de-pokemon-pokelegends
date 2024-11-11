package simulador.pokemon;

public abstract class Pokemon {
    public String nombre;
    private String tipo;
    private int salud;
    private int ataque;
    private int defensa;

    public Pokemon(String nombre,String tipo,int salud, int ataque, int defensa){
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void atacar(Pokemon objetivo){
        int daño = ataque - objetivo.defensa;
        objetivo.salud-=daño;
        System.out.println(nombre + "atacó a" + objetivo.nombre + "por" + daño + "puntos de daño.");
    }
        

    public void recibirAtaque(int daño) {
      salud-=daño;
      System.out.println(nombre + "recibió" + daño + "puntos de daño.");
    }

    public int getSalud(){
        return salud;
    }

    public String getNombre() {
        return nombre;
    }
}

