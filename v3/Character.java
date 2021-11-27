public class Character {
  int HP;
  boolean special;
  int damage;

  public int attack( Character name ) {
    if ( name.special ) {
      damage = ( int )( Math.random() * 15 );
    }
    else {
      damage = ( int )( Math.random() * 10 + 10 );
    }
    name.HP -= damage;
    return damage;
  }
  // public boolean isAlive() {
  //   boolean retBoo = true;
  //   if (HP <= 0) {
  //     retBoo = false;
  //   }
  //   return retBoo;
  // }
}
