package com.certificate.java.professional.datatype;


public class TypeCasting {
  public static void main(String[] args) {

    int a = 124;
    long b = a;
    double c = b;

    System.out.println("int value: " + a);
    System.out.println("long value: " + b);
    System.out.println("double value: " + c);

    double dbl = 135.35;
    long lg = (long) dbl;
    byte bt = (byte) lg;

    System.out.println("double value: " + dbl);
    System.out.println("long value: " + lg);
    System.out.println("byte value: " + bt);
  }
}
