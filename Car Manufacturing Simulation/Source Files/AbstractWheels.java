public abstract class AbstractWheels {
   private  int threads;                ///attributes
   private  int size;
    private int diameter;
    private String make;
   private  String model;

    AbstractWheels(){
        threads = 22;                   //default
        size = 17;
        diameter= 12;
        make = "default";
        model = "default";
    }
    AbstractWheels(int threads,int size, int diameter){         //formal parameters
        this.threads = threads;
        this.size = size;
        this.diameter = diameter;
    }

     void setThreads(int threads){          //getters and setters
        this.threads = threads;
    }
     int getThreads(){
        return threads;
    }
     void setMake(String make){
        this.make = make;
    }
     String getMake(){
       return make;
    }
     void setSize(int size){
        this.size = size;
    }
    int getSize(){
        return size;
    }
     void setDiameter(int diameter){
        this.diameter = diameter;
    }
     int getDiameter() {
        return diameter;
    }
    void setModel(String model){
        this.model = model;
    }
    String getModel() {
        return model;
    }

    void setEverything(String model, String make, int threads,int size, int diameter){ //multiple setter
        this.model = model;
        this.make= make;
        this.threads = threads;
        this.size = size;
        this.diameter = diameter;
    }



    public String toString() {
        return "Make : "+make+" \nModel : "+model +"\nThreads :" + threads + "\nSize : " + size + "\nDiameter :" + diameter;
    }


}
