/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11155001;

/**
 *
 * @author eugene
 */
public class Student {
    private String name,id;
    
    public void setStudentInformation(String name,String id){
        this.name=name;
        this.id=id;
    }
    public String getStudentname(){
        return this.name;
    }
    public String getStudentid(){
        return this.id;
    }
    public String askname(Student x){
        return x.getStudentname();
    }
    
}
