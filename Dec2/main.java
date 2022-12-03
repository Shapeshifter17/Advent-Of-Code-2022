import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int score = 0;
        int score2 =0;
        try {
            File myObj = new File("/home/andrei/Desktop/Advent of code/Dec 1/INput");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String placeholder = myReader.nextLine();

                //Draw ROck
                if (placeholder.equals("A X")){
                    //Score for choosing rock
                    score +=1;
                    score += 3;
                }
                //Loss ROck vs Scissors
                if (placeholder.equals("A Z")){
                    score +=3;
                }
                //Win Rock vs paper
                if (placeholder.equals("A Y")){
                    score += 2;
                    score += 6;
                }

                //Loss paper vs rock
                if (placeholder.equals("B X")){
                    //Score for choosing rock
                    score += 1 ;
                }
                //Draw Paper vs paper
                if (placeholder.equals("B Y")){
                    score +=2;
                    score +=3;

                }
                //Win paper vs scissor
                if (placeholder.equals("B Z")){
                    score +=3;
                    score +=6;
                }
                //Win scissor vs rock
                if (placeholder.equals("C X")){
                    //Score for choosing rock
                    score += 1 ;
                    score +=6;
                }
                //Loss scissor vs paper
                if (placeholder.equals("C Y")){
                    score +=2;
                }
                //Draw Scissor
                if (placeholder.equals("C Z")){
                    score +=3;
                    score +=3;

                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(score);


    }

}
