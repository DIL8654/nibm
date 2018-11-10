package com.nibm.meetup.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class O7_AddAllAndChecked
{

  public static void main(String... args)
  {
    Set<Integer> set = new HashSet<Integer>();
    boolean b = Collections.addAll(set, 1, 2, 3, 4, 5); // add all method
    System.out.println(b);
    System.out.println(set);
    
    
    // checked set example
    
    set = Collections.checkedSet(set, Integer.class);
    set.add(1);
    System.out.println(set);

    Set set3 = set;
    set3.add("two");
    System.out.println(set3);
  }

}
