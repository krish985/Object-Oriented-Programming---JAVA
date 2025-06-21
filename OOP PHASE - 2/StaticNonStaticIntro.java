public class StaticNonStaticIntro {
    static class Human {
        String name;
        static int population = 0;

        // Constructor.
        Human(String name) {
            this.name = name;
            Human.population += 1; // We are accesing using class because it's belong to the class.
        }
    }

    // Non static method.
    public void printHeloWorld() { 
        System.out.println("Hello World");
    }

    // Static stuff initialization.
    static int x = 10;
    static int y;

    // initialize val.
    static {
        y = 20;
    }

    public static void main(String[] args) {
        // 🔹 What is static in Java?
        // -> static keyword depend on class not an object.
        // -> static (method , variable) shared across all instances.
        // -> And non static memober unique for each object.

        // 🔹what Exactly mean.
        // -> suppose define static variable in class in will same as every
        // -> object in real life example earth have population it will same
        // -> as every person.
        // Conlucison : person is object and population something that same
        // as every object.

        // Example create human object.
        Human person1 = new Human("Alex");
        Human person2 = new Human("John");
        Human person3 = new Human("Mike");

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);
        System.out.println(Human.population); // // Static field: Best practice.

        // ⚠️ This works, but Java recommends accessing static members using the class
        // name, not the object.
        // System.out.println(person1.population);

        // 🆚 Static vs Non-Static Comparison.
        // -> static : belongs to class | Non static : belongs to object.
        // -> Memory Alllcoation once the class load . in object every time when instance created.
        // -> Accesed by Class and Non static by object.

        // Important concept.
        // -> something is static inside that you could not use non static stuff (because it belongs to object).
        // -> and something non static you use static stuff example.

        // printHeloWorld();  See line no : 13 you could not call non static stuff inside static block.

        // But Alternative Available you can use non static method inside static block.
        // create an object ob class then acesse via object like this.
        StaticNonStaticIntro obj = new StaticNonStaticIntro();  // ✅ Create object
        obj.printHeloWorld(); // ✅ Call non-static method


        // 🔹 Initailization of static stuff.
        // ->  see line no : 18.
        System.out.println("Print x : "+ x + " Print y : " + y);

    }
}
