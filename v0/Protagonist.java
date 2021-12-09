public class Protagonist {

  private String name;
  private int hP;
  public double attackFactor;

  public Protagonist() {
    name = "_";
    hP = 50;
    attackFactor = 0.10; // Protagonist halo
  }

  public Protagonist ( String name ) {
    this.name = name;
    hP = 50;
    attackFactor = 0.10;
  }

  public String getName ( ) {
    return name;
  }

  public int getHP() {
    return hP;
  }

  public boolean isAlive() {
    return hP > 0;
  }

  // Math.random - Maximum is 5 and minimum is 0.
  public void specialize() {
    attackFactor = attackFactor + ((int)(Math.random() * 5)) * 0.1;
  }

  public void normalize() {
    attackFactor = 0.10;
  }

  public void lowerHP( int doneDamage ) {
    hP -= doneDamage;
  }

  public int attack( Monster enemy ) {
    int damage;
    damage = ( int ) (this.attackFactor * enemy.getHP());
    enemy.lowerHP(damage);
    return damage;
  }

}
