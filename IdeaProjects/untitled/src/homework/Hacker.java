//1.1. Alege 2 obiecte de tipuri diferite și proiectează clasele aferente, folosind noțiunile studiate în acest capitol.
// Fiecare tip de obiect (i.e. clasă) trebuie să conțină:
//        Reprezentarea stării: minim 5 câmpuri (la alegere).
//        Reprezentarea comportamentului: minim 3 acțiuni la alegere, care să fie corelate logic cu tipul obiectului.
//        Pentru fiecare clasă, definește încă o metodă, printObjectState(), care afișează starea internă a obiectelor:
//        Concret, metoda va afișa toate câmpurile obiectului, pe rând, într-un mod plăcut (i.e. alături de un mesaj semnificativ pentru fiecare câmp).
package homework;

public class Hacker {
    private int varsta;
    private int numar_servere_sparte;
    private String nume;
    private int experienta_ani;
    public Hacker(int varsta,int numar_servere_sparte){
        this.varsta=19;
        this.numar_servere_sparte=0;
        this.nume="UNKNOWN";
        this.experienta_ani=0;
    }
    public Hacker(int varsta,int numar_servere_sparte,String nume,int experienta_ani){
        this.varsta=varsta;
        this.numar_servere_sparte=numar_servere_sparte;
        this.nume=nume;
        this.experienta_ani=experienta_ani;
    }
    public Hacker(){
        this.varsta=19;
        this.numar_servere_sparte=1000;
        this.nume="UNKNOWN NAME";
        this.experienta_ani=5;
    }
    public int getVarsta(int varsta){
        return varsta;
    }
    public String toHacker(){
        return "Numele este:" + nume + "varsta este:" + varsta + "experienta este:" + experienta_ani + "numarul de servere sparte este:" + numar_servere_sparte;
    }
    public int numarServereSparte(){
        return numar_servere_sparte;
    }
    void displayState(){
        System.out.println("Varsta:" + this.varsta + "\n" + "Nume:" + this.nume + "\n" + "Numar de servere sparte:"
                + this.numar_servere_sparte + "\n" + "Experienta in ani este:" + this.experienta_ani);
    }
    public void displayObjectState() {
        displayState();
    }
    public int getvarsta(){
        return this.varsta;
    }
    public int getexperienta_ani(){
        return this.experienta_ani;
    }
    public int getNumar_servere_sparte(){
        return this.numar_servere_sparte;
    }
    public String getnume(){
        return this.nume;
    }
    public void setvarsta(int noua_varsta){
        this.varsta = noua_varsta;
    }
    public void setexperienta_ani(int noua_experienta_ani){
        this.experienta_ani=noua_experienta_ani;
    }
    public void setnumar_servere_sparte(int noul_numar_de_servere_sparte){
        this.numar_servere_sparte=noul_numar_de_servere_sparte;
    }
    public void setnume(String noul_nume){
        this.nume = noul_nume;
    }
}
class Hacker2 {
    public static void main(String[] args) {
        Hacker newhacker = new Hacker(25,6000,"Kevin Mitnick",5);
        newhacker.displayState();
        System.out.println();
        newhacker.displayObjectState();
        System.out.println();
        System.out.print("Numele noului hacker-ului este:");
        newhacker.setnume("Lewis");
        System.out.println(newhacker.getnume());
        System.out.print("Numarul de servere sparte de noul hacker este:");
        newhacker.setnumar_servere_sparte(5000);
        System.out.println(newhacker.getNumar_servere_sparte());
        newhacker.setnumar_servere_sparte(1000);
        System.out.print("Varsta noului hacker este:");
        newhacker.setvarsta(30);
        System.out.println(newhacker.getvarsta());
        System.out.print("Experienta noului hacker este:");
        newhacker.setexperienta_ani(7);
        System.out.println(newhacker.getexperienta_ani());
        System.out.println(newhacker);
    }
}
