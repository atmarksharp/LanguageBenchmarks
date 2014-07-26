import scalalib.Bench

object tarai{
	def tarai(x:Int, y:Int, z:Int):Int = {
		if(x <= y){
			y
		}else{
			tarai(tarai(x-1,y,z),tarai(y-1,z,x),tarai(z-1,x,y));
		}
	}

	def main(args: Array[String]):Unit = {
		Bench.benchStart()
		val result:Int = tarai(12,6,0)
		Bench.benchEnd()
	}
}