// ссылка на задачи https://docs.google.com/document/d/1kJqeCC-fKWUjBjrmHJ1mjDu45SGRL39Q5vW4DmLJflA/edit?usp=sharing
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.print("\n1. Создание переменных и вывод их значений на консоль\n");
        byte internalMemory = 16;
        System.out.println("Оперативная пямять =  " + internalMemory);

        short processor = 11300;
        System.out.println("Серия процессора Intel =  " + processor);

        int osType = 11;
        System.out.println("Версия Windows =  " + osType);

        long transistorNum = 540000000;
        System.out.println("Количество транзисторов =  " + transistorNum);

        float availMemory = 15.8f;
        System.out.println("Доступная оперативная память =  " + availMemory);

        double osVersion = 22000.708;
        System.out.println("Сборка ОС =  " + osVersion);

        char coreModel = 'H';
        System.out.println("Буква в модели процессора =  " + coreModel);

        boolean isGood = true;
        System.out.println("Нравится ли мне компьютер = " + isGood);

        System.out.print("\n2. Расчет стоимости товара со скидкой\n");
        int x = 100;
        int y = 200;
        int discount = 11;

        int bothItemsDiscount = (x + y) * discount / 100;
        System.out.println("Размер скидки на оба товара в рублях = " + bothItemsDiscount);

        int totalCostWithDiscount = (x + y) - bothItemsDiscount;
        System.out.println("Общая стоимость товара со скидкой = " + totalCostWithDiscount);

        System.out.print("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.print("\n4. Отображение min и max значений числовых типов данных\n");
        byte maxByte = 127;
        byte maxByteIncrement = ++maxByte;
        byte maxByteDecrement = --maxByte;
        System.out.println("Byte максимум =  " + maxByte);
        System.out.println("Byte максимум значение после инкремента =  " + maxByteIncrement);
        System.out.println("Byte максимум значение после декремента =  " + maxByteDecrement + "\n");

        short maxShort = 32767;
        short maxShortIncrement = ++maxShort;
        short maxShortDecrement = --maxShort;
        System.out.println("Short максимум =  " + maxShort);
        System.out.println("Short максимум значение после инкремента =  " + maxShortIncrement);
        System.out.println("Short максимум значение после декремента =  " + maxShortDecrement + "\n");

        int maxInt = 2147483647;
        int maxIntIncrement = ++maxInt;
        int maxIntDecrement = --maxInt;
        System.out.println("Int максимум =  " + maxInt);
        System.out.println("Int максимум значение после инкремента =  " + maxIntIncrement);
        System.out.println("Int максимум значение после декремента =  " + maxIntDecrement + "\n");

        long maxLong = 9223372036854775807L;
        long maxLongIncrement = ++maxLong;
        long maxLongDecrement = --maxLong;
        System.out.println("Long максимум =  " + maxLong);
        System.out.println("Long максимум значение после инкремента =  " + maxLongIncrement);
        System.out.println("Long максимум значение после декремента =  " + maxLongDecrement + "\n");

        float maxFloat = 3.4028235E38f;
        float maxFloatIncrement = ++maxFloat;
        float maxFloatDecrement = --maxFloat;
        System.out.println("Float максимум =  " + maxFloat);
        System.out.println("Float максимум значение после инкремента =  " + maxFloatIncrement);
        System.out.println("Float максимум значение после декремента =  " + maxFloatDecrement + "\n");

        double maxDouble = 1.7976931348623157E308;
        double maxDoubleIncrement = ++maxDouble;
        double maxDoubleDecrement = --maxDouble;
        System.out.println("Double максимум =  " + maxDouble);
        System.out.println("Double максимум значение после инкремента =  " + maxDoubleIncrement);
        System.out.println("Double  максимум значение после декремента =  " + maxDoubleDecrement + "\n");

        System.out.print("\n5. Перестановка значений переменных\n");
        double first = 1.1;
        double second = 2.2;

        System.out.print("\nC помощью третьей переменной\n");
        System.out.println("Исходное значение первого числа = " + first);
        System.out.println("Исходное значение второго числа = " + second);
        double third = first;
        first = second;
        second = third;
        System.out.println("Новое значение первого числа = " + first);
        System.out.println("Новое значение второго числа = " + second + "\n");

        System.out.print("C помощью  арифметических операций\n");
        System.out.println("Исходное значение первого числа = " + first);
        System.out.println("Исходное значение второго числа = " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Новое значение первого числа = " + first);
        System.out.println("Новое значение второго числа = " + second + "\n");

        System.out.print("C помощью побитовой операции\n");
        System.out.println("Исходное значение первого числа = " + first);
        System.out.println("Исходное значение второго числа = " + second);

        //отделяем дробную часть от целой
        int firstInt = (int) first;
        double fractionPartFirst = first - firstInt;

        int secondInt = (int) second;
        double fractionPartSecond = second - secondInt;

        // переводим дробную часть в целое число
        int tempFractionFirst = (int) (fractionPartFirst * 10);
        int tempFractionSecond = (int) (fractionPartSecond * 10);

        // проводим побитовую операцию с целой частью
        firstInt = firstInt ^ secondInt;
        secondInt = secondInt ^ firstInt;
        firstInt = firstInt ^ secondInt;
        second = (double) secondInt;
        first = (double) firstInt;

//        // проводим побитовую операцию с дробной частью
        tempFractionFirst = tempFractionFirst ^ tempFractionSecond;
        tempFractionSecond = tempFractionSecond ^ tempFractionFirst;
        tempFractionFirst = tempFractionFirst ^ tempFractionSecond;

        // возвращаем дробную часть в дробный вид, делим на 10
        fractionPartFirst = (double) tempFractionFirst;
        fractionPartFirst = tempFractionFirst / 10.0;

        fractionPartSecond = (double) tempFractionSecond;
        fractionPartSecond = tempFractionSecond / 10.0;

        // суммируем целую и дробную часть получившегося числа
        first = first + fractionPartFirst;
        second = second + fractionPartSecond;

        System.out.println("Новое значение первого числа " + first);
        System.out.println("Новое значение второго числа " + second + "\n");

        System.out.print("6. Вывод символов и их кодов\n");
        int num1 = 35;
        char num1Char = (char) num1;
        System.out.println("Код символа = " + num1 + "," + "Символ = " + num1Char);

        int num2 = 38;
        char num2Char = (char) num2;
        System.out.println("Код символа = " + num2 + "," + "Символ = " + num2Char);

        int num3 = 64;
        char num3Char = (char) num3;
        System.out.println("Код символа = " + num3 + "," + "Символ = " + num3Char);

        int num4 = 94;
        char num4Char = (char) num4;
        System.out.println("Код символа = " + num4 + "," + "Символ = " + num4Char);

        int num5 = 95;
        char num5Char = (char) num5;
        System.out.println("Код символа = " + num5 + "," + "Символ = " + num5Char + "\n");


        System.out.print("7. Произведение и сумма цифр числа\n");
        int num = 345;
        int hundreds = (num / 100);
        int tens = (num / 10) % 10;
        int units = num % 10;

        int mult = hundreds * tens * units;
        System.out.println("Произведение цифр числа 345 = " + mult);

        int sum = hundreds + tens + units;
        System.out.println("Сумма цифр числа 345 = " + sum);

        System.out.print("\n8. Вывод на консоль ASCII-арт Дюка\n");
        String backSlash = "\\";
        String slash = "/";
        String space = " ";
        String openBracket = "(";
        String closeBracket = ")";
        String underscore = "_";
        System.out.println(space + space + space + space + slash + backSlash + space + space + space + space + space);
        System.out.println(space + space + space + slash + space + space + backSlash + space + space + space + space);
        System.out.println(space + space + slash + underscore + openBracket + space + closeBracket + backSlash + space + space + space);
        System.out.println(space + slash + space + space + space + space + space + space + backSlash + space + space);
        System.out.println(slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash + space);

        System.out.print("\n9. Отображение количества сотен, десятков и единиц числа\n");
        int numb = 123;
        int hundred = (numb / 100);
        int ten = (numb / 10) % 10;
        int unit = numb % 10;
        System.out.println(" Число N содержит: " + hundred + " сотню, " + ten + " десятка, " + unit + " единицы");

        System.out.print("\n10. Преобразование секунд\n");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec % 3600) % 60;
        int leftSec = ((sec % 3600) % 60) % 60;
        System.out.println(hours + ":" + minutes + ":" + leftSec);
                                        }
                             }
