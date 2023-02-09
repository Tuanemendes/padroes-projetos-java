package br.com.dio.singleton;
/*
 * singleton LayzHolder
 * @autor Tuane Mendes
 * */
public class SingletonLayzHolder {
    private static class InstanceHolder {
        public static SingletonLayzHolder instancia = new SingletonLayzHolder();
    }
    private SingletonLayzHolder(){
       super();
    }

    public static SingletonLayzHolder getInstancia(){

        return InstanceHolder.instancia;
    }


}
