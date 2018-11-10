package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O10_BinarySearch
{

  public static void main(String... args)
  {
    List<String> list = Arrays.asList("one", "two", "three", "four");
    Collections.sort(list);
    System.out.println("sorted list: " + list);
    int index = Collections.binarySearch(list, "three");
    System.out.println(index);
  }
}