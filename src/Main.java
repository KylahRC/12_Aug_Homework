import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            String runWhichQuestion = JOptionPane.showInputDialog("Which question do you want to run? Type just the number of the question you want to test or type Quit to close the program");

            if (runWhichQuestion.equalsIgnoreCase("Quit"))
            {
                break;
            }

            switch (runWhichQuestion)
            {
                case "1" -> Question_1.main(args);
                case "2" -> Question_2.main(args);
                case "3" -> Question_3.main(args);
                case "4" -> Question_4.main(args);
                case "5" -> Question_5.main(args);
                case "6" -> Question_6.main(args);
                case "7" -> Question_7.main(args);
                case "8" -> Question_8.main(args);
                case "9" -> Question_9.main(args);
                case "10" -> Question_10.main(args);
                case "11" -> Question_11.main(args);
                case "12" -> Question_12.main(args);
                case "13" -> Question_13.main(args);
                case "14" -> Question_14.main(args);
                case "15" -> Question_15.main(args);
                case "16" -> Question_16.main(args);
                case "17" -> Question_17.main(args);
                case "18" -> Question_18.main(args);
                case "19" -> Question_19.main(args);
                case "20" -> Question_20.main(args);
                case "21" -> Question_21.main(args);
                case "22" -> Question_22.main(args);

                default -> JOptionPane.showMessageDialog(null, "No exercise selected");
            }
        }
    }

}


