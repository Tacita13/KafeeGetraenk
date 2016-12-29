/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffeegetraenk;

/**
 *
 * @author Isamar
 */

public class Test {

    public static class Kaffee extends KaffeeGetraenk{
        int Wassergehalt=50;
        int Koffeingehalt=20;
        int Preis= 5*Wassergehalt+50*Koffeingehalt;
        @Override
        public int getWasser (){
        return Wassergehalt;
        }
        @Override
        public int getKoffein(){
        return Koffeingehalt;
        }
        @Override
        public int getPreis (){
        return Preis;
        }
        //Este toString se saco de lo que se había escrito en la clase abstracta, can I do that?
        @Override
        public String toString (){
        if( getKoffein() != 0) return "Caffeinated Coffee "+" "+ Preis;
            return " Caffeine-free Coffee "+" "+Preis;
            }
        }

    public static class Kakao extends KaffeeGetraenk{
        boolean Streuseln;
        int Wassergehalt=100;
        int Koffeingehalt=0;
        int Preis= 5*Wassergehalt+50*Koffeingehalt;
        @Override
        public int getWasser (){
        return Wassergehalt;
        }
        @Override
        public int getKoffein(){
        return Koffeingehalt;
        }
        @Override
        public int getPreis (){
        return Preis;
        }
        public Kakao(boolean streuseln){
           Streuseln=streuseln;
            }
        @Override
        public String toString (){
        String streuseln="mixed";
        if(Streuseln) {
            streuseln="sprinkled";
        }//Obvio que el hot cocoa no tiene cafeina, aun asi tengo q tener el if?
         if( getKoffein() != 0){          
             return " Hot Cocoa "+streuseln+" "+Preis;
                }
             return " Caffeine-free Hot Cocoa "+streuseln+" "+Preis;
            }
        }
    public static class MilchKaffee extends KaffeeGetraenk{
        boolean Schaum;
        int Wassergehalt=40;
        int Koffeingehalt=15;
        int Preis= 5*Wassergehalt+50*Koffeingehalt;
        @Override
        public int getWasser (){
        return Wassergehalt;
        }
        @Override
        public int getKoffein(){
        return Koffeingehalt;
        }
        @Override
        public int getPreis (){
        return Preis;
        }
        private boolean Geschaumt=false;
        public void Schaeume(){
           Geschaumt=true;
        }
        @Override
        public String toString (){
        String geschaumt="";
        if(Geschaumt) {
            geschaumt="with foam";
        }
        if( getKoffein() != 0){          
            return "Caffeinated White Coffee "+geschaumt+" "+Preis;
            }
            return " Caffeine-free Whitw Cofee "+geschaumt+" "+Preis;
            }
        }
/////--------------------------------------------------------

    public static void main ( String [] args ){
        KaffeeGetraenk kaffee = new Kaffee ();
        System .out. println (" Coffee : "+ kaffee );
        KaffeeGetraenk milchkaffee = new MilchKaffee ();
// (( MilchKaffee ) milchkaffee ). schaeume ();
        System .out. println (" White Coffee : "+ milchkaffee );
        KaffeeGetraenk kakao = new Kakao ( true );
        System .out. println (" Hot Cocoa : "+ kakao );

// simple list
         java . util . LinkedList < KaffeeGetraenk >
         kaffeeListe = new java.util.LinkedList < KaffeeGetraenk >();

         for(int i=0;i <5;i++) {
            kaffee = new Kaffee ();
            milchkaffee = new MilchKaffee ();
            kaffeeListe .add( kaffee );
            kaffeeListe .add( milchkaffee );
            }
         for(int i=0;i< kaffeeListe . size ();i++){
            System .out. println ( kaffeeListe .get(i));
            }
                            System.out.println("here "+milchkaffee);
         milchkaffee = kaffee ;
         kaffee = null ;
         kaffeeListe = null ;
         milchkaffee = kaffee ;
                     System.out.println("here "+milchkaffee);
                     
 
         
    }
}
