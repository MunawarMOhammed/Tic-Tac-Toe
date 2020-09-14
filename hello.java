import java.util.*;
import java.util.Scanner; 
class TicTacToe{
public static void main(String[] args){
  
   char rule[][] = new char[3][3];
   char tictac[][] = new char[3][3]; 

   // two 2D array one for printing rule and other is to store positions
   // Basic user interface statements 

   System.out.print("\n");
   System.out.println("Welcome  to  TIC  TAC  TOE Game");
   System.out.println("Rules:\tX is for player1\n        O is for player2\n");
   System.out.print("Positions to select \n");
   Scanner sc = new Scanner(System.in); 
   char k=49;

// ASCII of 49 is equivalent to numeric 1 so on...
// printing the rules position array matrix 1 to 9

   for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++)
                 {rule[i][j]=k;k++;}   
   }
   for(int i=0;i<=2;i++)
        {
          for(int j=0;j<=2;j++)
              {
                  System.out.print(rule[i][j] +"\t"); 
               }System.out.println(); 
        } 
       for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++)
                 {tictac[i][j]=00;}   
   }
   System.out.print(" Player1 Enter YOur Name : \t");
   String player1 = sc.nextLine();
   System.out.print(" Player2 Enter YOur Name : \t");
   String player2 = sc.nextLine();

// The main lOgic begin from here

  int n=5;

// this loop will iterate for both users to fetch the data of positions
  while(n>0){int p =1;
     //The below while  LOop will help to iterate the switch statements
     // same for 2nd user       
               while(p>0){ 
              System.out.print(" "+player1+" enter yOur Position : \t");
              int num1 = sc.nextInt();
    
         switch (num1) { 
          case 1: 
            tictac[0][0]=88;
            break; 
          case 2: 
            tictac[0][1]=88;
           break; 
          case 3: 
            tictac[0][2]=88;p--;
            break; 
          case 4: 
            tictac[1][0]=88;
            break; 
          case 5: 
            tictac[1][1]=88;
            break; 
          case 6: 
            tictac[1][2]=88;
            break; 
          case 7: 
            tictac[2][0]=88;
            break;
          case 8:
            tictac[2][1]=88;
            break;
          case 9:
            tictac[2][2]=88;
            break; 
          default: 
            System.out.print(" "+player1+" Please enter the valid position\n");
            p++;    
           }p--;}

         for(int i=0;i<=2;i++)
        {
          for(int j=0;j<=2;j++)
              {
                  System.out.print(tictac[i][j] +"\t"); 
               }System.out.println(); 
        } 
 // This is MAin COndition that CHecks N Find out the winner
 //
             if((tictac[0][0]!='\0'&&tictac[0][0]==tictac[0][1]&&tictac[0][1]==tictac[0][2]) ||
                (tictac[1][0]!='\0'&&tictac[1][0]==tictac[1][1]&&tictac[1][1]==tictac[1][2])||
                (tictac[1][0]!='\0'&&tictac[2][0]==tictac[2][1]&&tictac[2][1]==tictac[2][2])||
                (tictac[0][0]!='\0'&&tictac[0][0]==tictac[1][0]&&tictac[1][0]==tictac[2][0]) ||
                (tictac[0][1]!='\0'&&tictac[0][1]==tictac[1][1]&&tictac[1][1]==tictac[2][1])||
                (tictac[0][2]!='\0'&&tictac[0][2]==tictac[1][2]&&tictac[1][2]==tictac[2][2])||
                (tictac[0][0]!='\0'&&tictac[0][0]==tictac[1][1]&&tictac[1][1]==tictac[2][2]) ||
                (tictac[0][2]!='\0'&&tictac[0][2]==tictac[1][1]&&tictac[1][1]==tictac[2][0])
               ){
                    System.out.println("Congratulations!! "+player1+" You WON");
                    System.out.println("THanks for playing the Game  \n Execute again to Restart"); 
                    System.exit(0); 
                   }
              else { int g=0;
                    for(int i=0;i<=2;i++)
                     {
                   for(int j=0;j<=2;j++)
                       { 
                           if(tictac[i][j] !='\0')
                             g++;  
                       } 
                     }if(g == 9){System.out.println("Its A Draw between "+player1+" and "+player2);System.exit(0);}
                  }  
           int m=1; while(m>0)
           {System.out.print(" "+player2+" enter your position : \t");
    int num2 = sc.nextInt();
    switch (num2) { 
        case 1: 
            tictac[0][0]=79; 
            break; 
        case 2: 
            tictac[0][1]=79; 
            break; 
        case 3: 
            tictac[0][2]=79; 
            break; 
        case 4: 
            tictac[1][0]=79; 
            break; 
        case 5: 
            tictac[1][1]=79; 
            break; 
        case 6: 
            tictac[1][2]=79; 
            break; 
        case 7: 
            tictac[2][0]=79; 
            break;
        case 8:
            tictac[2][1]=79;
            break;
        case 9:
            tictac[2][2]=79;
            break; 
        default: 
            System.out.print(" "+player2+" Please enter the valid position");
            m++;
           
           }m--;}

         for(int i=0;i<=2;i++)
        {
          for(int j=0;j<=2;j++)
              {
                  System.out.print(tictac[i][j] +"\t"); 
               }System.out.println(); 
        } 
         if    ((tictac[0][0]!='\0'&&tictac[0][0]==tictac[0][1]&&tictac[0][1]==tictac[0][2]) ||
                (tictac[1][0]!='\0'&&tictac[1][0]==tictac[1][1]&&tictac[1][1]==tictac[1][2])||
                (tictac[1][0]!='\0'&&tictac[2][0]==tictac[2][1]&&tictac[2][1]==tictac[2][2])||
                (tictac[0][0]!='\0'&&tictac[0][0]==tictac[1][0]&&tictac[1][0]==tictac[2][0]) ||
                (tictac[0][1]!='\0'&&tictac[0][1]==tictac[1][1]&&tictac[1][1]==tictac[2][1])||
                (tictac[0][2]!='\0'&&tictac[0][2]==tictac[1][2]&&tictac[1][2]==tictac[2][2])||
                (tictac[0][0]!='\0'&&tictac[0][0]==tictac[1][1]&&tictac[1][1]==tictac[2][2]) ||
                (tictac[0][2]!='\0'&&tictac[0][2]==tictac[1][1]&&tictac[1][1]==tictac[2][0])
               ){System.out.println("Congratulation!! "+player2+" You WOn ");
                  System.out.println("THanks for playing the Game  \n Execute again to Restart"); 
                  System.exit(0); 
                  } 

     n--;
}


}}