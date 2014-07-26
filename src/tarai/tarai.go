package main

import "bench"

func tarai(x int, y int, z int) int {
	if(x <= y){
		return y
	}else{
		return tarai(tarai(x-1,y,z),tarai(y-1,z,x),tarai(z-1,x,y))
	}
}

func main() {
	bench.BenchStart()
	var _ int = tarai(12,6,0)
	bench.BenchEnd()
}