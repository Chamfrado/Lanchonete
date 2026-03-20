package model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;

    public Hamburguer(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
