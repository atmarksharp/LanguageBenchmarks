package groovylib;
import groovy.transform.CompileStatic

@CompileStatic
public class Bench_s {
	public static long t0;
	public static long t1;

	public static void bench_start(){
		t0 = System.currentTimeMillis();
	}

	public static void bench_end(){
		t1 = System.currentTimeMillis();
		long res = t1 - t0;
		System.out.println(res);
	}
}