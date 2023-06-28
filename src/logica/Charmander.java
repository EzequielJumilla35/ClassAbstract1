package logica;


public class Charmander extends Pokemon implements IFuego {

    String nombre = "Charmander";
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque placaje " + nombre);
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Arañazo " + nombre);
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Ataque Mordisco " + nombre);
    }

    @Override
    public void atacarPunioFuego() {
         System.out.println("Ataque Puño Fuego " + nombre);
    }

    @Override
    public void atacarLanzaLlamas() {
         System.out.println("Ataque Lanza LLamas " + nombre);
    }

    @Override
    public void atacarAscuas() {
         System.out.println("Ataque Ascuas " + nombre);
    }
    
}
