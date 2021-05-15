object books extends App{

      def add(x:Double, y:Double) : Double = x*y;

            def shipment(a:Int) : Double = (a-50) * 0.75;
                    
                    def price(b: Double = add(24.95,0.4) , c:Double = shipment(60) ) : Double = (b*60) + c + (50*3);

                              println(price());





}
