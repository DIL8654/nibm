package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O12_Sort
{

  public static void main(String... args)
  {
    List<Integer> list = Arrays.asList(210, 120, 33, 4, 50);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    
  }
}