package com.certificate.java.professional.comments;

public class JavaComments {

  public static void main(String[] args) {
//    System.out.println("Test");

    /*
    * Every thing is ignored
    * */

    System.out.println(testMethod("test"));
  }

  /**
   *
   * @param test first param
   * @return This returns true if param is blank
   */
  public static boolean testMethod(String test){
    return test.isBlank();
  }

}
