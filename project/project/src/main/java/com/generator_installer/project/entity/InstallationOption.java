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
@Table(name = "installation_options")
@SuppressWarnings("unused")
public class InstallationOption {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "path_program")
  private String pathProgram;

  @Column(name = "name_program")
  private String nameProgram;

  @ManyToOne
  @JoinColumn(name = "documentation_id", referencedColumnName = "ID")
  private Documentation documentation;

  @ManyToOne
  @JoinColumn(name = "additional_file_id", referencedColumnName = "ID")
  private AdditionalFiles additionalFile;

  public int getId() {
    return id;
  }

  public String getPathProgram() {
    return pathProgram;
  }

  public String getNameProgram() {
    return nameProgram;
  }

  public Documentation getDocumentation() {
    return documentation;
  }

  public AdditionalFiles getAdditionalFile() {
    return additionalFile;
  }

}



