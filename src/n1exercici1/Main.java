package n1exercici1;

import java.util.ArrayList;

import static n1exercici1.Tools.getString;
import static n1exercici1.Tools.getDouble;
import static n1exercici1.Tools.getInt;

public class Main {

    public static void main(String[] args) throws VendaBuidaException  {
        menu();
    }

    public static void menu() throws VendaBuidaException {

        int klk;
        Venda venda = new Venda();

        do{
            System.out.println("\nTria una opcio:\n" +
                    "1. Afegir productes a la cistella\n" +
                    "2. Pagar.\n" +
                    "3. Sortir del programa");
            klk = getInt("Tria una opcio.\n");

            switch (klk){
                case 0:
                    break;
                case 1: //AFEGIR PRODUCTES CISTELLA
                    addProducts(venda);
                    break;
                case 2: //REALITZAR CALCUL PREU TOTAL
                    calculatePrice(venda);
                    break;
            }

        } while (klk != 3);

    }

    static void addProducts(Venda venda){

        String name ="";

        while (!name.equalsIgnoreCase("exit")){
            name = getString("\nCom es diu el producte que vols afegir? Exit per a sortir");
            if (!name.equalsIgnoreCase("exit")){
                venda.llistaProductes.add(new Producte(name, getDouble("Quant val?")));
            }
        }

    }

    static void calculatePrice(Venda venda) throws VendaBuidaException {

        try{
            venda.calculateTotal();
        } catch (VendaBuidaException ex){
            System.out.println(ex.getMessage());
        }
    }
}