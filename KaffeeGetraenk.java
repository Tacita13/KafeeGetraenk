/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffeegetraenk;

public abstract class KaffeeGetraenk {
public abstract int getWasser ();
public abstract int getKoffein ();
public abstract int getPreis ();
public String toString (){
if( getKoffein () != 0) return " Caffeinated Coffee ";
return " Caffeine-free Coffee ";
}
}

