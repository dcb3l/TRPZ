package com.generator_installer.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
@SuppressWarnings("unused")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "license")
  private String license;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "user_right")
  private String userRight;

  public int getId() {
    return id;
  }

  public String getUserName() {
    return userName;
  }

  public String getLicense() {
    return license;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getUserRight() {
    return userRight;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUserRight(String userRight) {
    this.userRight = userRight;
  }

}


