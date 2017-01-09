class BusStop {

  private Person[] people;

  public BusStop() {
    this.people = new Person[10];
  }

  public Person[] getQueue() {
    return this.people;
  }

  public int queueLength() {
    int count = 0;
    for (Person person : people) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void joinQueue(Person person) {
    if (queueLength() == people.length) return;
    people[queueLength()] = person;
  }

}