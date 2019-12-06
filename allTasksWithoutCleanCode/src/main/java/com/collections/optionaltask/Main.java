package com.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args)  {

        //1. Read strings from file, reverse them and write to file.

        Scanner sc= null;
        try {
            sc = new Scanner((new File("./src/main/resources/read1.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Stack<String> strings=new Stack<String>();
        while(sc.hasNextLine())
        {
            strings.push(sc.nextLine());
        }
        sc.close();

        FileWriter nameFile = null;
        try {
            nameFile = new FileWriter("./src/main/resources/write1.txt");

        while(!strings.empty()) {
            nameFile.write(strings.pop()+"\n");
        }
        nameFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Second task. Enter a number, put its numbers on the stack. Print a number whose numbers go in the reverse order.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int number = in.nextInt();
//        int numberOfDigits = (int)(Math.log10(number)+1);
//        Stack<Integer> stackForNumber=new Stack<Integer>();
//        for (int i=numberOfDigits-1;i>=0;i--)
//        {
//            int temp=(int)(number/Math.pow(10,i));
//            stackForNumber.push(temp);
//            number=number-(int)(temp*Math.pow(10,i));
//        }
//        System.out.println("Your number in reverse order is: ");
//        while(!stackForNumber.isEmpty())
//        {
//            System.out.print(stackForNumber.pop());
//        }
//        in.close();


        //7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
//        String usersString = "";
//        Scanner sc = null;
//        try {
//            sc = new Scanner((new File("./src/main/resources/7exercise.txt")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (sc.hasNextLine()) {
//            usersString += sc.nextLine();
//        }
//        sc.close();
//        System.out.println(usersString);
//        System.out.println("Все скобки стоят правильно? "+checkBrackets(usersString));

        //6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
//        List<String> usersString=new ArrayList<String>();
//        Scanner sc= null;
//        try {
//            sc = new Scanner((new File("./src/main/resources/6exercise.txt")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(sc.hasNextLine())
//        {
//            usersString.add(sc.nextLine());
//        }
//        Collections.sort(usersString);
//        printList(usersString);

        //4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
//        List<String> strings=new ArrayList<String>();
//        Scanner sc= null;
//        try {
//            sc = new Scanner((new File("./src/main/resources/4exercise.txt")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(sc.hasNextLine())
//        {
//            strings.add(sc.nextLine());
//        }
//        MyComparator myComparator=new MyComparator();
//        Collections.sort(strings,myComparator);
//        printList(strings);

        //8  Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв,
        // считать одинаковыми. Использовать класс HashSet.
//        List<String> strings=new ArrayList<String>();
//        Set<String> setWithDifferentWords=new HashSet<String>();
//        Scanner sc= null;
//        try {
//            sc = new Scanner((new File("./src/main/resources/8exercise.txt")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(sc.hasNextLine())
//      {
//            strings.add(sc.nextLine());
//      }
//
//        for(int i=0;i<strings.size();i++)
//        {
//            String words[]=strings.get(i).split(" ");
//            for(String word : words)
//            {
//                setWithDifferentWords.add(word.toLowerCase());
//            }
//        }
//        System.out.println(setWithDifferentWords);

    }

    static <T extends List> void printList(T list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static boolean checkBrackets(String str) {
        if (str.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
