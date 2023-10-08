package org.cinema;

public class Person {
    protected String firstname;
    protected String lastName;
    private String userName;
    private String password;

    public Person(String firstname, String lastName, String userName, String password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
}
