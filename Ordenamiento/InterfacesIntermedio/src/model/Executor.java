package model;

public class Executor {

    private Action action;

    public void execute(Action action){
        this.action = action;
        this.action.run("Alfa", "Beta");
    }






}
