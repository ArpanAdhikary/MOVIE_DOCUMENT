package com.cg.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.dto.Movie;
import com.cg.dto.Screen;
import com.cg.dto.Seat;
import com.cg.dto.Show;
import com.cg.dto.Theater;
import com.cg.service.AdminServiceImpl;


public class MovieApp {

	Scanner sc = new Scanner(System.in);
	Boolean result;
	AdminServiceImpl srvc = new AdminServiceImpl();
	
	/* variables for Movies */
	Integer movieId,noOfMovie,movieLength;
	String movieName,movieGenre,movieDirector;
	LocalDate movieDate;
	
	/* variables for theater */
	String theaterName,theaterCity,managerName,managerContact;
	
	/* variables for screen */
	Integer theaterId,screenId,rows,columns;
	String screenName;
	
	/* variables for show */
	Integer showId;
	LocalTime showStartTime,showEndTime;
	String showName;
	
	/* variables for seat */
	Integer seatId;
	Double seatPrice;
	com.cg.dto.Seat.SeatStatus seatStatus = null;
	
	int count=0;
	
	
	public void addMovies()
	{
		try {
		System.out.println(" Enter Movie Id");
		if(count==1)
			sc.nextLine();
		movieId=sc.nextInt();
		System.out.println("Enter Movie Name");
		sc.nextLine();
		movieName=sc.nextLine();
		if(movieName.isEmpty())
			throw new NullPointerException();
		System.out.println("Enter Movie Length");
		movieLength=sc.nextInt();
		}
		
		catch(InputMismatchException e) {
			count=1;
			System.out.println("Should enter only number in movie id and movie length");
			return;
		}
		
		catch(NullPointerException e) {		
			System.out.println("Should enter Some Data, null value not accepted ");
			return;
		}
		sc.nextLine();
		System.out.println("Enter Movie Genre");
		movieGenre=sc.nextLine();
		System.out.println("Enter Movie Director");
		movieDirector=sc.nextLine();
		System.out.println("Enter in how many languages the movie is getting released");
		noOfMovie=sc.nextInt();
		String movieLang[]=new String[noOfMovie];
		for(int i=0;i<noOfMovie;i++) {
			System.out.println("Enter the language on which the movie is released");
			if(i==0)
				sc.nextLine();
			movieLang[i]=sc.nextLine();
		}	
		try {
		System.out.println("Enter Movie release date in the format dd/mm/yyyy ex: 12/05/2020");	
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		movieDate=LocalDate.parse(sc.next(),formatter);
		Movie movie = new Movie(movieId,movieName,movieGenre,movieDirector,movieLength,movieLang,movieDate);
		Movie movies;				
		movies=srvc.addMovie(movie);
		if(movies!=null)
			System.out.println("Movie added successfully");
		else
			System.out.println("Addition of movie unsuccessful");
		System.out.println(movie);
		}
		catch(DateTimeException e)
		{
			System.out.println("Please Check the format of the Date ");
		}
	}
	
	public void deleteMovies() {
		try {
		System.out.println("Enter the Id of the Movie to be deleted");
		if(count==1)
			sc.nextLine();
		movieId  = sc.nextInt();
		result = srvc.deleteMovie(movieId);
		if(result==true)
			System.out.println("Movie deleted successfully");
		else
			System.out.println("Deletation of Movie unsuccessful");
		}
		catch(NullPointerException e) {
			count=1;
			System.out.println("Movie Id cannot be null");
		}
		catch(InputMismatchException e) {
			count=1;
			System.out.println("Should enter only number in movie id ");
		}
		
	}
	
	public void addScreen() {
		try {
			System.out.println("Enter Theater Id");
			theaterId = sc.nextInt();
			System.out.println("Enter Screen Id");
			screenId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Screen Name");
		    screenName = sc.nextLine();
			System.out.println("Enter number of rows present");
			rows = sc.nextInt();
			System.out.println("Enter number of columns present");
			columns = sc.nextInt();
			System.out.println("Enter Number of Shows Present for this Screen");
			int totalShow = sc.nextInt();
			Integer showIdList[] = new Integer[totalShow];
			for(int i=0;i<totalShow;i++) {
			System.out.println("Enter the showId");
			showIdList[i] = sc.nextInt();
			}
			screenId=Integer.parseInt(Integer.toString(theaterId)+Integer.toString(screenId));
			Screen screens;
			Screen screen = new Screen(screenId,theaterId,screenName,showIdList,rows,columns);
			screens = srvc.addScreen(screen);
			if(screens!=null)
				System.out.println("Screen added successfully");
			else
				System.out.println("Addition of screen unsuccessful");
			System.out.println(screen);
		}
		catch(InputMismatchException e) {
			System.out.println("Should enter only number in movie id and movie length");
		}
		catch(NullPointerException e) {		
			System.out.println("Should enter Some Data, null value not accepted ");
		}
	}
	
