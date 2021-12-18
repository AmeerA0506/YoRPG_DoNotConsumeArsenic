public class Warrior extends Protagonist {
  public Warrior() {
    super();
    strengthFactor = 150;
    defenseFactor = 30;
  }

  public Warrior( String name ) {
    super ( name );
    strengthFactor = 150;
    defenseFactor = 30;
  }

  public void specialize() {
    attackFactor = 1.0;
    defenseFactor = 10;
  }

  public void normalize() {
    attackFactor = 0.4;
    defenseFactor = 30;
  }

  public static String about() {
    return "Warrior does greater damage but will accept greater loss.";
  }

}
