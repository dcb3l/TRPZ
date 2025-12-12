package com.generator_installer.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "additional_files")
@SuppressWarnings("unused")
public class AdditionalFiles {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "fileName")
  private String fileName;

  @Column(name = "path")
  private String path;

  @Column(name = "size")
  private int size;

  @Column(name = "protection_parametrs")
  private String protectionParameters;

  public int getId() {
    return id;
  }

  public String getFileName() {
    return fileName;
  }

  public String getPath() {
    return path;
  }

  public int getSize() {
    return size;
  }

  public String getProtectionParameters() {
    return protectionParameters;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setProtectionParameters(String protectionParameters) {
    this.protectionParameters = protectionParameters;
  }

}



