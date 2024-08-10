import java.util.ArrayList;
import java.util.Scanner;

public class Question_7
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

        Scanner searchFor = new Scanner(System.in);
        System.out.println("What colour of the rainbow are you looking for?");
        String colourSearched = searchFor.nextLine();


        if (colours.contains(colourSearched))
        {
            System.out.println("The colour " + colourSearched +" is in the array");
        }
        else
        {
            System.out.println("The colour " + colourSearched +" is not in the array");
        }
    }
}