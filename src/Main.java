public class Main {
    public static void main(String[] args) {

//Домашнее задание 1
    System.out.println("Домашнее задание 1");
//Задача 1
    System.out.println("Задача 1");
    int deposit = 15_000;
    int total = 0;
    int i = 0;
    //for (int i = 0; total < 2_459_000; i++){
    while (total <= 2_459_000){
        total = total + total/100;
        total = total + deposit;
        i++;
       System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
    }
       System.out.println("Для того чтобы накопить сумму - 2 459 000 рублей, понадобится " + i + " месяцев");

//Задача 2
    System.out.println("Задача 2");
    int n = 0;
    while (n < 10){
        n++;
        System.out.print(n + " ");
    };
        System.out.println("");
    for (int m = 10; m >= 1; m--){
        System.out.print(m + " ");
    };

//Задача 3
    System.out.println();
    System.out.println("Задача 3");
    int initialPopulation = 12_000_000;
    float birthrate = 17 / 1000f;
    float mortality = 8 / 1000f;
    int totalPopulation = 12000000;
        System.out.println(birthrate);
        System.out.println(mortality);
    for (int y = 1; y <= 10; y++){
        //initialPopulation = initialPopulation + birthrate - mortality;
        initialPopulation = initialPopulation + (initialPopulation / 1000 * 17) - (initialPopulation / 1000 * 8);
        //initialPopulation = initialPopulation + (initialPopulation * birthrate) - (initialPopulation * mortality);
        //totalPopulation = totalPopulation + initialPopulation;
        System.out.println("Год " + y + " численность населения составляет " + initialPopulation);
    }

//Домашнее задание 2
    System.out.println("Домашнее задание 2");
//Задача 1
    System.out.println("Задача 1");
        int depositVasya = 15_000;
        int totalVasya = 0;
        int iVasya = 0;
                while (totalVasya <= 12_000_000){
            totalVasya = totalVasya + (totalVasya / 100 * 7);
            totalVasya = totalVasya + depositVasya;
            iVasya++;
            System.out.println("Месяц " + iVasya + " сумма накоплений равна " + totalVasya + " рублей");
        }
        System.out.println("Для того чтобы накопить сумму - 12 000 000 рублей, понадобится " + iVasya + " месяцев");

//Задача 2
    System.out.println("Задача 2");
        int depositVasya2 = 15_000;
        int totalVasya2 = 0;
        int iVasya2 = 0;
        while (totalVasya2 <= 12_000_000) {
            totalVasya2 = totalVasya2 + (totalVasya2 / 100 * 7);
            totalVasya2 = totalVasya2 + depositVasya2;
            iVasya2++;
            if (iVasya2 % 6 == 0) {
                System.out.println("Месяц " + iVasya2 + " сумма накоплений равна " + totalVasya2 + " рублей");
            }
        }
        System.out.println("Для того чтобы накопить сумму - 12 000 000 рублей, понадобится " + iVasya2 + " месяцев");

//Задача 3
    System.out.println("Задача 3");
        int depositVasya3 = 15_000;
        int totalVasya3 = 0;
            for (int iVasya3 = 1; iVasya3 <= 9 * 12; iVasya3++){
            totalVasya3 = totalVasya3 + (totalVasya3 / 100 * 7);
            totalVasya3 = totalVasya3 + depositVasya3;
            if (iVasya3 % 6 == 0) {
                System.out.println("Месяц " + iVasya3 + " сумма накоплений равна " + totalVasya3 + " рублей");
            }
        }
        System.out.println("За 9 лет Вася накопит " + totalVasya3 + " рублей");

//Задача 4
    System.out.println("Задача 4");
    for (int friday = 2; friday < 31; friday = friday + 7){
       System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
    }

//Домашнее задание 3
    System.out.println("Домашнее задание 3");
//Задача 1
    System.out.println("Задача 1");
    int cometYear = 0;
    int thisYear = 2022;
    int yearsAgo = thisYear - 200;
    int yearsAhead = thisYear + 100;
    for (cometYear = 0;cometYear <= 2100;cometYear = cometYear + 79) {
        if (cometYear >= yearsAgo && cometYear <= yearsAhead) {
            System.out.println(cometYear);
        }
    }

    //Задача 2
        System.out.println("Задача 2");
    int x = 0;
    int b = 2;
        for (int a = 1; a <= 10; a++){
            x = b * a;
        System.out.println(b + " * " + a + " = " + x);
    }
    }
}