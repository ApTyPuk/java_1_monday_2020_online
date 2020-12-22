package student_alexander_shl.homework.lesson_10.level_1_intern.task_2;
/*
Task_2:
Дан класс:

class ArrayUtilImpl {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if(max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if(min.isPresent()) {
          minValue = min.getAsInt();
        }
        return minValue;
    }

}

Создать для этого класса интерфейс ArrayUtil.
Сделать так, чтобы класс ArrayUtilImpl имплементировал созданный вами интерфейс.
Не забудьте про аннотицию @Override. Её очень желательно "вешать" на методы,
которые вляются реализацией методов объявленных в интерфейсе.
 */

interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
