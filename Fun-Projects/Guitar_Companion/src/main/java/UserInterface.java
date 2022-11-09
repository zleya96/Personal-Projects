import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private Map<String, String> chordMapOpenPosition = new HashMap<>();
    String gMajor1;
    String cMajor1;
    String fMajor1;
    String bMajor1;
    String eMajor1;
    String aMajor1;
    String dMajor1;


    public UserInterface() {
        chordMapOpenPosition.put("g major", gMajor1);
        chordMapOpenPosition.put("c major", cMajor1);
        chordMapOpenPosition.put("f major", fMajor1);
        chordMapOpenPosition.put("b major", bMajor1);
    }

    public void askForChordName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a chord name: ");
        String input = scanner.nextLine();

        if (chordMapOpenPosition.containsKey(input.toLowerCase())) {
            System.out.println(chordMapOpenPosition.get(input.toLowerCase()));
        }

    }



    {
        gMajor1 =
                        "_ _ o o _ _\n" +
                        "| | |.| | |\n" +
                        "| * | | | |\n" +
                        "* | |.| * *\n" +
                        "| | | | | |\n" +
                        "| | |.| | |\n" +
                        "- - - - - - ";

        cMajor1 =
                        "x _ _ o _ o\n" +
                        "| | |.| * |\n" +
                        "| | * | | |\n" +
                        "| * |.| | |\n" +
                        "| | | | | |\n" +
                        "| | |.| | |\n" +
                        "- - - - - - ";

        fMajor1 =
                "_ _ _ _ _ _\n" +
                "* * *.* * *\n" +
                "| | | * | |\n" +
                "| * *.| | |\n" +
                "| | | | | |\n" +
                "| | |.| | |\n" +
                "- - - - - - ";

        bMajor1 =
                "x _ _ _ _ _\n" +
                "| | |.| | |\n" +
                "| * * * * *\n" +
                "| | |.| | |\n" +
                "| | * * * |\n" +
                "| | |.| | |\n" +
                "- - - - - - ";
    }

}
