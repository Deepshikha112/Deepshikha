package DemoAssignment;

public class Tea implements HotDrink
{
    public  Tea()
    {
        System.out.println("Inside Tea Constructor....");
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("....Tea");
    }
}
