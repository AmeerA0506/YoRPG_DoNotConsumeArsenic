class Protagonist extends Character{
  String name;
  int HP=50;
  boolean special=false;

  public Protagonist(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }

  public void normalize(){
    special=false;
  }
  public void specialize(){
    special=true;
  }
  public boolean getSpecial(){
    return special;

}
}
