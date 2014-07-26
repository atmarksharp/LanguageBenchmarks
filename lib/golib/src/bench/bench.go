package bench

import "time"
import "fmt"

var t0, t1 int

func BenchStart(){
	t0 = time.Now().Nanosecond()
}

func BenchEnd(){
	t1 = time.Now().Nanosecond()

	var m0 int = int(t0 / 1e6)
	var m1 int = int(t1 / 1e6)

	var res int = (m1 - m0)
	fmt.Printf("%d",res);
}