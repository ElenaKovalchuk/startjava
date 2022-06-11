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

        char nameFirstLetter = name.charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("M");
        } else if (nameFirstLetter == 'I') {
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
        int num = -78;
        if (num == 0) {
            System.out.println("Это ноль");
        } else if (num % 2 == 0) {
            System.out.println("Четное число");
        } else if (num % 2 != 0) {
            System.out.println("Нечетное число");
        }

        if (num == 0) {
        } else if (num > 0) {
            System.out.println("Положительное число");
        } else if (num < 0) {
            System.out.println("Отрицательное число");
        }


        System.out.println("\n 4. Поиск одинаковых цифр в числах \n");
        int srcNum1 = 557;
        int srcNum2 = 567;

        int hundreds1 = (srcNum1 / 100);
        int tens1 = (srcNum1 / 10) % 10;
        int ones1 = srcNum1 % 10;

        int hundreds2 = (srcNum2 / 100);
        int tens2 = (srcNum2 / 10) % 10;
        int ones2 = srcNum2 % 10;

        if (hundreds1 == hundreds2) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + hundreds1 + " в разряде сотен");
        }

        if (tens1 == tens2) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + tens1 + " в разряде десятков");
        }

        if (ones1 == ones2) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + ones1 + " в разряде единиц");
        }

        System.out.println("\n 5. Определение буквы, числа или символа по их коду \n");
        char code = '\u0057';
        char temp = (char) code;
        String symbol = String.valueOf(temp);

        if (symbol.matches(".*[a-z].*")) {
            System.out.println(symbol + " = это маленькая буква");
        } else if (symbol.matches(".*[A-Z].*")) {
            System.out.println(symbol + " = это большая буква");
        } else if (symbol.matches(".*[1-9].*")) {
            System.out.println(symbol + " = это число");
        } else {
            System.out.println(symbol + " = это не буква и не число");
        }


        System.out.println("\n 6. Определение суммы вклада и начисленных банком %\n");
        int depositValue = 300000;

        if (depositValue < 100000) {
            double interestRate = 0.05;
            double depositInterest = depositValue * interestRate;
            double amountWithInterest = depositValue + depositInterest;
            System.out.println("Сумма вклада = " + depositValue + " , начисленный процент= " + depositInterest + " , итоговая сумма с процентом= " + amountWithInterest);
        } else if (depositValue > 300000) {
            double interestRate = 0.1;
            double depositInterest = depositValue * interestRate;
            double amountWithInterest = depositValue + depositInterest;
            System.out.println("Сумма вклада = " + depositValue + " , начисленный процент= " + depositInterest + " , итоговая сумма с процентом= " + amountWithInterest);
        } else {
            double interestRate = 0.07;
            double depositInterest = depositValue * interestRate;
            double amountWithInterest = depositValue + depositInterest;
            System.out.println("Сумма вклада = " + depositValue + " , начисленный процент= " + depositInterest + " , итоговая сумма с процентом= " + amountWithInterest);
        }

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
            System.out.println("Банкомат может выдать " + hundreds + " сотен, "  +  " 5 десяток и " + ones + " долларовых банкнот.");
        }
        System.out.println("Проверка верности расчетов:");
        int result = hundreds * 100 + tensAvailable * 10 + ones;
        if(result == srcNum) {
            System.out.println("Расчеты верны.");
        } else {
            System.out.println("Ищи ошибку.");
        }


                                        }
                                 }

