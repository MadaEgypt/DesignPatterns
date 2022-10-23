
package CreationalSoftwareDesignPatterns.AbstractFactoryPattern;


public class FactoryCreator {
    
    public static AbstractFactory getFactory (String choice)throws NullPointerException{
        
        if (choice.equals("land")) {

            return new LandFactory();

        } else if (choice.equals("air")) {

            return new AirFactory();

        } else {
            
            return null;
        }
    }  
}
