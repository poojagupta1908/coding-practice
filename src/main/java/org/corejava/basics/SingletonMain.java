package org.corejava.basics;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Both references point to the same object
        System.out.println(obj1 == obj2); // true

        //EagerLoading Singleton-Instance created at class loading (not lazy).
        System.out.println("CALLING EagerLoading Singleton");
        EagerLoadingSingleton els1 = EagerLoadingSingleton.getInstance();
        EagerLoadingSingleton els2 = EagerLoadingSingleton.getInstance();
        System.out.println(els1 == els2);

         //LazyInitializationSingleton-Instance created only when first requested.
        System.out.println("CALLING LazyInitializationSingleton");
        LazyInitializationSingleton lis1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lis2 = LazyInitializationSingleton.getInstance();
        System.out.println(lis1 == lis2);

        //Thread-Safe Singleton (Synchronized Method)-Safe in multithreading but slower due to synchronization overhead.
        System.out.println("CALLING Thread-Safe Singleton (Synchronized Method)");
        ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
        System.out.println(tss1 == tss2);

        //Bill Pugh Singleton (Best Practice)-Uses a static inner class, lazy and thread-safe without synchronization.
        System.out.println("Bill Pugh Singleton (Best Practice) ");
        BillPughSingleton bps1 = BillPughSingleton.getInstance();
        BillPughSingleton bps2 = BillPughSingleton.getInstance();
        System.out.println(bps1 == bps2);

        //Enum Singleton (Safest)-Simplest and protects against serialization and reflection.
        System.out.println("CALLING /Enum Singleton ");
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        es1.showMessage();
        System.out.println(es1 == es2);


    }
}
