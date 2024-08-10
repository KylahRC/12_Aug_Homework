import java.util.ArrayList;

public class Question_12
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

        String portion = (colours.get(3) + ", " + colours.get(4) + ", " + colours.get(5));

        System.out.println(portion);
    }
}
