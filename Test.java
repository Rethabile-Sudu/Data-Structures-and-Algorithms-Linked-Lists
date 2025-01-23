
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String [] args)
    {
        MyLinkedList List = new MyLinkedList();
        Xbox x1 = new Xbox("Xbox360", "Microsoft Gaming", 2001,1000.00,12);
        Xbox x2 = new Xbox("Xbox1", "Microsoft Gaming", 2013, 11000.00, 1);
        Xbox x3 = new Xbox("Xbox series x","Microsoft Gaming",2020,15000.00, 7);
        Xbox x4 = new Xbox("Xbox series s","Microsoft Gaming",2020,13000.00,2);
        
        PlayStation ps1 = new PlayStation("PlayStation 3","Sony", 2006, 1500.00,"Essential", 12);
        PlayStation ps2 = new PlayStation("PlayStation 4","Sony", 2013, 6000.00,"Premium", 6);
        PlayStation ps3 = new PlayStation("PlayStation 5","Sony", 2020, 15000.00,"Deluxe", 3);
        PlayStation ps4 = new PlayStation("PlayStation Vita","Sony", 2011, 1000.00,"Essential", 12);
        
        System.out.println("Test empty");
        System.out.println(List.getFirstUnique());
        
        List.append(x1);
        System.out.println("Test 1 element");
        System.out.println(List.getFirstUnique());
        
        List.clear(); 
        List.append(x1);
        List.append(x2);
        List.append(x3);
        List.append(x4);
        List.append(ps1);
        List.append(ps2);
        List.append(ps3);
        List.append(ps4);
        
        System.out.println("Test with values");
        System.out.println(List.getFirstUnique()); 
        
         
    } 
}
