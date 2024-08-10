import java.util.ArrayList;

public class Question_14
{
    public static void main(String[] args)
    {
        String temp;
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Violet");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Red");

        System.out.println(colours);

        temp = colours.get(0);
        colours.set(0, colours.get(6));
        colours.set(6, temp);

        System.out.println(colours);
    }
}
