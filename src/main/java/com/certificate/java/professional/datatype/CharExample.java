package com.certificate.java.professional.datatype;

public class CharExample {

  public static void main(String[] args) {
    char c1 = 72;
    char c2 = 53;

    System.out.println("c1: " + c1);
    System.out.println("Is first variable letter?: " + Character.isLetter(c1));
    System.out.println("Is first variable digit? " + Character.isDigit(c1));

    System.out.println("c2: " + c2);
    System.out.println("Is second variable letter?: " + Character.isLetter(c2));
    System.out.println("Is second variable digit? " + Character.isDigit(c2));

    char leeter1 = 67; //C
    int num1 = leeter1 + 3; //70 -> F
    char letter2 = (char) num1; //F

    System.out.println("letter2 is " + letter2);

    char letter3 = 70; //F
    char letter4 = letter3--;
    boolean check1 = letter4 == 'E';
    boolean check2 = --letter3 > 'D';

    System.out.println("check1 : " + check1);
    System.out.println("check2 : " + check2);
  }
}
