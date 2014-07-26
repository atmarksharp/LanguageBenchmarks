#include <ctime>
#include <iostream>
#include <cmath>

clock_t t0, t1;

void bench_start(){
	t0 = std::clock();
}

void bench_end(){
	t1 = std::clock();

	double res = (t1 - t0) / (CLOCKS_PER_SEC / 1000.);
	std::cout << (int)std::round(res) << std::endl;
}