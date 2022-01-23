package com.rowanbear.music;

import java.util.ArrayList;
import java.util.List;

public class Genre {
	
	private String Genre;

	
	public Genre(String name) {
		this.Genre = name;
		
	}

	@Override
	public String toString() {
		return "Genre: " + Genre;
	}

	public String getGenre() {
		return Genre;
	}

	public static int compare(Genre m1, Genre m2) {
		int i = 0;
		int m1i = m1.toString().length();
		int m2i = m2.toString().length();
		if (m1i < m2i) {
			i = -1;
		} else if (m1i > m2i) {
			i = 1;
		} else if (m1i == m2i) {
			i = 0;
		}
		return i;
	}
	
	public static ArrayList<Genre> genres = new ArrayList<>(List.of(new Genre("Classical"), new Genre("Techno"), new Genre("Rock"), new Genre("ElectroFunk")));
	
	
	
}
