package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	try {
	System.out.print("Room number : ");
	int number = sc.nextInt();
	System.out.print("Check-in date (dd/MM/yyy):");
	Date checkIn = sdf.parse(sc.next());
	System.out.print("Check-out date (dd/MM/yyy):");
	Date checkOut = sdf.parse(sc.next());
	
	
	//if(!checkOut.after(checkIn)) {
		//System.out.println("Error in reservation: Check-out date must be after check-in date");
		
	//}else {
		Reservation reservation = new Reservation(number, checkIn, checkOut);
	    System.out.println("Reservtion: " + reservation );
	    
	    System.out.println();
	    System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in date (dd/MM/yyy):");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyy):");
		checkOut = sdf.parse(sc.next());
		
		
		
		/*
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			System.out.println("Error in reservation: Reservarion dates for update must be future dates");
		}else if( ! checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
		
		else {
			
			             */
			
			
			
			
			
		//String error = reservation.updateDates(checkIn, checkOut);
		//if (error != null) {
		//.out.println("Error in reservation: " + error);
			
		//}
		//else {
		
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservation : "+ reservation);
	
	
	}
	catch (ParseException e) {
		
		System.out.println("Invalid date format");
	}
	catch ( DomainException e) {
		System.out.println("Erro in reservation: " + e.getMessage( ));
	}
		
	
	catch (RuntimeException e) {
		System.out.println(" Unexpected error");
	}
		sc.close();
		
		
	}
	


}



//}
	
//}
