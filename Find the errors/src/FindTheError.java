import java.util.Scanner; 

public class FindTheError {

public static void main(String[] args) {

int height, width, depth;

System.out.println("Enter the height, width, and depth of a box and I will compute the volume."); 




Scanner keyboard = new Scanner(System.in);

height = keyboard.nextInt();

width = keyboard.nextInt();

depth=keyboard.nextInt();

int volume = height * width * depth; 
keyboard.close();

System.out.println("The volume is " + volume);

} }
