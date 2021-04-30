package com.instic.entities;

import javax.persistence.*;

@Entity(name="user")
public class User {
	@Id
    @GeneratedValue
    private Long id;
    private String name;
}
