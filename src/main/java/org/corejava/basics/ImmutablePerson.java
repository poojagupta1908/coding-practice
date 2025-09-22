package org.corejava.basics;

// Immutable class
final class ImmutablePerson {   //1.Declare the class as final (to prevent subclassing)
    private final String name;  //2.Make all fields private and final.
    private final int age;

    //4. Initialize fields via constructor only.
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Only getters, no setters
    //3. Don’t provide setter methods.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static class TestImmutable {
        public static void main(String[] args) {
            ImmutablePerson p = new ImmutablePerson("Pooja", 25);
            System.out.println(p.getName() + " " + p.getAge());  // Pooja 25

            // Can't modify, no setters available
            // p.setName("Neha"); ❌ compile error
        }
    }

}