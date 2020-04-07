package ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entity.Movie;
import service.AdminServiceImpl;

public class MovieApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch=1,ch1;
		boolean result;
		Integer movieId,noOfMovie,movieLength;
		String movieName,movieGenre,movieDirector;
		LocalDate movieDate;

		System .out.println("------------MovieToWATCH------------");
		System.out.print("  1. Home");
		System.out.print("    2. Movies");
		System.out.print("    3. Login");
		System.out.print("    4. SignUp");
		System.out.print("  5. About Us");
		System.out.println("  6. Exit");
		System.out.println("  Select a serial number");
		
		ch1 =  sc.nextInt();
		while(ch1!=6) {
			switch(ch1){
				case 1:
					System .out.println("------------MovieToWATCH------------");
					System.out.print("  1. Home");
					System.out.print("    2. Movies");
					System.out.print("    3. Login");
					System.out.print("    4. SignUp");
					System.out.print("  5. About Us");
					System.out.println("  6. Exit");
					System.out.println("  Select a serial number");
				break;
				
				case 2:
				//System.out.println("");	
				break;
				
				case 3:
					System.out.println("-----Login------");
					System.out.println("Enter 1 for admin");
					System.out.println("Enter 2 for customer");
					System.out.println("Enter any number for Back");
					int choice = sc.nextInt();
					
					AdminServiceImpl srvc = new AdminServiceImpl();
					
					
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
								Movie movies;				
								movies=srvc.addMovie(movie);
								if(movies!=null)
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
								ch1=3;
							break;
								
							default:
								System.out.println("Wrong Choice");								
							}
						}
					}
					else
					{
						ch1=1;
					}
						
				break;
				
				case 4:
					
				break;
				
				case 5:
					System.out.println("About Us");
					System.out.println("We are here to help you book your seats with an ease . Best offers for our customer etc.");
				break;
				
				case 6:
					ch1=6;
				break;
				
				default:
					ch1=1;
			}	
		}
		
		sc.close();
	}

}
