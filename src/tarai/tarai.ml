let rec tarai x y z = 
	if x <= y then
		y
	else
		tarai (tarai (x-1) y z) (tarai (y-1) z x) (tarai (z-1) x y)
;;

let main () =
	Bench.bench_start ();
	let _ = tarai 12 6 0 in
	Bench.bench_end ()
;;

main ()
;;