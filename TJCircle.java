package pa03;

import java.awt.Color;

public class TJCircle extends CircleShape{

  public TJCircle(){
    super();
    this.color = Color.magenta;
  }

  public static void main(String[] args){
    TJCircle x = new TJCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "TJCircle:" + super.toString();
  }
}
