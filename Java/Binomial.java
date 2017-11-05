/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomial;

/**
 *
 * @author max
 */
public class Binomial {
        
    public static int fakultaet(int zahl1)
    {   
    int fakul=1;
        for (int i=1; i<=zahl1; i++){
             fakul = i*i;
        }
        return fakul;
    }
    
    public static int binomial(int n, int k){
        return fakultaet(n)/(fakultaet(k)*fakultaet(n-k));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ergebnis; int n=9; int k=2;
            ergebnis=binomial(n, k);
            System.out.print("Das Ergebnis ist"+" "+ergebnis+"\n");
        }
    }
