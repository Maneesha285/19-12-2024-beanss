package singletonexample;

public class Singleton {
    private static Singleton Eseva;// private obj
    private Singleton(){  // private constructor

    }
    public static Singleton getInstance(){//creating a public method to get instance
        if (Eseva==null){

            Eseva = new Singleton();
        }
        return Eseva;
    }
    public void displaymessage(){
        System.out.println( " Committed changes in Eseva ");
    }
}
