package com.nibm.meetup.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 1.5 JDK-pre
public class O1_ArrayListObj
{
  public static void main(String[] args)
  {
    List lst = new ArrayList(); // A List contains instances of Object. Upcast ArrayList to List
    lst.add("alpha"); // add() takes Object. String upcast to Object implicitly
    lst.add("beta");
    lst.add("charlie");
    lst.add(new Integer(100));

    System.out.println(lst); // [alpha, beta, charlie]

    // Get a "iterator" instance from List to iterate thru all the elements of the
    // List
    Iterator iter = lst.iterator();
    while (iter.hasNext())
    { // any more element
      // Retrieve the next element, explicitly downcast from Object back to String
      Object str = iter.next();
      //String str =  (String) iter.next();// what happen when it is cast to the String Pre-1.5 JDK is not type-safe
      System.out.println(str);
    }
  }
}