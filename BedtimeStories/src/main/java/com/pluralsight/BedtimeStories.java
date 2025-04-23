package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.print("Which story:");
            String story = input.nextLine();

            FileInputStream fis = new FileInputStream("src/main/resources/" + story);
            Scanner scanner = new Scanner(fis);


            int linenumber = 1;
            while(scanner.hasNextLine()) {
                System.out.println(linenumber + ": " + scanner.nextLine());
                linenumber++;
            }

        } catch (Exception e) {
            System.out.println("Story does not exist");
        }
    }
}

