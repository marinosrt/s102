package n1exercici1;
/*
*Aquesta subclass d'Exception ens serveix per a capturar la possibilitat que la collection de Vendes estigui buida.
* Si està buida informarem d'aquest error abans de calcular el totalPrice de la Venda.
*/

public class VendaBuidaException extends Exception{

    private String message;

    public VendaBuidaException(String message){
        this.message = message;
        getMessage();
    }


    public String getMessage(){
        return message;
    }

}
