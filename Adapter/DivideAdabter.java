package Adapter;
public class DivideAdabter extends Divider implements MultiplyInterface
{

    DivideAdabter DividerAdabter;
    
    public void Divider(String operation ,BigDecimal  x , BigDecimal y)
    {
        if(operation.equalsIgnoreCase("divide"))
        {
           DivideAdabter DividerAdabter = new DivideAdabter();
           System.out.println(DividerAdabter.Divide(x, y).big);
        }
        else if(operation.equalsIgnoreCase("multiply"))
        {  
             DivideAdabter DividerAdabter = new DivideAdabter();
            System.out.println(DividerAdabter.multiply(x, y).big);
        }
        else
        {
            System.out.println("Invalid Operatin ");
        }
    }
   
    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b)
    {
         BigDecimal product= new BigDecimal( a.big * b.big) ;
    
      
       return product;
    }
    
}
