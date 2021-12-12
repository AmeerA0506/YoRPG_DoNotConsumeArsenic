public class Healer extends Protagonist {
  private double replenishFactor = 0.25;

  public Healer() {
    super();
    hP = 225;
    strengthFactor = 105;
    defenseFactor = 20;
  }

  public Healer( String name ) {
    super( name );
    hP = 225;
    strengthFactor = 105;
    defenseFactor = 20;
  }

  public void specialize() {
    attackFactor = 0.5;
    replenishFactor = 0.5;
    defenseFactor = 15;
    hP = replenish();
  }

  public void normalize() {
    attackFactor = 0.4;
    defenseFactor = 20;
    replenishFactor = 0.25;
  }

  public int replenish() {
    int addHP;
    addHP = ( int )( replenishFactor * (Math.random() * 100));
    hP += addHP;
    return hP;
  }

  public static String about() {
    return "Healers have excessive hP and their hP recharges but at the cost of their powers.";
  }

}
