public class Healer extends Protagonist {
  public Healer(){
    _hitPts = 125;
    _strength = 100;
    _defense = 40;
    _attack = .4;
  }
  public static void about() {
    System.out.println("With a unique advantage, the healer provides an extra health boost per round. Their hits pack less of a punch, though.");
  }
}
