/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112a1;
import java.util.*;

//This class is a product class that will store the data about the products being captured
public class Unknown {
    LinkedList<Unknown2> list;
    
    public Unknown(){
        list = new LinkedList<>();
    }
    
    public void add(Unknown2 report){
        if(!find(report.getPcode())){
            list.add(report);
        }
        else{
            System.out.println("Product already exists!");
        }
    }
    
    public boolean find(String prdcode)
	{


		for (Unknown2 l : list) {

			if (l.getPcode().equals(prdcode)) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}
    	
    public void delete(String recpcode)
	{
		Unknown2 recordDel = null;

		for (Unknown2 ll : list) {

			if (ll.getPcode().equals(recpcode)) {
				recordDel = ll;
			}
		}


		if (recordDel == null) {

			System.out.println("Invalid product code");
		}
		else {

			list.remove(recordDel);


			System.out.println(
				"Successfully removed product from the list");
		}
	}
    public Unknown2 findReport(String prdcode)
	{


		for (Unknown2 l : list) {

			if (l.getPcode().equals(prdcode)) {
				return l;
			}
		}

		return null;
	}
    	public void update(String prdcode, Scanner num, String warranty,int price, int level)
	{

		if (find(prdcode)) {
			Unknown2 rec = findReport(prdcode);

			System.out.print(
				"What is the new price ? ");
			price = num.nextInt();

			System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.");
            int war=num.nextInt();
            if(war==1){
                warranty = "6 Months";}
            else{
                warranty = "2 Years";}
            
            System.out.println("Enter the stock level for the " + rec.getPname() + "" );
            level=num.nextInt();



			rec.setPrice(price);
			rec.setWarranty(warranty);
			rec.setLevel(level);
			System.out.println(
				"Record Updated Successfully");
		}
		else {

			System.out.println(
				"Product Not Found in the Product list");
		}
	}
        public void display()
	{


		if (list.isEmpty()) {

			System.out.println("The list has no records\n");
		}

		for (Unknown2 report : list) {

			System.out.println(report.toString());
		}
	}
    
}
