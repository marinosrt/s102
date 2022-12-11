package n1exercici1;

import java.util.Scanner;

public class Tools {

    static String getString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static double getDouble(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }

    static int getInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

}
