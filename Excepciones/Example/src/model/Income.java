package model;

import exceptions.InvalidAmmountException;

public class Income {

    private double value;

    public Income(double value) throws InvalidAmmountException {
        if(value <= 0){
            throw new InvalidAmmountException(value);
        }else{
            this.value = value;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
