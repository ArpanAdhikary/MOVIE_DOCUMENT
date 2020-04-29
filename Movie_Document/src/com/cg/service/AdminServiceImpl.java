package com.cg.service;

import org.apache.log4j.Logger;

import com.cg.dao.MovieDaoImpl;
import com.cg.dao.ScreenDaoImpl;
import com.cg.dao.SeatDaoImpl;
import com.cg.dao.ShowDaoImpl;
import com.cg.dao.TheaterDaoImpl;
import com.cg.dto.Movie;
import com.cg.dto.Screen;
import com.cg.dto.Seat;
import com.cg.dto.Show;
import com.cg.dto.Theater;
import com.cg.exceptions.MovieExceptions;
import com.cg.exceptions.ScreenExceptions;
import com.cg.exceptions.TheaterExceptions;


public class AdminServiceImpl implements AdminService{

	private MovieDaoImpl movieDao=new MovieDaoImpl();
	private TheaterDaoImpl theaterDao=new TheaterDaoImpl();
	private ScreenDaoImpl screenDao=new ScreenDaoImpl();
	private ShowDaoImpl showDao=new ShowDaoImpl();
	private SeatDaoImpl seatDao=new SeatDaoImpl();
	Logger logger = Logger.getLogger(AdminServiceImpl.class.getName());
	boolean result;
	private Movie  movies;
	
	
	
	public AdminServiceImpl() {
		super();
	}

	@Override
	public Theater addTheater(Theater theater) {
		if(validateTheater(theater.getTheaterId())) { 
			theater=theaterDao.addTheater(theater);
			return theater;
		}
		else
			return null;
		}
		
	@Override
	public Boolean deleteTheater(Integer theaterId){
		logger.info("Critical validation will take place");
		if(validateTheater(theaterId)) {
			logger.info("Deletion of Theater will take place");
			result=theaterDao.deleteTheater(theaterId);
			return result;
		}
		else
			return false;
	}

	@Override
	public Movie addMovie(Movie movie){
	
		if(validateMovie(movie.getMovieId())) { 
			movies=movieDao.addMovieDao(movie);
			return movies;
		}
		else
			return null;
		}
		
	
	@Override
	public Boolean deleteMovie(Integer movieId){
		if(validateMovie(movieId)) {
			logger.info("Deletion of Movie will take place");
			result=movieDao.deleteMovie(movieId);
			return result;
		}
		else {
			return false;
		}
						
	}			
	@Override
	public Screen addScreen(Screen screen) {
		if(validateTheater(screen.getTheaterId())) {
			if(validateScreen(screen.getScreenId())) {
				logger.info("Addition of Screen will take place");
				screen=screenDao.addScreen(screen);
				return screen;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}	
	@Override
	public Boolean deleteScreen(Integer screenId) {	
		if(validateScreen(screenId)) {
			logger.info("Deletion of Screen will take place");
			result=screenDao.deleteScreen(screenId);
			return result;
		}
		else {
			return false;
		}
	}
	@Override
	public Show addShow(Show show) {
		show=showDao.addShowDao(show);
		return show;		
	}

	@Override
	public Boolean deleteShow(Integer showId) {
	
		result=showDao.deleteShow(showId);
		return result;
	
	}
	
	@Override
	public Boolean addSeat(Seat seat) {
	
		result=seatDao.addSeat(seat);
		return result;
	
	}

	@Override
	public Boolean deleteSeat(Integer seatId) {
		result=seatDao.deleteSeat(seatId);
		return result;
	}
	
	public Boolean validateMovie(Integer movieId) {
		try {
			logger.info("Critical validation will take place");
		
			String id=Integer.toString(movieId);
			if(movieId!=0 ) {
				if(id.charAt(0)=='3') {
					if(id.length()>=4) {
						return true;
					}
					else {
						throw new MovieExceptions(movieId);
					}
				}
				else {
					throw new MovieExceptions(movieId);			
				}
			}
			else {
				throw new MovieExceptions(movieId);
			}	
		}
		catch(NullPointerException e) {
			logger.info("Null value Entered");
			System.out.println("Data cannot be null");
			return false;
		}
		catch(MovieExceptions e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Boolean validateTheater(Integer theaterId) {
		try {
			logger.info("Critical validation will take place");
			String id=Integer.toString(theaterId);
			if(theaterId!=0 ) {
				if(id.charAt(0)=='2') {
					if(id.length()>=4) {
						return true;
					}
					else {
						throw new TheaterExceptions(theaterId);
					}
				}
				else {
					throw new TheaterExceptions(theaterId);			
				}
			}
			else {
				throw new TheaterExceptions(theaterId);
			}	
		}
		catch(NullPointerException e) {
			logger.info("Null value Entered");
			System.out.println("Data cannot be null");
			return false;
		}
		catch(TheaterExceptions e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Boolean validateScreen(Integer screenId) {
		try {
			logger.info("Critical validation will take place");
			String id=Integer.toString(screenId);
			if(screenId!=0 ) {
				if(id.length()>=4) {
					return true;
				}
				else {
					throw new ScreenExceptions(screenId);
				}
			}
			else {
				throw new ScreenExceptions(screenId);			
			}
		}
		catch(NullPointerException e) {
			logger.info("Null value Entered");
			System.out.println("Data cannot be null");
			return false;
		}
		catch(ScreenExceptions e) {
			System.out.println(e);
			return false;
			}
	
	}
}
