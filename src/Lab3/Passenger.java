package Lab3;

import java.util.ArrayList;

public class Passenger {
    private static final ArrayList<Integer> priceList = new ArrayList<>();
    private static final ArrayList<String> valTicketList = new ArrayList<>();
    private static final ArrayList<String> passengerList = new ArrayList<>();

    public static void addPassenger(String passenger) {
        Ticket bt = new Ticket();
        passengerList.add(bt.getName(passenger));
    }

    public static void addTicket(String ticket) {
        Ticket bt = new Ticket();
        valTicketList.add(bt.getTicket(ticket));
    }

    public static void addPrice(int price) {
        Ticket bt = new Ticket();
        priceList.add(bt.getPrice(price));
    }

    public static void showPassenger() {
        for (int i = 0; i < passengerList.size() && i < valTicketList.size() && i < priceList.size(); i++) {
            System.out.println(passengerList.get(i) + " " + valTicketList.get(i) + " " + priceList.get(i));
        }
        Main.switchAlt();
    }
}
