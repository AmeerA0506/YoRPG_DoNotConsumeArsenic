public class Monster extends Character {
    public Monster() {
        _hitPts = 150;
        _strength = 20 + (int) (Math.random() * 45);
        _defense = 20;
        _attack = 1;
    }
}
