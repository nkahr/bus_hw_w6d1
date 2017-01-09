import static org.junit.Assert.assertEquals;
import org.junit.*;



public class BusTest {

  Bus bus;
  Person nina;
  Person tom;
  Person alex;

  @Before
  public void before() {
    bus = new Bus(2); //small bus
    nina = new Person("Nina");
    tom = new Person("Tom");
    alex = new Person("Alex");
  }

  @Test
  public void hasSeatCount() {
    assertEquals(2, bus.seatCount());
  }

  @Test 
  public void hasName() {
    assertEquals("Nina", nina.getName() );
  }

  @Test
  public void canGetPassengerCount() {
    assertEquals(0, bus.passengerCount());
    bus.addPassenger(nina);
    assertEquals(1, bus.passengerCount());
    bus.addPassenger(alex);
    assertEquals(2, bus.passengerCount());
    bus.addPassenger(tom);
    assertEquals(2, bus.passengerCount());
  }


}