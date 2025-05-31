package com.certificate.java.professional.inputoutput;

import java.util.Scanner;

public class BasicInput {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Type your name:");
    String name = sc.nextLine();
    System.out.println("Your name is: " + name);
    sc.close();
  }
}
