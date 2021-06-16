//author : Youssef Chammam

import java.util.Scanner;

public class TripService implements TripsInterface {

    LinkedList.Node head;
    Transportation vehicle;

    //gives back end destination and all part trips, with the number of free places in the vehicle
    public void trips(LinkedList partTrips, int freePlaces) {
        //constructor
        vehicle.numberOfSeats = freePlaces;
        String lastDestination = LinkedList.lastDestination(head);
        System.out.println("the trip is to " + lastDestination);
        System.out.println("and it goes through the following places : ");
        LinkedList.destinations(head);
        System.out.println("The count of free places in the transport vehicle of this trip is the following : " + freePlaces);
    }

    //Confirm or cancel a trip
    public void tripConfirmed() {
        //identification of the person willing to book or to cancel a reservation
        System.out.println("what is your name ?");
        Scanner scan3 = new Scanner(System.in);
        Person client = new Person();
        client.name = scan3.next();

        System.out.println("do you want to book your trip [0] or to cancel it [1] ? ");
        Scanner s1 = new Scanner(System.in);
        int result = s1.nextInt();
        if (result == 0) {
            System.out.println("the trip is confirmed ! ");
            double costs = LinkedList.costs(head);
            System.out.println("the costs of the trip would be :" + costs + " euros.");
        } else if (result == 1) {
            //if it is canceled, we delete everything from the list, which leads us to no destination.
            System.out.println("The trip has been canceled.");
            LinkedList.canceled(head);
        } else
            throw new IllegalArgumentException("you didn't enter a correct value");
    }

    //confirm or decline a booking

        public boolean bookingStatus () {
            System.out.println("do you want to confirm your booking [0] or to decline it [1] ? ");
            Scanner s2 = new Scanner(System.in);
            int result2 = s2.nextInt();
            if (result2 == 0) {
                if (vehicle.availableSeats()) {
                    System.out.println("congratulations, the booking is confirmed !");
                    vehicle.subtractSeat(); //because a seat is now reserved
                    return true;
                } else {
                    System.out.println("sorry , no more seats available in the vehicle.");
                    return false;
                }
            } else if (result2 == 1) {
                System.out.println("Your booking has been successfully declined.");
                vehicle.addSeat(); //because an extra seat will be free
                return false;
            } else
                throw new IllegalArgumentException("you didn't enter a correct value");
        }
    }


