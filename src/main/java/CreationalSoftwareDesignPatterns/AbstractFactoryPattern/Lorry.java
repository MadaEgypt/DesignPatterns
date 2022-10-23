
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class Lorry implements LandTransportaion {

    @Override
    public int getPrice() {
        
        return 150 ;
    }

    @Override
    public int getDuration() {
        
        return 7 ;
    }
        
    
}
