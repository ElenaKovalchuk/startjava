// ссылка на задачи https://docs.google.com/document/d/1kJqeCC-fKWUjBjrmHJ1mjDu45SGRL39Q5vW4DmLJflA/edit?usp=sharing
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.print("\n1. Создание переменных и вывод их значений на консоль\n");
        byte internalMemory = 16;
        System.out.println("Оперативная память =  " + internalMemory);

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
        int productXPrice = 100;
        int productYPrice = 200;
        int discount = 11;

        int bothItemsDiscount = (productXPrice + productYPrice) * discount / 100;
        System.out.println("Размер скидки на оба товара в рублях = " + bothItemsDiscount);

        int discountPrice = (productXPrice + productYPrice - bothItemsDiscount);
        System.out.println("Общая стоимость товара со скидкой = " + discountPrice);

        System.out.print("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.print("\n4. Отображение min и max значений числовых типов данных\n");
        byte maxByte = 127;
        System.out.println("Byte максимум =  " + maxByte);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxByte);
        System.out.println("Byte максимум значение после декремента =  " + --maxByte + "\n");

        short maxShort = 32767;
        System.out.println("Short максимум =  " + maxShort);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxShort);
        System.out.println("Byte максимум значение после декремента =  " + --maxShort + "\n");

        int maxInt = 2147483647;
        System.out.println("Int максимум =  " + maxInt);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxInt);
        System.out.println("Byte максимум значение после декремента =  " + --maxInt + "\n");

        long maxLong = 9223372036854775807L;
        System.out.println("Long максимум =  " + maxLong);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxLong);
        System.out.println("Byte максимум значение после декремента =  " + --maxLong + "\n");

        float maxFloat = 3.4028235E38f;
        System.out.println("Float максимум =  " + maxFloat);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxFloat);
        System.out.println("Byte максимум значение после декремента =  " + --maxFloat + "\n");

        double maxDouble = 1.7976931348623157E308;
        System.out.println("Double максимум =  " + maxDouble);
        System.out.println("Byte минимум значение после инкремента =  " + ++maxDouble);
        System.out.println("Byte максимум значение после декремента =  " + --maxDouble + "\n");

        System.out.print("\n5. Перестановка значений переменных\n");
        double num1 = 1.1;
        double num2 = 2.2;

        System.out.print("\nC помощью третьей переменной\n");
        System.out.println("Исходное значение первого числа = " + num1);
        System.out.println("Исходное значение второго числа = " + num2);
        double tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новое значение первого числа = " + num1);
        System.out.println("Новое значение второго числа = " + num2 + "\n");

        System.out.print("C помощью  арифметических операций\n");
        System.out.println("Исходное значение первого числа = " + num1);
        System.out.println("Исходное значение второго числа = " + num2);
          num1 += num2;  // то же что num1 = num1 + num2;
          num2= num1 - num2;
          num1 -= num2; // то же что num1 = num1 - num2;

        System.out.println("Новое значение первого числа = " + num1);
        System.out.println("Новое значение второго числа = " + num2 + "\n");

        System.out.print("C помощью побитовой операции\n");
        System.out.println("Исходное значение первого числа = " + num1);
        System.out.println("Исходное значение второго числа = " + num2);

        //умножаем исходные числа на 10, чтобы сделать их целыми
        num1 *= 10; //num1 = num1 * 10;
        int tmp1 = (int) num1;
        num2 *= 10; //num2 = num2 * 10;
        int tmp2 = (int) num2;

        // проводим побитовую операцию
        tmp1 ^= tmp2;     //tmp1 =  tmp1  ^ tmp2;
        tmp2 ^= tmp1;  //tmp2 = tmp2 ^  tmp1 ;
        tmp1 ^= tmp2;  //tmp1  = tmp1  ^ tmp2;

        // возвращаем дробную часть в дробный вид, делим на 10
        num1 = (double)  tmp1;
        num1 /= 10.0; //num1 =  num1  / 10.0;

        num2 = (double) tmp2;
        num2 /= 10.0; //num2 = num2 / 10.0;

        System.out.println("Новое значение первого числа " + num1);
        System.out.println("Новое значение второго числа " + num2 + "\n");

        System.out.print("6. Вывод символов и их кодов\n");
        int codeChar1 = 35;
        System.out.println("Код символа = " + codeChar1 + "," + "Символ = " +(char) codeChar1);

        int codeChar2 = 38;
        System.out.println("Код символа = " + codeChar2 + "," + "Символ = " +(char) codeChar2);

        int codeChar3 = 64;
        System.out.println("Код символа = " + codeChar3 + "," + "Символ = " +(char) codeChar3);

        int codeChar4 = 94;
        System.out.println("Код символа = " + codeChar4 + "," + "Символ = " +(char) codeChar4);

        int codeChar5 = 95;
        System.out.println("Код символа = " + codeChar5 + "," + "Символ = " +(char) codeChar5 + "\n");

        System.out.print("7. Произведение и сумма цифр числа\n");
        int srcNum = 345;
        int hundreds = (srcNum / 100);
        int tens = (srcNum / 10) % 10;
        int ones = srcNum % 10;

        int multDigits = hundreds * tens * ones;
        System.out.println("Произведение цифр числа 345 = " + multDigits);

        int sumDigits = hundreds + tens + ones;
        System.out.println("Сумма цифр числа 345 = " + sumDigits);

        System.out.print("\n8. Вывод на консоль ASCII-арт Дюка\n");
        String backslash = "\\";
        String slash = "/";
        String space = " ";
        String openBracket = "(";
        String closeBracket = ")";
        String underscore = "_";
        System.out.println(space + space + space + space + slash + backslash + space + space + space + space + space);
        System.out.println(space + space + space + slash + space + space + backslash + space + space + space + space);
        System.out.println(space + space + slash + underscore + openBracket + space + closeBracket + backslash + space + space + space);
        System.out.println(space + slash + space + space + space + space + space + space + backslash + space + space);
        System.out.println(slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + space);

        System.out.print("\n9. Отображение количества сотен, десятков и единиц числа\n");
        srcNum = 123;
        int hundred = (srcNum / 100);
        int ten = (srcNum / 10) % 10;
        ones = srcNum % 10;
        System.out.println(" Число N содержит: " + hundred + " сотню, " + ten + " десятка, " + ones + " единицы");

        System.out.print("\n10. Преобразование секунд\n");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = (totalSec % 3600) % 60;
        int sec = ((totalSec % 3600) % 60) % 60;
        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}
