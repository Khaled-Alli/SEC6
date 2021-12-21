package Adapter;
public class Main 
{
    public static void main(String[] args) {
        BigDecimal x=new BigDecimal(5);
        BigDecimal y=new BigDecimal(5);
        
       DivideAdabter div= new DivideAdabter();
       
       div.Divider("divide",x, y);
       div.Divider("multiply",x, y);
       div.Divider("m",x, y);
        
    }
}
