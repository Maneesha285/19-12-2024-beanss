package singletonexample;



public class SingletonTest {
    public static void main(String[] args) {

            Singleton singleton=Singleton.getInstance();
            Singleton singleton1=Singleton.getInstance();
            singleton.displaymessage();
            singleton1.displaymessage();
            System.out.println(singleton==singleton1);

        }

    }

