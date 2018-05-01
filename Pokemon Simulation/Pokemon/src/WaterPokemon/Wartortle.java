package WaterPokemon;

import Pokemon.Pokemon;


public class Wartortle extends Squirtle {

    public Wartortle(){
        super.name= "Wartortle";
        super.type="water";
        super.setOverallHP(90);
        super.currentHP=getOverallHP();
    }

    public Pokemon Evolution(){
        Blastoise ref;

        ref= (Blastoise)this;

        return ref;

    }

    public Pokemon Attack(Pokemon p){
        System.out.println("Charmeleon...ch..chh");
        p.currentHP-=70;

        return this;

    }



}