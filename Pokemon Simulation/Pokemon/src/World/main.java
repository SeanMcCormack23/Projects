package World;
import FirePokemon.*;

import GrassPokemon.*;
import Pokeball.Standard_Pokeball;
import Pokemon.Pokemon;
import Catch_Scenario.*;
import Pokeball.*;

public class main {

    public static void main(String [] args){


Pokemon c = new Bulbasaur();
Pokemon d = new Charmeleon();
Pokemon e = new Charizard();



        Pokeball ball = new Standard_Pokeball();

        c = c.Attack(d);
        c = c.Attack(d);
        c= c.Attack(d);
        c = c.Attack(d);
//        c= c.Attack(d);
//        c= c.Attack(d);
//        c = c.Attack(d);



           boolean ans = Catch.Catch(d,ball);

           System.out.println("did i catch "+d.getClass()+" = "+ans);









    }








}
