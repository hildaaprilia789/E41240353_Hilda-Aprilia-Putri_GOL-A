/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author Hp
 */

    public class B extends A { // Mendeklarasikan Class B yang diturunkan dari Class A
    int z;

    void TampilkanJumlah() {
        // Subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}

