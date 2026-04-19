/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cloud;

/**
 *
 * @author AL
 */
public class formatService {
    private FormatsFactory factory ;

    public formatService(FormatsFactory factory) {
        this.factory = factory;
    }
    
    public void type(){
        factory.creat().type();
    }
    
}
