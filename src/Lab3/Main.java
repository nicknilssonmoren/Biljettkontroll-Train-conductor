package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        switchAlt();
    }

    public static void switchAlt() {
        System.out.println("Vill du se alla passagerare eller vill du sälja en biljett till en kund?"
                + "\nVisa alla passagerare: 1." + "\nSälja biljett: 2." + "\nExit kod: 3.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Passenger.showPassenger();
                break;
            case 2:
                Ticket bt = new Ticket();
                bt.buyTicket();
                break;
            case 3:
                System.exit(0);
            default:
                switchAlt();
        }
    }
}