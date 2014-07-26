open Sys;;

let t0 = ref 0.;;
let t1 = ref 0.;;

let bench_start () =
	t0 := Sys.time()
;;

let bench_end () =
	t1 := Sys.time();
	let res = int_of_float ((!t1 -. !t0) *. 1000.) in
	print_int (res)
;;