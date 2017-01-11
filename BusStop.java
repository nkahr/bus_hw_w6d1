import java.util.ArrayList;

class BusStop {

  private ArrayList<Person> people = new ArrayList<Person>();

  public ArrayList<Person> getQueue() {
    return this.people;
  }

  public int queueLength() {
    return people.size();
  }

  public void removePerson(Person person) {
    people.remove(person);
  }

  public void joinQueue(Person person) {
    people.add(person);
  }

}