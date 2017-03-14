
import java.util.Scanner;


public class PhoneBookApp  {

   
    public static void main(String[] args) throws Exception{
      
        String name,address,phone_number;
        String searchname, delname;
        int choice;
        PhoneBook PB1 = new PhoneBook();
        Scanner input = new Scanner(System.in);
        
        boolean deleted;
        
        
        do {
            System.out.println("1. Add Contact \n2. Search Phone Book \n3. Delete Contact \n4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Dwse to onoma ths neas epafhs: ");
                    name = input.next();
                    input.hasNextLine();
                    System.out.print("Dwse th dieuthinsi ths neas epafhs: ");
                    address = input.next();
                    input.hasNextLine();
                    System.out.print("Dwse ton arithmo ths neas epafhs: ");
                    phone_number = input.next();
                    
                    System.out.println("  ");
                    PB1.addContact(name, address, phone_number);
                    break;

                case 2:
                    System.out.print("Dwse to onoma ths epafhs pros anazhthsh: ");
                    searchname = input.next();
                    input.nextLine();
                     {
                        try {

                            System.out.println(PB1.SearchPhoneBook(searchname).toString());

                        } catch (NoContactException NCE) {
                            NCE.toString();
                        }

                    }
                    break;
                case 3:
                    System.out.print("Dwse to onoma ths epafhs pros diagrafh: ");
                    delname = input.next();
                    input.nextLine();
                    deleted = PB1.deleteContact(delname);
                    if (deleted == true) {
                        System.out.println("H epafh exei diagrafei ");
                        
                    } else {
                        System.out.println("H epafh den vrethike");
                    }
                    break;
                case 4:
                    System.out.println("Telos programmatos ");
                    break;
            }
        } while ( choice != 4);


        
        
    }
    
}
