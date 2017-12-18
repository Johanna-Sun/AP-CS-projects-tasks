

public class Oct24 {

  static class Student {

    private double code;
    private String name;

    Student(double code, String name){
         this.code=code;
         this.name=name;
     }

     void setPrice(double code){
           this.code=code;
       }

       public String toString(){
           return "price is "+code+"; name is "+name;
       }

  }

  public static void main(String[] args) {
    Student apple=new Student(1.2,"apple");
System.out.println(apple);

apple.setPrice(2.0);
System.out.println(apple);
  }
}
