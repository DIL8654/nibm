package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O11_MaxMinElement
{

  public static void main(String... args)
  {
    List<Integer> list = Arrays.asList(20, 10, 100, 140);
    Integer max = Collections.max(list);
    System.out.println(max);
    
    List<Integer> list2 = Arrays.asList(20, 10, 100, 140);
    Integer max2 = Collections.max(list2, Collections.reverseOrder());
    System.out.println(max2);
  }
}