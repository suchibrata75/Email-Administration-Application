package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Email em = new Email("john","smith");
		
		em.setAlternateEmail("abc@gmail.com");
		System.out.println("Alternate email = " + em.getAlternateEmail());
		
		em.changePassword("1452gdfer");
		System.out.println("Alternate Password = " + em.getPassword());
		
		System.out.println(em.showInfo());
		
	}

}
