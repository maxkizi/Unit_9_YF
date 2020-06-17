public class Mitya {
    public static void main (String args []){
        int a = 10, b = 2, c = 0;

        //Выводим исходные данные на экран
        System.out.println("Исходные данные: a = " + a + ", b = " + b + ". ");
        System.out.println();

        //1. Операция сложения
        System.out.println("1. Операция сложения.");
        System.out.println("Сумма a и b равна: a + b = " + (a+b));
        // Проверка результата
        System.out.println("Проверка результата");
        if (((a+b)- b) == a)
            System.out.println("Решение верно");
        else System.out.println("Решение не верно");
        System.out.println();

        //2. Операция вычитания
        System.out.println("2. Операция вычитания.");
        System.out.println("Разность a и b равна: a - b = " + (a-b));
        // Проверка результата
        System.out.println("Проверка результата");
        if (((a-b)+ b) == a)
            System.out.println("Решение верно");
        else System.out.println("Решение не верно");
        System.out.println();


        //3. Операция умножения
        System.out.println("3. Операция сложения.");
        System.out.println("Произведение a и b равно: a * b = " + (a*b));
        // Проверка результата
        System.out.println("Проверка результата");
        if (((a*b)/ b) == a)
            System.out.println("Решение верно");
        else System.out.println("Решение не верно");
        System.out.println();

        //4. Операция сложения
        System.out.println("4. Операция сложения.");
        System.out.println("Частное a и b равна: a / b = " + (a/b));
        // Проверка результата
        System.out.println("Проверка результата");
        if (((a/b) * b) == a)
            System.out.println("Решение верно");
        else System.out.println("Решение не верно");
        System.out.println();


    }
}
