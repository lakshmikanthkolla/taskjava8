package task4_2.task4_2;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class avg {
public static void main(String[] args) {
System.out .println("calculate average of numbers");
System.out.println("Enter array length");
Scanner s = new Scanner(System.in);
int len = s.nextInt();
int[] ip = new int[len];
for (int i = 0; i < len; i++) {
ip[i] = s.nextInt();
}
float avg = average(ip);
System.out.println(avg);
 }

public static float average(int[] input) {
float sum = 0f;
for (int num : input) {
sum = sum + num;
}
return sum / input.length;
}
}  
