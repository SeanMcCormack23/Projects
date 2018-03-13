public class Series3 extends BMW {


    Series3(){              //creates a specific car using specific types of engine, transmission, omissions and wheels

        Engine engine = new StandardEngine();
        Transmission trans = new ManualTransmission();
        engine.setTransmission(trans);
        Omission omission = new OmissionEnvironmentFriendly();
        AbstractWheels wheels = new BridgestoneStandard();
        super.setWheels(wheels);
        super.setOmission(omission);
        super.setEngine(engine);
        super.setModel("Series3");


    }

}
