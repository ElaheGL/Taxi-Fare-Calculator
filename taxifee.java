import java.text.DecimalFormat;

public class taxifee {
	public static double calfee(double distance) {
		double basefee =5;
		double totalfee;
		
		
		if (distance ==2) {
			totalfee = basefee;}
		else if(distance <=10){
			totalfee = basefee +( 1.5*(distance -2));
			}
		else
			totalfee = basefee +( ( 1.5*(distance -2)) + (1*(distance -10)));
		
		return totalfee;
	}

}
