import java.util.ArrayList;

public class Question_22
{
    public static void main(String[] args)
    {
        int i;
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");

        for (i = 0; i < colours.size(); i++)
        {
            System.out.print(colours.get(i)+ ", ");
        }

    }
}
