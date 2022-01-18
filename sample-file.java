import javax.xml.soap.*;
import javax.xml.namespace.QName;
import java.util.Iterator;
import java.net.URL;

public class Request {
    public static void main(String[] args)    {
        try {
            SOAPConnectionFactory soapConnectionFactory =
                SOAPConnectionFactory.newInstance();
            SOAPConnection connection =
                soapConnectionFactory.createConnection();

            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();

            SOAPHeader header = message.getSOAPHeader();
            SOAPBody body = message.getSOAPBody();
            header.detachNode();

            QName bodyName = new QName("http://wombat.ztrade.com",
                "GetLastTradePrice", "m");
            SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

            QName name = new QName("symbol");
            SOAPElement symbol = bodyElement.addChildElement(name);
            symbol.addTextNode("SUNW");

            URL endpoint = new URL("http://wombat.ztrade.com/quotes");
            SOAPMessage response = connection.call(message, endpoint);

            connection.close();

            SOAPBody soapBody = response.getSOAPBody();

            Iterator iterator = soapBody.getChildElements(bodyName);
            bodyElement = (SOAPBodyElement)iterator.next();
            String lastPrice = bodyElement.getValue();

            System.out.print("The last price for SUNW is ");
            System.out.println(lastPrice);

        } catch (Exception ex) {
            ex.printStackTrace();
			
			
			public class DemoClass{
 //latest code is added by dev1//// new code for HDFC-300 userstory is added by Dev1
 package com.softwaretestinghelp;
 
public class DemoClass{
public static int  sampleMethod(int a,int b) throws ArithmeticException{ 
//[1] int as data type of return value
      System.out.println("Hello, this is sample method");
      int c = a/b; // int c = 4 / 2 gets calculated as 2 
      System.out.println("c:"+c); // c: 2
      return c;//return statement 
 } 
 
public static void main (String[] args){
    int x = DemoClass.sampleMethod(4,2);//return value is assigned to variable x 
    System.out.println("x:"+x); // x: 2
 }
 // latest changes done by dev2// new code for HDFC-301 userstory is added by Dev2
 public class DemoClass{
 
          public static String getGrade(int percentage ) {       
               if(percentage&amp;gt;=60){  
                   System.out.println("A grade"); 
                   return "A grade"; //Return statement
               }else if(percentage&amp;gt;=40){  
                   System.out.println("B grade"); 
                   return "B grade"; //Return statement
               }else {  
                   System.out.println("Not Eligible");  
                   return "Not Eligible"; //Return statement
               }
          }
 
  
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    String grade = DemoClass.getGrade(70);
    System.out.println("Grade:"+grade);
 }
 
}
        }
    }
}