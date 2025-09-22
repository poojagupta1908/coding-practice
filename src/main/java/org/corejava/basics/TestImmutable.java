package org.corejava.basics;

import java.util.Date;

public class TestImmutable {

    public static void main(String[] args) {
        MutablePerson p = new MutablePerson("Pooja", 25);
        System.out.println(p.getName() + " " + p.getAge());  // Pooja 25

        // Changing state
        p.setName("Neha");
        p.setAge(30);
        System.out.println(p.getName() + " " + p.getAge());  // Neha 30


        //immutable
        ImmutablePerson ip = new ImmutablePerson("Pooja", 25);
        System.out.println("immutable eaxample" + ip.getName() + " " + ip.getAge());  // Pooja 25

        // Can't modify, no setters available
        // p.setName("Neha"); ❌ compile error


        //Example 2: Immutable Class with Mutable Object
        System.out.println("Example 2: Immutable Class with Mutable Object");

        Date date = new Date();
        ImmutablePerson2 emp = new ImmutablePerson2("John", date);

        // Try to modify original date
        date.setTime(0);

        // Employee's date still unchanged
        System.out.println(emp.getJoiningDate());
    }

}
