import  javax.swing.JOptionPane;

public class JacksQuadraticClass
{
    public static void main()
    {
        String aS = JOptionPane.showInputDialog("Enter you a value");
        String bS = JOptionPane.showInputDialog("Enter you b value");
        String cS = JOptionPane.showInputDialog("Enter you c value");
       double a = Double.parseDouble(aS);
       double  b = Double.parseDouble(bS);
      double c = Double.parseDouble(cS);
      double RealCheck = ((b*b)-(4*a*c));
        
        
        
        
        if(RealCheck < 0)
        {
            System.out.print("“Sorry, your discriminant is negative. We cannot process imaginary roots right now…”");
        }
        else{
            System.out.println("B squared is "+b*b);
            System.out.println(4*a*c);
            System.out.println(Math.sqrt((b*b)-(4*a*c)));
            System.out.println(((b*-1)+Math.sqrt(RealCheck/(2*a));
            System.out.println(((b*-1)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
        }
            
            
        }
    }

