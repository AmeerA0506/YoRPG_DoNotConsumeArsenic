public class Character {
  
  protected int hP;
  protected int strengthFactor;
  protected int defenseFactor;
  protected double attackFactor;

  public int getDefense() {
    return defenseFactor;
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

  public int attack( Character enemy ) {
    int damage;
    damage = ( int ) ((strengthFactor * attackFactor) - enemy.getDefense());

    if ( damage < 0 ) {
      damage = 0;
    }

    enemy.lowerHP(damage);
    return damage;
  }

}
