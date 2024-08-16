public class Main {
    public static void main(String[] args) {
        String[] = nomes = {"Rodrigo", "João", "Rafael", "Rafiel"};

        for(int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Rafael")) {
                System.out.println("Fala " + nomes[i] + "!");
            } else if (nomes[i].equals("Rafiel")) {
                System.out.println("Você quis dizer \"Rafael\"?");
            } else {
                System.out.println("Denovo irmão? Vazaaaa");
            }
        }
    }
}