package World;
import FirePokemon.Charizard;
import FirePokemon.Charmeleon;
import GrassPokemon.Bulbasaur;
import Pokemon.Pokemon;
import FirePokemon.Charmander;
public class main {

    public static void main(String [] args){


Pokemon c = new Bulbasaur();
Pokemon d = new Charmeleon();
Pokemon e = new Charizard();



    System.out.println(c);
        System.out.println(c.getOverallHP());

    c = c.Evolution(c);
    System.out.println(c);
        System.out.println(c.getOverallHP());





    }








}
