package GrassPokemon;

import Pokemon.Pokemon;


public class Bulbasaur extends Pokemon {

    public Bulbasaur(){
        super("Bulbasaur");
        super.type="grass";
        super.setOverallHP(60);
        super.currentHP=getOverallHP();
        super.level=5;
        super.rarity = 60;
    }

    public Pokemon Evolution(Pokemon c){

        Ivysaur ev = new Ivysaur();
        c = (Ivysaur)ev;
        return c;


    }

    public Pokemon Attack(Pokemon p){

        Pokemon ref;
        ref = p;


        ref.currentHP -=10;

        return this;

    }



}
