package ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entity.Movie;
import service.MovieServiceImpl;

public class MovieApp {

	public static void main(String[] args) {
		
		int ch=1;
		boolean result;
		Integer movieId,noOfMovie,movieLength;
		String movieName,movieGenre,movieDirector;
		LocalDate movieDate;
		
//		System.out.println("Home");
//		System.out.println("Login");
//		System.out.println("");

		System.out.println("Enter 1 for admin");
		System.out.println("Enter 2 for customer");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		MovieServiceImpl srvc = new MovieServiceImpl();
		
		
		if(choice==1) {
			while(ch!=7) {
				System.out.println("Press 1: for add Movie");
				System.out.println("Press 2: for delete Movie");
				System.out.println("Press 3: for add screen");
				System.out.println("Press 4: for delete screen");
				System.out.println("Press 5: for add show");
				System.out.println("Press 6: for delete show");
				System.out.println("Press 7: for logout");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println(" Enter Movie Id");
					movieId=sc.nextInt();
					System.out.println("Enter Movie Name");
					movieName=sc.next();
					System.out.println("Enter Movie Genre");
					movieGenre=sc.next();
					System.out.println("Enter Movie Director");
					movieDirector=sc.next();
					System.out.println("Enter Movie Length");
					movieLength=sc.nextInt();
					System.out.println("Enter in how many languages the movie is getting released");
					noOfMovie=sc.nextInt();
					String movieLang[]=new String[noOfMovie];
					for(int i=0;i<noOfMovie;i++) {
						System.out.println("Enter the language on which the movie is released");
						movieLang[i]=sc.next();
					}		
					System.out.println("Enter Movie release date");
					DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yy");
					movieDate=LocalDate.parse(sc.next(),formatter);
					Movie movie = new Movie(movieId,movieName,movieGenre,movieDirector,movieLength,movieLang,movieDate);
									
					result=srvc.addMovie(movie);
					if(result==true)
						System.out.println("Movie added successfully");
					else
						System.out.println("Addition of movie unsuccessful");
					break;
				
				case 2:
					System.out.println("Enter the Id of the movie to be deleted");
					movieId  = sc.nextInt();
					result = srvc.deleteMovie(movieId);
					if(result==true)
						System.out.println("Movie deleted successfully");
					else
						System.out.println("Deletation of movie unsuccessful");
					break;
					
				case 7:
					System.out.println("good bye admin");
					break;
					
				default:
					System.out.println("Wrong Choice");
					
				}
			}
		}
		sc.close();
	}

}
