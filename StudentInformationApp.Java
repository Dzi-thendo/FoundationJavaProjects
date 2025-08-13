import java.util.Scanner;

public class StudentInformationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter mark 1 (0-100): ");
        double m1 = sc.nextDouble();

        System.out.print("Enter mark 2 (0-100): ");
        double m2 = sc.nextDouble();

        System.out.print("Enter mark 3 (0-100): ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double average = total / 3.0;

        String status;
        if (average >= 50) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        System.out.println("\n--- Student Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + String.format("%.1f", average));
        System.out.println("Status: " + status);

        sc.close();
    }
}
