
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class AirPlaneBigSize implements AirTransportation {
    
    @Override
    public int getPrice() {
        
        return 500 ;
    }

    @Override
    public int getDuration() {
        
        return 2 ;
    }
    
}
