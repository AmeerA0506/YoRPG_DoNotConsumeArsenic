public class Character {
  protected int health;
  protected int damage;
  protected boolean special;

  public void minHP (int hp ) {
    health -= hp;
  }
}
