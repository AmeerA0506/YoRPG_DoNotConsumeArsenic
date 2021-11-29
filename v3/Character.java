public class Character {
  protected int _hitPts;
  protected int _strength;
  protected int _defense;
  protected double _attack;

  public boolean isAlive() {
    return _hitPts > 0;
  }

  public int getDefense() {
    return _defense;
  }

  public void lowerHP(int damage) {
    if (damage<0){
    _hitPts = _hitPts- damage;
  }
}
  public int attack(Character name) {
    int damage = (int)( (_strength * _attack) - name.getDefense() );

    name.lowerHP(damage);
    return damage;
  }

  public int getHealth() {
    return _hitPts;
  }
}
