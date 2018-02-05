package pa03;

public class TimCircle extends CircleShape{

  public static void main(String[] args){
    TimCircle x = new TimCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "TimCircle:" + super.toString();
  }
}
