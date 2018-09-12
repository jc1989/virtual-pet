
public class Animal {
private int structure;
private int hunger;

private String name;




public Animal(int structure, int hunger, String name) {
	this.structure = structure;
	this.hunger = hunger;
	this.name = name;
}
public Animal() {
}









public void eat() {
	System.out.println(name + ": \"MMM, YUMMY!\"");
hunger+=5;
}
public void getHunger() {
	System.out.println("Hunger" + hunger);
	
}
public void setName(String str) {
	name=str;
	
	
}
}
