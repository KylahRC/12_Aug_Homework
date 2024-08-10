import java.util.ArrayList;

public class Question_3
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

        colours.add(0,"Crimson");

        System.out.println(colours);
    }
}
