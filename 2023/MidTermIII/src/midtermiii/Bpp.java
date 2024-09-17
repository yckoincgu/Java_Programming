/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermiii;

/**
 *
 * @author hlpss
 */
public class Bpp {
    
    public void ap(){
        A a=new A();
        a.getGreeting("");
        a.get1();
    }
    
    public void bp(){
        B b=new B();
        b.get2();
    }
    
    public void cp(){
        person john=new person("john","123");
        john.getGreeting(john.name);
    }
    
    public void dp(){
        Employee john=new Employee("john","123");
        john.getGreeting(john.name);
               
    }
}
