package com.javaIOtasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTask {
    static String counter = "-";

    public static void main(String[] args)
    {
        //folder for test ...allTasksWithoutCleanCode\src\main\resources\dirForMainTask
        //file for test allTasksWithoutCleanCode\src\main\resources\mainTaskTreeFiles.txt
        System.out.println("Path to folder or file");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        String result="";
        File dir = new File(path);
        if(!dir.exists()){
            System.out.println("The folder doesn't exist");
        }
        else if(!dir.isDirectory()){
            System.out.println("This is file");
            List<String> data=new ArrayList<>();
            data= readFile(path);
            System.out.println("The folder contains "+quantityFolders(data)+" folders");
            System.out.println("The folder contains "+quantityFiles(data)+" files");
            double averageFilesinFolders=((double)quantityFiles(data)/quantityFolders(data));
            System.out.println("Average quantity files in folders is "+averageFilesinFolders);
            System.out.println("Average name's length "+ averageLengthNameOfFiles(listOfFiles(data)));
        }
        else {

            result+= printAllFilesFromDirectory(dir);
            writeToFile(result);
        }
    }

    static List readFile(String path){
        List <String> arr=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(path)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  arr;
    }
    static int quantityFolders(List<String> list){
        int countFolders=0;
        for(String item:list){
            if(item.indexOf('-')!=-1){
                countFolders++;
            }
        }
        return countFolders;
    }
    static int quantityFiles(List<String> list){
        int countFiles=0;
        for(String item:list){
            if(item.indexOf('$')!=-1){
                countFiles++;
            }
        }
        return countFiles;
    }
    static List listOfFiles(List <String> list){
        List<String> result=new ArrayList<>();
        for(String item:list){
            if(item.indexOf('$')!=-1){
                result.add(item);
            }
        }
        return result;
    }
    static double averageLengthNameOfFiles(List<String> list){
        int sum=0;
        int count=0;
        for(String item:list){
            int index=item.indexOf('.');
            sum+=item.substring(3,index).length();
            count++;
        }
        return (double)sum/count;
    }
    static void writeToFile(String s){
        try(FileWriter fileWriter=new FileWriter("./src/main/resources/mainTaskTreeFiles.txt",false))
        {
            fileWriter.write(s);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String printAllFilesFromDirectory(File dir){
        String result="";
        for(File file : dir.listFiles()) {
            if(file.isDirectory()) {
                counter = "-";
                result+=print(file);
                result+= printAllFilesFromDirectory(file);
            }else{
                counter="$";
                result+="\t"+print(file);
            }
        }
        return result;
    }

    static String print(File file){
        String res=counter+" "+file.getName()+"\n";
        return res;
    }
}
