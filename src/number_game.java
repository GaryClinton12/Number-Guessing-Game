import java.util.Scanner;

public class number_game {


    public static void main(String[] args){

        Scanner myAnswer = new Scanner(System.in);
        double correctNumDouble= Math.random()*10;
        int correctNum = (int)correctNumDouble;
        System.out.print("Pick a number between 1-10: ");

        int answer = myAnswer.nextInt();
        System.out.println(correctNum);





        while(answer==correctNum){
            answer = Integer.parseInt(myAnswer.next());

        }
       if (answer==correctNum){

            System.out.println("Congrats you've guessed correctly! The answer was: "+ correctNum);

        }
       else {
            System.out.println("Try Again: ");
       }
       }




    }

