package com.javaFundamential;

import java.util.*;

public class OptionalTask1 {
    private static void minAndMaxNumbersInString(String numbers){
        String maxNumber= Arrays.stream(numbers.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        int lengthMax=maxNumber.length();
        String minNumber= Arrays.stream(numbers.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null);
        int lengthMin=minNumber.length();
        System.out.println("Maximum number is "+maxNumber+" length is "+lengthMax);
        System.out.println("Minimum number is "+minNumber+" length is  "+lengthMin);
    }
    public static double averageLengthOfNumbers(List s){
        double sum=0;
        for(int i=0;i<s.size();i++){
            sum+=((String)s.get(i)).length();
        }
        return sum/s.size();
    }
    public static List listNumbersWithLengthGreaterThanX(List n, double x){
        List numbers=new ArrayList();
        for(int i=0;i<n.size();i++){
            if(((String)n.get(i)).length()>x){
                numbers.add(n.get(i));
            }
        }
        return numbers;
    }
    public static int[] listToArray(List s){
        int [] numbers=new int [s.size()];
        for(int i=0;i<s.size();i++){
            numbers[i]= Integer.parseInt(((String)s.get(i)));
        }
        return numbers;
    }
    public static int[] getCharsOfInteger(int number,int lengthOfNumber){
        int [] chars=new int[lengthOfNumber];
        for(int i=0;i<lengthOfNumber;i++){
            chars[i]=number%10;
            number=number/10;
        }
        return chars;
    }
    public static void findNumberWithMinimalSameChars(List s){
        int [] numbers=new int [s.size()];
        int [] countArray=new int[s.size()];
        int maxQuantityOfDiffDigits=0;
        int maxQuantityOfDiffDigitsIndex=0;
        numbers=listToArray(s);
        for(int i=0;i<numbers.length;i++){
            int count=0;
            int [] getCharsOfInteger=getCharsOfInteger(numbers[i],((String)s.get(i)).length());
            for(int j=0;j<getCharsOfInteger.length;j++){
                for(int k=0;k<getCharsOfInteger.length;k++){
                    if(getCharsOfInteger[j]==getCharsOfInteger[k]){
                        count++;
                    }
                }
            }
        countArray[i]=count;
        }
        for(int i=0;i<countArray.length;i++){
            if(countArray[i]>maxQuantityOfDiffDigits){
                maxQuantityOfDiffDigitsIndex=i;
                maxQuantityOfDiffDigits=countArray[i];
            }
        }
        System.out.println("Number with least different digits "+numbers[maxQuantityOfDiffDigitsIndex]);

    }
    public static void main(String[] args) {
        //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через пробел и нажмите Enter");
        String numbers=sc.nextLine();
        System.out.println("Your numbers are "+numbers);
        minAndMaxNumbersInString(numbers);

        //Вывести числа в порядке возрастания (убывания) значений их длины.
        List<String> numbersInList = new ArrayList<String>(Arrays.asList(numbers.split("\\s")));
        StringListSort stringListSort=new StringListSort();
        Collections.sort(numbersInList,stringListSort);
        System.out.println("Decreasing order "+ numbersInList);
        StringListSortAsc stringListSortAsc=new StringListSortAsc();
        Collections.sort(numbersInList,stringListSortAsc);
        System.out.println("Ascending order "+numbersInList);

        // Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        double averageLengthOfNumbers=averageLengthOfNumbers(numbersInList);
        List numbersWithLengthGreaterThan=new ArrayList();
        numbersWithLengthGreaterThan=listNumbersWithLengthGreaterThanX(numbersInList,averageLengthOfNumbers);
        System.out.println("All numbers with length greater than "+averageLengthOfNumbers+" are "+numbersWithLengthGreaterThan);
        //Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        findNumberWithMinimalSameChars(numbersInList);
    }
}
