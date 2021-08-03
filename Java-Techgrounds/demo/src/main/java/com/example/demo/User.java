package com.example.demo;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

}