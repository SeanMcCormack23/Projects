public class BridgestoneSpecial extends Bridgestone {

    BridgestoneSpecial() {                  //derived from Bridgestone, certain type of Wheel

        String make = super.getMake();
        String model = "SPF5000CC";
        super.setEverything(model,make,24,19,14);
    }


    public void getInfo () {
        super.toString();
    }
}
