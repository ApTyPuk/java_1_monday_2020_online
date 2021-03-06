package student_dmitry_vasiliev.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Формат поехал...поправил")
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindSelectedNumber();
        test.shouldCountSelectedNumber();
        test.shouldChangeFirstSelectedNumber();
        test.shouldChangeAllSelectedNumber();
        test.shouldArrayRotate();
        test.shouldArraySortMinMax();
    }

    public void shouldCreateArray() {
        String testName = "shouldCreateArray";
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(8);
        printTestResult(newArray.length == 8, testName);
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFillArrayWithRandomNumbers";
        int[] newArray1 = arrayUtil.createArray(8);
        int[] newArray2 = arrayUtil.createArray(8);

        arrayUtil.fillArrayWithRandomNumbers(newArray1);
        arrayUtil.printArrayToConsoleString(newArray1);
        int sumFirst = 0;
        for (int i = 0; i < newArray1.length; i++) {
            sumFirst += newArray1[i];
        }

        arrayUtil.fillArrayWithRandomNumbers(newArray2);
        arrayUtil.printArrayToConsoleString(newArray2);
        int sumSecond = 0;
        for (int i = 0; i < newArray2.length; i++) {
            sumSecond += newArray2[i];
        }

        printTestResult(sumFirst != sumSecond && sumFirst != 0, testName);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFindMaxNumber";
        int[] array = {1, 2, 3, 4, 9, 6, 7, 8};
        int result = arrayUtil.findMaxNumberReturn(array);
        printTestResult(result == 9, testName);
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFindMinNumber";
        int[] array = {9, 2, 3, 4, 5, 6, 7, 8};
        int result = arrayUtil.findMinNumberReturn(array);
        printTestResult(result == 2, testName);
    }

    public void shouldFindSelectedNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFindSelectedNumber";
        int[] array = {9, 2, 3, 4, 5, 6, 7, 8};
        int selectedNumber = 8;
        int result = arrayUtil.findSelectedNumberReturn(array, selectedNumber);
        printTestResult(result == 8, testName);
    }

    public void shouldCountSelectedNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldCountSelectedNumber";
        int[] array = {9, 2, 3, 4, 5, 6, 7, 9};
        int countNumber = 2;
        int result = arrayUtil.findSelectedNumberReturn(array, countNumber);
        printTestResult(result == 2, testName);
    }

    public void shouldChangeFirstSelectedNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldChangeFirstSelectedNumber";
        int[] array = {9, 2, 3, 4, 5, 11, 11, 9};
        int selectedNumber = 11;
        int newNumber = 10;
        int result = arrayUtil.changeFirstSelectedNumber(array, selectedNumber, newNumber);
        printTestResult(result == 5, testName);
    }

    public void shouldChangeAllSelectedNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldChangeAllSelectedNumber";
        int[] array = {9, 11, 3, 4, 5, 11, 11, 9};
        int selectedNumber = 11;
        int newNumber = 10;
        int result = arrayUtil.changeAllSelectedNumber(array, selectedNumber, newNumber);
        printTestResult(result == 3, testName);
    }

    public void shouldArrayRotate() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldArrayRotate";
        int[] oldArray = {1,2,3,4,5,6,7,8};
        int[] newArray = {8,7,6,5,4,3,2,1};
        int[] result = arrayUtil.arrayRotate(oldArray);
        int resultNumber = arrayUtil.twoAarraysCompare(result, newArray);
        printTestResult(resultNumber == 8, testName);
    }

    public void shouldArraySortMinMax() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldArraySortMinMax";
        int[] array = {8, 2, 3, 5, 5, 6, 1, 1};
        int result = arrayUtil.arraySortMinMax(array);
        printTestResult(result == 1, testName);
    }

    public void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }

    public int twoAarraysCompare(int[][] testArray, int[][] newArray) {
        ArrayUtilTest arrayUtil = new ArrayUtilTest();
        int checkNumber = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == testArray[i]) {
                checkNumber++;
            }
        }
        return checkNumber;
    }
}

