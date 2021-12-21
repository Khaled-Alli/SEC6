package Adapter;

import java.time.format.DecimalStyle;

public class Multiplier implements MultiplyInterface
{
   
    @Override
    public BigDecimal multiply(BigDecimal a,BigDecimal b)
    { 
        
    BigDecimal product= new BigDecimal( a.big * b.big) ;
    
      
      return product;
    }
    
}
