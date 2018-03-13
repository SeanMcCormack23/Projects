public abstract class Omission {
    private String safety;

    Omission(){             //constructor
        safety= "Not set";
    }


     void setSafety(String safety){         //getters and setters
        this.safety= safety;
    }

     String getSafety(){
        return safety;
    }


    public String toString (){
        return ""+safety;
    }
}
