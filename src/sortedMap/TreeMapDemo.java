/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedMap;

import java.util.*;

/**
 *
 * @author rtafuni
 */
public class TreeMapDemo {

    public static void main(String args[]) {
        //create a hash map
        TreeMap tm = new TreeMap();
        
        //put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));
        
        //get a set of the entries
        Set set = tm.entrySet();
        
        //get an iterator
        Iterator i = set.iterator();
        
        //display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        
        //Deposit 1000 into Zara's account
        double balance = ((Double)tm.get("Zara")).doubleValue();
        tm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + tm.get("Zara"));
        
    }
}
