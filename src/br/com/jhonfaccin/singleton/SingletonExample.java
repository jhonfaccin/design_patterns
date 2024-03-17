package br.com.jhonfaccin.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
    }
}