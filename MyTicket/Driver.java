
public class Driver
{
    public static void main(){
        
        Animal d1 = new Dog(4,true);
        Animal c1 = new Cat(4,9);
        
        
        Animal[] myList = {d1,c1};
        
        for(Animal x: myList){
            
            System.out.println(x);
        }
        
        
    }
}
