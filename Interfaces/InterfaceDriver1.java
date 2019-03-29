import java.util.*;

public class InterfaceDriver1
{
    public static void main()
    {
        InventoryItem i1 = new LampShade(true, 10.00);
        InventoryItem i2 = new LampShade(true, 20.00);
        InventoryItem i3 = new DuctTape(true, 5.00);
        InventoryItem i4 = new DuctTape(true, 6.00);
        
        ArrayList<InventoryItem> invList = new ArrayList<InventoryItem>();
        invList.add(i1);
        invList.add(i2);
        invList.add(i3);
        invList.add(i4);
        
        for(InventoryItem currItem:invList)
        {
            System.out.println(currItem.shipped());
        }
    }
}
