package Pokemon;


public abstract class Pokemon implements Attack{

    public abstract Pokemon Evolution(Pokemon c);

    private int overallHP;
    public int currentHP;
    public int attack;
    public String type;
    public  int level;
    public  String name;
    public int rarity;
    public String status;
    public String attack1Name;
    public int attack1;
    public String attack2Name;
    public int attack2;
    public String attack3Name;
    public int attack3;
    public String attack4Name;
    public int attack4;



   public Pokemon(String name){
        this.name = name;
    }
    public Pokemon Attack(Pokemon p){

       System.out.println(" i am attacking you."+p);

       return p;

    }
    public void setOverallHP (int hp){
       this.overallHP = hp;
    }
    public int getOverallHP(){
       return this.overallHP;
    }

}
