public class Tank extends Protagonist {
  public Tank(){
    _hitPts = 200;
    _strength = 80;
    _defense = 60;
    _attack = .4;
  }
  public static void about() {
    System.out.println("A Tank is known for a slow game. They have less of a punch like the healer but make it up with defense and health.");
  }
}
