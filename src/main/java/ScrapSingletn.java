
public class ScrapSingletn {
	
	private static ScrapSingletn newInstance;

	private ScrapSingletn(){	
	}
	
	public static synchronized ScrapSingletn getInstance(){
		if(newInstance == null){
			newInstance = new ScrapSingletn();
		}
		return newInstance;
	}
	
	public int add(int x, int y){
		return x+y;
	}

}
