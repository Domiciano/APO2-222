package exceptions;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(double total, double price) {
        super("El precio es de "+price+" y no le alcanza porque tiene "+total);
    }
}
