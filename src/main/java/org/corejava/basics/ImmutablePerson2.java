package org.corejava.basics;

import java.util.Date;

public class ImmutablePerson2 {

    private final String name;
    private final Date joiningDate;  // mutable object

    //Return deep copies of mutable objects (if any) instead of original references.
    public ImmutablePerson2(String name, Date joiningDate) {
        this.name = name;
        // Defensive copy to prevent outside changes
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getJoiningDate() {
        // Return a new copy, not the original
        return new Date(joiningDate.getTime());
    }
}
