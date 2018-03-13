public abstract class Engine {
    private String clutch;
    private int co2;
    private String dssr;
    private Transmission transmission; // abstract transmission object


    Engine () {
        clutch = "Not yet installed";
        co2 = 0;
        dssr = "Not yet installed";
    }

    public void setClutch(String clutch){               //getters andf setters
        this.clutch  = clutch;
    }
    public String getClutch() {
        return clutch;
    }
    public void setCo2(int co2){
        this.co2 = co2;
    }
    public int getCo2() {
        return co2;
    }
    public void setDssr(String dssr) {
        this.dssr = dssr;

    }
    public String getDssr(){
        return dssr;
    }
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }
    public Transmission getTransmission(){
        return transmission;
    }

    void setEverything(String clutch, int co2, String dssr,Transmission transmission){
       this.clutch = clutch;
       this.co2 = co2;
       this.dssr = dssr;
       this.transmission= transmission;
    }

    public String toString() {
        return "Clutch : "+clutch+"\nC02 : "+co2 +"\nDSSR :" +dssr + "\nTransmission : " + transmission;
    }

}
