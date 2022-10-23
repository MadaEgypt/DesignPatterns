
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class AirPlaneSmallSize implements AirTransportation {
    
    @Override
    public int getPrice() {
        
        return 750 ;
    }

    @Override
    public int getDuration() {
        
        return 1 ;
    }
    
}
