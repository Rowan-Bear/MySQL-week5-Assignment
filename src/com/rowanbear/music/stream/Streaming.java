package com.rowanbear.music.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.rowanbear.music.Genre;
import com.rowanbear.music.Sort;

public class Streaming {

	public static void main(String[] args) {
		
		//creates instance of the list in Sort Class
		ArrayList<Genre> genres = Sort.genres;
		
		System.out.println(Sort(genres));
		
		
		
		
		
		
	}
	
	public static String Sort(ArrayList<Genre> genres){
	//creates stream
		ArrayList<Genre> genres2 = genres;
			
	return genres2.stream()
//			//Converts stream of object to stream of String
			.map(Genre -> Genre.toString())
//			//Sorts the Stream
			.sorted()
			.collect(Collectors.joining(", "));
			
			
	}
}
