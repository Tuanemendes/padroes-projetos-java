package br.com.dio.strategy;

public class TesteStrategy {
    //strategy
    public static void main(String[] args) {
        Comportamento defesivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agresivo = new ComportamentoAgresivo();

        Robo robo  = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defesivo);
        robo.mover();
        robo.setComportamento(agresivo);
        robo.mover();
        robo.mover();
    }
}
