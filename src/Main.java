import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander", 25, 30, 35);
        Pokemon squirtle = new Pokemon("Squirtle", 30, 25, 30);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 35, 30, 25);
        Pokemon charizard = new Pokemon("Charizar", 35, 40, 45);
        Pokemon wartortle = new Pokemon("Wartortle", 40, 35, 40);
        Pokemon Ivysaur = new Pokemon("Ivysaur", 45, 40, 35);

        System.out.println(charmander);
        System.out.println(squirtle);
        System.out.println(bulbasaur);
        System.out.println(charizard);
        System.out.println(wartortle);
        System.out.println(Ivysaur);

        Resfriado resfriado = new Resfriado();

        ArrayList<Capturable> pokedex = new ArrayList();

        pokedex.add(charmander);
        pokedex.add(squirtle);
        pokedex.add(bulbasaur);
        pokedex.add(charizard);
        pokedex.add(wartortle);
        pokedex.add(Ivysaur);

        for (Capturable pokemon: pokedex){
            System.out.println(pokemon);
            pokemon.capturar();
        }
    }
}
