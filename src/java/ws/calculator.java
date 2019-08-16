/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 8402-01
 */
@WebService(serviceName = "calculator")
public class calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNumber")
    public double addNumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        double addNumber = A + B ;
        return (A+B) ;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividenumber")
    public double dividenumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
        double dividenumber = A / B;
        return (A/B);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplynamber")
    public double multiplynamber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
        double multiplynamber = A * B;
        return (A*B);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtraNumber")
    public double subtraNumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
        double subtraNumber = A - B;
        return (A-B);
    }
}
