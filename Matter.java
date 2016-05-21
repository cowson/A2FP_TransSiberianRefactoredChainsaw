public abstract class Matter {

  private String type;
  private String texture;

  public Matter (String newType, String newTexture) {
    type = newType;
    texture = newTexture;
  }

  public String getType () {
    return type;
  }

  public String getTexture () {
    return texture;
  }
}
