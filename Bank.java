public class Bank{
   String bankName;
   int bankBranch;
   String HeadQuater;
   
   Bank(String bankName,int bankBranch, String HeadQuater){
     this.bankName=bankName;
     this.bankBranch=bankBranch;
     this.HeadQuater=HeadQuater;
   }
   
   public void printDetails(){
     System.out.println("Bank Details are:"+this.bankName+" "+this.bankBranch+" "+this.HeadQuater);
   }
   public static void main(String args[]){
     Bank b=new Bank("Canara",121,"Mumbai");
     b.printDetails();
     
   }
}