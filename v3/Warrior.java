public class Warrior extends Protagonist {
  public Warrior(String name){
    Protagonist(name);
    int atk=2;
    int evasiveness=1;
    int HP=200;
  }
  public static void about() {
    System.out.println(" A Warrior attacks with twice the might.");
  }
}
