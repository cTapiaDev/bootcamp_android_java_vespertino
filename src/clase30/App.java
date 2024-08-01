package clase30;

public class App {
    
    public static void main(String[] args) {
        
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        
        charmander.ataqueAraniazo();
        charmander.ataqueLanzaLlamas();
        squirtle.ataqueBurbuja();
        squirtle.ataquePlacaje();
        
        
        MiEquipo listaEquipo = new MiEquipo();
        
        listaEquipo.agregarPokemon(charmander);
        listaEquipo.agregarPokemon(squirtle);
        
        listaEquipo.mostrarEquipo();
        
        
    }
    
}
