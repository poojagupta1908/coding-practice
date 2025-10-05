package org.corejava.basics;

public class Singleton {
    // Static reference to the single instance
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {}

    // Public method to return the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create instance only when needed
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

