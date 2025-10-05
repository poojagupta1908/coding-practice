package org.corejava.basics;


import java.util.Comparator;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int phone;

    Employee(int id, String name,int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    // Natural order: by id
    @Override
    public int compareTo(Employee other) {
        return this.phone - other.phone;
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

// Custom Comparator: by name
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee s1, Employee s2) {
        return s1.name.compareTo(s2.name);
    }
}
