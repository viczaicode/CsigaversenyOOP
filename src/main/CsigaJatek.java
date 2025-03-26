package main;

import java.util.Scanner;




public class CsigaJatek {
    
    
    private final Scanner SC = new Scanner(System.in);
    
    private int korokSzama;
    private Csiga[] csigak;
    
    
    public CsigaJatek(int korokSzama) {
        this.korokSzama = korokSzama;
        csigak = new Csiga[3];
        csigak[0] = new Csiga("🐌","zold"); //zold \u001B[32m
        csigak[1]= new Csiga("🐌", "kek"); //kek  \u001B[34m
        csigak[2]= new Csiga("🐌", "piros"); //piros \u001B[31m
        this.verseny();
        
    }
    
    public void verseny(){
        
        String gyoztes = SC.nextLine();
        
        for (int kor = 1; kor <= korokSzama; kor++) {
            System.out.println(kor+". Kör:");
            for (int i = 0; i < csigak.length; i++) {
                int lepes = csigak[i].lep();
                csigak[i].pozFrissit(lepes);
                
                String lepesJel = (lepes>3) ? "==" : "-";
                csigak[i].hozzaad(lepesJel);
                System.out.println(csigak[i].getSzin() + csigak[i].getLepesjel() + csigak[i].getNev());
            }
        }
        
        int maxPozicio = 0;
        int gyoztesIndex = 0;
        for (int i = 0; i < csigak.length; i++) {
            if(csigak[i].getPoz() > maxPozicio) {
                maxPozicio = csigak[i].getPoz();
                gyoztesIndex = i;
            }
        }
        System.out.println("\u001B[30mGyőztes csiga: " + csigak[gyoztesIndex].getSzin() + csigak[gyoztesIndex].getNev());
        
        if (gyoztes == csigak[gyoztesIndex].getSzinNev()) {
            System.out.println("Jött a mix!");
        } else {
            System.out.println("Elment a pénzed, csáááá!!!!");
        }
        
        
        
    }
}