	public void deleteScreen() {
		try {
			System.out.println("Enter the Id of the Screen to be deleted");
			if(count==1)
				sc.nextLine();
			screenId  = sc.nextInt();
			result = srvc.deleteScreen(screenId);
			if(result==true)
				System.out.println("Screen deleted successfully");
			else
				System.out.println("Deletation of Screen unsuccessful");	
		}
		catch(NullPointerException e) {
			count=1;
			System.out.println("Screen Id cannot be null");
		}
		catch(InputMismatchException e) {
			count=1;
			System.out.println("Should enter only number in Screen id");
		}
		
	}
			
	
	public void addShows() {

		System.out.println("Enter Theater Id");
		theaterId = sc.nextInt();
		System.out.println("Enter Screen Id");
		screenId = sc.nextInt();
		System.out.println("Enter Show Id");
		showId = sc.nextInt();
		System.out.println("Enter Movie Name");
		sc.next();
		movieName = sc.nextLine();
		System.out.println("Enter Show Name");
		sc.next();
		showName = sc.nextLine();
		System.out.println("Enter Show start Time");
		showStartTime=LocalTime.parse(sc.next());
		System.out.println("Enter Show end Time");
		showEndTime=LocalTime.parse(sc.next());
		System.out.println("Enter total number of seats");
		int totalSeat = sc.nextInt();
		System.out.println(" Enter the number of category of seats  present ");
		int noCategorySeat = sc.nextInt();
		int count=0;
		Integer seat[] = new Integer[totalSeat];
		for(int i=0;i<noCategorySeat;i++) {
			System.out.println(" Enter the prices of each category of seats  present ");
			double categorySeat = sc.nextDouble();
			System.out.println("Enter number of seat present in the above category");
			int quantitySeat = sc.nextInt();
			for(int j=0;j<quantitySeat;j++) {
				seatId=count;
				seatPrice=categorySeat;
				seat[count]=seatId;
				addSeat(seatId,seatPrice);
				count++;
			}
		}
			Show show = new Show(showId,screenId,theaterId,showName,movieName,showStartTime,showEndTime,seat);
			show = srvc.addShow(show);
			if(show!=null)
				System.out.println("Show added successfully");
			else
				System.out.println("Addition of show unsuccessful");
			System.out.println(show);
		}
	public void deleteShows() {

		System.out.println("Enter the Show Id to be deleted");
		showId  = sc.nextInt();
		result = srvc.deleteShow(showId);
		if(result==true)
			System.out.println("Show deleted successfully");
		else
			System.out.println("Deletation of Show unsuccessful");
		
		}
	
	public void addTheater() {
		try {
			System.out.println("Enter the Theater Id");
			theaterId  = sc.nextInt();
			System.out.println("Enter the Theater Name");
			sc.next();
			theaterName = sc.nextLine();
			System.out.println("Enter the Theater City");
			theaterCity = sc.nextLine();
			System.out.println("Enter the Manager Name");
			managerName = sc.nextLine();
			System.out.println("Enter the Manager Contact");
			managerContact = sc.nextLine();
			System.out.println("Enter number of movies this theater is currently going to show ");
			int noOfMovies = sc.nextInt();
			Integer movieIdList[] = new Integer[noOfMovies];
			for(int i=0;i<noOfMovies;i++) {
				System.out.println("Enter the MovieId");
				movieIdList[i] = sc.nextInt();
			}
			System.out.println("Enter number of screen this theater is currently going to have ");
			int noOfScreen = sc.nextInt();
			Integer screenIdList[] = new Integer[noOfScreen];
			for(int i=0;i<noOfScreen;i++) {
				System.out.println("Enter the ScreenId");
				screenIdList[i] = sc.nextInt();
			}
			Theater theater = new Theater(theaterId,theaterName,theaterCity,movieIdList,screenIdList,managerName,managerContact);	
			theater = srvc.addTheater(theater);
			if(theater!=null)
				System.out.println("Theater added successfully");
			else
				System.out.println("Addition of theater unsuccessful");
			System.out.println(theater);
		}
		catch(InputMismatchException e) {
			System.out.println("Should enter only number");
		}
		catch(NullPointerException e) {		
			System.out.println("Should enter Some Data, null value not accepted ");
		}
	}

