
package CreationalSoftwareDesignPatterns.FactoryMethodPattern;

// 3 - protected class
public class AirTransportation implements Transportation{

    @Override
    public int getPrice() {
        
        return 200;
    }
       
    @Override
    public int getTax() {
        
        return 200/10;
    }
       
    @Override
    public int getDuration() {
        
        return 3;
    }
        
    
}
