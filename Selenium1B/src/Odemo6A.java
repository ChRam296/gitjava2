public class Odemo6A {

    int x = 4;
    // Assuming A is defined elsewhere
    A a1 = new A(); 
    Odemo6A d1;

    public static void main(String[] args) {
        System.out.println("Main Method Start");        

        Odemo6A d1 = new Odemo6A();
        System.out.println(d1.x);
        System.out.println(d1.d1); // This will print null.

        // Initialize d1.d1
        d1.d1 = new Odemo6A();

        // Initialize nested d1s
        d1.d1.d1 = new Odemo6A(); // Initialize d1.d1.d1
       // d1.d1.d1.d1 = new Odemo6A(); // Initialize d1.d1.d1.d1

        int x = 6;
        d1.d1.d1.x = x; // Set the x of the deepest d1 instance.

        // Assign the reference back to the top-level d1
        d1.d1.d1.d1 = d1; // This is where you create a reference cycle.

        d1.d1.d1.d1.x = 13; // Now d1.x is also changed to 13.

        // Print the nested values
        System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.x); // Deeply nested reference
        System.out.println(d1.d1.d1.d1.d1.d1.x); // Direct access to x of d1
        System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1);

        // Print the original object
        System.out.println(d1);
    }
}

// Note: Ensure class A is defined, otherwise there will be another error.

