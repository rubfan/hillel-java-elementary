package ua.od.hillel;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Result: " + app.toBinary(7));
    }

    public String replaceSymbolInEmail(String email) {
        return email.replaceAll("@","[at]").replaceAll("\\.","[dot]");
    }

    public String collapseWord(String text) {

        StringBuilder result = new StringBuilder();
        String[] wordArr = text.split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].length() > 4) {
                wordArr[i] = collapse(wordArr[i]);
            }
            result.append(wordArr[i] + " ");
        }

        return result.toString().trim();
    }

    public String collapse(String word) {
        return String.valueOf(word.charAt(0)) + (word.length()-2) + String.valueOf(word.charAt(word.length()-1));
    }

    public int countPalindrome(String text) {
        String[] wordArr = text.split(",");
        int count = 0;
        for (int i = 0; i < wordArr.length; i++) {
            if(isPalindrome(wordArr[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word.trim());
        return stringBuilder.reverse().toString().equals(word.trim());
    }

    public String toBinary(int number) {

        if(number < 2) {
            return "1";
        }
        return toBinary(number/2) + String.valueOf(number%2) ;
    }
}
