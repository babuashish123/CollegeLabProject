public class Day3 {
    // method or attributes
   /* int age;
    String color;
    float height;

    // methods or behaviour of animal
    void run() {
        System.out.println("Running");
    }

    void eat() {
        System.out.println("Eating");
    }
*/
    int age;
    String color;
    float height;
    void initializationOfObjects(int a, String c, float h)
    {
        age = a;
        color = c;
        height =h;
        System.out.println(""+age+""+color+""+height);
    }
    public static void main(String[] args) {

        Day3 d3 = new Day3();
        d3.initializationOfObjects(10,"Black",5.5f);

       // System.out.println();
        //System.out.println(+d3.initializationOfObjects(););
      //  d3.age=15;
      //  d3.color="black";
      //  d3.height=5.3f;
      //  System.out.println("Cat age :"+d3.age+"\ndog color ::"+d3.color+"\ndog height ::"+d3.height);

    }
}
/*
* OOPS CONCEPT
*               1. CLASS -
* IT IS THE COLLECTION OF OBJECTS
* ->CLASS IS NOT A REAL WORLD ENTITY
* -> IT IS TEMPLATE OR BLUEPRINT
* ->CLASS DOES NOT OCCUPY MEMORY
* ->EG. fruit ,animal etc
*           2.OBJECT
* ->it is real world entity
* ->object occupies memory
*                CAR
*       * BMW    *AUDI   * SWIFT
*
*
*                   *FRUIT
*         *MANGO   * ORANGE  * TOMATO
*
*                   *ANIMAL
*       *CAT  *DOG *COW   * BUFFALO
*
*
*
*
*
*
*
*
*
* */
