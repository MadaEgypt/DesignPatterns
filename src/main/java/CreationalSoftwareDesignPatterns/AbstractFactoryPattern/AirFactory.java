
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class AirFactory implements AbstractFactory {
        
    @Override
    public AirTransportation getAirTransportaion (String choice) throws NullPointerException{
        
        if (choice.equals("airplane_bigSize")) {

            return new AirPlaneBigSize();

        } else if (choice.equals("airplane_smallSize")) {

            return new AirPlaneSmallSize();

        } else {
            
            return null;
        }
    }
    
    @Override
    public LandTransportaion getLandTransportaion (String choice) {

        return null ;

    }

    
    
    
}
