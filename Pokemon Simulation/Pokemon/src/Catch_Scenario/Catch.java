package Catch_Scenario;
import Pokemon.*;
import Pokeball.*;
import java.util.Random;

public class Catch {


   public static boolean Catch (Pokemon pokemon, Pokeball ball){

       double Balllevel = ball.level*0.01;
       int rarity = pokemon.rarity;
       double currentHP = pokemon.currentHP;
       double overallHP = pokemon.getOverallHP();
       double hp = (pokemon.currentHP*100);
       hp/=overallHP;
       double levelPokemon =  pokemon.level;

       System.out.println("CURRENT HP "+currentHP);
       System.out.println("OVERALL HP "+overallHP);
       System.out.println("NAME: "+pokemon.name);
       System.out.println("POKEBALL: "+Balllevel);
       System.out.println("RARITY: "+rarity);
       System.out.println("HP: "+hp+"%");
       System.out.println("LEVEL: "+levelPokemon);
//
//
//

        if (ball instanceof Master_Ball){
            return true;
        }
        else {

               double ans = probability(rarity,hp,Balllevel,levelPokemon);
            }





    return false;

        }

        public static double probability(double rarity, double hp, double Balllevel, double levelPokemon){

        double variableRare = rarity;


        double variableLevel = levelPokemon;

        hp = hp/100;
        hp = 1-hp;

        double factors = 0;



        System.out.println("hp at this point => "+hp);

        double result=variableLevel+variableRare;
        System.out.println("accumulation => "+result);
        result*=hp;
        result*=Balllevel;
            if (result<=35.3){
                factors = 3;
            }
            if (result<=20){
                factors = 4;
            }
            if (result<=10){
                factors= 5;
            }
            result*=factors;
        System.out.println("The result is  => "+result);


        boolean didICatch = didICatch(result);
        return result ;

        }



        public static boolean didICatch(double result){



       return true;
        }
   }


