public class Main {
    public static void main(String[] args){
        String nome = "Rafael";


        if (nome.equals("Rafael")) {
            System.out.println("Fala patrão");
        } else if(nome.equals("Rafiel")) {
            System.out.println("Você quis dizer \"Rafael\"?");
        } else {
            System.out.println("Vaza daqui impostor!");
        }
    }
}