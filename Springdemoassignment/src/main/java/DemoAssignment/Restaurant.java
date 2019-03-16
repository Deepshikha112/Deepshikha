package DemoAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant
{
    HotDrink hotDrink;

//    public Restaurant(HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }
//    public Restaurant()
//    {
//        System.out.println("Inside Restaurant Constructor.........");
//    }
//    @Autowired
//    private  Tea tea;

//    @Autowired
//    public void setTea(Tea tea)
//    {
//        this.tea=tea;
//    }
//    public Tea getTea()
//    {
//        return tea;
//    }
    private Tea tea;
    public Restaurant(Tea tea)
    {
        System.out.println("Inside Restaurant Constructor.........");
        this.tea=tea;
    }

    public void prepareTea()
    {
        tea.prepareHotDrink();
    }



    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink=hotDrink;
    }
}