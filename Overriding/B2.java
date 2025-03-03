/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Hp
 */
public class B2 extends A2 {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Memanggil method milik superclass (A)
        System.out.println("Method milik class B dipanggil");
    }
}
