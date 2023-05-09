import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmoticonsFeeling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type something: ");
        String input_frase = input.nextLine();

        Pattern pattern = Pattern.compile(":-\\)");
        Matcher matcher = pattern.matcher(input_frase);
        long fun = matcher.results().count();

        pattern = Pattern.compile(":-\\(");
        matcher = pattern.matcher(input_frase);
        long upset = matcher.results().count();

        if (fun > upset)
            System.out.println("fun");
        else if (fun < upset)
            System.out.println("upset");
        else
            System.out.println("neutral");

    }

}
