import java.util.Scanner;

public class VirtualPetApp {
	static Scanner s =  new Scanner(System.in);
public static void main(String []args) {
	Animal loki = new Animal(3,0,"Loki");
	Animal chopper = new Animal();
	chopper.setName("Chopper");
	loki.eat();
	loki.getHunger();
	chopper.eat();
	chopper.eat();
	chopper.eat();
	chopper.eat();
	chopper.eat();
	chopper.eat();
	
	VirtualPet billy = new VirtualPet();
	billy.setName("Billy");
	billy.eat();
	billy.getHunger();
	
	
	
	
	
	
	
	
	
//	
//	boolean playing = true;
//	while (playing == true) {
//		System.out.println("Choose a Character Name!");
//		System.out.println("What kind of pet do you have?");
//		System.out.println("How old is your pet?");
//		System.out.println("What color if your pet?");
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("Do you want to continue?");
//		String userContinue = s.nextLine();
//		while (!userContinue.equals("no") || !userContinue.equals("yes")) {
//			playing = false;
//			System.out.println("Do you want to continue?");
//			userContinue = s.nextLine();
//		}
//		if (userContinue.equals("no")) {
//			System.exit(0);
//			
//		}
//	}
	

}
}
