class Rule{
    public char x;
    public int y;
        Rule(){}
      }

public class Ex {

    public static void main(String[] args) {
        Rule[] ru=  new Rule[6];
        ru[0] = new Rule();
        ru[0].x = 'E';
        ru[0].y = 3;
        System.out.println(ru[0].x);

    }

}
