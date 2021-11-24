public class Monster extends Character {

  public Monster() {
    health = 25;
    damage = 0;
  }

  public int attack ( Protagonist pro ) {
    if ( pro.special == true){
        damage = (int)(Math.random()*10);
        pro.minHP( damage );
    }
    else {
      damage = (int)(Math.random()*5 +5);
      pro.minHP( damage );
    }
    return damage;
  }

  public boolean isAlive() {
    boolean retBoo = true;
    if( health <= 0 ) {
      retBoo = false;
    }
    return retBoo;
  }
}
