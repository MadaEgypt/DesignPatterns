
package CreationalSoftwareDesignPatterns.FactoryMethodPattern;

// 1 - protected class
public interface Transportation {
    
   public abstract int getPrice ();
   
   public abstract int getTax ();
   
   public abstract int getDuration ();   
    
}
