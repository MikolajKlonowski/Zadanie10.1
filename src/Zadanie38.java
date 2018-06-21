import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie38 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić do listy?");
        int a = sc.nextInt();

        int [] tablica = new int[a];
        FileWriter fileWriter = new FileWriter("plik.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i =0; i<tablica.length; i++){
            Random random = new Random();
            tablica[i]=random.nextInt(100);


            bufferedWriter.write("  "+tablica[i]);


        }
        bufferedWriter.close();
    }
}
