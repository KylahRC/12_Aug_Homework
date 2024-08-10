import java.util.ArrayList;

public class Question_15
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

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);
        numbers2.add(11);
        numbers2.add(12);
        numbers2.add(13);
        numbers2.add(14);

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.addAll(numbers);
        numbers3.addAll(numbers2);

        System.out.println(numbers3);

    }
}
