package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O8_DisJoint
{

  public static void main(String... args)
  {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50, 60);
    boolean b = Collections.disjoint(list, list2);
    System.out.println(b);
    
    List<Integer> list3 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list4 = Arrays.asList(10, 20, 30, 4, 50, 60);
    boolean c = Collections.disjoint(list3, list4);
    System.out.println(c);
  }
}