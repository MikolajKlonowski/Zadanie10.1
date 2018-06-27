import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Metody {
    int[] b;

    public void podajJakDuzaChceszMiecTablice( ){
        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić do listy?");
        int a = sc.nextInt();
       b = new int[a];
    }

    public void wczytajLiczbyZTablicyDoPliku( ) throws IOException {

        FileWriter fileWriter = new FileWriter("plik.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i =0; i<b.length; i++){
            Random random = new Random();
            b[i]=random.nextInt(100);


            bufferedWriter.write("  "+b[i]);


        }
        bufferedWriter.close();
    }

}
