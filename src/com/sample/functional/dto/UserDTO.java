package com.sample.functional.dto;

public class UserDTO {

    private String userId;
    private int age;
    private int id;

    public  UserDTO( String userId, int age, int id) {
        this.age = age;
        this.id = id;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
