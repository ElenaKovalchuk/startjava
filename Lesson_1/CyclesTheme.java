import java.rmi.activation.ActivationGroup_Stub;
import java.sql.SQLOutput;
import java.util.function.DoubleToIntFunction;

public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int oddNumSum = 0;
        int evenNumSum = 0;
        int num = -10;
        do {
            if (num % 2 == 0) {
                evenNumSum += num;
            } else {
                oddNumSum += num;
            }
            num++;
        } while (num <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNumSum + ", сумма четных чисел = " + oddNumSum + "\n");

        System.out.println("2. Вывод чисел в интервале между (max и min) \n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.print("Все числа между min и max: ");
        for (int i = min + 1; i < max; i += 1) {
            System.out.print(i + " " + "\n");
        }

        System.out.println("\n 3. Вывод реверсивного числа и суммы его цифр \n");
        System.out.println("Исходное число в обратном порядке:");
        int srcNum = 1234;
        int sum = 0;
        int digit;

        while (srcNum != 0) {
            digit = (srcNum % 10);
            System.out.println(digit);
            sum += digit;
            srcNum /= 10;
        }

        System.out.println("Сумма цифр числа = " + sum);

        System.out.println("\n 4. Вывод чисел на консоль в несколько строк \n");
        num1 = 1;
        num2 = 24;
        int j = 0;
        int totalNum = 0; // счетчик выведенных чисел

        for (int i = num1 + 1; i < num2; i += 2) {
            totalNum += 1;
            j += 1;
            if (j % 5 == 0) {
                System.out.printf("%2d \t \n", i);
            } else {
                System.out.printf("%2d \t", i);
            }
        }

        if ((totalNum % 5) != 0) {
            for (int k = 1; k <= 5 - (totalNum % 5); k += 1) {
                System.out.printf("%2d \t", 0);
            }
        }

        System.out.println("\n 5. Проверка количества единиц на четность \n");
        srcNum = 3141591;
        num = srcNum;
        String str = Integer.toString(num);
        int n = str.length(); // счётчик
        int oneCounter = 0;
        while (n > 0) {
            if (num % 10 == 1) {
                oneCounter = oneCounter + 1;
            }
            n--;
            num = num / 10;
        }
        if (oneCounter % 2 == 0) {
            System.out.println("Число " + srcNum + " содержит " + oneCounter + " (четное) количество единиц");
        } else {
            System.out.println("Число " + srcNum + " содержит " + oneCounter + " (нечетное) количество единиц");
        }

        System.out.println("\n 6. Отображение фигур в консоли \n");
        System.out.println("Фигура через for \n");
        char ch1 = '*';
        for (j = 1; j <= 5; j++) {
            for (int i = 1; i <= 10; i += 1) {
                if (i != 10) {
                    System.out.print(ch1);
                } else {
                    System.out.println(ch1);
                }
            }
        }

        System.out.println(" \n Фигура через while \n");
        char ch2 = '#';
        j = 1;
        int i;
        while (j <= 5) {
            i = 6 - j;
            while (i >= 0) {
                if (i != 6 - j) {
                    System.out.print(ch2);
                } else {
                    System.out.println();
                }
                i--;
            }
            j++;
        }

        System.out.println("\n Фигура через do while \n");
        char ch3 = '$';
        j = 1;
        do {
            i = 0;
            do {
                i++;
                System.out.print(ch3);
            } while (i < j);
            System.out.println();
            j++;
        } while (j <= 2);

        j = 1;
        do {
            i = 4 - j;
            do {
                i--;
                System.out.print(ch3);
            } while (i > 0);
            System.out.println();
            j++;
        } while (j <= 3);

        System.out.println("\n 7. Отображение ASCII-символов \n");
        System.out.println("Символы, идущие до цифр и имеющие нечетные коды \n");
        System.out.println("DEC " + " CHAR");
        for (i = 0; i <= 47; i++) {
            char ch = (char) i;
            if (i % 2 != 0) {
                System.out.printf("%2d \t %3s %n", i, ch);
            }
        }

        System.out.println(" \n Маленькие английские буквы, имеющие четные коды \n");
        System.out.println("DEC " + " CHAR");
        for (i = 97; i <= 122; i++) {
            char ch = (char) i;
            if (i % 2 == 0) {
                System.out.printf("%3d \t %3s %n", i, ch);
            }
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом \n");
        srcNum = 1234321;
        char[] srcNumArray = ("" + srcNum).toCharArray();
        boolean isPolindrom = true;
        for (i = 0; i < srcNumArray.length; i++) {
            if (srcNumArray[i] != srcNumArray[srcNumArray.length - i - 1]) {
                isPolindrom = false;
                break;
            }
        }

        if (isPolindrom == true) {
            System.out.println("Число " + srcNum + " является палиндромом \n");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом \n");
        }

        System.out.println("\n 9. Определение, является ли число счастливым \n");
        srcNum = 123328;
        int sumFirst = 0;
        int sumLast = 0;

        for (j = 0; j < 3; j++) { //считаем сумму трех первых цифр
            digit = (srcNum % 10);
            sumFirst += digit;
            srcNum /= 10;
        }
        System.out.println("Сумма трех первых цифр = " + sumFirst);

        for (i = 5; i > 2; i--) { //считаем сумму трех последних цифр
            digit = (srcNum % 10);
            sumLast += digit;
            srcNum /= 10;
        }
        System.out.println("Сумма трех последних цифр = " + sumLast);

        if (sumFirst == sumLast) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }
    }
}
















