/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112a1;

//This class is a report class that store the data captured and produce a report 
public class Unknown2 {
    //Variables that are going to be used are being stored
        private String warranty="";
        private String category="";
        private int price=0;
        private int level=0;
        private String supplier="";
        private String prdname="";
        private String prdcode="";
        
    public Unknown2(){}
    
    public Unknown2(String prdname,String prdcode,String category,
            String warranty,int price,int level,String supplier){
        this.prdname=prdname;
        this.prdcode=prdcode;
        this.category=category;
        this.warranty=warranty;
        this.price=price;
        this.level=level;
        this.supplier=supplier;
    }

    //The get and set methods are being used to store the data that has been captured into the report 
    
    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPname() {
        return prdname;
    }

    public void setPname(String pname) {
        this.prdname = pname;
    }

    public String getPcode() {
        return prdcode;
    }

    public void setPcode(String pcode) {
        this.prdcode = pcode;
    }
        @Override
    public String toString(){
        int pnum=0;
        pnum++;
        String string;
        string = """
                 PRODUCT REPORT
               
                 PRODUCT """+ pnum+
                "\n---------------------------------------------------------------"+
                "\nPRODUCT STUDENT >> " + "\t" + prdcode+
                "\nPRODUCT NAME >> " + "\t" +  prdname+
                "\nPRODUCT CATEGORY >> " + "\t" + category+
                "\nPRODUCT WARRANTY >> " + "\t" + warranty+
                "\nPRODUCT PRICE >> " + "\t" + price+
                "\nPRODUCT LEVEL >> " + "\t" + level+
                "\nPRODUCT SUPPLIER >> " + "\t" + supplier
                ;
        return string;
    }
}
