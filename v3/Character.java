class Character{
  public int attack(Character name){
  if (pat.special){
  damage=(int)(Math.random()*15);
}
else{
  damage=(int)(Math.random()*10+10);
}
}
public boolean isAlive(){
  boolean retBoo=true;
  if(HP<=0){
    retBoo= false;
  }
  return retBoo;
}
}