	public void deleteTheater() {
		try {
			System.out.println("Enter the Theater Id to be deleted");
			theaterId  = sc.nextInt();
			result = srvc.deleteTheater(theaterId);
			if(result==true)
				System.out.println("Theater deleted successfully");
			else
				System.out.println("Deletation of Theater unsuccessful");
		 }

			catch(InputMismatchException e) {
				System.out.println("Should enter only number in Theater id ");
			}
		
			catch(NullPointerException e) {
				System.out.println("Theater Id cannot be null");
			}
	}
	
	public void addSeat(Integer seatId,Double seatPrice) {
	
		Seat seat=new Seat(seatId,com.cg.dto.Seat.SeatStatus.Available,seatPrice);
		result=srvc.addSeat(seat);
		if(result==false)
			System.out.println("Seat added successfully");
		else
			System.out.println("Addition of seat unsuccessful");
		System.out.println(seat);
	}
	
	public void addSeat() {
		System.out.println("Enter the Seat Id");
		seatId = sc.nextInt();
		seatStatus=com.cg.dto.Seat.SeatStatus.Available;
		System.out.println("Enter The seat price");
		seatPrice = sc.nextDouble();
		Seat seat = new Seat(seatId,seatStatus,seatPrice);
		result=srvc.addSeat(seat);
		if(result==false)
			System.out.println("Seat added successfully");
		else
			System.out.println("Addition of seat unsuccessful");
		System.out.println(seat);
	}
	
	public void deleteSeat() {
		System.out.println("Enter the Seat Id to be deleted");
		seatId  = sc.nextInt();
		result = srvc.deleteSeat(seatId);
		if(result==true)
			System.out.println("Seat deleted successfully");
		else
			System.out.println("Deletation of Seat unsuccessful");	
	}
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\Users\\arpan\\git\\MOVIE_DOCUMENT\\Movie_Document\\src\\com\\cg\\logger\\Logger.properties");
		Logger logger = Logger.getLogger(MovieApp.class.getName());
		int ch=1,ch1;
		
		Scanner sc = new Scanner(System.in);
		MovieApp app = new MovieApp();
		logger.info("Entering homepage choice");
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
					ch1 =  sc.nextInt();
				break;
				
				case 2:
				//System.out.println("");	
				break;
				
				case 3:
					logger.info("Entering choice");
					System.out.println("-----Login------");
					System.out.println("Enter 1 for admin");
					System.out.println("Enter 2 for customer");
					System.out.println("Enter any number for Back");
					int choice = sc.nextInt();
					
					
					
					if(choice==1) {
						while(ch!=11) {
							System.out.println("Press 1: for add Movie");
							System.out.println("Press 2: for delete Movie");
							System.out.println("Press 3: for add Screen");
							System.out.println("Press 4: for delete Screen");
							System.out.println("Press 5: for add Show");
							System.out.println("Press 6: for delete Show");
							System.out.println("Press 7: for add Theater");
							System.out.println("Press 8: for delete Theater");
							System.out.println("Press 9: for add Seat");
							System.out.println("Press 10: for delete Seat");
							
							System.out.println("Press 11: for Logout");
							ch=sc.nextInt();
							switch(ch) {
							
							/*  ADD MOVIE BY ADMIN */
							case 1:
								logger.info("Add movie");
								app.addMovies();
							break;
							
							/*  DELETE MOVIE BY ADMIN */
							case 2:
								logger.info("Delete Movie");
								app.deleteMovies();			
							break;
							
							/*  ADD MOVIE BY ADMIN */
							case 3:
								app.addScreen();									
							break;
							
							/*  DELETE SCREEN BY ADMIN */
							case 4:
								app.deleteScreen();
							break;
							
							/*  ADD SHOW BY ADMIN */
							case 5:
								app.addShows();
							break;
							
							/*  DELETE SHOW BY ADMIN */
							case 6:
								
								app.deleteShows();
						
							break;
							
							/* ADD THEATER BY ADMIN */
							case 7:
							
								app.addTheater();					
							
							break;
							
							/*  DELETE THEATER BY ADMIN */
							case 8:
						
								app.deleteTheater();
						
							break;
							
							/* ADD SEAT BY ADMIN */
							case 9:
							
								app.addSeat();
								
							break;
				
							case 10:
								
								app.deleteSeat();
								
							break;
							
							case 11:
		
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
