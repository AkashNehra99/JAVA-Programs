import java.util.Scanner;

// WAP to calculate a percentage of a given student in CBSE board(5 subjects)
public class CWH_06_percalculator {
    public static void main(String[] args) {
        System.out.println("CBSE board exam student result: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks: ");
        int a = sc.nextInt();
        System.out.println("Enter subject 2 marks: ");
        int b = sc.nextInt();
        System.out.println("Enter subject 3 marks: ");
        int c = sc.nextInt();
        System.out.println("Enter subject 4 marks: ");
        int d = sc.nextInt();
        System.out.println("Enter subject 5 marks: ");
        int e = sc.nextInt();
        float sum = a+b+c+d+e;
        float per = (sum/500)*100;
        System.out.println("The percentage of the student is: ");
        System.out.println(per);
    }
}
