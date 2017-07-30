import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        final Scanner scan =  buildScan(args);

        int i = scan.nextInt();
        String d = scan.next();
        final StringBuilder sb = new StringBuilder(scan.nextLine());
        while(scan.hasNext()) {
            sb.append(" ");
            sb.append(scan.nextLine());
        }
        System.out.println("String:" + sb.toString());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }


    private static Scanner buildScan(String[] args) throws FileNotFoundException {
        final Scanner scan;
        if (args.length == 0) {
            scan = new Scanner(System.in);
        } else {
            final File file = new File(args[0]);
            scan = new Scanner(file);
        }
        return scan;
    }
}
