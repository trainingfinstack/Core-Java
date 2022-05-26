// a java class to test the encapsulated class account

public class Testencapsulation {

	public static void main(String[] args) {
		
		// creating instance of account class
		Account acc = new Account();
		
		// setting values through setter method
		acc.setAcc_no(7560504000L);  
		acc.setName("Ram Narayan");
		acc.setEmail("ram12345@gmail.com");
		acc.setAmount(133565f);
		
		// getting values through getter methods
		
		System.out.println(acc.getAcc_no()+ "" +acc.getName()+ "" +acc.getEmail()+ "" +acc.getAmount());
	

	}

}
