public class PooIntrocudao {
    public static void main(String [] args) { 

        var american = new Cachorro();
        american.setRaca("American");

        var bulldog = new Cachorro();
        bulldog.setRaca("Bulldog");

        System.out.println(american.getRaca());
        System.out.println(bulldog.getRaca());

    }

    public static class Cachorro{
        private String raca;

        public String getRaca(){
            return raca;
        }

        public void setRaca(String raca){
            this.raca = raca;
        }
    }

    public static class Tartaruga{
        private String raca;
    }

    public static class Cavalo{
        private String raca;
    }

    public static class Boi{
        private String raca;
    }

    public static class Gato{
        private String raca;
    }

}