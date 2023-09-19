public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i<15) {
            System.out.println("i is" + 1 + "but is less than 15") ;
            i++;
        }
        int k = 0;
        while (k > 5) {
            System.out.println ("k is" + 1 +"but is greater than 5");
            k++;
        }
        int a = 0;
        while (a < 10 && b <= 20) {
            System.out.println ("a is " + 1 + "but is less than 10");
            System.out.println ("b is " + 1 + "less than or equal to 20");
            a++;
            b++;
        } 
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

