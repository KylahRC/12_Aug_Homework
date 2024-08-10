import java.util.ArrayList;

public class Question_6
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

        System.out.println(colours);

        colours.remove(2);

        System.out.println(colours);
    }
}
