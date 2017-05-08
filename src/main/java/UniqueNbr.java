import java.util.Arrays;

public class UniqueNbr {

	public static void main(String[] args) {
		ifUnsorted();
		ifSorted();
	}
	
	private static void ifUnsorted(){
		  int[] in = new int[]{1,5,5,3,3,6,6,6};
		  int[] out = new int[in.length];
		  out[0] = in[0];
		  int outLen = 1;
		  
		  for(int i=1;i<in.length;i++){
		  	int j=0;
		  	for(;j<outLen;j++){
		  	  if(out[j]==in[i]){
		  	  	break;
		  	  }
		  	}
		  	if(j==outLen){
		  		out[outLen]=in[i];
		  		outLen++;
		  	}
		  }
		  System.out.println(Arrays.toString(out));
	}
	
	private static void ifSorted(){
		  int[] in = new int[]{1,5,5,3,3,6,6,6};
		  int[] out = new int[in.length];
		  out[0] = in[0];
		  int prev = in[0];
		  int outIndex=1;
		  for(int i=1;i<in.length;i++){
		  	if(in[i]!=prev){
		  		out[outIndex]=in[i];
		  		outIndex++;
		  		prev = in[i];
		  	}
		  }
		  System.out.println(Arrays.toString(out));
	}

}
