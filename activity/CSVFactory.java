/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cloud;

/**
 *
 * @author AL
 */
public class CSVFactory extends FormatsFactory{
     @Override
    public  Fileformat creat() {
        return new CSVFormat();
    }
}
