package CreationalSoftwareDesignPatterns.FactoryMethodPattern;

// creator class
public class TransportationFactory {


    public Transportation getTransportation(String fanctionality) throws NullPointerException {

        if (fanctionality.equals("Land")) {
            
            System.out.println("[ 2 - land ]\n");
            
            return new LandTransportation();

        } else if (fanctionality.equals("Air")) {
            
            System.out.println("[ 1 - air ]\n");
            
            return new AirTransportation();
            

        } else { 
            
               System.out.println("Errorrrrrr");
               
               return null;
            }

        } 
    }


