/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclient;

/**
 *
 * @author Saipronoti
 */
public class JavaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        int i = 12;
        int j = 19;
        int result = add(i, j);
        System.out.println("Addition Result = " + result);
        int a= 12;
        int b = 8;
        int result1 = sub(a, b);
        System.out.println("Subtraction Result = " + result1);
    } catch (Exception ex) {
        System.out.println("Exception: " + ex);
    }
        // TODO code application logic here
    }

    private static int add(int a, int b) {
        org.me.calculator.Calculator_Service service = new org.me.calculator.Calculator_Service();
        org.me.calculator.Calculator port = service.getCalculatorPort();
        return port.add(a, b);
    }

    private static int sub(int a, int b) {
        org.me.calculator.Calculator_Service service = new org.me.calculator.Calculator_Service();
        org.me.calculator.Calculator port = service.getCalculatorPort();
        return port.sub(a, b);
    }
    
}
