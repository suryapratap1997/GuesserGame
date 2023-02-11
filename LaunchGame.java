package GuesserGame;
import java.util.*;



import java.lang.Math;

class Guesser{

int guessNum;

int guessNumber(int level)
{
    
    
        System.out.println("This is level: " + level);
       // double num = Math.random();
        //num *= (int)Math.pow(10,level);
        //guessNum = (int)num;
       Scanner sc = new Scanner(System.in);
        System.out.print("Guesser Number: ");
        guessNum = sc.nextInt();


    
return guessNum;
}


}

class Umpire{

int guessNum;
int level = 1;
Player p1 = new Player();
Player p2 = new Player();
Player p3 = new Player();



public void fromGuesser()
{
    Guesser obj = new Guesser();
    guessNum = obj.guessNumber(level);
}

public void fromPlayer()
{
    if(p1.level==level)
    {
       
        System.out.print("Player 1 guess the number: ");
        p1.number();

    }

    
    if(p2.level==level)
    {
        
        System.out.print("Player 2 guess the number: ");
        p2.number();
        
    }

    
    if(p3.level==level)
    {
        System.out.print("Player 3 guess the number: ");
        p3.number();
        
    }
}

public void compare()
{
    if(p1.num == guessNum && p1.level==level)
          {  System.out.println("Player 1 Won the Level "+level);
             p1.level++;
        }
    if(p2.num == guessNum && p2.level == level)
     {
        System.out.println("Player 2 Won the Level "+level);
        p2.level++;
    }

    if(p3.num == guessNum && p3.level==level)
    {
        System.out.println("Player 3 Won the Level "+level);
        p3.level++;

     }


     
     
     if(p1.level>level || p2.level>level || p3.level>level)
     {
        level++;
     }

     else
     {
        System.out.println("No one could complete level "+ level);
        
        this.level=0;
     }

     System.out.println("Guesser guess: "+guessNum);
        

        }



}




class Player{

    int num;
    int level = 1;

    public void number()
  {
    Scanner sc = new Scanner(System.in);    
    num = sc.nextInt();
    //sc.close();
    

    }


}

public class LaunchGame {
   
    public static void main(String args[])
    {
    System.out.println("Welcome to Gusser");
    Umpire u = new Umpire();
    Scanner sc = new Scanner(System.in);

    while(u.level!=0)
    {
        u.fromGuesser();
        u.fromPlayer();
        u.compare();
    System.out.println("Are you want to play more(y/n): ");
    char more = sc.next().charAt(0); 
    
    if(more=='y'|| more == 'Y')
       { if(u.level==0)
            u.level = 1;
        }
    else
        u.level = 0;





    }


sc.close();    

}

}
