public class Dragon extends Monster {
  public Dragon() {
    super();
    hP = 150;
    strengthFactor = 65;
    defenseFactor = 25;
  }

  public String about() {
    return "A Dragon terrorizes all those who dares challenge it.";
  }
}
