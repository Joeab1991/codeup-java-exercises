

public class SyntaxLecture {

	public static void main(String[] args) {
		/* Declaring vaiables
		 * without initializing */
		int weight;
		// Initialization after declaration
		weight = 12;
		// Declaration and initialization at once
		String breed = "Shiba Inu";
		String name = "Nina";
		int cuteness = 10;
		// A statement
		System.out.println(name + " is a " + breed + " and is " + cuteness + " out of 10 on the cuteness scale.");

		// very small numbers: byte data type
		byte smol = 12;
		System.out.println(smol);
		// very large numbers: long data type
		long bigNumber;
		//assign the small value to the large variable
		bigNumber = smol;
		System.out.println(bigNumber);
		bigNumber = 1234567890123456789L;
		System.out.println(bigNumber);
		// smol = bigNumber; not allowed
		// casting: convert a value from one type to another
		smol = (byte) bigNumber;
		System.out.println(smol);
		// float has 4 bytes of memory, double has 8 bytes
		float imafloat;
		double imadouble = 3.14159;
	}
}
