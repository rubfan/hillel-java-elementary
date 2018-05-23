package ua.od.hillel.HW9;

public class HW9 {

    public static void main(String[] args) {

        HW9 hw9 = new HW9();

        hw9.changeEmail("user.testing@domain.com.ua");
        hw9.shortingWords("internationalization localization cat elephant monitor");
        hw9.shortingWords("hillel java elementary homework");
        hw9.palindromes("deleveled, evitative, cat, dog, deified ");
        System.out.println("=====================================\nbinary ---> " + hw9.toBinary(123));
    }

    public  void changeEmail(String mail) {
        System.out.println("=====================================");
        System.out.println("Before: " + mail + "\n@ ---> [at]\n. ---> [dot]");
        mail = mail.replace("@", "[at]");
        mail = mail.replace(".", "[dot]");
        System.out.println("After: " + mail);
    }

    public void shortingWords(String phrase) {
        System.out.println("=====================================");
        System.out.println("Before:\n" + phrase);
        String[] words = phrase.split(" ");
        String newPhrase = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
               // String number = Integer.toString(words[i].length()-2);
                words[i] = words[i].charAt(0) + Integer.toString(words[i].length()-2) + words[i].charAt(words[i].length()-1);
            }
            newPhrase = newPhrase.concat(words[i] + " ");
        }
        System.out.println("After:\n" + newPhrase.trim());
    }

    public void palindromes(String phrase) {
        System.out.println("=====================================");
        System.out.println(phrase);
        int palNumber = 0;
        String[] words = phrase.split(",");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
            String reverse = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].substring(j, j+1);
            }
            if (words[i].equals(reverse)) {
                palNumber++;
            }
        }
        System.out.println("There are " + palNumber + " palindromes in this phrase.");
    }

    public String toBinary(int decimal) {

        if (decimal == 0) {
            return "0";
        }

        if(decimal < 2) {
            return "1";
        }
        String temp = "";
        temp = decimal%2 + temp;

        return toBinary(decimal/2) + temp ;
    }
}
