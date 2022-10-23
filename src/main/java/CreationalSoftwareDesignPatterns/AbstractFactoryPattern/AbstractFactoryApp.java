
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class AbstractFactoryApp {
    
    public static void main(String[] args) {
        
        try {
        
        System.out.println(FactoryCreator.getFactory("land").getLandTransportaion("lorry").getPrice() + " $");
        
        System.out.println(FactoryCreator.getFactory("land").getLandTransportaion("lorry").getDuration() + " Days");
        
        System.out.println(FactoryCreator.getFactory("land").getLandTransportaion("mini_bus").getPrice() + " $");
        
        System.out.println(FactoryCreator.getFactory("land").getLandTransportaion("mini_bus").getDuration() + " Days");
        
        System.out.println("-----------------------------------");
                
        System.out.println(FactoryCreator.getFactory("air").getAirTransportaion("airplane_bigSize").getPrice() + " $");
        
        System.out.println(FactoryCreator.getFactory("air").getAirTransportaion("airplane_bigSize").getDuration() + " Days");
        
        System.out.println(FactoryCreator.getFactory("air").getAirTransportaion("airplane_smallSize").getPrice() + " $");
        
        System.out.println(FactoryCreator.getFactory("air").getAirTransportaion("airplane_smallSize").getDuration() + " Days");
        
        System.out.println("-----------------------------------");
        
//        System.out.println(FactoryCreator.getFactory("").getLandTransportaion("").getPrice() + " $");
//
//        System.out.println(FactoryCreator.getFactory("").getLandTransportaion("").getDuration() + " Days");
//
//        System.out.println(FactoryCreator.getFactory("").getAirTransportaion("").getPrice() + " $");
//
//        System.out.println(FactoryCreator.getFactory("").getAirTransportaion("").getDuration() + " Days");
        
        
        } catch ( NullPointerException ex) {
            
            System.out.println("Erorrrrrrr");
            
            System.out.println(ex);
        }
        
    }
    
}
