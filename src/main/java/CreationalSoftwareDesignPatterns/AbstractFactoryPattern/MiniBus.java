
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class MiniBus implements LandTransportaion {

    @Override
    public int getPrice() {
        
        return 300 ;
        
    }

    @Override
    public int getDuration() {
        
        return 3 ;
        
    }
    
}
