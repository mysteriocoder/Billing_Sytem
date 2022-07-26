package billingsystem;

class calculateTaxForGivenData{
	int data;
	int id;
	double result;
	public double calculateTax(int data,int id){
		this.data=data;
		this.id=id;
		
		if(id==1) {
			
			try {
				 result=(data*0.6)/5;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		else if(id==2) {
			try {
				 result=(data*0.6)/6;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
		}
		else if(id==3) {
			try {
				 result=(data*0.6)/7;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		else if(id==4) {
			try {
				 result=(data*0.6)/8;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		else {
			try {
				 result=(data*0.6)/9;
				
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		return result;
		
	}
}




