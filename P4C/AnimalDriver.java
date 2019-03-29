public class AnimalDriver
{
    public static void main()
    {
        Nadav a1=new Nadav();
        Nadav a2=new Nadav(true, false, 2, false);
        Sri s1=new Sri();
        Sri s2=new Sri(4, true, 100000, true);
        
        Animal[] animalArray=new Animal[4];
        animalArray[0]=a1;
        animalArray[1]=a2;
        animalArray[2]=s1;
        animalArray[3]=s2;
        
        System.out.println(a1.eatCusCus());
        System.out.println(a2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
        for(Animal boi:animalArray)
        {
            System.out.println(boi.toString());
        }
    }
}
