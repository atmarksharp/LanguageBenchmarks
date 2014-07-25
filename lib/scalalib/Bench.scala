package scalalib

object Bench {
	var t0:Long = 0
	var t1:Long = 0

	def bench_start():Unit = {
		t0 = System.currentTimeMillis();
	}

	def bench_end():Unit = {
		t1 = System.currentTimeMillis();
		val res:Long = t1 - t0;
		System.out.println(res);
	}
}
