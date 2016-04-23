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
import java.util.*;

public class T2 {

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
        Set res = new HashSet();
        res.addAll(a);
        res.retainAll(b);

        return res;
    }

    public static void main(String[] args) {
        Set a = new HashSet();
        a.add("str1");
        a.add("str2");
        a.add("str3");
        Set b = new HashSet();
        b.add("str1");
        b.add("str5");
        b.add("str7");

        System.out.println(T2.getIntersection(a, b));
    }
}
