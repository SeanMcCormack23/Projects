package FirePokemon;
import Pokemon.Pokemon;


public class Charizard extends Charmeleon {

    public Charizard (){
        super.name="Charizard";
        super.type="fire";
        super.setOverallHP(120);
        super.currentHP=getOverallHP();
        super.rarity=3;
        super.level = 37;
        super.status = "none";
    }

    public Pokemon Evolution(){

        return null;
    }

    public Pokemon Attack(Pokemon p){
        System.out.println("ch..chh..chharizard");
        p.currentHP-=95;

        return this;

    }



}