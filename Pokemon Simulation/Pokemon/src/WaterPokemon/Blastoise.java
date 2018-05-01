package WaterPokemon;

import Pokemon.Pokemon;


public class Blastoise extends Wartortle {

    public Blastoise(){
        super.name= "Blastoise";
        super.type="water";
        super.setOverallHP(112);
        super.currentHP=getOverallHP();
    }

    public Pokemon Evolution(){


        return null;

    }

    public Pokemon Attack(Pokemon p){
        System.out.println("Charmeleon...ch..chh");
        p.currentHP-=70;

        return this;

    }



}