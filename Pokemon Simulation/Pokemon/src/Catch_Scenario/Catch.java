package Catch_Scenario;
import Pokemon.*;
import Pokeball.*;
import java.util.Random;

public class Catch {


   public static boolean Catch (Pokemon pokemon, Pokeball ball){

       int Balllevel = ball.level;
       int rarity = pokemon.rarity;
       double currentHP = pokemon.currentHP;
       double overallHP = pokemon.getOverallHP();
       double hp = (pokemon.currentHP*pokemon.getOverallHP());
       hp/=100;

//       System.out.println("CURRENT HP "+currentHP);
//       System.out.println("OVERALL HP "+overallHP);
//       System.out.println("level of ball is "+Balllevel);
//       System.out.println("rarity of pokemon is "+rarity);
//       System.out.println("HP % of pokemon is "+hp+"%");






        if (ball instanceof Master_Ball){
            return true;
        }
        else {

            if(hp<=10){
                Random R = new Random();
                double result= R.nextInt(3)+1;
                System.out.println(result);

                if(result<2){
                    return true;
                }
            }


            return true;





        }





    }
}
