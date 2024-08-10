import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question_10
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

        Collections.shuffle(colours);

        System.out.println(colours);
    }
}
