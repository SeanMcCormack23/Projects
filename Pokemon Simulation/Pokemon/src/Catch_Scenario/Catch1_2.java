package Catch_Scenario;
import Pokemon.*;
import Pokeball.*;
import java.util.Random;

public class Catch1_2 {


    public static boolean Catch(Pokemon pokemon, Pokeball ball) {

        int Ball_level = ball.level;

        int s;

        int rand1;

        int divider;



        if (ball instanceof Master_Ball) {
            return true;
        }

        else
        {

           if (pokemon.name == "Marowak")
           {
               return false;
           }
           else
           {
               Random r = new Random();

               if (Ball_level==25)
               {
                    rand1 = r.nextInt(255)+1;
                    System.out.println(rand1);
                    divider = 12;
               }
               else if (Ball_level ==50)
               {
                    rand1 = r.nextInt(200)+1;
                   System.out.println(rand1);
                   divider = 8;
               }
               else
               {
                    rand1 = r.nextInt(150)+1;
                    divider = 12;
                   System.out.println(rand1);
               }


           if(pokemon.status=="Asleep" || pokemon.status=="Frozen")
           {
               s = 25;
               System.out.println(s);
           }
           else if (pokemon.status=="Burnt" || pokemon.status == "Paralyzed" || pokemon.status=="Confused")
               {
                   s = 10;
                   System.out.println(s);
               }
            else
           {
               s = 0;
               System.out.println(s);
           }



          int ans = rand1-s;

               System.out.println("check 1 = "+ans);

               if (ans<0){
                   return true;
               }

               else
               {

                   int maxHP = pokemon.getOverallHP()*255;
                   System.out.println("algorithm HP ="+maxHP);

                   int ans_after_ball = maxHP/divider;
                   System.out.println("algorithm after = "+ans_after_ball);

                   int currentHP_ready = pokemon.currentHP/4;
                   System.out.println("current HP  = "+currentHP_ready);

                   int overall_num = ans_after_ball/currentHP_ready;
                   System.out.println("FINAL  = "+overall_num);

                   if (overall_num>255)
                   {
                       overall_num=255;
                   }

                   if (pokemon.rarity<ans){
                       System.out.println("didnt catch due to rarity.\n Rarity =>"+pokemon.rarity+"\n ans => "+ans);
                       return false;
                   }
                   else {
                       int final1 = r.nextInt(255)+1;

                       if (overall_num>final1){
                           System.out.println(pokemon.name+" was Caught.");
                           return true;
                       }
                       else {
                           return false;
                       }

                   }



               }


           }

        }




    }


}


