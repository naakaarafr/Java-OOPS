public class clgfee{
	public static void main (String[] args){
		int actual_fee= 125000;
		int percentdiscount= 10;
		int discount=(percentdiscount*actual_fee)/100 ;
		int final_price= actual_fee- discount;
		System.out.println("The discount amount is INR "+discount+"and final discounted fee is INR "+final_price);
	}
}