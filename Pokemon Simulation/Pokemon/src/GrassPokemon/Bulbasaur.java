package GrassPokemon;

import Pokemon.Pokemon;


public class Bulbasaur extends Pokemon {

    public Bulbasaur(){
        super("Bulbasaur");
        super.type="grass";
        super.setOverallHP(60);
        super.currentHP=getOverallHP();
    }

    public Pokemon Evolution(Pokemon c){

        Ivysaur ev = new Ivysaur();
        c = (Ivysaur)ev;
        return c;


    }

    public Pokemon Attack(Pokemon p){
        System.out.println("bulba...bulbasaur");
        System.out.println("I am attacking a "+p.getClass());
        Pokemon ref;
        ref = p;

        System.out.println(" his health is "+p.currentHP);
        ref.currentHP -=15;

        return this;

    }



}
