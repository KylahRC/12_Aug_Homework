import java.util.ArrayList;

public class Question_13
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

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(6);
        numbers2.add(5);
        numbers2.add(4);
        numbers2.add(3);
        numbers2.add(2);
        numbers2.add(1);

        boolean equals = numbers.equals(numbers2);

        if (equals)
        {
            System.out.println("The lists are the same");
        }
        else
        {
            System.out.println("The lists are not the same");
        }

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

        boolean equals2 = numbers.equals(numbers2);

        if (equals2)
        {
            System.out.println("The lists are the same");
        }
        else
        {
            System.out.println("The lists are not the same");
        }
    }
}
