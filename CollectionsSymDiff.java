/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
*/

public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> symmetricDiff = new HashSet<T>(set1);
    symmetricDiff.addAll(set2);
    Set<T> tmp = new HashSet<T>(set1);
    tmp.retainAll(set2);
    symmetricDiff.removeAll(tmp);
    return symmetricDiff;
}