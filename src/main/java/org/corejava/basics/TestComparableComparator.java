package org.corejava.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparableComparator {

        public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(3, "Alice" , 1234));
            list.add(new Employee(1, "Bob" , 4567));
            list.add(new Employee(2, "Charlie",789));

            // Sort using Comparable (by id)
            Collections.sort(list);
            System.out.println("Sorted by id: " + list);

            // Sort using Comparator (by name)
            Collections.sort(list, new NameComparator());
            System.out.println("Sorted by name: " + list);

            // Using lambda for Comparator
            Collections.sort(list, (s1, s2) -> s2.name.compareTo(s1.name));
            System.out.println("Sorted by name descending: " + list);
        }
    }

