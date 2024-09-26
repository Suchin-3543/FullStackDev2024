package com.gentech.springboot_library.controller;



import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.springboot_library.entity.Library;
import com.gentech.springboot_library.server.LibraryServer;

@RestController
@RequestMapping("/v1/api")

public class LibraryController {
	
	private LibraryServer libraryService;

	private LibraryController(LibraryServer libraryService) {
		super();
		this.libraryService = libraryService;
	}
	
	@GetMapping("/library")
	public List<Library> getAllLibrary()
	{
		return libraryService.getLibrary();
	}
	
	@GetMapping("/library/{id}")
	public Library getOneBook(@PathVariable Long id) throws Exception
	{
		return libraryService.getParticularBook(id);
	}
	
	@PostMapping("/library")
	public  Library saveBook(@RequestBody Library library)
	{
		return libraryService.createBook(library);
	}
	
	@PutMapping("/library/{id}")
	public  Library updateBookname(@PathVariable Long id, @RequestBody Library library)
	{
		library.setBook_id(id);
		return libraryService.updateBookname(library);
	}
	
	
	@DeleteMapping("/library/{id}")
	public String DeleteSpecificBook(@PathVariable Long id)
	{
		libraryService.deleteBook(id);
		return "The Department with id value "+id+" has deleted succesfully";
	}

}

