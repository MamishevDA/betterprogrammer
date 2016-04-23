package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dmitriy.mamishev
 */
public class ForRunT3 {

    public static void main(String[] args) {
        T3 t = new T3();
        T3.NodeClass root = t.new NodeClass();
        T3.NodeClass node1 = t.new NodeClass();
        T3.NodeClass node2 = t.new NodeClass();
        root.addNode(node1).addNode(node2);

        T3.NodeClass node11 = t.new NodeClass();
        T3.NodeClass node12 = t.new NodeClass();
        node1.addNode(node11).addNode(node12);

        System.out.printf("average = %s\n",T3.getAverage(root));
    }
}
