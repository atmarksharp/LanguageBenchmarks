from lib.bench import Bench

def tarai(x, y, z):
	if x <= y:
		return y
	else:
		return tarai(tarai(x-1,y,z),tarai(y-1,z,x),tarai(z-1,x,y))

Bench.bench_start()
result = tarai(12,6,0)
Bench.bench_end()