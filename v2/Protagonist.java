public class Protagonist extends Character {

  protected String name;

  public Protagonist() {
    name = "_";
    strengthFactor = 100;
    defenseFactor = 40;
    hP = 125;
    attackFactor = 0.4;
  }

  public Protagonist ( String name ) {
    this();
    this.name = name;
  }

  public String getName ( ) {
    return name;
  }

  public void specialize() {
    attackFactor = 0.75;
    defenseFactor = 20;
  }

  public void normalize() {
    attackFactor = 0.40;
    defenseFactor = 40;
  }

}
