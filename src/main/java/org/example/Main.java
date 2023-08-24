package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static int fibonacci(int a) {
        int zahl1 = 0;
        int zahl2 = 1;
        int zahl3 = 0;

        if (a < 2) {

            return a;
        }
        for (int j = 0; j+2 <= a; j++) {

            zahl3 = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = zahl3;


        }

        return zahl3;

    }
}
