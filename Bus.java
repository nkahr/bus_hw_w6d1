public class Bus {

  int seats;
  Person[] passengers;

  public Bus(int seats) {
    this.seats = seats;
    this.passengers = new Person[seats];
  }

  public int seatCount() {
    return this.seats;
  }

  public int passengerCount() {
    int count = 0;
    for (Person passenger : passengers) {
      if (passenger != null) {
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person passenger) {
    if (isFull()) return;
    passengers[passengerCount()] = passenger;
  }

  public boolean isFull() {
    return passengerCount() == seats;
  }

}