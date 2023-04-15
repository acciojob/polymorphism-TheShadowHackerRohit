package com.driver;

public class Main {

    public static class  Product{// task 1
        public static int product(int x, int y) {//task 3
            return x*y;
        }

         public static int product(int x, int y, int z) {//task 4
            return x*y*z;
         }
         public static double product(double x, double y) {//task 5
            return x*y;
         }
    }

    public static void main(String[] args) {

        Product p = new Product();//task 2

        p.product(1,2);
        //System.out.println(p.product(1,2));

        p.product(1,2,3);
        //System.out.println(p.product(1,2,3));

        p.product(1.000,2.000);
        //System.out.println(p.product(1.000,2.000));

    }

}