
public class MathSqrt {

	public static void main(String[] args) {
		System.out.println(sqrRoot(100));
	}
	
	public static int sqrRoot(int in){
		int result = 0;
		for(int i=1;i<in;i++){
			if(i>in/i){
				System.out.println("No Sqrt possible");
				break;
			}
			if(i==in/i && in%i==0){
				result = i;
				System.out.println("Sqrt is "+i);
				break;
			}
		}
		return result;
	}
}
