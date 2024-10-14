package gla_java;
//The Main Class gives option to user to add members,view members,add committee,view committee,add bill,view bill. 
/**
 * @author Sabah Sayed
 * @since 8/07/2024
 */
import java.util.ArrayList;
import java.util.Scanner;

// Main class

/**
* Main class-
* Takes user inputs
*/

public class GoaLegislativeAssembly {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Committee> committees = new ArrayList<>();
        ArrayList<Bill> bills = new ArrayList<>();
        
        while (true) {
            System.out.println("\nGoa Legislative Assembly Management System");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Add Committee");
            System.out.println("4. View Committees");
            System.out.println("5. Add Bill");
            System.out.println("6. View Bills");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter Constituency: ");
                    String constituency = scanner.nextLine();
                    members.add(new Member(memberName, constituency));
                    System.out.println("Member added successfully.");
                    break;
                case 2:
                    System.out.println("Members of the Assembly:");
                    for (Member member : members) {
                        System.out.println(member);
                    }
                    break;
                case 3:
                    System.out.print("Enter Committee Name: ");
                    String committeeName = scanner.nextLine();
                    System.out.print("Enter Chairman: ");
                    String chairman = scanner.nextLine();
                    committees.add(new Committee(committeeName, chairman));
                    System.out.println("Committee added successfully.");
                    break;
                case 4:
                    System.out.println("Committees of the Assembly:");
                    for (Committee committee : committees) {
                        System.out.println(committee);
                    }
                    break;
                case 5:
                    System.out.print("Enter Bill Title: ");
                    String billTitle = scanner.nextLine();
                    System.out.print("Enter Introduced By: ");
                    String introducedBy = scanner.nextLine();
                    bills.add(new Bill(billTitle, introducedBy));
                    System.out.println("Bill added successfully.");
                    break;
                case 6:
                    System.out.println("Bills in the Assembly:");
                    for (Bill bill : bills) {
                        System.out.println(bill);
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
