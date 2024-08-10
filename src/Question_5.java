import java.util.ArrayList;

public class Question_5
{
    public static void main(String[] args)
    {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Grey");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");

        System.out.println(colours);

        colours.set(0, "Red");

        System.out.println(colours);
    }
}
