package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailService1 extends Specification
{
    def "Send Email Testing"()
    {
        given:"Create email instance"
        def emailService=new EmailService()
        and:
        Order order=new Order()
        when:
        emailService.sendEmail(order)
        then:
        thrown(RuntimeException)
    }
    def "Stub send Email"()
    {
        given: "Create instance"
        Order order=new Order();
        EmailService emailService=EmailService.getInstance();
        String str="deepshikha.yadav@tothenew.com"
        when:
        boolean emailSend=emailService.sendEmail(order,str);
        then:
        emailSend==true
    }

}
