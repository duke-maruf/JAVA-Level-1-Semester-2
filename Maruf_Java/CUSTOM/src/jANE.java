
public class jANE {

	public static void main(String[] args) {
		int x[]= {7,1,0,4,6,0,9,2};
		int y[]= {5,0,3,6,1,4,0,3};
		for(int i=x[6];i>=0;i--) {
			try {
				System.out.println("We get "+x[i]/y[i]);
				if((i%4==0)) {
					throw new ArrayIndexOutOfBoundsException();
				}
			}
			catch(ArithmeticException ex) {
				System.out.println("Exception of AE!");
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Index exceeded");
			}
			catch(Throwable ex) {
				System.out.println("Unknown Exception");
			}
		}

	}

}
