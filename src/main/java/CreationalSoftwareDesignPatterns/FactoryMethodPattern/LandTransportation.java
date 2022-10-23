
package CreationalSoftwareDesignPatterns.FactoryMethodPattern;

// 2 - protected class
public class LandTransportation implements Transportation{

    @Override
    public int getPrice() {
        
        return 100 ;
    }

    @Override
    public int getTax() {
        
        return 100/10;
    }

    @Override
    public int getDuration() {

        return 7;  
    }
}
