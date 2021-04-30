package com.beans;

import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String post_content;
    
    @ManyToOne
    @JoinColumn( name="author_id", nullable=false )
    private User author;
    
    public Post(Long id, String post_content, User author) {
        super();
        this.id = id;
        this.post_content = post_content;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
