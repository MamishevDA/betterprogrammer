package tests;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dmitriy.mamishev
 */
public class T3 {

    // Please do not change this interface
    public static interface Node {

        int getValue();

        List<Node> getChildren();
    }

    public static double getAverage(Node root) {
        /*
          Please implement this method to
          return the average of all node values (Node.getValue()) in the tree.
         */
        double sum = (root.getValue() + sum(root.getChildren()));
        double res = (double) sum / getCount();
        return res;
    }

    public static double sum(List<Node> node) {
        if (node.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Node node1 : node) {
            sum = sum + node1.getValue() + sum(node1.getChildren());
            count++;
        }
        return sum;
    }

    public class NodeClass implements Node {

        public NodeClass() {
            this.node = new ArrayList<>();
            this.value = (int) (Math.random() * 10);
            System.out.println(this.value);
        }

        @Override
        public int getValue() {
            return this.value;
        }

        @Override
        public List<Node> getChildren() {
            return this.node;
        }

        public NodeClass addNode(Node node) {

            this.node.add(node);
            return this;
        }
        private int value = 1;
        private List<Node> node;
    }

    public static int getCount() {
        return count;
    }

    private static int count = 1;

}
