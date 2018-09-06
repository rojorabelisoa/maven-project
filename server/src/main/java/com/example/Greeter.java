/**
* this is default package
**/
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
   * @param someone name of person
   * @return greeting return
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
