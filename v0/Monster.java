public class Monster {
  private int hP;
  private double attackFactor;

  public Monster() {
    hP = 50;
    attackFactor = 0.5;
  }
  public int getHP() {
    return hP;
  }

  public boolean isAlive() {
    return hP > 0;
  }

  public void lowerHP( int doneDamage ) {
    hP -= doneDamage;
  }

  public int attack( Protagonist enemy ) {
    int damage;
    damage = ( int ) (this.attackFactor * enemy.getHP());
    enemy.lowerHP(damage);
    return damage;
  }

}
