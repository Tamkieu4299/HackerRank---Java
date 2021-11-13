
public class problem2_solution {
	
	public static class Person{
		String SSN;
		String name;
		char gender;
		private static Person spouse = null;

		Person(String strN, String strName, char charGender){
			SSN = strN;
			name = strName;
			gender = charGender;
		}
		
		void display() {
			System.out.println(SSN);
			System.out.println(name);
			System.out.println(gender);
		}
		void marry(Person Y) {
			if(spouse == null && Y.spouse == null && gender != Y.gender && this != Y) {
				spouse = Y;
				Y.spouse = this;
			}
		}
		
		void divorce() {
			if(spouse != null) {
				spouse = null;
				spouse.spouse = null;
			}	
		}
		
		void displaySpouse() {
			if(spouse == null) {
				System.out.println("There is no spouse");
			}
			else {
				spouse.display();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Person Alice = new Person("87", "Alice",'F');
		Person Bob = new Person("38", "Bob",'M');
		Person Carol = new Person("55", "Carol",'F');
		
		/*1*/
		Alice.display();
		
//		/*2*/
//		Alice.marry(Carol);
//		Alice.displaySpouse();
//		
//		/*3*/
//		Alice.marry(Bob);
//		Alice.displaySpouse();
//		Bob.displaySpouse();
		
		/*4*/
		Alice.marry(Bob);
		Alice.divorce();
		Bob.marry(Carol);
		Carol.displaySpouse();
	}

}
