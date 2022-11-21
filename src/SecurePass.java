public class SecurePass {
    private String password;

    public SecurePass(String password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void status() {
            if(!passLength()) {
                System.out.println("The password must be at least 8 characters long");
            }
            if(!containsUpperCase()) {
                System.out.println("The password must contain at least one uppercase letter");
            }
            if(!containsLowercase()) {
                System.out.println("The password must contain at least one lowercase letter");
            }
            if(!containsDigit()) {
                System.out.println("The password must contain at least one numeric digit");
            }
            if(!containsSpecialSymbol()) {
                System.out.println("The password must contain at least one of these special digits: ! @ # $ % ^ & * ?");
            }
        }

    private boolean passLength() {
        return password.length() >= 8;
    }

    private boolean containsUpperCase() {
        String upperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        return checkString(upperCaseLetters);
    }

    public boolean checkString(String characterString) {
        for (int i = 0; i < characterString.length(); i++) {
            if(password.contains(characterString.substring(i, i+1))) {
                return true;
            }
        }
        return false;
    }

    private boolean containsSpecialSymbol() {
        String special = "!@#$%^&*?";
        return checkString(special);
    }

    private boolean containsDigit() {
        String digits = "1234567890";
        return checkString(digits);
    }

    private boolean containsLowercase() {
        String lowerCaseLetters = "qwertyuiopasdfghjklzxcvbnm";
        return checkString(lowerCaseLetters);
    }

    public boolean isSecure() {
        return containsDigit() && containsLowercase() && containsSpecialSymbol() && containsUpperCase() && passLength();
    }


}
