package CreationalSoftwareDesignPatterns.PrototypePattern;

import java.util.ArrayList;

public class PrototypeApp {

    public static void main(String[] args) {

        ArrayList< String > products = new ArrayList <> ();

        products.add("products_1") ;

        products.add("products_2") ;

        products.add("products_3") ;

        Order order1 = new Order(products , 101 , "Mohamed", null , null , 0 );

        Order order2 = order1.clone();

        System.out.println(order2.getProducts());

        System.out.println(order2.getCustomerId());

        System.out.println(order2.getCustomerName());

        System.out.println(order2.getDeliveryType());

        System.out.println(order2.getDeliveryDuration());

        System.out.println(order2.getPoints());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(order1.toString());
    }
}
