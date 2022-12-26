//2.1. Definește o clasă ProfilUtilizator, care va conține următoarele câmpuri:
//
//        nume
//        prenume
//        email
//        număr de telefon
//        data nașterii
//        gen
//        2.2. Comportamentul obiectelor de tip class ProfilUtilizator va fi definit prin următoarele metode:
//
//        initializeazaProfil(): metoda va citi de la tastatură, pe rând, informațiile necesare inițializării stării.
//        actualizareEmail(String): metoda va actualiza adresa de email.
//        actualizareNumarTelefon(String): metoda va actualiza numărul de telefon.
//        afisareVarsta(int an): metoda primește ca argument anul curent (i.e. 2022), calculează vârsta aproximativă (i.e. ca diferență de ani) și afișează rezultatul.
//        afisareStareInterna(): acțiunea va afișa starea completă a obiectului.
//        2.3. Testează implementarea anterioară printr-un scenariu riguros, implementat într-o clasă separată (i.e. TestareProfilUtilizator),
//        care să folosească cel puțin 2 obiecte și să apeleze cel puțin o dată fiecare metodă.
package profil_utilizator;

public class ProfilUtilizator {
    String nume;
    String prenume;
    private String gen;
    String email;
    String numar_de_telefon;
    String data_nasterii;
    public ProfilUtilizator (){
        this.nume="UNKNOWN NAME";
        this.prenume="UNKNOWN SURNAME";
        this.email="UNKNOWN EMAIL";
        this.numar_de_telefon="UNKNOWN PHONE NUMBER";
        this.data_nasterii = "UNKNOWN B-DAY DATA";
    }
    public ProfilUtilizator(String nume,String prenume,String email,String numar_de_telefon,String data_nasterii){
        this.nume=nume;
        this.prenume=prenume;
        this.gen=gen;
        this.email=email;
        this.numar_de_telefon=numar_de_telefon;
        this.data_nasterii=data_nasterii;
    }
    //to do(construtor pentru nume,prenume si gen)
//    public ProfilUtilizator(String prenume, String ion, String s){
//        this.nume="UNKNOWN";
//        this.prenume=prenume;
//        this.gen=gen;
//        this.email="UNKNOWN";
//        this.numar_de_telefon="UNKNOWN";
//        this.data_nasterii="UNKNOWN";
//    }
//    public ProfilUtilizator(String prenume,String nume){
//        this(prenume, "Ion", "Stefan");
//        this.nume=nume;
//    }
    public String toString(){
        return "Profil Utilizator:" +
                "nume:" + nume +
                "prenume:" + prenume +
                "gen:" + gen +
                "email:" + email +
                "numar de telefon:" + numar_de_telefon +
                "data nasterii:" + data_nasterii;
    }
    public String displayState(){
        return "Nume:" + this.nume + "\n" + "prenume:" + this.prenume + "\n"
                        + "email:" + this.email + "\n" + "numar de telefon:" + this.numar_de_telefon + "\n" +
                "data nasterii:" + this.data_nasterii + "\n";
    }
    public static void displayObjectState(){
        displayObjectState();
    }
    public String getnume(){
        return this.nume;
    }
    public String getprenume(){
        return this.prenume;
    }
    public String getgen(){
        return this.gen;
    }
    public String getemail(){
        return this.email;
    }
    public String getdata_nasterii(){
        return this.data_nasterii;
    }
    public String getnumar_de_telefon(){
        return this.numar_de_telefon;
    }
    public void setnume(String noul_nume){
        this.nume=noul_nume;
    }
    public void setprenume(String noul_prenume){
        this.prenume=noul_prenume;
    }
    public void setgen(String noul_gen){
        this.gen=noul_gen;
    }
    public void setemail(String noul_email){
        this.email=noul_email;
    }
    public void setdata_nasterii(String noua_data_de_nastere){
        this.data_nasterii=noua_data_de_nastere;
    }
    public void setnumar_de_telefon(String noul_numar_de_telefon){
        this.numar_de_telefon=noul_numar_de_telefon;
    }
}
class TestareProfilUtilizator{
    public static void main(String[] args) {
        ProfilUtilizator utilizator1 = new ProfilUtilizator("Ion","Vlad","vlad2@yahoo.com","0751234567","02-decembrie-1990");
        System.out.println(utilizator1.displayState());
        System.out.println();
        ProfilUtilizator utilizator2 = new ProfilUtilizator("Robert","Mihai","robert02@yahoo.com","0751245961","05-martie-2000");
        System.out.print("Numele primului utilizator este:");
        utilizator2.nume= "Robert";
        System.out.println(utilizator2.getnume());
        System.out.print("Prenumele primului utilizator este:");
        utilizator2.prenume="George";
        System.out.println(utilizator2.getprenume());
        System.out.print("Email-ul primului utilizator este:");
        utilizator2.email="robertt06@yahoo.com";
        System.out.println(utilizator2.email);
        System.out.print("Numarul de telefon al primului utilizator este:");
        utilizator2.numar_de_telefon="07523451234";
        System.out.println(utilizator2.numar_de_telefon);
        System.out.print("Data nasterii primului utilizator este:");
        utilizator2.data_nasterii="01-ianuarie-2000";
        System.out.println(utilizator2.data_nasterii);
        utilizator2.displayState();
        System.out.println();

        ProfilUtilizator utilizator_nou = new ProfilUtilizator("Stefan","Cristea","stefan3@yahoo.com","0751234567","02-decembrie-1990");
        utilizator_nou.displayState();
        System.out.println();
        utilizator_nou.displayState();
        System.out.print("Prenumele noului utilizator este:");
        System.out.println(utilizator_nou.getprenume());
        System.out.print("Numele noului utilizator este:");
        System.out.println(utilizator_nou.getnume());
        System.out.println("Email-ul noului utilizator este:");
        System.out.println(utilizator_nou.getemail());
        System.out.println("Numarul de telefon al noului utilizator este:");
        System.out.println(utilizator_nou.getnumar_de_telefon());
        System.out.print("Data de nastere a noului utilizator este:");
        System.out.println(utilizator_nou.data_nasterii);
    }
    }
///initializeazaProfil(): metoda va citi de la tastatură, pe rând, informațiile necesare inițializării stării.
///la finalul implementarii in cadrul metodei,sa se apeleze metoda close() pe obiectul de tip scanner