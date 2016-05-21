public class Pickupable extends Matter {

  private Long timeOfFormation;

  public Pickupable (String newType, String newTexture) {
    super (newType, newTexture);
    timeOfFormation = System.currentTimeMillis ();
  }

  // TODO fucntion checkDecompose (Checks time created versus current time etc)
}
