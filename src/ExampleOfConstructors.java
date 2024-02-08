public class ExampleOfConstructors {
    ExampleOfConstructors()
    {
        int age = 5;
        String name ="Ashish";
        float height = 5.5f;
        System.out.println("The details of a person is:");
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);

    }

    public static void main(String[] args) {
        new ExampleOfConstructors();
    }
}
