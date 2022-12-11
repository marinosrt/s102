package n1exercici1;

import java.util.ArrayList;

public class Venda {
    ArrayList<Producte> llistaProductes;
    double preuTotalVenda;
    boolean initial = false;

    public Venda() {
        llistaProductes = new ArrayList<>();
    }

    public double getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public void setPreuTotalVenda(double preuTotalVenda) {
        this.preuTotalVenda = preuTotalVenda;
    }

    public void addProducts(Producte product){
            llistaProductes.add(product);
    }

    public void calculateTotal() throws VendaBuidaException {
        if (llistaProductes != null){
            for (int i = 0; i < llistaProductes.size(); i++){
                preuTotalVenda += llistaProductes.get(i).getPrice();
            }
            System.out.println("\nPreu total de la compra: " + preuTotalVenda + "€\n");
        } else {
            throw new VendaBuidaException("\nPer a fer una venda primer has d'afegir productes");
        }

    }

}
