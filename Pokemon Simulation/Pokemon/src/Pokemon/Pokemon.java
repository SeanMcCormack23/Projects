package Pokemon;


public abstract class Pokemon implements Attack{

    public abstract Pokemon Evolution(Pokemon c);

    private int overallHP;
    public int currentHP;
    public int attack;
    public String type;
    public  int level;
    public  String name;



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
