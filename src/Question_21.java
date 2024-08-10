import java.util.ArrayList;

public class Question_21
{
    public static void main(String[] args)
    {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Grey");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");

        System.out.println(colours);

        colours.set(1, "Orange");

        System.out.println(colours);

    }
}
