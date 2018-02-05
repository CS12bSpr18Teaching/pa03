package pa03;

import java.awt.Color;

public class GavinCircle extends CircleShape {

  public GavinCircle(){
    super();
    this.color = new Color(88,167,67);
  }

  public static void main(String[] args){
    GavinCircle x = new GavinCircle();
    System.out.println("my circle is "+x);
  }

  public String toString (){
    return "GavinCircle:" + super.toString();
  }

}
