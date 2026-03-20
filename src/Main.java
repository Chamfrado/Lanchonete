import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredienteList = new ArrayList<String>();
        ingredienteList.add("pao");
        ingredienteList.add("hamburguer");
        ingredienteList.add("queijo");
        ingredienteList.add("bacon");
        ingredienteList.add("jiló");
        ingredienteList.add("ovo");



        Cliente cliente = new Cliente("Lohran", "Cintra");
        Hamburguer hamburguer = new Hamburguer(ingredienteList);

        Pedido pedido1 = new Pedido(cliente, hamburguer);

        System.out.println(hamburguer.getIngredientes());
    }
}

