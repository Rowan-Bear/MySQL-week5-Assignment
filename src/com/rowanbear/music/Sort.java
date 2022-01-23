package com.rowanbear.music;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	
	public static ArrayList<Genre> SortLambda(ArrayList<Genre> genres){
		ArrayList<Genre> lambdaGenres = genres;
		lambdaGenres.sort((m1, m2) -> Genre.compare(m1, m2));
	
		return lambdaGenres;
	}
	
	public static ArrayList<Genre> SortMethRef(ArrayList<Genre> genres){
		ArrayList<Genre> methRefGenre = genres;
		methRefGenre.sort(Genre::compare);
		
		
		return methRefGenre;
		
	}
	
	public static ArrayList<Genre> genres = new ArrayList<>(List.of(new Genre("Classical"), new Genre("Techno"), new Genre("Rock"), new Genre("ElectroFunk")));
	
	public static void main(String[] args) {
		
		SortLambda(genres);
		SortMethRef(genres);
		System.out.println(genres);
		
		
		
		
		
		
		
	}

}
