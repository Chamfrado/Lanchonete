package model;

public class Pedido {


    private Cliente cliente;
    private Hamburguer hamburguer;

    public Pedido(Cliente cliente, Hamburguer hamburguer) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hamburguer getLanche() {
        return hamburguer;
    }

    public void setLanche(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getStatus(){
        return cliente.getNomeInteiro() + " " + hamburguer.getIngredientes();
    }
}
