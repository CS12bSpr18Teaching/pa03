package pa03;

import java.awt.Color;

public class TimCircle extends CircleShape{

  public TimCircle(){
    super();
    this.color = new Color(0,0,0);
  }

  public static void main(String[] args){
    TimCircle x = new TimCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "TimCircle:" + super.toString();
  }
}
