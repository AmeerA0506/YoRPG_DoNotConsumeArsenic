public class Orc extends Monster {
  public Orc() {
    super();
    strengthFactor = (int)( Math.random() * 45 );
    defenseFactor = 25;
  }

  public String about() {
    return "An Orc, renown for its awful smell, is weaker in fights but tougher in its leathery skin.";
  }
}
