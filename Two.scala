object Two{
    def main(args:Array[String])=
       {
         var a:Int=2
         var b:Int=3
         var c:Int=4
         var d:Int=5
         var k:Float=4.3f
      
         b-=1
         d-=1
         a+=1
         c+=1
     
         println("--b*a+c*d-- = " + (b*a+c*d))
         println("a++ = " + (a))
         println("-2*(b-k)+c = " + (-2*(b-k)+c))
         println("c=c++ = " + (c))
         println("c=++c*a++ = " + (c*a))
       }
}