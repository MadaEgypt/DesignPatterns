
package CreationalSoftwareDesignPatterns.BuilderPattern;

import java.util.List;


public class OrderClassifcationA implements Builder{

    
    private List <String> products ;
    
    private int caustomerId ; 
    
    private String customerName ;
    
    private String deliveryType ;
    
    private String deliveryDuration ;
    
    private int points ;
    
    
    @Override
    public void setProducts(List<String> products) {
        this.products = products;
    }
    
    @Override
    public void setCaustomerId(int caustomerId) {
        this.caustomerId = caustomerId;
    }
    
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Override
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    
    @Override
    public void setDeliveryDuration(String deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }
    
    @Override
    public void setPoints(int points) {
        this.points = points;
    }
    
    @Override
    public Order getResult (){
        return new Order ( products , caustomerId , customerName , "Very_Fast" , "1 Day" , 1000 ) ;
    }
    
}
