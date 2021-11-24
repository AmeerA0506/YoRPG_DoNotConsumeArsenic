public class Protagonist extends Character {
   String name;
  // boolean special = false;

  public Protagonist() {
    health = 50;
    special = false;
    damage = 0;
  }

  public Protagonist ( String name ) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int attack ( Monster monster ) {
    if (special) {
      damage = (int)(Math.random()*15);
    }
    else{
      damage = (int)(Math.random()*10+10);
    }
    monster.minHP( damage );
    return damage;
  }

  public void normalize() {
    special = false;
  }

  public void specialize() {
    special = true;
  }

  public boolean getSpecial() {
    return special;
  }

  public boolean isAlive(){
    boolean retBoo = true;
    if ( health <= 0 ) {
      retBoo = false;
    }
    return retBoo;
  }
}
