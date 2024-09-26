package com.gentech.springboot_library.server;

import java.util.List;

import com.gentech.springboot_library.entity.Library;



public interface LibraryServer {
	List<Library> getLibrary();
	Library getParticularBook(Long id) throws Exception;
	Library createBook(Library library);
	Library updateBookname( Library  library);
	void deleteBook(Long id);

}
