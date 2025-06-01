package com.certificate.java.professional.datatype.numbers;

public class Numbers {
  public static void main(String[] args) {

    System.out.println("-------------- Octal Numbers ---------------");
    // Octal
    // octal numbers: (0-7)

    int octalNumber1 = 015; // this will be stored as 13 in decimal
    int octalNumber2 = 0104;
    int sumOctalNumbers = octalNumber1 + octalNumber2;

    System.out.println("OctalNumber1 in decimal: " + octalNumber1);
    System.out.println("OctalNumber2 in decimal: " + octalNumber2);
    System.out.println("Result in decimal: " + sumOctalNumbers);
    System.out.println("Result in Octal: " + Integer.toOctalString(sumOctalNumbers));

    System.out.println("-------------- Hexadecimal Numbers -------------");

    int hexNumber1 = 0x1B0;
    int hexNumber2 = 0X2F;
    int sumHexNumbers = hexNumber1 + hexNumber2;

    System.out.println("hexNumber1 in decimal: " + hexNumber1);
    System.out.println("hexNumber2 in decimal: " + hexNumber2);
    System.out.println("Result in decimal: " + sumHexNumbers);
    System.out.println("Result in Octal: " + Integer.toHexString(sumHexNumbers));


    System.out.println("-------------- Binary Numbers -------------");

    int binaryNumber1 = 0b1001;
    int binaryNumber2 = 0B1011;
    int sumBinaryNumbers = binaryNumber1 + binaryNumber2;

    System.out.println("binaryNumber1 in decimal: " + hexNumber1);
    System.out.println("binaryNumber2 in decimal: " + hexNumber2);
    System.out.println("Result in decimal: " + sumBinaryNumbers);
    System.out.println("Result in binary: " + Integer.toBinaryString(sumBinaryNumbers));

  }
}
