import java.util.ArrayList;

public class Question_9
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

        ArrayList<String> colours2 = new ArrayList<String>(colours);

        System.out.println(colours);
        System.out.println(colours2);
    }
}
