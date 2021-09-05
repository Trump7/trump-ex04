import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = input.nextLine();
        System.out.println("Enter a verb: ");
        String verb = input.nextLine();
        System.out.println("Enter an adjective: ");
        String adj = input.nextLine();
        System.out.println("Enter an adverb: ");
        String adv = input.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");

    }
}
