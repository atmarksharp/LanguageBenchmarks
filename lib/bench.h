#include <time.h>
#include <stdio.h>
#include <math.h>

clock_t t0, t1;

void bench_start(){
	t0 = clock();
}

void bench_end(){
	t1 = clock();

	double res = (t1 - t0) / (CLOCKS_PER_SEC / 1000.);
	printf("%d\n",(int)round(res));
}