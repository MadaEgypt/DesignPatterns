
package CreationalSoftwareDesignPatterns.BuilderPattern;

import java.util.List;


public class Director {
    
    public void  createOrderObject (Builder builder , List products ,  int id , String name ,String type , String days , int points){
        
        builder.setProducts(products);
        
        builder.setCaustomerId(id);
        
        builder.setCustomerName(name);
        
        builder.setDeliveryType(null);
        
        builder.setDeliveryDuration(null);
        
        builder.setPoints(0);
    }
    
    
}
