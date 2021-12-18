public class Tank extends Protagonist {
  public Tank() {
    super();
    defenseFactor = 70;
    strengthFactor = 110;
    attackFactor = 0.3;
  }

  public Tank ( String name ) {
    super( name );
    defenseFactor = 70;
    strengthFactor = 110;
  }

  public void specialize() {
    defenseFactor = 80;
    hP = 150;
    attackFactor = 0.2;
  }

  public void normalize() {
    attackFactor = 0.3;
    defenseFactor = 70;
  }

  public static String about() {
    return "Tanks are formiddable but at the cost of their attack powers.";
  }
}
