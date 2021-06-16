//Author : Youssef Chammam


import java.util.Scanner;

public class LinkedList{
    public static class Node {
        public String place;
        public Node next;
        //constructor
        public Node(String place){
            this.place = place;
        }
        Node head;
    }
    //count how many destinations will be crossed during the trip
    public static int countNodes(Node head){
        int counter = 1;
        Node currentNode = head;
        while (currentNode.next != null){
            counter +=1;
            currentNode = currentNode.next;
        }
        return counter;
    }
    //append a destination at the end of the trip
    public static void append(Node head , String newEndDestination){
        if (head == null) {
            head = new Node(newEndDestination);
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(newEndDestination);
    }
    //give back last destination
    public static String lastDestination(Node head){
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        return currentNode.place;
    }
    //give back all destinations
    public static void destinations(Node head){
        Node currentNode = head;
        while (currentNode.next != null){
            System.out.println(currentNode.place);
            currentNode = currentNode.next;
        }
    }
    public static void canceled(Node head){
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode.place = null;
            currentNode = currentNode.next;
        }
    }
    //costs calculator of the trip : 20 euros per stop, and 0.20 euros per kilometer.
    public static double costs(Node head){
       int totalDest = countNodes(head);
        System.out.println("how many kilometers is the trip (not decimal but approximately)? ");
       Scanner scannerr = new Scanner(System.in);
        int kilometers = scannerr.nextInt();
       return kilometers*0.20 + totalDest*20;
    }
}
