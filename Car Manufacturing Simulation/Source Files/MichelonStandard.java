public class MichelonStandard extends Michelon {


    MichelonStandard() {            //derived from Michelon

        String make = super.getMake();
        String model = "Michelon Standard Wheels 100";
        super.setEverything(model,make,15,22,13);
    }

    public void getInfo () {
        super.toString();
    }

}
