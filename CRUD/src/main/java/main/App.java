package main;

public class App {
    public static void main(String[] args) {
        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();

        System.out.println("I'm all right!");
    }
}
