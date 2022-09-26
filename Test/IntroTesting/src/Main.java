import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}",
                "domic.rincon@gmail.com"));
    }


}
