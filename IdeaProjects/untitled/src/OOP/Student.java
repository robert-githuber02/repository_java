package OOP;

public class Student {
    //campurile clasei, atributele clasei, starea clasei
    //modificatorul de acces este default, nu public!
    //default vs public vs private

    //modificatorii de acces sunt: public, private, protected, package-private (default)
    //coding practice: campurile clasei sunt private, clasa este public, metodele sunt publice de regula
    //metodele ce sunt folosite doar in cadrul clasei , nu si in afara, atunci pot fi declarate private
    private int varsta;
    private String nume;
    private double medie;

    //pentru a construi un obiect avem nevoie de un constructor (este o metoda)
    //constructorul default / fara param. este deja implementat in orice clasa, contine valori default
    //pentru campurile clasei noastre
    //obiectele nu au o valoare precizata, vor lua implicit valoarea null (Stringurile + tipurile referentiale (printre care si clasele, obiectele))

    //setam valori default pentru campurile obiectelor noastre
    //constructorul default este unic, nu puteam crea mai multi constructori default
    public Student() {
        this.varsta = 19;
        this.nume = "UNKNOWN NAME";
        this.medie = 0.0;
    }

    //putem crea mai multi constructori cu parametri
    public Student(int varsta, String nume, double medie) {
        this.varsta = varsta;
        this.nume = nume;
        this.medie = medie;
    }

    public Student(int varsta) {
        this.varsta = varsta;
        this.nume = "UNKNOWN";
        this.medie = 0.00;
    }

    public Student(int varsta, String nume) {
        this(varsta); //apelam constructorul cu parametrul "varsta" creat anterior
        this.nume = nume;
    }


    //metoda generala pentru afisarea campurilor obiectului: toString()
    //se apeleaza in main() folosind sout(objectName)
    public String toString() {
        return "Student{" +
                "varsta=" + varsta +
                ", nume='" + nume + "" +
        ", medie=" + medie +
                '}';
    }
    //metodele private nu pot fi apelate in main
    //vom apela aceasta metoda intr-o metoda publica a clasei, ce va fi apelata in main
    private void displayState() {
        System.out.println("Varsta: " + this.varsta + "\n" + "Nume: " + this.nume + "\n" + "Medie: " + this.medie);
    }

    //metoda de afisare a campurilor obiectului
    //this este un pointer catre campul obiectului

    public void displayObjectState() {
        displayState();
    }

    //pentru a prelua campuri private ale obectului vom utiliza metodele getter
    //pentru a modifica / actualiza valoarea campului private unui obiect vom folosi setter

    //getter varsta
    public int getVarsta() {
        return this.varsta;
    }

    public String getNume() {
        return this.nume;
    }

    //getter pentru medie
    //TODO getMedie()
    public double getMedie(){
        return this.medie;
    }
    ///setter pentru campul nume:este folosit pentru a actualiza valoarea campului private al obiectului
    public void setNume(String noul_Nume){
        this.nume = noul_Nume;
    }
    public void setMedie(double noua_medie){
        this.medie = noua_medie;
    }
    public void setVarsta(int noua_varsta){
        this.varsta = noua_varsta;
    }
}

class Program {
    public static void main(String[] args) {
        //am instantiat / creat un obiect care se numeste stud1 de tipul clasei Student
//        Student stud1 = new Student();
//        System.out.println(stud1.displayObjectState());
//
//        System.out.println();
//
//        Student stud2 = new Student(18, "Robert", 9.90);
//        stud2.nume = "Robert"; // nume obiect.camp
//        stud2.medie = 9.50;
//        stud2.displayState();
//
//        System.out.println();
//
//        Student stud3 = new Student(29);
//        System.out.println(stud3.displayObjectState());
//
//        System.out.println();
//
//        stud3 = stud2; //shallow copy
//        System.out.println(stud3.displayObjectState());
//
//        System.out.println();
//
//        stud2.nume = "Mihai";
//        System.out.println(stud3.displayObjectState());
//
//        System.out.println();

        Student studentNou = new Student(20, "Robert");
        studentNou.displayObjectState();
        // studentNou.varsta = 21;
        System.out.println();
        studentNou.displayObjectState();
        //  studentNou.nume = "Laurentiu";
        studentNou.displayObjectState();

        System.out.println(studentNou.getVarsta());
        System.out.println("Numele studentului nou este: " + studentNou.getNume());
        System.out.println("Media studentului nou este:" + studentNou.getMedie());
        studentNou.setNume("Nicusor");
        System.out.println(studentNou.getNume());
        studentNou.setMedie(9.70);
        System.out.println(studentNou.getVarsta());
        studentNou.setVarsta(20);
        System.out.println(studentNou.getMedie());
        System.out.println(studentNou);
        //metoda generala pentru afisarea campurilor obiectului: toString()
        //se apeleaza in main() folosind sout(objectName)
    }
}
