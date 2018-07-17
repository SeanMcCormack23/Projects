package World;
import ElectricPokemon.Pikachu;
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



        Pokeball ball = new Ultra_Ball();




        System.out.println(c.getClass()+" health is "+c.currentHP);

        Pokemon pickachu = new Pikachu();
        System.out.println(pickachu.getClass()+" health is "+pickachu.currentHP);

        pickachu = pickachu.Attack(c);

        System.out.println(c.getClass()+" health is "+c.currentHP);

        System.out.println(pickachu.getClass()+" health is "+pickachu.currentHP);


        c = c.Attack(pickachu);
        c = c.Attack(pickachu);
        c = c.Attack(pickachu);

        c = c.Attack(pickachu);
        c = c.Attack(pickachu);
        c = c.Attack(pickachu);



        System.out.println(pickachu.getClass()+" health is "+pickachu.currentHP);




          boolean ans = Catch1_2.Catch(pickachu,ball);

           System.out.println("did i catch "+pickachu.getClass()+" = "+ans);









    }








}
