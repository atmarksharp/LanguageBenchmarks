class Bench
	def self.bench_start()
		@@t0 = Time.now
	end

	def self.bench_end()
		@@t1 = Time.now
		res = ((@@t1.to_f - @@t0.to_f) * 1000.0).to_i
		puts res
	end
end