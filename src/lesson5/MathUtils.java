package lesson5;

public class MathUtils {
    /**
     * Создание метода
     * 1 - модификатор доступа (слово определяющее область видимости)
     * public - доступен внутри всего проекта
     * protected - доступен только внутри текущей папки и наследникам текущего класса
     * -------(package) - доступен только внутри текущей папки
     * private - доступен только внутри текущего класса
     * <p>
     * Где можно ставить модификатор доступа:
     * - перед классом
     * - перед методом (там где создаете метод)
     * <p>
     * 2 - static (может быть или нет)
     * 3 - указываем возвращаем тип(или слово void, если ничего не возвращает)
     * 4 - название метода
     * 5 - входящие параметры (Всегда в () через , и с указанием типа и названия переменной
     * 6 - тело выполнения данного метода
     */

    public static void calculateAreaOfTriangle(int a, int b, int c) {
        double area = (a + b + c) / 2.0;
        System.out.println(Math.sqrt(area * (area - a) * (area - b) * (area - c)));

    }

        public static double calculateAreaOfTriangleReturnResult(int a, int b, int c) {
        double area = (a + b + c) / 2.0;
        double result = Math.sqrt(area * (area - a) * (area - b) * (area - c));
        return result;}

    //Метод печатает на консоль периметр фигуры по выбору
    public static void askFigureAndPrintArea() {


    }
//char - примитивный, только хранит символ
    //
//    public static void fromCamelCaseToScreamSnakeCase(String text) {
//        //startDate - > START_DATE
//        char[] chars = text.toCharArray();
//        //Одно и то же
////        for (int i = 0; i < chars.length; i++) {
////            chars[i] = '1';
////        }
//        StringBuilder sb = new StringBuilder();
//        for (char currentChar : chars) {
//            if (Character.isUpperCase(currentChar)){
//                else {
//                    sb.append(Character.toUpperCase(currentChar));
//                }
//            }
//            System.out.println(sb);
//        }
//}
}


