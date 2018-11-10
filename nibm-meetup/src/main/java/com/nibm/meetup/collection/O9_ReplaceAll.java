package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class O9_ReplaceAll
{

  public static void main(String... args)
  {
    List<String> list = Arrays.asList("one", "two", "one");
    System.out.println(list);
    boolean b = Collections.replaceAll(list, "one", "three");
    System.out.println(b);
    System.out.println(list);
  }
}