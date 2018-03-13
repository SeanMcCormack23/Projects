public class MiniCooper extends Mini {

    MiniCooper(){
       Engine engine = new StandardEngine();
       Transmission trans = new ManualTransmission();
       AbstractWheels wheels = new BridgestoneStandard();
       Omission omission = new OmissionStandard();

       engine.setTransmission(trans);
       super.setEngine(engine);
       super.setWheels(wheels);
       super.setOmission(omission);
       super.setModel("Mini Cooper Standard");
    }
}
