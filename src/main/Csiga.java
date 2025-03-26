
package main;

import java.util.Random;

    
            
public class Csiga {
    private final Random RND = new Random();
    private String nev;
    private String szin;
    private int pozicio;
    private String lepesjel;
    private String szinNev;
    
    public Csiga(String nev, String szinNev) {
        this.nev = nev;
        this.pozicio = 0;
        this.lepesjel = "";
        this.szinNev = szinNev;
        if (this.szinNev == "zold") {
            this.szin = "\u001B[32m";
        } else if (this.szinNev == "kek") {
            this.szin = "\u001B[34m";
        } else {
            this.szin = "\u001B[31m";
        }
        
    }
    
    public String getNev() {
        return this.nev; 
    }
    
    public String getSzin() {
        return this.szin; 
    }

    public int getPoz() {
        return this.pozicio;
    }
    
    public int lep() {
        if(RND.nextDouble()<0.2){
            return RND.nextInt(0,7);
        }
        return RND.nextInt(0,4);
    }
    
    public void pozFrissit(int lepes){
        this.pozicio += lepes;
    }
    
    public void hozzaad(String lepesjel) {
        
        this.lepesjel += lepesjel;
    }
    
    public String getLepesjel() {
        return this.lepesjel;
    }
    
    public String getSzinNev() {
        return this.szinNev;
    }
    
    
    
    


    
    
    
    
}
