import groovylib.Bench_s;
import groovy.transform.CompileStatic

@CompileStatic
public class tarai_s{
	public static int _tarai(int x, int y, int z){
		if(x <= y){
			return y;
		}else{
			return _tarai(_tarai(x-1,y,z),_tarai(y-1,z,x),_tarai(z-1,x,y));
		}
	}

	public static void main(String[] args) {
		Bench_s.bench_start();
		int result = _tarai(12,6,0);
		Bench_s.bench_end();
	}
}