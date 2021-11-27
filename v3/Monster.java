public class Monster extends Character {
  int HP = 25;
  public boolean isAlive() {
    boolean retBoo = true;
    if (HP <= 0) {
      retBoo = false;
    }
    return retBoo;
  }
}
