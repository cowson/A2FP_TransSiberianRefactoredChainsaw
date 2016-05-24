public abstract class Matter {

  private String _type;
  private String _texture;

  public Matter (String newType, String newTexture) {
    type = newType;
    texture = newTexture;
  }

  public String getType () {
    return _type;
  }

  public String getTexture () {
    return _texture;
  }
}
