package model;

public class Cliente {

    private String Nome;
    private String Sobrenome;


    public Cliente( String nome,String sobrenome) {
        Sobrenome = sobrenome;
        Nome = nome;
    }


    public void Hello(){
        System.out.println("Olá Mundo!");
    }

    public void Bye(){
        System.out.println("Bye Bye baby!");
    }

    public String getNomeInteiro(){
        return Nome + " " + Sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }
}
