package chap1;

import java.math.BigDecimal;
public class BigDecialDemo {
  @SuppressWarnings("deprecation")
public static void main(String[] argv) {

    System.out.println("--- Normal Print-----");
    System.out.println(2.00 - 1.1);
    System.out.println(2.00 - 1.2);
    System.out.println(2.00 - 1.3);
    System.out.println(2.00 - 1.4);
    System.out.println(2.00 - 1.5);
    System.out.println(2.00 - 1.6);
    System.out.println(2.00 - 1.7);
    System.out.println("\n--- BigDecimal Usage Print-----");
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.6")));
    System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.7")));
    BigDecimal d1= new BigDecimal("2.00");
    BigDecimal d2= new BigDecimal("1.17");
    System.out.println(d1.subtract(d2));
    BigDecimal bd1 = new BigDecimal("1234.34567");
    bd1 = bd1.setScale(3, BigDecimal.ROUND_CEILING);
    System.out.println(bd1);

  }
}