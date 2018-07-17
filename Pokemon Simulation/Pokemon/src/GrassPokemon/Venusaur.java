package GrassPokemon;
import Pokemon.Pokemon;


public class Venusaur extends Ivysaur {

    public Venusaur(){
        super.name= "Venusaur";
        super.type="grass";
        super.setOverallHP(110);
        super.currentHP=getOverallHP();
        super.status = "none";
        super.rarity = 3;
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


