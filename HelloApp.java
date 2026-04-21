public class HelloApp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        if (args.length == 0) {
            sb.append("World");
        } else {
            boolean f = true;
            for (String n : args) {
                if (!f) {
                    sb.append(", ");
                }
                sb.append(n);
                f = false;
            }
        }

        System.out.println("Hello, " + sb + "!");
    }
}