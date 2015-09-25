/*
Реализуйте метод, проверяющий, является ли заданное число степенью двойки. Степени двойки со знаком "-" тоже должны распознаваться.

Если для решения задачи вам требуются циклы или условные операторы, то можете вернуться к ней после просмотра соответствующих уроков. Хотя решить можно и без них.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
*/

/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param value any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */
public static boolean isPowerOfTwo(int value) {
    int x = Math.abs(value);
    return (x != 0) && ((x & (x-1)) == 0);
}