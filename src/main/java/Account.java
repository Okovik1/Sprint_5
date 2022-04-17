public class Account {
    private final String name;
    private boolean checkResult = true;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        String checkName = name.toLowerCase();

        if (checkName.length() < 3) {
            System.out.println("Name is too short");
            return checkResult = false;
        } else if (checkName.length() > 19) {
            System.out.println("Name is too long");
            return checkResult = false;
        } else if (checkName.startsWith(" ")) {
            System.out.println("Please, remove whitespace at the start");
            return checkResult = false;
        } else if (checkName.endsWith(" ")) {
            System.out.println("Please, remove whitespace at the end");
            return checkResult = false;
        } else if (!checkName.contains(" ")) {
            System.out.println("You should use whitespaces between name and surname");
            return checkResult = false;
        }
        return checkResult;
    }

}



