import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int arr []= new int[100];
        ArrayList<Integer> list = new ArrayList<Integer>();

        try {
            File myObj = new File("/home/andrei/Desktop/Advent of code/Dec 1/INput");
            Scanner myReader = new Scanner(myObj);
            int data = 0;
            while (myReader.hasNextLine()) {
                String placeholder = myReader.nextLine();
                if (placeholder.equals("")){
                    list.add(data);
                    data = 0;
                }
                else{
                    data += Integer.parseInt(placeholder);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Collections.sort(list);

        System.out.println(list);
        System.out.println(list.get(list.size()-1) + list.get(list.size()-2) + list.get(list.size()-3));

    }

}
