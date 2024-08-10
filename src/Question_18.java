import java.util.ArrayList;

public class Question_18
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        boolean notEmpty = !numbers.isEmpty();

        if(notEmpty)
        {
            System.out.println("Array is not empty");
        }

        numbers.removeAll(numbers);

        boolean empty = numbers.isEmpty();

        if(empty)
        {
            System.out.println("Array is empty");
        }

    }
}
