
public class FormulaGeneral {

	public static void main(String[] args) {
		
		int a=6,b=-19,c=7;
		double p1=0;
		double p3=0;
		double p4;
		double p2=0;
		double r4;
		double r3=0;
		double r1=0;
		double r2=0;
		double x;
		double x1;
	
		r1= Math.pow(b, 2)-4*a*c;
		r2= Math.sqrt(r1);
		r3=(-b)-r2;
		r4=r3/(2*a);
		System.out.println("el resultado es "+r4);
		
		p1= Math.pow(b, 2)+4*a*c;
		p2= Math.sqrt(p1);
		p3=(+b)+p2;
		p4=p3/(2*a);
		System.out.println("el resultado es "+p4);
		
		x=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("El resultado es "+x );
		
		x1=(+b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a);
		System.out.println("El resultado es "+x1 );
	}

}
