public class Users {
 private String[] cust_name = {"Bob" ,"Allice" ,"JT"};
 private int [] cust_Pin = {1234, 3333, 0001};
 private double [] cust_Balance = {100.0, 250.0, 999999999.0};
 private int index_cust;
  public Users()
	public boolean findCust(String name, int pin) {
		index_cust=-1;
		for (int i=0; i < cust_namelength;i++) {
		if (name.equals(cust_name[i]) && cust_Pin[i]==pin) {
			index_cust = i;
			System.out.println("Welcome Valued customer");
			return true;
		}
			
		}
		if (index_cust < 0) {
			System.out.println();
			System.out.println("I'm sorry we can't locate this customer.");
			System.out.println("Please try again.");
			System.out.println();
			return false;
		}
		return true;
	}
	public void changeName(String name) {
		cust_name [index_cust]=name;
		System.out.println();
		System.out.println(" THe name on your account has been changed to: " +cust_name[index_cust]+"\n\n");
	} 
	public void changePin(int pin){
		cust_Pin[index_cust]=pin;
		System.out.println();
		System.out.println(" The pin number on your account has been changed to: "+ cust_Pin[index_cust]+"\n\n");
	} 
	public void widthdrawMoney(double w){
		if (cust_Balence[index_cust]==0) {
			System.out.println("\tYour current balance is zero.");
			System.out.println("\tYou cannot widthdraw!!!");
			System.out.println("\tYou need to deposit money first");
		}else if (w > cust_Balance) {
			System.out.println("\tThe amount you want to widthdraw is greater than the balence you currently have");
			System.out.println("\tPlease check the amount you entered");
		}else{
			setbalance(getBalance()-w);
			System.out.println("\n\tYou withdrew the amount of " + w);
			System.out.println("\tYou're current balance is " + getBalance());
		}
		
	}
public void setBalance(double b){
	cust_Balance[index_cust] = b; 
}
public double getBalance(){
	return cust_Balance[index_cust];
}
}