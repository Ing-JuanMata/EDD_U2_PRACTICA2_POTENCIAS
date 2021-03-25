/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Potencia {

    public Potencia() {
    }

    public long potencia(long x, long y) {
        return (y == 1) ? x : x * potencia(x, y - 1);
    }
}
