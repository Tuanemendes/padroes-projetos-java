package br.com.dio.singleton;

/*
 * singleton Eager "rápido"
 * @autor Tuane Mendes
 * */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }


}
