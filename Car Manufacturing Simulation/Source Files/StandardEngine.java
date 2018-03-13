public class StandardEngine extends Engine {

    StandardEngine(){           //type of engine
        Transmission normalTranmission = new ManualTransmission();
        super.setEverything("Clutch 20PP",9,"340-19-11",normalTranmission);
    }
}
