package Lab3;

import java.util.Scanner;

public class Ticket {
    private String name;
    private int age;
    private String ticket;
    private int price;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String getTicket(String ticket) {
        return ticket;
    }

    public String setTicket(String ticket) {
        this.ticket = ticket;
        return ticket;
    }

    public int getPrice(int price) {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public void buyTicket() {
        System.out.println("Vad heter du?");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.next());
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hur gammal är du?");
        Scanner scanner1 = new Scanner(System.in);
        age = setAge(scanner1.nextInt());
        if (age < 18 || age > 65) {
            System.out.println("Vill du köpa en enkelbiljett eller en månadsbiljett?"
                    + "\nEnkelbiljett: 1." + "\nMånadsbiljett: 2.");
            int choice = scanner1.nextInt();
            switch (choice) {
                case 1:
                    Passenger.addPassenger(getName(name));
                    ticket = setTicket("Enkelbiljett");
                    Passenger.addTicket(getTicket(ticket));
                    price = setPrice(20);
                    Passenger.addPrice(getPrice(price));
                    System.out.println(getTicket(ticket) + ": " + getName(name) + "\n");
                    Main.switchAlt();
                case 2:
                    Passenger.addPassenger(getName(name));
                    ticket = setTicket("Månadsbiljett");
                    Passenger.addTicket(getTicket(ticket));
                    price = setPrice(450);
                    Passenger.addPrice(getPrice(price));
                    System.out.println(getTicket(ticket) + ": " + getName(name) + "\n");
                    Main.switchAlt();
                default:
                    break;
            }
        } else {
            System.out.println("Vill du köpa en enkelbiljett eller månadsbiljett?"
                    + "\nEnkelbiljett: 1." + "\nMånadsbiljett: 2.");
            Scanner scanner2 = new Scanner(System.in);
            int choice = scanner2.nextInt();
            switch (choice) {
                case 1:
                    Passenger.addPassenger(getName(name));
                    ticket = setTicket("Enkelbiljett");
                    Passenger.addTicket(getTicket(ticket));
                    price = setPrice(35);
                    Passenger.addPrice(getPrice(price));
                    System.out.println(getTicket(ticket) + ": " + getName(name) + "\n");
                    Main.switchAlt();
                case 2:
                    Passenger.addPassenger(getName(name));
                    ticket = setTicket("Månadsbiljett");
                    Passenger.addTicket(getTicket(ticket));
                    price = setPrice(600);
                    Passenger.addPrice(getPrice(price));
                    System.out.println(getTicket(ticket) + ": " + getName(name) + "\n");
                    Main.switchAlt();
                default:
                    break;
            }
        }
    }
}