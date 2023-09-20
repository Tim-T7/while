public class DoWhile
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        do {
            System.out.println("i is" + 1 + "but is less than 15") ;
            i++;
        } while (i<5);
        int k = 0;
        do {
            System.out.println ("k is" + 1 +"but is greater than 5");
            k++;
        } while (k>5);
        int a = 0;
        do {
            System.out.println ("a is " + 1 + "but is less than 10");
            System.out.println ("b is " + 1 + "less than or equal to 20");
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }

    public static void main(String[] args)
    {        
        DoWhile hw = new DoWhile();
        hw.run();
    }
}

