package WaterPokemon;

import Pokemon.Pokemon;


public class Squirtle extends Pokemon {

    public Squirtle() {
        super("squirtle");
        super.type = "water";
        super.setOverallHP(60);
        super.currentHP = getOverallHP();
    }

    public Pokemon Evolution(Pokemon c) {

        Wartortle ev = new Wartortle();
        c = (Wartortle) ev;
        return c;


    }

    public Pokemon Attack(Pokemon p) {
        System.out.println("Charmander...ch..ch.charmander");
        Pokemon ref;
        ref = p;

        ref.currentHP -= 15;

        return this;

    }

}
