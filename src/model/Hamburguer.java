package model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;
    private double preco;

    public Hamburguer(ArrayList<String> ingredientes, double preco) {
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void tirarIngrediente(String ingrediente){
        this.ingredientes.remove(ingrediente);
    }
}
