
package CreationalSoftwareDesignPatterns.BuilderPattern;

import java.util.ArrayList;


public class BuilderApp {
    
    public static void main(String[] args) {
        
        Director director = new Director () ;
        
        
        ArrayList < String > products = new ArrayList <> ();
        
        products.add("products_1") ;
        
        products.add("products_2") ;
        
        products.add("products_3") ;
            
        
        System.out.println("-----------------------------------");
        
        OrderClassifcationA orderClassifcationBuilderA = new OrderClassifcationA ();
        
        director.createOrderObject(orderClassifcationBuilderA , products , 101 , "Mohamed", null , null , 0) ;
        
        Order order1 = orderClassifcationBuilderA.getResult() ;
        
        System.out.println(order1.getProducts());
        
        System.out.println(order1.getCaustomerId());
        
        System.out.println(order1.getCustomerName());
        
        System.out.println(order1.getDeliveryType());
        
        System.out.println(order1.getDeliveryDuration());
        
        System.out.println(order1.getPoints());
        
        
        System.out.println("-----------------------------------");
        
        OrderClassifcationB orderClassifcationBuilderB = new OrderClassifcationB ();
        
        director.createOrderObject(orderClassifcationBuilderB , products , 102 , "Omar", null , null , 0) ;
        
        Order order2 = orderClassifcationBuilderB.getResult() ;
        
        System.out.println(order2.getProducts());
        
        System.out.println(order2.getCaustomerId());
        
        System.out.println(order2.getCustomerName());
        
        System.out.println(order2.getDeliveryType());
        
        System.out.println(order2.getDeliveryDuration());
        
        System.out.println(order2.getPoints());
        
        
        System.out.println("-----------------------------------");
        
        OrderClassifcationC orderClassifcationBuilderC = new OrderClassifcationC ();
        
        director.createOrderObject(orderClassifcationBuilderC , products , 103 , "Rayan", null , null , 0) ;
        
        Order order3 = orderClassifcationBuilderC.getResult() ;
        
        System.out.println(order3.getProducts());
        
        System.out.println(order3.getCaustomerId());
        
        System.out.println(order3.getCustomerName());
        
        System.out.println(order3.getDeliveryType());
        
        System.out.println(order3.getDeliveryDuration());
        
        System.out.println(order3.getPoints());


       
    }
    
}
