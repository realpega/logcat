//April 2024 - March 2025

import java.util.Scanner;

public class Fees
  {
    public static void main (String[] args)
    {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Enter Month:");
      String month = scanner.nextLine();

      switch (month) {
            case "January":
                January();
                break;
            case "February":
                February();
                break;
            case "March":
                March();
                break;
            case "April":
                April();
                break;
            case "May":
                May();
                break;
            case "June":
                June();
                break;
           case "July":
                July();
                break;
            case "August":
                August();
                break;
            case "September":
                September();
                break;
            case "October":
                October();
                break;
            case "November":
                November();
                break;
            case "December":
                December();
                break;
            default:
                System.out.println("Invalid month name. Please enter a valid month name.");
                break;
      }
    }
