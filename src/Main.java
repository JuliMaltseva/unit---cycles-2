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
       System.out.println("Для того чтобы накопить сумму - 2 459 000 рублей, на понадобиться " + i + " месяцев");

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

    }
}