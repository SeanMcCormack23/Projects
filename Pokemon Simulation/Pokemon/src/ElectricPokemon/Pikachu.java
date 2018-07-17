package ElectricPokemon;
import Pokemon.*;

public class Pikachu extends Pokemon {

    public Pikachu(){
        super("Pikachu");
        super.type="Electric";
        super.setOverallHP(80);
        super.currentHP=getOverallHP();
        super.level=5;
        super.status = "none";
        super.rarity= 100;
        super.attack1Name="Tackle";
        super.attack1 = 10;
        super.attack2Name="Shock";
        super.attack2 = 30;
        super.attack3Name="Thundershock";
        super.attack3 = 35;
        super.attack4Name = "Growl";
        super.attack4 = 5;
    }

    public Pokemon Evolution(Pokemon p ){
        return p;

    }

    public Pokemon Attack(Pokemon p ){

        Attacking.AttackingPokemon(this,p,attack1Name);
        return this;
    }

}
