module lib.bench;

import std.stdio;
import std.datetime;

private TickDuration t0;
private TickDuration t1;

void bench_start(){
	t0 = Clock.currSystemTick();
}

void bench_end(){
	t1 = Clock.currSystemTick();
	long res = t1.msecs - t0.msecs;
	
	writefln("%d",res);
}