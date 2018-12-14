import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}
/**
 * Class for show.
 */
class Show {
    /**
     * name of the movie.
     */
    private String movie;
    /**
     * show timing.
     */
    private String showTime;
    /**
     * array of seats.
     */
    private String[] seats;
    /**
     * Constructs the object.
     *
     * @param      movi     The movie
     * @param      showTim  The show time
     * @param      seat     The seats
     */
    Show(final String movi, final String showTim, final String[] seat) {
        this.movie = movi;
        this.showTime = showTim;
        this.seats = seat;
    }
    /**
     * Gets the movie.
     *
     * @return     The movie.
     */
    String getMovie() {
        return movie;
    }
    /**
     * Gets the show time.
     *
     * @return     The show time.
     */
    String getShowTime() {
        return showTime;
    }
    /**
     * Gets the seats.
     *
     * @return     The seats.
     */
    String[] getSeats() {
        return seats;
    }
    /**
     * Sets the seat na.
     *
     * @param      index  The index
     */
    void setSeatNA(final int index) {
        seats[index] = "N/A";
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return movie + "," + showTime;
    }
}
/**
 * Class for patron.
 */
class Patron {
    /**
     * name of the patron.
     */
    private String name;
    /**
     * mobile number of the patron.
     */
    private String mobile;
    /**
     * Constructs the object.
     *
     * @param      nam    The name
     * @param      mobil  The mobile
     */
    Patron(final String nam, final String mobil) {
        this.name = nam;
        this.mobile = mobil;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    String getName() {
        return name;
    }
    /**
     * Gets the mobile.
     *
     * @return     The mobile.
     */
    String getMobile() {
        return mobile;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return name + " " + mobile;
    }
}
/**
 * Class for book your show.
 */
class BookYourShow {
    /**
     * list of shows.
     */
    private ArrayList<Show> showList;
    /**
     * list of tickets.
     */
    private ArrayList<String> ticketList;
    /**
     * Constructs the object.
     */
    BookYourShow() {
        showList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }
    /**
     * Adds a show.
     *
     * @param      show  The show
     */
    void addAShow(final Show show) {
        showList.add(show);
    }
    /**
     * Gets a show.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     *
     * @return     A show.
     */
    Show getAShow(final String movie, final String showTime) {
        for (Show show: showList) {
            if (show.getMovie().equals(movie)
            && show.getShowTime().equals(showTime)) {
                return show;
            }
        }
        return null;
    }
    /**
     * { function_description }.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     * @param      patron    The patron
     * @param      seats     The seats
     */
    void bookAShow(final String movie, final String showTime,
    final Patron patron, final String[] seats) {
        Show show = getAShow(movie, showTime);
        if (show == null) {
            System.out.println("No show");
            return;
        }
        boolean flag = false;
        String[] sseats = show.getSeats();
        for (String seat: seats) {
            for (int i = 0; i < sseats.length; i++) {
                if (seat.equals(sseats[i])) {
                show.setSeatNA(i);
                flag = true;
                }
            }
        }
        if (flag) {
            ticketList.add(patron.getMobile()
                + " " + movie + " " + showTime);
        }
    }
    /**
     * { function_description }.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     * @param      mobile    The mobile
     */
    void printTicket(final String movie, final String showTime,
    final String mobile) {
        String t = mobile + " " + movie + " " + showTime;
        if (ticketList.contains(t)) {
            System.out.println(t);
        } else {
            System.out.println("Invalid");
        }
    }
    /**
     * Shows all.
     */
    void showAll() {
        for (Show show: showList) {
            System.out.println(show.toString() + ","
            + Arrays.toString(show.getSeats()).replace(" ", ""));
        }
    }
}
