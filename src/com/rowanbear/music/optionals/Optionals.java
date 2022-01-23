package com.rowanbear.music.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.rowanbear.music.Genre;

public class Optionals {

	public static void main(String[] args) {
		
		Genre punk = genreMethod(Optional.of(new Genre("Punk")));
		System.out.println(punk);
		
		try {
			genreMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Genre genreMethod(Optional<Genre> optionalGenre) {
		 
		//returns the object  if the object is present in the optional
		
		return optionalGenre.orElseThrow(() -> new NoSuchElementException("This aint it"));
		
		// throws a NoSuchElementException with a custom message "This aint it!" if the object is not present
		
	}
	
	
	

}
