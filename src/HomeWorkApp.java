public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    // Три слова в столбик
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Сумма двух чисел
    public static void checkSumSing(){
        int a = 111;
        int b = -222;
        if (a+b>0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
    //Вывод цвета в зависимости от заданного числа
    public static void printColor(){
        int value = 5678;
        if (value<=0)
            System.out.println("Красный");
        if (value>0 && value<=100)
            System.out.println("Желтый");
        if (value>100)
            System.out.println("Зеленый");
    }
    //Сравнение чисел
    public static void compareNumbers(){
        int a = 222;
        int b = 90;
        if (a>=b)
            System.out.println("a>=b");
        else
        System.out.println("a<b");
    }
}
