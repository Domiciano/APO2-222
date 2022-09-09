package exceptions;

public class InvalidAmmountException extends Exception{

    public InvalidAmmountException(double value) {
        super("El valor "+value+" no es registro válido");
    }
}

