
package prog6112a1;
import java.util.*;


public class ST10357809_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables that are going to be used in the program are declared below
        Scanner num = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        String warranty="";
        String category="";
        int price=0;
        int level=0;
        String supplier="";
        String prdname="";
        String prdcode="";
        int prdnum=1;
        int flot=1;
        
        Products hr = new Products();

		Report r = new Report();
         //Welcome page of the program which allows user to go to the main menu for the program       
        System.out.println("""
                           STUDENT MANAGEMENT APPLICATION
                           *********************************
                           Enter (1) to launch menu or any other key to exit
                           """);
        int launch=num.nextInt();
        
           //Menu of the program which allows user to select what they would like to do on the program 
          if(launch==1){  
            do{
                System.out.println("""
                               Please select one the following menu items:
                               (1) Capture a new student.
                               (2) Search for a student.
                               (3) Update a student.
                               (4) Delete a student.
                               (5) Print student report.
                               (6) Exit Application.
                               """);
            int option=num.nextInt();
            //The user will input a number and switch statement will test for equality and stores the product under the correct category
            switch(option){
                
                case 1: 
                    System.out.print("Enter the student id: ");
                    prdcode=word.nextLine();
                    System.out.print("Enter the student name: ");
                    prdname=word.nextLine();
                    r.setPname(prdname);
                    System.out.print("Enter the student age: ");
                    prdcode=word.nextLine();
                    System.out.print("Enter the student email: ");
                    prdcode=word.nextLine();
                    System.out.print("Enter the student course: ");
                    prdcode=word.nextLine();
                    
                    System.out.print("""
                                     Select the product category:
                                     Desktop Computer - 1
                                     Laptop - 2
                                     Tablet - 3
                                     Printer - 4
                                     Gaming Console - 5
                                     """);
                    System.out.print("""
                                     
                                     Product Category >> """);
                     flot=num.nextInt();
                     while(flot<1||flot>5){
                         System.out.print("""
                                     Select the product category:
                                     Desktop Computer - 1
                                     Laptop - 2
                                     Tablet - 3
                                     Printer - 4
                                     Gaming Console - 5
                                     """);
                    System.out.print("""
                                     
                                     Product Category >> """);
                     flot=num.nextInt();
                     }
                    
                    
                    switch(flot){
                        case 1 -> category="Desktop Computer";
                        case 2 -> category="Laptop";
                        case 3 -> category="Tablet";
                        case 4 -> category="Printer";
                        case 5 -> category="Gaming Console";
                    }
                    System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
            int war=num.nextInt();
            if(war==1){
                warranty = "6 Months";}
            else{
                warranty = "2 Years";}
            
            
            System.out.print("Enter price for " + r.getPname() + " ");
            price=num.nextInt();
            System.out.print("Enter stock level for " + r.getPname()+ " ");
            level=num.nextInt();
            System.out.print("Enter supplier for " + r.getPname()+ " ");
            supplier=word.nextLine();
            
            System.out.println("Product details have been saved successfully!!!");
            r = new Report(prdname,prdcode,category,warranty,price,level, supplier);
            hr.add(r);
				System.out.println(r.toString());
                                break;
                case 2:
                   System.out.print(
					"What is the product code? ");
				String rpcode=word.nextLine();

				if (!hr.find(rpcode)) {
					System.out.println(
						"Product does not exist\n");
				}
				break;
                case 3:
                    System.out.print(
					"What is the product code? ");

				String recPcode=word.nextLine();
				hr.update(recPcode,num,warranty, price,level);

				break;
                case 4:
                    System.out.print(
					"What is the product code? ");
				String recpcode=word.nextLine();

				hr.delete(recpcode);
				break;
                case 5:
                    hr.display();
                    break;
                case 6:
                    System.out.print("Program Terminated!");
                    System.exit(0);
                    default:

				System.out.println("\nInvalid input\n");
				break;

            }
                
            }
            while(launch==1);
        }
          else{
              System.out.print("Program Terminated!");
                    System.exit(0);}
       
    }
    public boolean test(int flot){
        if(flot==1||flot==2||flot==3||flot==4||flot==5)
            return true;
        else 
            return false;
    }
    public static int category(int flot, Scanner num){
        System.out.print("""
                                     Select the product category:
                                     Desktop Computer - 1
                                     Laptop - 2
                                     Tablet - 3
                                     Printer - 4
                                     Gaming Console - 5
                                     """);
                    System.out.print("""
                                     
                                     Product Category >> """);
                     flot=num.nextInt();
                     return flot;
    }
}
