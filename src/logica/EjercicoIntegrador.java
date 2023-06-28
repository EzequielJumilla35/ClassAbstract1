package logica;


public class EjercicoIntegrador {
    public static void main(String[] args) {
     Pikachu picachu = new Pikachu();
     Charmander charmander = new Charmander();
     
     //Picachu
     picachu.atacarAraniazo();
     picachu.atacarImpactTrueno();
     picachu.atacarMordisco();
     picachu.atacarPlacaje();
     picachu.atacarPunioTrueno();
     
     //Charmander
     charmander.atacarAraniazo();
     charmander.atacarAscuas();
     charmander.atacarLanzaLlamas();
     charmander.atacarMordisco();
     charmander.atacarPlacaje();
     charmander.atacarPunioFuego();
        
    }
}
