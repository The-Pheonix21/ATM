import java.util.Scanner;
import java.io.*;
class ATM{
	Users myAtmuserdata = new Users();
  public void ATM () {
        StartAtm();
  }
     private void StartAtm(){
      String name;
        int pin;
        boolean tempBool;
        Scanner Atmread = new Scanner(System.in);
        System.out.println(" ====================================");
        System.out.println("+        Welcome to C&S Bank         +");
        System.out.print("+ Please enter your name: ");
        name=Atmread.nextLine();
        System.out.println(" =====================================");
        System.out.print(" Now please enter your pin number: ");
        String temp=Atmread.nextLine();
        try{
          pin=Integer.parseInt(temp);
          tempBool=myAtmuserdata.findCust(name,pin);
          if(tempBool){
            AtmMainMenu();
          }
        }
        catch(Exception e){
             System.out.println("\tError Input! Your pin must be a number only.");
           }

    }
	
    public void AtmMainMenu(){
        Scanner AtmMainRead = new Scanner(System.in);
        int selectMyItem = 0;
        String selectMyString;
        String cont;
     while (selectMyItem < 4) {
        System.out.println("\t====================================================");
        System.out.println("\tWelcome to this simple ATM machine");
        System.out.println("\t====================================================");
        System.out.println();
        System.out.println("\tPlease select ATM Transactions");
        System.out.println("\tPress [1] Check Balance");
        System.out.println("\tPress [2] Withdraw");
        System.out.println("\tPress [3] Change Name");
        System.out.println("\tPress [4] Change Pin");
        System.out.println("\tPress [5] Exit");
                
        System.out.print(" What would you like to do? ");
        selectMyString = AtmMainRead.nextLine();
        try {
        selectMyItem = Integer.parseInt(selectMyString);
        }
         catch(Exception e){
             System.out.println("\tUse the numbers provided above. You gibbin!");
             AtmMainMenu();
           }
        if(selectMyItem>5){
                System.out.println("\tPlease select correct transaction.");
            }  else{
                switch (selectMyItem){
                       case 1:
                        System.out.println("\tYour balance is: "+myAtmuserdata.getBalance());
                        break;
                       case 2:
                        System.out.print("\tTo withdraw, make sure that you have sufficient funds in your account.");
                        System.out.println();
                        System.out.print("\tEnter amount of money to withdraw: ");
                        selectMyString = AtmMainRead.nextLine();
                        try{
                            double withdraw = Double.parseDouble(selectMyString);
                            System.out.println("\tAmount to withdraw: "+withdraw +"\n\n");
                            myAtmuserdata.withdrawMoney(withdraw);
                        }
                       catch(Exception e){
                            System.out.println("\tNumbers only you you you you .");
                        }
                        
                        break;
                       case 3:
                        System.out.println();
                        System.out.print("\tEnter new name: ");
                        String newName = AtmMainRead.nextLine();
                        myAtmuserdata.changeName(newName);
                        break;
                       case 4:
                        System.out.println();
                        System.out.print("\tEnter new pin: ");
                        String newStpin = AtmMainRead.nextLine();
                        int newpin=Integer.parseInt(newStpin);
                        myAtmuserdata.changePin(newpin);
                        break;
                        default:
                        System.out.print("\tTransaction exited.");
                        break;
                                
                    }
                    if (selectMyItem < 5){
                    System.out.println("\n\n");
                    System.out.print("Would you like to perform another transaction? Y or N - ");
                        cont = AtmMainRead.nextLine();
                        if (!cont.equalsIgnoreCase("Y"))
                            selectMyItem=5;
                    }
            }                
        }

    }
 }