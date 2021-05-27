package org.example;

public class Contact {
    private String name;
    private int age;
    private long id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contact(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Contact() {
    }
}
