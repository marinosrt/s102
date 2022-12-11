package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int klk;
        Entrada entrada = new Entrada();

        do {
            System.out.println("\nTria una opcio:\n" +
                    "0. EXIT\n" +
                    "1. Get Byte value\n" +
                    "2. Get Int value\n" +
                    "3. Get Float value\n" +
                    "4. Get Double value\n" +
                    "5. Get Char value\n" +
                    "6. Get String value\n" +
                    "7. Get Boolean value");
            klk = sc.nextInt();

            switch (klk){
                case 0:
                    break;
                case 1: //BYTE
                    getByte(entrada);
                    break;
                case 2: //INT
                    getInt(entrada);
                    break;
                case 3: //FLOAT
                    getFloat(entrada);
                    break;
                case 4: //DOUBLE
                    getDouble(entrada);
                    break;
                case 5: //CHAR
                    getChar(entrada);
                    break;
                case 6: //STRING
                    getString(entrada);
                    break;
                case 7: //BOOLEAN
                    getBoolean(entrada);
                    break;
            }
        } while (klk != 0);
    }

    static void getByte(Entrada entrada){
        try{
            System.out.println("\nThe introduced Byte is: " + entrada.llegirByte("Type a Byte value"));
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            getByte(entrada);
        }
    }

    static void getInt(Entrada entrada){
        try{
            System.out.println("\nThe introduced Int is: " + entrada.llegirInt("Type a Int value"));
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            getInt(entrada);
        }
    }

    static void getFloat(Entrada entrada){

        try{
            System.out.println("The introduced Float is: " + entrada.llegirFloat("Type a Float value"));
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            getFloat(entrada);
        }

    }

    static void getDouble(Entrada entrada){

        try{
            System.out.println("The introduced Double is: " + entrada.llegirDouble("Type a Double value"));
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            getDouble(entrada);
        }
    }

    static void getChar(Entrada entrada){
        try{
            System.out.println("\nThe introduced Char is: " + entrada.llegirChar("Type a Char value"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            getChar(entrada);
        }
    }

    static void getString(Entrada entrada){

        try{
            System.out.println("\nThe introduced String is: " + entrada.llegirString("Type a String value"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            getString(entrada);
        }

    }

    static void getBoolean(Entrada entrada){

        try{
            System.out.println("The introduced Boolean is: " + entrada.llegirSiNo("Type a Boolean value"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            getBoolean(entrada);
        }

    }
}
