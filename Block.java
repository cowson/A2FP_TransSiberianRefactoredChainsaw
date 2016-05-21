public abstract class Block extends Matter {

  private int resiliance;

  public Block (String newType, String newTexture) {
    super (newType, newTexture);
  }

  public int getResiliance () {
    return resiliance;
  }

  // TODO function ifClicked (Breaking etc.)
}
