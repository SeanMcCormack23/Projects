package FirePokemon;
import Pokemon.Pokemon;


public class Charmeleon extends Charmander {

     public Charmeleon(){
        super.name= "Charmeleon";
        super.type="fire";
        super.setOverallHP(90);
        super.currentHP=getOverallHP();
        super.rarity=70;
        super.level = 17;
    }

    public Pokemon Evolution(){
        Charizard ref;

        ref= (Charizard)this;

        return ref;

    }

    public Pokemon Attack(Pokemon p){
        System.out.println("Charmeleon...ch..chh");
        p.currentHP-=70;

        return this;

    }



}