package com.main.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@EnableAutoConfiguration
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "voornaam", nullable = false)
    private String firstName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "achternaam", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String email;

    @Column(name = "ervaring", nullable = false)
    private String ervaring;

    @Column(name = "sterren", nullable = false)
    private Integer sterren;

    @Column (name = "created_at")
    private LocalDate created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getErvaring() {
        return ervaring;
    }

    public void setErvaring(String ervaring) {
        this.ervaring = ervaring;
    }

    public Integer getSterren() {
        return sterren;
    }

    public void setSterren(Integer sterren) {
        this.sterren = sterren;
    }

    public LocalDate getCreated() {
        return created;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}