package StructuralSoftwareDesignPattern.CompositePattern;

public class UIApp {

    public static void main(String[] args) {

        Employee CEO =new Employee( "Mohamed", "CEO", 50000);

        Employee financeManager =new Employee( "Omar", "Head Finance", 30000);
        Employee itManager =new Employee( "Rayan", "Head IT", 30000);

        Employee RevisionManager =new Employee( "Ahmed", "Finance_Revision", 20000);
        Employee PayrollManage =new Employee( "Ali", "Finance_Payroll", 20000);

        Employee programmingManager =new Employee( "Mahmoud", "IT Programming", 10000);
        Employee networkManager =new Employee( "Ayman", "IT Network", 10000);

        CEO.add(financeManager);
        CEO.add(itManager);

        financeManager.add(RevisionManager);
        financeManager.add(PayrollManage);

        itManager.add(programmingManager);
        itManager.add(networkManager);

        System.out.println("CEO : " + CEO.getName());
        for (Employee manager : CEO.getSubOrdinates()){
            System.out.println("  Manager : " + manager.getName() );
            for(Employee subManager : manager.getSubOrdinates()){
                System.out.println("    Sup Manager : " + subManager.getName());
            }
        }
    }
}
