public class Protagonist extends Character {

  private String name;

  /*
  private int hP;
  private int strengthFactor;
  private int defenseFactor;
  public double attackFactor;
  */

  public Protagonist() {
    name = "_";
    strengthFactor = 100;
    defenseFactor = 40;
    hP = 125;
    attackFactor = 0.4; // Protagonist halo
  }

  public Protagonist ( String name ) {
    this();
    this.name = name;
  }

  public String getName ( ) {
    return name;
  }

  // public int getDefense() {
  //   return defenseFactor;
  // }

  // public int getHP() {
  //   return hP;
  // }

  // public boolean isAlive() {
  //   return hP > 0;
  // }

  // Math.random - Maximum is 5 and minimum is 0.
  public void specialize() {
    attackFactor = 0.75;
    defenseFactor = 20;
  }

  public void normalize() {
    attackFactor = 0.40;
    defenseFactor = 20;
  }

  // public void lowerHP( int doneDamage ) {
  //   hP -= doneDamage;
  // }
  //
  // public int attack( Monster enemy ) {
  //   int damage;
  //   damage = ( int ) ((strengthFactor * attackFactor) - enemy.getDefense());
  //
  //   if ( damage < 0 ) {
  //     damage = 0;
  //   }
  //
  //   enemy.lowerHP(damage);
  //   return damage;
  // }

}
