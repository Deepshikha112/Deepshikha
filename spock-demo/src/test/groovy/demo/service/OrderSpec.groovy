package demo.service

import demo.domain.Order
import spock.lang.Specification

class OrderSpec extends Specification
{
    def"Test get Quantity"()
    {
        given:"create instance of order"
        Order order=new Order()
        and:
        order.setQuantity(5)
        when:
        int testQuantity=order.getQuantity()
        then:
        testQuantity==5
    }
    def "Test set Quantity"()
    {
        given:"create instances of order"
        Order order=new Order();
        Order testQuantity=new Order()
        when:
        testQuantity=order.setQuantity(10)
        then:
        testQuantity.getQuantity()==10
    }
    def"Test get Itemname"()
    {
        given:"create instance of order"
        Order order=new Order()
        and:
        order.setItemName("Bucket")
        when:
        String testQuantity=order.getItemName()
        then:
        testQuantity=="Bucket"
    }
    def "Test set itemName"()
    {
        given:"create instances of order"
        Order order=new Order();
        Order testItemName=new Order()
        when:
        testItemName=order.setItemName("Bucket")
        then:
        testItemName.getItemName()=="Bucket"
    }
    def"Test get Price"()
    {
        given:"create instance of order"
        Order order=new Order()
        and:
        order.setPrice(0.5d)
        when:
        double testPrice=order.getPrice()
        then:
        testPrice==0.5d
    }
    def "Test set itemPrice"()
    {
        given:"create instances of order"
        Order order=new Order();
        Order testPrice=new Order()
        when:
        testPrice=order.setPrice(0.5d)
        then:
        testPrice.getPrice()==0.5d
    }
    def"Test get PriceWithTax"()
    {
        given:"create instance of order"
        Order order=new Order()
        and:
        order.setPriceWithTex(0.9d)
        when:
        double testPrice=order.getPriceWithTex()
        then:
        testPrice==0.9d
    }
    def "Test set itemPrice With Tax"()
    {
        given:"create instances of order"
        Order order=new Order();
        Order testPrice=new Order()
        when:
        testPrice=order.setPriceWithTex(0.9d)
        then:
        testPrice.getPriceWithTex()==0.9d
    }
}