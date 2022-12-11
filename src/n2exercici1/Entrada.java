package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Entrada {

    public Entrada() {
    }

    //EXCEPTION CLASS InputMismatchException
    public static byte llegirByte(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextByte()){
            return sc.nextByte();
        } else {
            throw new InputMismatchException("The introduced value is not a BYTE. Try again.");
        }
    }

    public static int llegirInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextInt()){
            return sc.nextInt();
        } else {
            throw new InputMismatchException("The introduced value is not an INT. Try again.");
        }


    }

    public static float llegirFloat(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextFloat()){
            return sc.nextFloat();
        } else {
            throw new InputMismatchException("The introduced value is not a FLOAT. Try again.");
        }

    }

    public static double llegirDouble(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextDouble()){
            return sc.nextDouble();
        } else {
            throw new InputMismatchException("The introduced value is not a DOUBLE. Try again.");
        }
    }

    //EXCEPTION CLASS Exception
    public static char llegirChar(String message) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.next().length() == 1){
            return sc.next().charAt(0);
        } else {
            throw new Exception("The introduced value is not a CHAR. Try again.");
        }
    }

    public static String llegirString(String message) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextLine()){
            return sc.nextLine();
        } else {
            throw new Exception("The introduced value is not a STRING. Try again.");
        }
    }

    public static boolean llegirSiNo(String message) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        if (sc.hasNextBoolean()){
            return sc.nextBoolean();
        } else {
            throw new Exception("The introduced value is not a BOOLEAN. Try again.");
        }
    }
}
