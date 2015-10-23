/*
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

*/

public class AsciiCharSequence implements CharSequence {
    // implementation
    private final byte value[];
    int start;
    int end;
    
    public AsciiCharSequence(final byte[] value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length;
    }

  @Override
  public char charAt(final int index) {
    return (char) value[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            bytes[i] = value[j];
        }
        return new AsciiCharSequence(bytes);
    }
    
  @Override
  public String toString() {
    /*final char[] chars = new char[this.chars.length];
    for (int i = 0; i < this.chars.length; i++) {
      chars[i] = (char) this.chars[i];
    }
    
    return new AsciiCharSequence(chars);
    */
      StringBuffer result = new StringBuffer();
      for (int i = 0; i < length(); i++) {
          result.append(charAt(i));
      }
      return result.toString();
  }
}