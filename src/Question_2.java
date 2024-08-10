import java.util.ArrayList;
public class Question_2
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

        for (int i = 0; i < colours.size(); i++)
        {
            System.out.print(colours.get(i) + ", ");
        }
    }
}

