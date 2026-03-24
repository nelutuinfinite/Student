package ro.ulbs.proiectaresoftware.student.Lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


import java.util.*;



public class Aplication {
    static void main() throws FileNotFoundException  {
        String cu;
        String[] cuvinte;
        String[] toate;
        Path path = Paths.get("C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\Lab3\\out.txt");
        File fis = new File("C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\Lab3\\in.txt");

        try(Scanner sc= new Scanner(fis);

        BufferedWriter text= Files.newBufferedWriter(path);) {
            while(sc.hasNextLine()){
                cu = sc.nextLine();
                cuvinte = cu.split("\\.");
                toate = cu.split(" ");
                toate[toate.length-1]+="\n\n";
                for(int i=0;i< cuvinte.length;i++){
                    cuvinte[i]+="\n";
                    System.out.print((cuvinte[i]));
                }
                    text.write("b\n");
                    for(String line: cuvinte){
                        text.write(line);
                    }

                    text.write("a\n");
                    for(String line : toate){
                        text.write(line);
                    }
                }




            }
            catch (IOException e) {
            throw new RuntimeException(e);
            }
    }
}

