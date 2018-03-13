public  abstract class Car {
    private AbstractWheels wheels;      //availability of multiple types of wheels from different companies
    private Engine  engine;             // two different types of engines, includes a transmission abstract object
    private Omission omission;             //two different omission types
    private String make;
    private String model;




    Car() {

    }

    void setWheels(AbstractWheels wheels){
        this.wheels = wheels;
    }
    void setEngine(Engine engine){
        this.engine = engine;
    }
    void setOmission(Omission omission){
        this.omission = omission;
    }
    void setMake(String make){
        this.make = make;
    }
    void setModel(String model){
        this.model = model;
    }


    public String toString() {
        return "Make : "+make+"\nModel " +model+"\nWheels_______ \n" + wheels + "\n\nEngine________" + engine + "\n\nOmission______" + omission+"\n ///////////////////// \n \n";
    }
}
