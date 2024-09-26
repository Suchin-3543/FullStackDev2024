package com.gentech.springboot_library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.springboot_library.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long>{

	Optional<Library> findById(Long id);

	

}
