package br.com.dio.strategy;

public class ComportamentoAgresivo implements Comportamento{

    @Override
    public void moverEstrategico() {
        System.out.println("Robo esta se movendo agresivo...");
    }
}
