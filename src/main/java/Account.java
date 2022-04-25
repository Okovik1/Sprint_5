import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private final String name;
    private boolean checkResult = true;

    public Account(String name) {
        this.name = name;
    }


    public boolean checkNameToEmboss(String name) {

//Попыталась сделать через RegEx, в целом заработало, только не смогла побороть ограничение с 3 до 19 символов-ограничение почему то выходит до 24 в итоге:)
// Был дубль 2 с RegEx но что то не взлетело, думаю позаниматься еще ими на досуге, и добить уже позже
//        try {
//            Pattern pattern = Pattern.compile("^[a-zA-Z][{1}\\s][a-zA-z]$");
//            Matcher matcher = pattern.matcher(name);
//            return matcher.matches();
//        } catch (NullPointerException exception) {
//            System.out.println("Null detected!");
//            return false;
//        }
//    }

        if (name == null) {
            System.out.println("Null detected!");
            return checkResult = false;
        } else if (name.length() < 3) {
            System.out.println("Name is too short");
            return checkResult = false;
        } else if (name.length() > 19) {
            System.out.println("Name is too long");
            return checkResult = false;
        } else if (name.startsWith(" ")) {
            System.out.println("Please, remove whitespace at the start");
            return checkResult = false;
        } else if (name.endsWith(" ")) {
            System.out.println("Please, remove whitespace at the end");
            return checkResult = false;
        } else if (!name.contains(" ")) {
            System.out.println("You should use whitespaces between name and surname");
            return checkResult = false;
        } else if (countWhitespaces(name) > 1) {
            System.out.println("Name should have only 1 whitespace between firstname and lastname");
            return checkResult = false;
        }

        return checkResult;
    }

    public Integer countWhitespaces(String checkName) {
        int k = 0;
        for (int i = 0; i < checkName.length(); i++) {
            if (checkName.substring(i, i + 1).contains(" ")) k++;
        }
        return k;
    }

}









