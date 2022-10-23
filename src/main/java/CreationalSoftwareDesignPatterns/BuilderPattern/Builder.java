
package CreationalSoftwareDesignPatterns.BuilderPattern;

import java.util.List;


public interface Builder {
    
    void setProducts(List <String> products) ;
    
    void setCaustomerId(int caustomerId) ; 
    
    void setCustomerName(String customerName) ;
    
    void setDeliveryType(String deliveryType) ;
    
    void setDeliveryDuration(String deliveryDuration) ;
    
    void setPoints(int points) ;
    
    public abstract Order getResult () ;
    
}
