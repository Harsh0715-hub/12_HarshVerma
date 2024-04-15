package random;
class Dog{
		String name;
		String breed;
		
		public Dog(String name  , String breed) {
			this.name= name;
			this.breed=breed;
			
		}
		
		
	}


public class doggy {

	public static void main(String[] args) {
		 Dog r1 = new Dog("sheru" , "siberian husky");
		 Dog r2 = new Dog("tommy" , "golden retriever");
		System.out.println(r1.name);
		System.out.println(r1.breed);
		System.out.println(r2.name);
		System.out.println(r2.breed);
		
		
		
		
	}

}
