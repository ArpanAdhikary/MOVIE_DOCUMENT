package com.cg.dto;

import java.time.LocalDate;
import java.util.Arrays;


public class Movie {

	private Integer movieId,movieLength;
	private String movieName,movieGenre,movieDirector;
	private String language[];
	private LocalDate date;
	
	public Movie(int movieId, String movieName, String movieGenre, String movieDirector, Integer movieLength,
			String[] language, LocalDate date) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.language = language;
		this.date = date;
		}

	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieGenre() {
		return movieGenre;
	}
	
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	
	public String getMovieDirector() {
		return movieDirector;
	}
	
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	
	public Integer getMovieLength() {
		return movieLength;
	}
	
	public void setMovieLength(Integer movieLength) {
		this.movieLength = movieLength;
	}
	
	public String[] getLanguage() {
		return language;
	}
	
	public void setLanguage(String[] language) {
		this.language = language;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieLength=" + movieLength + ", movieName=" + movieName
				+ ", movieGenre=" + movieGenre + ", movieDirector=" + movieDirector + ", language="
				+ Arrays.toString(language) + ", date=" + date + "]";
	}
	
}
