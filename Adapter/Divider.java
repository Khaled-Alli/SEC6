package Adapter;
public class Divider implements DivideInterface
{
    
    @Override
    public BigDecimal Divide(BigDecimal a, BigDecimal b)
    {
         BigDecimal quotient= new BigDecimal( a.big / b.big) ;
      
      return quotient;
        
    }
    
}
