package com.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String prenom;

    @Column
    private String nom;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany(mappedBy="cart")
    private Set<Post> posts;

    public User(Long id, String prenom, String nom, String username, String password, Set<Post> posts) {
        super();
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

}