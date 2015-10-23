/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример

InputStream последовательно возвращает четыре байта: 48 49 50 51.

Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
*/

private static final int BUFFER_SIZE = 4 * 1024;
public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    // your implementation here
    StringBuilder builder = new StringBuilder();
    InputStreamReader reader = new InputStreamReader(inputStream, charset);
    char[] buffer = new char[BUFFER_SIZE];
    int length;
    while ((length = reader.read(buffer)) != -1) {
        builder.append(buffer, 0, length);
    }
    return builder.toString();
}