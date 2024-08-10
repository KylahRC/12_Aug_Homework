import java.util.ArrayList;

public class Question_4
{
    public static void main(String[] args)
    {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");

        String getElement = colours.get(3);

        System.out.println(getElement);
    }
}
