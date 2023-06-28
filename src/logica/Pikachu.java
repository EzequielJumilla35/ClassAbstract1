
package logica;


public class Pikachu extends Pokemon implements IElectrico {

    String nombre = "Pikachu";
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Este es el ataque PLACAJE " + nombre);
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Este es el ataque ARanizazo " + nombre);
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Este es el ataque PLACAJE " + nombre);
    }

    @Override
    public void atacarImpactTrueno() {
       System.out.println("Este es el ataque Impacto Trueno "+ nombre);
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Este es el ataque Puño Trueno " + nombre);
    }
    
    }
    

