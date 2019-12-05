package com.javaIOtasks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //1. Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
//        int[] array=createMatrixWithRandom(10);
//        bubbleSort(array);
//        try(FileWriter writer = new FileWriter("./src/main/resources/ex1IO.txt", false))
//        {
//            for(int i=0;i<array.length;i++){
//                String s = Integer.toString(array[i]);
//                writer.write(s);
//                writer.write(System.lineSeparator());
//            }
//            writer.flush();
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("OK");
        // 2. Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.

//              String modifyString="";
//        try {
//            String content = new String(Files.readAllBytes(Paths.get("./src/main/resources/ex2IO.java")), "UTF-8");
//            System.out.println("File's content ");
//            System.out.println(content);
//            System.out.println("After replace public to private: ");
//            modifyString=content.replace("public", "private");
//            System.out.println(modifyString);
//            System.out.println("All changes was recorded to file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(FileWriter fileWriter=new FileWriter("./src/main/resources/ex2IO.java",false))
//        {
//            fileWriter.write(modifyString);
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//5. В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
// которые имеют средний балл более 7.

//        Scanner sc = null;
//        try {
//            sc = new Scanner(new File("./src/main/resources/ex5IO.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String[] student={};
//        String resultMod=" ";
//        List studentsWithGood=new ArrayList<>();
//        while (sc.hasNextLine()) {
//            student = sc.nextLine().split("\\s+");
//            double sum = 0;
//            for (int i = 1; i < student.length; i ++) {
//                sum += Integer.parseInt(student[i]);
//            }
//            if (sum / (student.length - 1) > 7) {
//                studentsWithGood.add(student[0]);
//            }
//        }
//        String content="";
//        try {
//           content = new String(Files.readAllBytes(Paths.get("./src/main/resources/ex5IO.txt")), "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        resultMod=content;
//        for(int i=0;i<studentsWithGood.size();i++){
//            resultMod=resultMod.replace(studentsWithGood.get(i).toString(), studentsWithGood.get(i).toString().toUpperCase());
//        }
//        try(FileWriter fileWriter=new FileWriter("./src/main/resources/ex5IO.txt",false))
//        {
//            fileWriter.write(resultMod);
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("OK");
//        sc.close();


        //  7.Из файла удалить все слова, содержащие от трех до пяти символов, но при этом из каждой строки
        //  должно быть удалено только максимальное четное количество таких слов.

        List<String> arr = new ArrayList<>();
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/ex7IO.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arr);

        try (FileWriter fileWriter = new FileWriter("./src/main/resources/ex7IO.txt", false)) {
            for (int i = 0; i < arr.size(); i++) {
                result.add(deleteWords(arr.get(i), countWordsWithLengthFromThreeToFive(arr.get(i))));
                fileWriter.write(result.get(i));
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int countWordsWithLengthFromThreeToFive(String s) {
        List<String> strings = Arrays.asList(s.split("\\s+"));
        int count = 0;
        for (String item : strings) {
            if (item.length() >= 3 && item.length() <= 5) {
                count++;
            }
        }
        count = (count / 2) * 2;
        return count;
    }

    public static String deleteWords(String s, int quantity) {
        List<String> strings = Arrays.asList(s.split("\\s+"));
        int count = 0;
        String resultString = "";
        for (String item : strings) {
            if (item.length() >= 3 && item.length() <= 5 && count < quantity) {
                count++;
            } else {
                resultString += item + " ";
            }
        }
        resultString += "\n";
        System.out.println(resultString);
        return resultString;
    }

    public static int[] createMatrixWithRandom(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(80) - 10;
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
