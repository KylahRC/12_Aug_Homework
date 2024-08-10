import java.util.ArrayList;

public class Question_8
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int temp;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);

        for (a = 0; a < numbers.size() - 1; a++)
        {
            for (b = 0; b < numbers.size() - 1; b++)
            {
                if (numbers.get(b) > numbers.get(b + 1))
                {
                    temp = numbers.get(b);
                    numbers.set(b, numbers.get(b + 1));
                    numbers.set(b + 1, temp);
                }
            }
        }

        System.out.println(numbers);
    }
}
