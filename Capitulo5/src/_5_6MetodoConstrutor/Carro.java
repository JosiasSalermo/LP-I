package _5_6MetodoConstrutor;

public class Carro {

    int potencia;
    int velocidade;
    String nome;

    Carro(int p){
        potencia = p;
        velocidade = 10;
    }

    Carro(String nome){
        // código omitido
    }

    Carro(int potencia, String nome){
        // código omitido
    }
}
