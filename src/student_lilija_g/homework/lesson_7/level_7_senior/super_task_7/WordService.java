package student_lilija_g.homework.lesson_7.level_7_senior.super_task_7;

/*
Улучшить код приведённый ниже.
Нужно разбить этот код на методы и сделать его более читабельным.

Профессионально подоити к улучшению кода - это значит
1. понять, что делает этот код;
2. перед изменением кода написать на него автоматические тесты;
3. придумать и реализовать улучшения;
4. убедиться, что после ваших улучшений тесты по прежнему проходят.

class WordService {

 	// Такие методы надо разбивать на более мелкие методы!
     public String findMostFrequentWord(String text) {
         String[] textArray;
         int[] wordCountArray;
         textArray = convertStringToWordArray(text);
         wordCountArray = new int[textArray.length];

         int wordCounter = 0;
         for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
             for (String s : textArray) {
                 if (textArray[wordCount].equals(s)) {
                     wordCounter++;
                 }
             }
             wordCountArray[wordCount] = wordCounter;
             wordCounter = 0;
         }

         int max = 0;
         for (int count =0; count < wordCountArray.length; count++) {
             if (wordCountArray[count] > max) {
                 max = count;
             }
         }
        return textArray[max];
     }

     private String[] convertStringToWordArray(String text) {
         return  text.split(" ");
     }

     public static void main(String[] args) {
         WordService wordService = new WordService();
         String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
         System.out.println(result);
     }
}
 */
class WordService {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public String findMostFrequentWord(String text) {
        String[] textArray = convertStringToWordArray(text);
        int[] wordCountArray = wordCounter(textArray);
        return findWord(textArray, wordCountArray);
    }

    private int[] wordCounter(String[] textArray) {
        int[] wordCountArray = createArray(textArray.length);
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
        return wordCountArray;
    }

    public String findWord(String[] textArray,int[] wordCountArray) {

        int max = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }

    private String[] convertStringToWordArray(String text) {
        return text.split(" ");
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
        System.out.println(result);
    }
}
