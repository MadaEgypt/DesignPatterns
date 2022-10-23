package CreationalSoftwareDesignPatterns.FactoryMethodPattern;

// main class
public class FactoryPatternAPP {

    public static void main(String[] args) {

//        TransportationFactory.getTransportation("Air");
//        
//        System.out.println("------------------------");
//        
//        TransportationFactory.getTransportation("Land");
//        
//        System.out.println("------------------------");
        try {

            TransportationFactory factory = new TransportationFactory();

            Transportation TransportationWay = factory.getTransportation("Air");

            System.out.println("Price = " + TransportationWay.getPrice() + " $");

            System.out.println("Tax = " + TransportationWay.getTax() + " $");

            System.out.println("Duration = " + TransportationWay.getDuration() + " Days");

            System.out.println("-----------------------------------------------");

            TransportationWay = factory.getTransportation("Land");

            System.out.println("Price = " + TransportationWay.getPrice() + " $");

            System.out.println("Tax = " + TransportationWay.getTax() + " $");

            System.out.println("Duration = " + TransportationWay.getDuration() + " Days");

            System.out.println("-----------------------------------------------");

//            TransportationWay = factory.getTransportation("EEE");
//
//            System.out.println("Price = " + TransportationWay.getPrice() + " $");
//
//            System.out.println("Tax = " + TransportationWay.getTax() + " $");
//
//            System.out.println("Duration = " + TransportationWay.getDuration() + " Days");
//
//            System.out.println("-----------------------------------------------");

        } catch (NullPointerException ex) {

            System.out.println(ex);

        }

    }

}
