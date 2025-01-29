import java.util.Scanner;

public class Starcirclepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        
        // Calculate the diameter (for grid size)
        int diameter = 2 * r;

        // Loop through each row
        for (int i = 0; i <= diameter; i++) {
            // Loop through each column
            for (int j = 0; j <= diameter; j++) {
                // Calculate distance from the center of the circle (r, r)
                double distance = Math.sqrt(Math.pow(i - r, 2) + Math.pow(j - r, 2));

                // If the distance is within the radius range, print a star
                if (distance >= r - 0.5 && distance <= r + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}

