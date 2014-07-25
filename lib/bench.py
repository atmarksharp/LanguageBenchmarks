from time import clock

class Bench:
	@classmethod
	def bench_start(self):
		self.t0 = clock()

	@classmethod
	def bench_end(self):
		self.t1 = clock()
		delta = (self.t1 - self.t0)
		res = int(delta * 1000.0)
		print(res)