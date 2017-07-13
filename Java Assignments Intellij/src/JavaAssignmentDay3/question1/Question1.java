package JavaAssignmentDay3.question1;
/* Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, 
 * provide methods that are common to all Rodents, and override these in the derived classes to perform 
 * different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with 
 * different specific types of Rodents, and call your base-class methods to see what happens. Make the 
 * methods of Rodent abstract whenever possible and all classes should have default constructors that print 
 * a message about that class.
 */
public class Question1 {
	public static void main(String[] args) {
		//Array of different kinds of rodent
		Rodent[] rod_arr = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		//Calling base-class methods
		for(Rodent i : rod_arr){
			i.eat();
			i.jump();
		}
	}
}

abstract class Rodent{
		Rodent(){
		System.out.println("In Rodent Class Constructor.");
	}
	abstract void eat();
	abstract void jump();
}

class Mouse extends Rodent {
	Mouse(){
		System.out.println("In Mouse Class Constructor.");
	}
	void eat(){
		System.out.println("Mouse is eating.");
	}
	void jump(){
		System.out.println("Mouseis jumping.");
	}
}

class Gerbil extends Rodent {
	Gerbil(){
		System.out.println("In Gerbil Class Constructor.");
	}
	void eat(){
		System.out.println("Gerbil is eating.");
	}
	void jump(){
		System.out.println("Gerbil is jumping.");
	}
}

class Hamster extends Rodent {
	Hamster(){
		System.out.println("In Hamster Class Constructor.");
	}
	void eat(){
		System.out.println("Hamster is eating.");
	}
	void jump(){
		System.out.println("Hamster is jumping.");
	}
}
