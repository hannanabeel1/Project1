/*
 * Movie Reservations Application
 * 1) Welcome the user. (Done);-}
 * 2) Ask: how many users are going to watch the movie.  (Done);-)
 * 3)list the name of each available movie with index for each movie. (Done);-0
 * 4) Ask the user in which movie is interested. (Done);-(
 * 5) inform the user with the movie details (cost, theater) (Done);-{
 *  - Theater
 *  - Cost of tickets
 */
import java.util.*;
public class MovieTickets {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /*int costOfTickits;
        String Theater;*/
        String[][] Movies = create_movies();
        // Start interaction
        System.out.println("Wlecome To The Cinema");
        System.out.println("Hello Mr.!");
        System.out.println("Enter Your Email: ");
        String Email = input.nextLine();
         System.out.println("Enter Your Name: ");
        String Name = input.nextLine();
        System.out.println("Enter Your Contact Number: ");
        int Num = input.nextInt();
        // Get number of tickets
        System.out.print("How many people are going to watch the movie? ");
        int NumOfTickets = input.nextInt();
        int TicketsCost = NumOfTickets * (int) (Math.random()*20);
        System.out.println("Choose one of the following movies:");
        int i = 1;
        for (String[] movie : Movies) {
            System.out.println(i + ": Name: " + movie[0] + ", Theater: " + movie[1] + ", Cost Per Ticket: " + TicketsCost );
            i++;
        }
        // Get movie
        int MovieChoice = input.nextInt() - 1;
        System.out.println("Theater for the selected movie is: " + Movies[MovieChoice][1]);
        System.out.println("Tickets cost for the selected movie is: " + TicketsCost * NumOfTickets);
        System.out.println("Enjoy With Your Movie");
        System.out.println("Create by 'Hanna , Ahmad'");
        System.out.println("Dr. Yousef Sanjalawe: " + "Programming Fundamental");
    }
    // Create Method
    public static String[][] create_movies() {
        String[][] Movies = {
                { "Avatar2", "A1"},
                { "The Good Doctor", "A2"},
                { "Den Of Thieves", "A3"},
                { "Wednesday", "A4"},
                { "Money Heist", "A5"},
                { "San Andreas", "B1"},
                { "Passengers", "B2"},
                { "G.I.Joe", "B3"},
                { "Red Notice", "B4"},
                { "Peaky Blinders", "B5"},
        };

        return Movies;
    }
}
