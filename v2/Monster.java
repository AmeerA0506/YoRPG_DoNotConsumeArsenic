public class Monster extends Character {

  /*
  private int hP;
  private int strengthFactor;
  private int defenseFactor;
  private double attackFactor;
  */

  public Monster() {
    hP = 150;
    strengthFactor = 20 + (int)( Math.random() * 45 ); // [20, 65)
    defenseFactor = 20;
    attackFactor = 1;
  }

  // public int getDefense() {
  //   return defenseFactor;
  // }

  // public boolean isAlive() {
  //   return hP > 0;
  // }

  // public void lowerHP( int doneDamage ) {
  //   hP -= doneDamage;
  // }
  //
  // public int attack( Protagonist enemy ) {
  //   int damage;
  //   damage = ( int ) (( strengthFactor * attackFactor) - enemy.getDefense());
  //
  //   if (damage < 0) {
  //     damage = 0;
  //   }
  //
  //   enemy.lowerHP(damage);
  //   return damage;
  //}

}
