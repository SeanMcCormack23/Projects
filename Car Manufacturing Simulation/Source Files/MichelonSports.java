public class MichelonSports extends Michelon {

    MichelonSports() {              //derived from Michelon

        String make = super.getMake();
        String model = "Michelon Sports Pro 3000c";
        super.setEverything(model,make,12,19,17);
    }


    public void getInfo () {
        super.toString();
    }

}
