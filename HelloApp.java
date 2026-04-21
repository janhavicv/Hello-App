public class HelloApp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        for (String n : args) {
            sb.append(n).append(", ");
        }

        String s = sb.substring(0, sb.length() - 2);

        System.out.println("Hello, " + s + "!");
    }
}