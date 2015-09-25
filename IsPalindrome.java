/*
–еализуйте метод, провер€ющий, €вл€етс€ ли заданна€ строка палиндромом. ѕалиндромом называетс€ строка, котора€ читаетс€ одинаково слева направо и справа налево. ѕри определении "палиндромности" строки должны учитыватьс€ только буквы и цифры. ј пробелы, знаки препинани€, а также регистр символов должны игнорироватьс€.

≈сли в вашем решении требуютс€ циклы и условные операторы, можете вернутьс€ к этой задаче после просмотра соответствующего урока. Ќо решить можно и без них.

¬оспользуйтесь предоставленным шаблоном. ƒекларацию класса, метод main и обработку ввода-вывода добавит провер€юща€ система.

Sample Input:
Madam, I'm Adam!
Sample Output:
true
*/

/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */
public static boolean isPalindrome(String text) {
        String result = text.replaceAll("\\W", "").toLowerCase();
        //System.out.println(result);
        return result.equalsIgnoreCase((new StringBuilder(result)).reverse().toString());
}