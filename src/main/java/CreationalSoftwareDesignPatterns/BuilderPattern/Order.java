
package CreationalSoftwareDesignPatterns.BuilderPattern;

import java.util.List;


public class Order {
    
    private List <String> products ;
    
    private int caustomerId ; 
    
    private String customerName ;
    
    private String deliveryType ;
    
    private String deliveryDuration ;
    
    private int points ;

    public Order(List<String> products, int caustomerId, String customerName, String deliveryType, String deliveryDuration, int points) {
        this.products = products;
        this.caustomerId = caustomerId;
        this.customerName = customerName;
        this.deliveryType = deliveryType;
        this.deliveryDuration = deliveryDuration;
        this.points = points;
    }
    

    public List <String> getProducts() {
        return products;
    }

    public void setProducts(List <String> products) {
        this.products = products;
    }
    

    
    public int getCaustomerId() {
        return caustomerId;
    }

    public void setCaustomerId(int caustomerId) {
        this.caustomerId = caustomerId;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    

    
    public String getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(String deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }
  
    

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
    
    
    
    
}
