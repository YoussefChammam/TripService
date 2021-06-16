//Author : Youssef Chammam

public abstract class Transportation implements TransportationInterface{

    public int numberOfSeats;

    public boolean availableSeats(){
        if (numberOfSeats > 0)
            return true;
        else
           return false;
    }
    public  void addSeat(){
        numberOfSeats += 1;
    }
    public void subtractSeat(){
        numberOfSeats -=1;
    }
}
