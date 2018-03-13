public abstract class  Transmission {
private String type;
    Transmission() {            //transmission abstract class
        String type = "not set";

    }
    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return " "+type;
    }


}
