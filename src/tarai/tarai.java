import javalib.Bench;

public class tarai{
	public static int tarai(int x, int y, int z){
		if(x <= y){
			return y;
		}else{
			return tarai(tarai(x-1,y,z),tarai(y-1,z,x),tarai(z-1,x,y));
		}
	}

	public static void main(String[] args) {
		Bench.benchStart();
		int result = tarai(12,6,0);
		Bench.benchEnd();
	}
}