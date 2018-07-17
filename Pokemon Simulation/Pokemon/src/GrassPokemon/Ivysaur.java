package GrassPokemon;

import Pokemon.Pokemon;


public class Ivysaur extends Bulbasaur {


    public Ivysaur(){
        super.name= "Ivysaur";
        super.type="grass";
        super.setOverallHP(90);
        super.currentHP=getOverallHP();
        super.status = "none";
        super.rarity = 4;
    }

    public Pokemon Evolution(){
        Venusaur ref;

        ref= (Venusaur)this;

        return ref;

    }

    public Pokemon Attack(Pokemon p){
        System.out.println("Charmeleon...ch..chh");
        p.currentHP-=70;

        return this;

    }



}
