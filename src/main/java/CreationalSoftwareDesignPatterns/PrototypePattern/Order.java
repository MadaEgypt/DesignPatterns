
package CreationalSoftwareDesignPatterns.PrototypePattern;

import java.util.List;


public class Order {
    
    private List <String> products ;
    
    private int customerId ;
    
    private String customerName ;
    
    private String deliveryType ;
    
    private String deliveryDuration ;
    
    private int points ;

    public Order (List<String> products, int customerId, String customerName, String deliveryType, String deliveryDuration, int points) {
        this.products = products;
        this.customerId = customerId;
        this.customerName = customerName;
        this.deliveryType = deliveryType;
        this.deliveryDuration = deliveryDuration;
        this.points = points;
    }

    public Order (Order order) {   // using it for clone ()
        this.products = order.products ;
        this.customerId = order.customerId;
        this.customerName = order.customerName;
        this.deliveryType = order.deliveryType;
        this.deliveryDuration = order.deliveryDuration;
        this.points = order.points;
    }

    public List <String> getProducts() {
        return products;
    }

    public void setProducts(List <String> products) {
        this.products = products;
    }
    

    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public Order clone () {

        return new Order (this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                ", deliveryDuration='" + deliveryDuration + '\'' +
                ", points=" + points +
                '}';
    }
}
