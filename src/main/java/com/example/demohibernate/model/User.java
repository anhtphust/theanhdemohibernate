package com.example.demohibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "useage", nullable = false)
    private int useage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUsaerage() {
        return useage;
    }

    public void setUsaerage(int usaerage) {
        this.useage = usaerage;
    }

    public User(int id, String username, int usaerage) {
        this.id = id;
        this.username = username;
        this.useage = usaerage;
    }

    public User() {
    }
}
