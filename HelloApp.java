public class HelloApp {
    public static void main(String[] args) {

        String s;

        if (args.length == 0) {
            s = "World";
        } else {
            s = String.join(", ", args);
        }

        System.out.println("Hello, " + s + "!");
    }
}