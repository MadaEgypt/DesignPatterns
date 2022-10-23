
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public interface AbstractFactory {
    
    public abstract LandTransportaion getLandTransportaion (String choice);
    
    public abstract AirTransportation getAirTransportaion (String choice);
    
}
