// a account class which is a fully encapsulated class
// it has a private data member and getter and setter methods

public class Account {
	
	// private data members
	private long acc_no;
	private String name, email;
	private float amount;
	
	// public getter and setter methods
	public long getAcc_no()
	{
		return acc_no;
	}
	
	public String getName()
	{
		return name;
		}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getemail()
	{
		return email;
	}
	
		public void setemail(String email)
		{
			this.email = email;
		}
		
		
		public float getAmount()
		{
			return amount;
			
	}
	public void setAmount(float amount)
	{
	this.amount = amount;

	}

}
