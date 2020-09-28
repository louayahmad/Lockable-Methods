package question4;

import java.text.NumberFormat;

public class Account implements Lockable {

      private final double RATE = 0.035; // interest rate of 3.5%

      private long acctNumber;

      private double balance;

      private String name;

      private int key;

      private boolean locked = false;

   
      public Account(String owner, long account, double initial) {

            name = owner;

            acctNumber = account;

            balance = initial;

      }

  

      public double deposit(double amount) {

          if (locked) {
        	  
        	  System.out.println("Account locked, unable to deposit, please unlock!");
          }
    	 
          else {
        	  
        	  balance = balance + amount;
          }

          return balance;

      }


      public double withdraw(double amount, double fee) {
			
			if (locked) {
        	  
        	  System.out.println("Account locked, unable to withdraw, please unlock!");
            }
            
			else {
				
				balance = balance - amount - fee;
			}

			return balance;

      }


      public double addInterest() {
    	  
    	  	if (locked) {
        	  
        	  System.out.println("Account locked, unable to add interest, please unlock!");
        	  
            }

    	  	else { 
    	  		
    	  		balance += (balance * RATE);
    	  		
    	  	}

            return balance;

      }


      public double getBalance() {
    	  	
    	    if (locked) {
        	  
        	  System.out.println("Account locked, unable to get balance, please unlock!");
            
    	    }
           
    	    return balance;

      }

      
      public String toString() {
    	  
    	  	if (locked) {
    	  		
    	  	}
			
    	  	else {
    	  		
    	  		NumberFormat fmt = NumberFormat.getCurrencyInstance();
                return (acctNumber + "\t" + name + "\t" + fmt.format(balance));

    	  	}    
    	  	
    	  	return "Unable to Show Account Info, Account Locked, please unlock!";


      }

      @Override

      public void setKey(int key) {

            if (!locked)

                  this.key = key;

      }

      @Override

      public void lock(int key) {

            if (this.key == key) {
            		
          	      System.out.println("Account locked!");

                  locked = true;

            }

      }

      @Override

      public void unlock(int key) {


            if (this.key == key) {
            	
            	  System.out.println("Account unlocked!");
            	  
                  locked = false;

            }
            
          
      }

      @Override

      public boolean locked() {

    	  	
            return locked;

      }
}

	