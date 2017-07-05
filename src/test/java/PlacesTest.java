import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest {

  //confirm we can successfully instantiate Place objects
  @Test
  public void Place_instantiatesCorrectly_true(){
    Place myPlace = new Place("Tokyo");
    assertEquals(true, myPlace instanceof Place);
  }

  //make sure we can assign each place a description and then retrieve it:
  @Test
  public void Place_instantiatesWithDescription_String() {
    Place myPlace = new Place("Tokyo");
    assertEquals("Tokyo", myPlace.getDescription());
  }
}
