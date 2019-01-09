import  javax.swing.JOptionPane;
public class javaProj
{
    // instance variables - replace the example below with your own
   public static void main(){
    String minS = JOptionPane.showInputDialog("Enter a low value:");
    String maxS = JOptionPane.showInputDialog("Enter a high value:");
    
    String arrayLengthS = JOptionPane.showInputDialog("Enter Array Length");
    int arrayLength = Integer.parseInt(arrayLengthS);
    int[] myArray = new int[arrayLength];
    
    int min = Integer.parseInt(minS);
    int max = Integer.parseInt(maxS); 
    int maxMiniusMin = max - min+1;
    int numOfOdd = 0;
    
    
    if(max<=min){   
   
        System.out.println("Error");
    }else {
        System.out.println("Max vaule is: "+max+", "+"Min vaule is: "+ min);
        for(int i=0; i<myArray.length; i++)
        {
            myArray[i] = (int)((Math.random()*maxMiniusMin)+min);
        }
        for(int i=0;i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
        for(int i=0;i<myArray.length; i++){
            int remainder = myArray[i]%2;  
            if(remainder == 0){
               System.out.println("Element #"+(i+1)+" in the array is "+myArray[i]+" is even");
              
              
            }else{
               System.out.println("Element #"+(i+1)+" in the array is "+myArray[i]+" is odd");
               numOfOdd = numOfOdd+1;
        }
    }
    System.out.println("The number of evens are " + (myArray.length-numOfOdd));
    System.out.println("The number of odds are " + numOfOdd);
    }
}       
}

