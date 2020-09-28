package question4;

public class Driver {

	public static void main (String [] args) {
		
		 Account acct1 = new Account ("Louay Ahmad", 72354, 2568.56);
		 
		 acct1.setKey(7789); // set 7789 as key
         acct1.lock(7789); // locked 
         acct1.unlock(8888); //key is wrong, so they cannot withdraw or deposit

         System.out.println(acct1);
         System.out.println();
         
         acct1.unlock(7789);
         
         System.out.println(acct1);
         System.out.println();
         
         acct1.withdraw(1542,5);
         
         System.out.println(acct1);
         System.out.println();
         
         acct1.lock(7789); 
         acct1.deposit(1000); //account is locked, unable to deposit 
         System.out.println();
         acct1.unlock(7789);
         acct1.deposit(10000);
         acct1.addInterest();
         
         System.out.println(acct1);
         System.out.println();
         
         acct1.lock(7789); 
         acct1.withdraw(4323,15);
         System.out.println();
         
         System.out.println(acct1);
         System.out.println();
         
         acct1.unlock(7789); 
         acct1.withdraw(4323,15);
         
         System.out.println(acct1);	 
		 		
	}
}
