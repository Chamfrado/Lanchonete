import model.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lohran", "Cintra");
        Cliente cliente2 = new Cliente("Marcos", "Estranho");



        System.out.println(cliente2.getNomeInteiro() );
        System.out.println(cliente.getNomeInteiro());
    }
}


