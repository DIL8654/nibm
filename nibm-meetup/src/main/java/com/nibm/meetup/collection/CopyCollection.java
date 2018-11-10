package com.nibm.meetup.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyCollection
{

  public static void main(String... args)
  {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(2,5,6,7,8,9);

    Collections.copy(list2, list);
    System.out.println(list2);

  }

}
