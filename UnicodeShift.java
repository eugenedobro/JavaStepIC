/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a:
*/

public char charExpression(int a) {
    char pos = (char)(92 + a); 
    return pos;
}