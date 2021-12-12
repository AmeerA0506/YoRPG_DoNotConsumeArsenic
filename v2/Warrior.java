public class Warrior extends Protagonist {
  public Warrior() {
    super();
    strengthFactor += 50;
    defenseFactor -= 10;
  }

  public Warrior( String name ) {
    super( name );
    strengthFactor += 50;
    defenseFactor -= 10;
  }

  public void specialize() {
    attackFactor = 1.0;
    defenseFactor = 10;
  }

  public static String about() {
    return "Warrior does greater damage but will accept greater loss.";
  }

}
