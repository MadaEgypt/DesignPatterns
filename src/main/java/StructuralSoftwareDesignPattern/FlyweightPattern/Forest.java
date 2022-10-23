package StructuralSoftwareDesignPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree (int x, int y, String name, String color){

        TreeType treeType = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);

    }
}
