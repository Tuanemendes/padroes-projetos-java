package br.com.dio.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void moverEstrategico() {
        System.out.println("Robo esta se movendo...");
    }
}
