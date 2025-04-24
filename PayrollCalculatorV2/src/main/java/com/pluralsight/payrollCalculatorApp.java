package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class payrollCalculatorApp {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the name of the file employee file to process: ");
        String file = myScanner.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String newFile = myScanner.nextLine();

        try{
            String fileName = "inventory.csv";
            String writeFile = "report.txt";

            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            // create a FileWriter
            FileWriter newFileWriter = new FileWriter("src/main/resources/" + writeFile);
            // Buffered writer
            BufferedWriter newBufwriter = new BufferedWriter(newFileWriter);

            // create another file writer
            FileWriter newFileWriter2 = new FileWriter("src/main/resources/report.csv");
            // Create another BufferedWriter
            BufferedWriter newbufwriter2 = new BufferedWriter(newFileWriter2);

            String head = ("id" + "|" + "name" + "|" + "gross-pay" + "\n");

            //  Loop with buffered reader
            String input;
            while((input = bufReader.readLine()) != null) {

                String[] inputParts = input.split("\\|");
                if(inputParts[0].equals("id")){
                    continue;
                }
                //generate product
                Employee theEmployee = new Employee(Integer.parseInt(inputParts[0]), inputParts[1], Double.parseDouble(inputParts[2]), Double.parseDouble(inputParts[3]) );

                System.out.printf("%d - %s - $%.2f\n", theEmployee.getEmployeeId(), theEmployee.getName(), theEmployee.getGrossPay());

                String outputLine = theEmployee.getEmployeeId() + ", " + theEmployee.getName() + ", " + theEmployee.getGrossPay() +"\n";

                newBufwriter.write(head);

                newBufwriter.write(outputLine);

                newbufwriter2.write(outputLine);
            }
            // Close loop
            newBufwriter.close();
            newbufwriter2.close();
            bufReader.close();

        } catch (Exception e) {
            System.out.println("I can't read!");
        }

    }

}



