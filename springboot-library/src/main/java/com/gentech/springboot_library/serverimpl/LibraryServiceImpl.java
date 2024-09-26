package com.gentech.springboot_library.serverimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gentech.springboot_library.entity.Library;
import com.gentech.springboot_library.repository.LibraryRepository;
import com.gentech.springboot_library.server.LibraryServer;

@Service
public  class LibraryServiceImpl implements LibraryServer{
	private LibraryRepository libraryRepository;
		
	public LibraryServiceImpl(LibraryRepository libraryRepository)
		{
			super();
			this.libraryRepository=libraryRepository;
		}

		@Override
		public List<Library> getLibrary() {
			
			return libraryRepository.findAll();
		}

		@Override
		public Library getParticularBook(Long id) throws Exception {
			Optional<Library> lib=libraryRepository.findById(id);
			if(lib.isPresent())
	        {
	        	return lib.get();
		
	        }
	        throw new Exception("The Book id "+id+" has not available in the database table");
			
		}

		@Override
		public Library createBook(Library library) {
			
			return libraryRepository.save(library);
		}

		@Override
		public Library updateBookname(Library library) {
			
			 return libraryRepository.save(library);
		}
		
		@Override
		public void deleteBook(Long id) {
			libraryRepository.deleteById(id);
			
		}

}

