package com.generator_installer.project.repository;

import com.generator_installer.project.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
    File findByFileName(String fileName);
    void deleteByFileName(String fileName);
}
