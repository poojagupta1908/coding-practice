package org.corejava.basics;

public class EagerLoadingSingleton {


        // Instance created at class loading
        private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

        private EagerLoadingSingleton() {}

        public static EagerLoadingSingleton getInstance() {
            return instance;
        }


}
