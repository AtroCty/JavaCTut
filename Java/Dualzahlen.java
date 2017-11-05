package dualzahlen;

/**
 * @author max
 */
public class Dualzahlen {
     
    public static int laengeDerZeichenkette(String dualzahl[]){
        return dualzahl.length;
    }
    
    public static int positionVomPunkt(String dualzahl[]){
        char position =1;
            for (int i=1; i<=dualzahl.length; i++){
                if(dualzahl[i]=="."){
                }
                position =i;
            }
        return position;
    }
    
    public static int dualInDezimal(String dualzahl[]){
        int potenz=dualzahl.length;
        int dezimalzahl=0;
            for(int i=1; i<=potenz; i++){
                if(dualzahl[i]=="1"){
                    dezimalzahl=dezimalzahl+potenz;
                }
                    potenz=potenz-1;
            }
                return dezimalzahl;
    }
    

    
    public static void main(String[] args) {
        
        String dualzahl="111001";
        
        int laengeDerZeichenkette=laengeDerZeichenkette(dualzahl);
        int positionVomPunkt=positionVomPunkt(dualzahl);
        int dualInDezimal=dualInDezimal(dualzahl);
   
    System.out.println("Die Zeichenkette ist "+laengeDerZeichenkette+" Zeichen lang");
    System.out.println("Der Punkt ist an Position "+positionVomPunkt);
    System.out.println("Die Dualzahl ist "+dualInDezimal+" in dezimal");
        
    }
    
}
