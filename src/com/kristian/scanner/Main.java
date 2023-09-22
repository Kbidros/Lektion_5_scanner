package com.kristian.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

        do {

            int result = scannerNumber();

            if (result > 1000){
                isPlaying = false;
                break;

            }

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("Looping...");
            }




        } while (isPlaying);

    }

    public static int scannerNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert a number");
        return sc.nextInt(); //radix?
    }
    public static String scannerText () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = sc.nextLine();

        return input;
    }

}
