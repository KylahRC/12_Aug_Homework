import java.util.ArrayList;

public class Question_20
{
    public static void main(String[] args)
     {
        ArrayList<Integer> numbers = new ArrayList<Integer>(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

         System.out.println(numbers.size());

        numbers.trimToSize();

        System.out.println(numbers.size());
    }
}