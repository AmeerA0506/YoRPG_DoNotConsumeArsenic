public class Monster extends Character {

  public Monster() {
    hP = 150;
    strengthFactor = 20 + (int)( Math.random() * 45 ); // [20, 65)
    defenseFactor = 20;
    attackFactor = 1;
  }

}
