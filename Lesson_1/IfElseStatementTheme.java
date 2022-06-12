public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java \n");
        int age = 30;
        boolean maleSex = false;
        double height = 1.60;
        String name = "Iren";

        if (age > 20) {
            System.out.println("Хватит учиться, пора работать.");
        } else {
            System.out.println("Ученье - свет, а не ученье - тьма.");
        }

        if (!maleSex) {
            System.out.println("Мадемуазель");
        }

        if (height < 1.80) {
            System.out.println("Невысокий рост");
        } else {
            System.out.println("Высокий рост");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("M");
        } else if (firstLetterName == 'I') {
            System.out.println("I");
        } else {
            System.out.println("Ни M, ни I");
        }

        System.out.println("\n 2. Поиск max и min числа \n");
        int num1 = 4785;
        int num2 = 29;
        if (num1 > num2) {
            System.out.println(num1 + " " + "больше, чем" + " " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " " + "больше, чем" + " " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n 3. Работа с числом \n");
        int num = 0;

        if (num == 0) {
            System.out.println("Это ноль");
        } else if (num % 2 == 0) {
            System.out.println("Четное число");
        } else if (num % 2 != 0) {
            System.out.println("Нечетное число");
        }

        if (num > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

        System.out.println("\n 4. Поиск одинаковых цифр в числах \n");
        int srcNum1 = 867;
        int srcNum2 = 567;

        int hundreds1 = (srcNum1 / 100);
        int tens1 = (srcNum1 / 10) % 10;
        int ones1 = srcNum1 % 10;

        int hundreds2 = (srcNum2 / 100);
        int tens2 = (srcNum2 / 10) % 10;
        int ones2 = srcNum2 % 10;
        String output = "В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра ";

        String hundredsResult = " ";
        if (hundreds1 == hundreds2) {
            hundredsResult = hundreds1 + " в разряде сотен,";
        }

        String tensResult = " ";
        if (tens1 == tens2) {
            hundredsResult = tens1 + " в разряде десяток,";
        }

        String onesResult = " ";
        if (ones1 == ones2) {
           onesResult = ones1 + " в разряде единиц";
        }

        System.out.println(output + hundredsResult + tensResult + onesResult + ".");

        System.out.println("\n 5. Определение буквы, числа или символа по их коду \n");
        char code = '\u0057';
        char temp = (char) code;

        if ((temp >= '0' && temp <= '9')){
            System.out.println("Это число");
        } else if (temp >= 'a' && temp <= 'z') {
            System.out.println(" Это маленькая буква");
        } else if (temp >= 'A' && temp <= 'Z') {
            System.out.println(" Это большая буква");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n 6. Определение суммы вклада и начисленных банком %\n");
        int depositValue = 300000;
        double interestRate;

        if (depositValue < 100000) {
            interestRate = 0.05;
        } else if (depositValue > 300000) {
            interestRate = 0.1;
        } else {
            interestRate = 0.07;
        }

        double depositInterest = depositValue * interestRate;
        double amountWithInterest = depositValue + depositInterest;
        System.out.println("Сумма вклада = " + depositValue + " , начисленный процент = " + depositInterest + " , итоговая сумма с процентом = " + amountWithInterest);

        System.out.println("\n 7. Определение оценки по предметам %\n");
        int programmingMarkPercentage = 91;
        int historyMarkPercentage = 59;
        String subjectNameHistory = "История";
        String subjectNameProgramming = "Программирование";
        int historyScore;
        int programmingScore;

        if (programmingMarkPercentage <= 60) {
            programmingScore = 2;
            System.out.println(subjectNameProgramming + ", оценка = " + programmingScore);
        } else if (programmingMarkPercentage > 60 && programmingMarkPercentage <= 73) {
            programmingScore = 3;
            System.out.println(subjectNameProgramming + ", оценка = " + programmingScore);
        } else if (programmingMarkPercentage > 91) {
            programmingScore = 5;
            System.out.println(subjectNameProgramming + ", оценка = " + programmingScore);
        } else {
            programmingScore = 4;
            System.out.println(subjectNameProgramming + ", оценка = " + programmingScore);
        }

        if (historyMarkPercentage <= 60) {
            historyScore = 2;
            System.out.println(subjectNameHistory + ", оценка = " + historyScore);
        } else if (historyMarkPercentage > 60 && programmingMarkPercentage <= 73) {
            historyScore = 3;
            System.out.println(subjectNameHistory + ", оценка = " + historyScore);
        } else if (historyMarkPercentage > 91) {
            historyScore = 5;
            System.out.println(subjectNameHistory + ", оценка = " + historyScore);
        } else {
            historyScore = 4;
            System.out.println(subjectNameHistory + ", оценка = " + historyScore);
        }

        int averageMarkPercentage = (programmingMarkPercentage + historyMarkPercentage) / 2;
        System.out.println("Средний % по предметам " + averageMarkPercentage);

        int averageScore = (historyScore + programmingScore) / 2;
        System.out.println("Средний балл оценок по предметам " + averageScore);

        System.out.println("\n 8. Расчет прибыли\n");
        int monthlyRentPayment = 5000;
        int averageMonthlySalesRevenue = 13000;
        int averageMonthlyGoodsCost = 9000;

        int AnnualProfit = (averageMonthlySalesRevenue - monthlyRentPayment - averageMonthlyGoodsCost) * 12;

        if (AnnualProfit > 0) {
            System.out.println("+" + AnnualProfit);
        } else {
            System.out.println(AnnualProfit);
        }

        System.out.println("\n 9. Подсчет количества банкнот\n");
        int srcNum = 567;
        int tensAvailable = 5;

        int hundreds = (srcNum / 100);
        int tens = (srcNum / 10) % 10;
        int ones = srcNum % 10;

        System.out.println("Из банкомата нужно снять " + srcNum + " долларов." + " Номинал банкнот в банкомате: 100, 10, 1 доллар.");
        System.out.println("В наличии есть " + tensAvailable + " десяток.");
        System.out.println("Нужно " + hundreds + " сотен, " + tens + " десяток и " + ones + " долларовых банкнот.");

        if (tens > tensAvailable) {
            ones = ones + (tens - tensAvailable) * 10;
            System.out.println("Банкомат может выдать " + hundreds + " сотен, " + " 5 десяток и " + ones + " долларовых банкнот.");
        }
        System.out.println("Проверка верности расчетов:");
        int result = hundreds * 100 + tensAvailable * 10 + ones;
        if (result == srcNum) {
            System.out.println("Расчеты верны.");
        } else {
            System.out.println("Ищи ошибку.");
        }
    }
}

