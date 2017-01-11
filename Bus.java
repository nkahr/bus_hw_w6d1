import java.util.ArrayList;

public class Bus {

  private int seats;
  private ArrayList<Person> passengers = new ArrayList<Person>();

  public Bus(int seats) {
    this.seats = seats;
  }

  public int seatCount() {
    return this.seats;
  }

  public int passengerCount() {
    return passengers.size();
  }

  public void addPassenger(Person passenger) {
    if (isFull()) return;
    passengers.add(passenger);
  }

  public boolean isFull() {
    return passengerCount() == seats;
  }

  public void pickUpPassengers(BusStop busStop) {
    ArrayList<Person> people = busStop.getQueue();
    ArrayList<Person> toBeRemoved = new ArrayList<Person>();
    for (Person person : people) {
      if (!isFull()) {
        addPassenger(person);
        toBeRemoved.add(person);
      }
    }
    for (Person person : toBeRemoved) {
      busStop.removePerson(person);
    }
  }

}