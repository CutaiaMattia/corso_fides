package org.example;


public class BubbleSortAlphabet {

    public static void main(String[] args) {


        String phrase = "il coccodrillo come fa";
        String replacedPhrase = phrase.replaceAll("\\s+", "");
        char[] phraseToChars = new char[replacedPhrase.length()];

        for (int k = 0; k < replacedPhrase.length(); k++) {
            phraseToChars[k] = replacedPhrase.charAt(k);
        }

        for (int i = 0; i < phraseToChars.length; i++) {
            for (int j = 0; j < phraseToChars.length - 1 - i; j++) {
                if (phraseToChars[j] > phraseToChars[j + 1]) {
                    char tmp = phraseToChars[j];
                    phraseToChars[j] = phraseToChars[j + 1];
                    phraseToChars[j + 1] = tmp;
                }
            }
        }
        for (char phraseToChar : phraseToChars) {
            System.out.print(phraseToChar + " ");
        }

        char carattere = phraseToChars[0];
        int countOccorrenze = 1;
        for (int w = 1; w < phraseToChars.length; w++) {
            if (phraseToChars[w] == carattere) {
                countOccorrenze++;
            } else {
                if (countOccorrenze > 1) {
                    System.out.printf("\nil carattere %c e' presente %s volte\n", carattere, countOccorrenze);
                }
                countOccorrenze = 1;
                carattere = phraseToChars[w];
            }
        }
        if (countOccorrenze > 1) {
            System.out.printf("\nil carattere %c e' presente %s volte\n", carattere, countOccorrenze);
        }
    }


}

