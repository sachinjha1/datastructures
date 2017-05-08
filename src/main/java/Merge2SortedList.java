import java.util.ArrayList;
import java.util.List;

public class Merge2SortedList {

	public static void main(String[] args) {
	int[] in1 = new int[]{1,2,3};
	int[] in2 = new int[]{2,3,4};
	
	List<Integer> res = new ArrayList<Integer>();
	
	int index1=0;
	int index2=0;
	
	while((index1+index2) != (in1.length+in2.length)){
		if(index1==in1.length){
			res.add(in2[index2++]);
		}else if(index2==in2.length){
			res.add(in1[index1++]);
		}else if(in1[index1]<in2[index2]){
			res.add(in1[index1++]);
		}else if(in1[index1]>in2[index2]){
			res.add(in2[index2]++);
		}else if(in1[index1]==in2[index2]){
			res.add(in1[index1++]);
			res.add(in2[index2++]);
		}
		
	}
	
	System.out.println(res);
	
	
	}

}
