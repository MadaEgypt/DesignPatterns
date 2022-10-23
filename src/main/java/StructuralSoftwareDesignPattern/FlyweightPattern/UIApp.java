package StructuralSoftwareDesignPattern.FlyweightPattern;

public class UIApp {

    public static void main(String[] args) {

        Forest forest = new Forest();
        forest.plantTree(10,20, "name1", "red");
        forest.plantTree(10,30, "name2", "blue");
        forest.plantTree(10,40, "name3", "green");

    }
}
