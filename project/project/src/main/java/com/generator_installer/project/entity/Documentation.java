package com.generator_installer.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "documentation")
@SuppressWarnings("unused")
public class Documentation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "License")
  private String license;

  @Column(name = "Info")
  private String info;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "ID")
  private User user;

  public int getId() {
    return id;
  }

  public String getLicense() {
    return license;
  }

  public String getInfo() {
    return info;
  }

  public User getUser() {
    return user;
  }

}


