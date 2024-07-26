package busResv;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2)); //Assigning 2 capacities in BUS:1 to make the output check easier.
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int userOption = 1;
		Scanner sc = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		
		while(userOption == 1) {
			System.out.println("ENTER '1' TO BOOK and '2' TO EXIT...." );
			userOption = sc.nextInt();
			
			if(userOption == 2) {
				System.out.println("<<... THANK YOU ...>>");
			}
		
			if(userOption == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("YOUR BOOKING IS CONFIRMED..!!!");
				}
				else
					System.out.println("SORRY ! BUS is FULL. Try for Another Bus or Date !!!");
			}
		}

	}

}
