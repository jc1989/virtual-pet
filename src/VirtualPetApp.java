import java.util.Scanner;

public class VirtualPetApp {
	static Scanner s =  new Scanner(System.in);
public static void main(String []args) {
	Animal loki = new Animal(3,0,"Loki");
	Animal chopper = new Animal();
	chopper.setName("Chopper");
//	loki.eat();
//	loki.getHunger();
//	chopper.eat();
//	chopper.eat();
//	chopper.eat();
//	chopper.eat();
//	chopper.eat();
//	chopper.eat();
	
//	VirtualPet billy = new VirtualPet();
//	billy.setName("Billy");
//	billy.eat();
//	billy.getHunger();
	
	VirtualPet pet = new VirtualPet();
	
	
	
	
	
	
	
	
	boolean playing = true;
	while (playing == true) {
		System.out.println("Choose a Character Name!");
		String pett = s.nextLine();
		System.out.println("What kind of pet do you have?");
		String kind = s.nextLine();
		System.out.println("How old is your pet?");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("What color is your pet?");
		String color = s.nextLine();
		
		
		
		
		
		
		
		
		
		System.out.println("Do you want to continue?");
		String userContinue = s.nextLine();
		while (!userContinue.equals("no") && !userContinue.equals("yes")) {
			
			System.out.println("Do you want to continue? Type Yes, or No");
			userContinue = s.nextLine();
			if (userContinue.equals("no")) {
				System.exit(0);
				
			}
		}
		if (userContinue.equals("no")) {
			System.exit(0);
			
		}
	}
	

}
}
