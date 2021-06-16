//Author : Youssef Chammam

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest{
    public static void main(String[] args) {
        TripService test1 = new TripService();
        //2 different transports
        Transportation Bus1 = new LicensedBuses();
        Transportation Mercedes = new PrivatePKW();
        //trip1

        //all the trip separated in nodes
        LinkedList.Node head = new LinkedList.Node("berlin");
        LinkedList.Node stop1 = new LinkedList.Node("Magdeburg");
        LinkedList.Node stop2 = new LinkedList.Node("Hannover");
        LinkedList.Node stop3 = new LinkedList.Node("Bielefeld");
        LinkedList.Node lastStop = new LinkedList.Node("Köln");
        //next node of each node
        head.next = stop1;
        stop1.next = stop2;
        stop2.next = stop3;
        stop3.next = lastStop;
        //the vehicle
        test1.vehicle = Mercedes;

        //booking as much as possible until
        test1.bookingStatus();
        test1.bookingStatus();
        System.out.println(Mercedes.numberOfSeats); //expected 1 available seat.
        test1.bookingStatus();
        test1.bookingStatus(); //expected refuse due to no available seats.

    }
}