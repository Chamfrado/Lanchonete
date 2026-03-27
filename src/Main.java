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


        Hamburguer hamburguer = new Hamburguer(ingredienteList, 19);

        System.out.println(hamburguer.getIngredientes());

        System.out.println("Antes de tirar: " + hamburguer.getIngredientes());
        hamburguer.tirarIngrediente("jiló");
        System.out.println("Depois de tirar: " + hamburguer.getIngredientes());

        //Cliente cliente = new Cliente("Lohran", "Cintra");
//
        //Pedido pedido1 = new Pedido(cliente, hamburguer);


    }
}

