public class BridgestoneStandard extends Bridgestone {

    BridgestoneStandard() {             //derived from Bridgestone company


        String make = super.getMake();
        String model = "S100";
        super.setEverything(model,make,21,16,12);

    }
    public void getInfo () {
        super.toString();
    }

}
