package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O13_ReverseAndReverseOrder
{

  public static void main(String... args)
  {
    List<String> list = Arrays.asList("one", "two", "three", "tour");
    Collections.reverse(list);
    System.out.println(list);
    
    List<String> list2 = Arrays.asList("one", "two", "three", "four");
    Collections.sort(list2, Collections.reverseOrder());
    System.out.println(list2);
  }
}