package Favority;
/*
    System.out.println("Welcome to system");
 */

import java.util.Scanner;

import static Favority.FavorityBook.getUserString;
import static Favority.FavorityBook.recommendation;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        String favBook;

        Scanner sc = new Scanner(System.in);

        //Asking for information

        System.out.println("Please, enter your name: ");
        name = sc.next();

        System.out.println("Your age, please: ");
        age = sc.nextInt();

        System.out.println("What is your favourite book? ");
        favBook = sc.next();

        //Output information with method

        getUserString(name, age, favBook);

        //Get a recommendation

        recommendation(age, name);

        String agrum;

        do{
            //Asking about continue

            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to continue? (y/n)");
            agrum = scan.nextLine();
            if(agrum.equals("y")){

                System.out.println("Please, enter your name: ");
                name = sc.next();

                System.out.println("Your age, please: ");
                age = sc.nextInt();

                System.out.println("What is your favourite book? ");
                favBook = sc.next();

                getUserString(name, age, favBook);

                recommendation(age, name);
            }
        }while (!agrum.equals("n"));
    }

}

