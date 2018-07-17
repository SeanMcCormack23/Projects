package Pokemon;

public class Attacking {


    public static Pokemon AttackingPokemon(Pokemon me, Pokemon p,String attackMove){


            Pokemon ref;
            ref = p;

            ref.currentHP -=10;

            return ref;



    }
}
