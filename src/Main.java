public class Main
{
    public static void main(String[] args)
    {
        double num = 150;
        double tax = 0.02;
        double cost = (num + (num * tax));

        if(num >= 100)
        {
            System.out.println("The total price is " + num);
        }
        else
        {
            System.out.println("The total price is " + cost);
        }
    }
}