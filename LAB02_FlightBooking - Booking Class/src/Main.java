import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0){
            FlightBooking fb  = new FlightBooking();
            String line = scanner.nextLine();
            phanTich(line, fb);
            System.out.println();
        }
    }
    public static void phanTich(String s, FlightBooking fb){
        String[] arr_str = s.split(" ");
        for(int i = 0; i < arr_str.length; i+=2){
            switch (arr_str[i + 1]) {
                case "Booking":
                    System.out.print(fb.booking());
                    break;
                case "Confirmed":
                    System.out.print(fb.confirmed(arr_str[i]));
                    break;
                case "Cancel":
                    System.out.print(fb.cancel());
                    break;
            }
        }
    }
}

class FlightBooking{
    public String flightId="OOP24";
    private static int seatAvailable=180;
    private int numOfSeatsRemaining;
    //Your code goes here
    public FlightBooking(){
        this.numOfSeatsRemaining = seatAvailable;
    };
    public String booking(){
        this.numOfSeatsRemaining -= 1;
        return "[Seat Available: "+ this.numOfSeatsRemaining+"]";
    }
    public String cancel(){
        this.numOfSeatsRemaining += 1;
        return "[Seat Available: "+ this.numOfSeatsRemaining+"]";
    }
    public String confirmed(String id){
        return "--User "+ id +" Confirmed--[Seat Available: "+ this.numOfSeatsRemaining+"]";
    }

}