package simulador.pokemon;

public abstract class Pokemon {
    public String nombre;
    public int salud;
    public final int ataque;
    private final int defensa = 0;

    public Pokemon(String nombre, int salud, int ataque, String tipo){
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
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

    public void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

