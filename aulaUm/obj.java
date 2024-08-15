public class Carro {
private String cor;
private String modelo;
private int velocidade;
private float cilindrada;

public Carro(){} // se não tiver o construtor dentro dele, ele estará oculto

public Carro(String modelo, String cor){
    this.modelo = modelo;
    this.cor = cor;
}

public string getModelo(){
	return modelo;
}

public void setModelo(){
	this.modelo = modelo;
}

// get set cilindrada

public float getCilindrada(){
    return cilindrada;
}

public void setCilindrada(float cilindrada){
    this.cilindrada = cilindrada;
}

public void setCilindrada(String cilindrada){
    this.cilindrada = Float.parseFloat(cilindrada);
}

}

Carro meuCarro = new Carro("Fusion", "Prata");
meuCarro.cor(); // "Prata"

// meuCarro.setCor("Azul");
// meuCarro.getCor(); // Azul