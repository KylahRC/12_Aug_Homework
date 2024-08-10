import java.util.ArrayList;

public class Question_16
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
        numbers2.addAll(numbers);

        System.out.println(numbers2);
    }
}
