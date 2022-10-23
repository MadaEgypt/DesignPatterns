package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;

public class LandFactory implements AbstractFactory {
    
    @Override
    public LandTransportaion getLandTransportaion (String choice) throws NullPointerException {

        if (choice.equals("lorry")) {

            return new Lorry();

        } else if (choice.equals("mini_bus")) {

            return new MiniBus();

        } else {
            
            return null;
        }

    }

    @Override
    public AirTransportation getAirTransportaion (String choice) {
        
        return null ;
    }

}
