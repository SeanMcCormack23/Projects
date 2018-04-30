package FirePokemon;
import Pokemon.Pokemon;


 public class Charmander extends Pokemon {

   public Charmander(){
        super("Charmander");
        super.type="fire";
       super.setOverallHP(60);
       super.currentHP=getOverallHP();
    }

     public Pokemon Evolution(Pokemon c){

       Charmeleon ev = new Charmeleon();
       c = (Charmeleon)ev;
       return c;


     }

    public Pokemon Attack(Pokemon p){
       System.out.println("Charmander...ch..ch.charmander");
       Pokemon ref;
       ref = p;

        ref.currentHP -=15;

       return ref;

    }



}
