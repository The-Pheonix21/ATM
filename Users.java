class Users{
	private String[] cust_name = {"Bob" ,"Allice" ,"JT"};
	private int [] cust_Pin = {1234, 3333, 0001};
	private double [] cust_Balance = {100.0, 250.0, 999999999.0};
  private int index_Cust;

 public boolean findCust(String name, int pin) {
    index_Cust=-1;
    for (int i=0; i < cust_name.length; i++){
      if (name.equals(cust_name[i]) && cust_Pin[i]==pin){
        index_Cust = i;
                System.out.println(" Welcome valued customer.");
                return true;
      } 
    }
         if (index_Cust < 0){
                System.out.println();
                System.out.println(" Invalid user name or pin number.");
                System.out.println(" Please try again.");
                System.out.println();
          }
    return false;
  }
 public void changeName(String name){
        cust_name[index_Cust]=name;
        System.out.println();
        System.out.println("  The name on your account has been changed to: " + cust_name[index_Cust]+"\n\n");
     }
     public void changePin(int pin){
        cust_Pin[index_Cust]=pin;
        System.out.println();
        System.out.println("  The pin number on your account has been changed to: " + cust_Pin[index_Cust]+"\n\n");
     }

     public void withdrawMoney(double w){
          if(cust_Balance[index_Cust]==0){
              System.out.println("\tYour current balance is zero.");
              System.out.println("\tYou cannot withdraw!");
              System.out.println("\tYou need to deposit money first.");
          }
          else if(w > cust_Balance[index_Cust]){
              System.out.println("\tThe amount you want to withdraw is greater than to your balance");
              System.out.println("\tPlease check the amount you entered.");
          }
          else{
              setBalance(getBalance() - w);
              System.out.println("\n\tYou withdrew the amount of " + w);
              System.out.println("\tYou're current balance is " + getBalance());
          }
      }

     public void setBalance(double b)
      {
          cust_Balance[index_Cust] = b;
      }
      public double getBalance()
      {
          return cust_Balance[index_Cust];
    }    
}