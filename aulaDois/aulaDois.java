public class Pessoa extends Humano {
    private String nome;
    private Float altura;
    private Integer idade;
    private int passos;


    public Pessoa(String nome, Float altura, Integer idade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.passos = passos;
    }



    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Float getAltura(){
        return altura;
    }

    public void setAltura(){
        this.altura = altura;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setIdade(){
        this.idade = idade;
    }


    @Override
    public void Falar(String fala){
        System.out.println(nome + "disse: " + fala);
    }

    public void Andar(){
        this.passos = passos + 1;
    }

    public void setNome(String novoNome) {
    this.nome = novoNome;
    System.out.println("O nome foi alterado para " + novoNome);
    }

}