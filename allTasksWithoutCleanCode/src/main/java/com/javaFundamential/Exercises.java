package com.javaFundamential;

import java.util.Scanner;


public class Exercises {
    private static int inverseInt(int value) {
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;

        }
        return result;
    }

    public static void main(String[] args) {
        //Приветствовать любого пользователя при вводе его имени через командную строку
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут? \n");
        name = in.nextLine();
        System.out.println("Привет  " + name + "!");

        // Отобразить в окне консоли аргументы командной строки в обратном порядке.
//       System.out.println("Все числа для коммандной строки переданы в  Run-> Edit configurations->Program arguments \n");
//        for (int i=args.length-1;i>=0;i--)
//        {
//            System.out.println(" "+args[i]);
//        }


        //Отобразить в окне консоли аргументы командной строки в обратном порядке. При вводе данных в терминале с хранением в Int
      /*Scanner in=new Scanner(System.in);
        System.out.println("Введите цифры без пробелов \n");
        int numb=in.nextInt();
        int result= inverseInt(numb);
        System.out.println("Введенные числа в обратном порядке:  "+result);*/

        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
//        int quantityNumber;
//        Scanner in=new Scanner(System.in);
//        System.out.println("Сколько сгенерировать случайных чисел? ");
//        quantityNumber=in.nextInt();
//        int [] generateNumbers;
//        generateNumbers=new int [quantityNumber];
//        System.out.println("Сгенерированные числа: ");
//        for (int i=0;i<quantityNumber;i++)
//        {
//            generateNumbers[i]=(int)(Math.random() *(1000-1))+1;
//            System.out.print(generateNumbers[i]+" ");
//        }
//        System.out.println("\nСгенерированные числа с переходом на новую строку: ");
//        for (int i=0;i<quantityNumber;i++)
//        {
//            System.out.println(generateNumbers[i]);
//        }


        //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        // и вывести результат на консоль.
//        System.out.println("Все числа для коммандной строки переданы в  Run-> Edit configurations->Program arguments \n");
//        int sum=0;
//        int multiply=1;
//        for (int i=args.length-1;i>=0;i--)
//        {
//            sum+=Integer.parseInt(args[i]);
//            multiply*=Integer.parseInt(args[i]);
//        }
//        System.out.println("Сумма= "+sum);
//        System.out.println("Произведение= "+multiply);

        //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.
//        System.out.println("Введите число от 1 до 12 ");
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("Январь\n");
//                break;
//            case 2:
//                System.out.println("Февраль\n");
//                break;
//            case 3:
//                System.out.println("Март\n");
//                break;
//            case 4:
//                System.out.println("Апрель\n");
//                break;
//            case 5:
//                System.out.println("Май\n");
//                break;
//            case 6:
//                System.out.println("Июнь\n");
//                break;
//            case 7:
//                System.out.println("Июль\n");
//                break;
//            case 8:
//                System.out.println("Август\n");
//                break;
//            case 9:
//                System.out.println("Сентябрь\n");
//                break;
//            case 10:
//                System.out.println("Октябрь\n");
//                break;
//            case 11:
//                System.out.println("Ноябрь\n");
//                break;
//            case 12:
//                System.out.println("Декабрь\n");
//                break;
//            default:
//                System.out.println("Не правильно введено число. Должно быть в промежутке от 1 до 12\n");
//        }


    }


}
