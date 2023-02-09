package br.com.dio.singleton;

/*
 * singleton lazy "Preguiçoso"
 * @autor Tuane Mendes
 * */
public class SingletonLazy {

    private static SingletonLazy intancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getIntancia() {
        if (intancia == null) {
            intancia = new SingletonLazy();
        }
        return intancia;
    }
}
