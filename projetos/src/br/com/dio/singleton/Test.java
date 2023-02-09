package br.com.dio.singleton;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        System.out.println("--------------------------------------------------");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("--------------------------------------------------");

        SingletonLayzHolder singletonLayzHolder = SingletonLayzHolder.getInstancia();
        System.out.println(singletonLayzHolder);
        singletonLayzHolder = SingletonLayzHolder.getInstancia();
        System.out.println(singletonLayzHolder);


    }
}
