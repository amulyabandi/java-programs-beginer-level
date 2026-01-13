import java.util.Scanner;
class GuessNumber{
    public static void main(String[] args){
        int secretNumber =9;
        int guess;
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Guess a number  between 1 and 10");
            guess=sc.nextInt();
            if (guess> secretNumber){
                System.out.println("Too High");
            }
            else if (guess <secretNumber){
                System.out.println("Too low");
            }
            else{
                System.out.println("CONGRATS YOUR ANSWER IS CORRECT");
                break;
            }
        }
        sc.close();
    }
}