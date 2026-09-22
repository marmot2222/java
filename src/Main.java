
//class Osoba {
//    String imie;
//    int wiek;
//
//Osoba(String imie, int wiek) {
//    this.imie = imie;
//    this.wiek = wiek;
//}
//
//void przedstaw() {
//    System.out.println("jestem " + imie + " mam " + wiek + " lat");
//}
//    public static void main(String[] args) {
//Osoba osoba1 = new Osoba("alicja",13);
//        Osoba osoba2 = new Osoba("Dawid",17);
//
//        osoba1.przedstaw();
//        osoba2.przedstaw();
//    }
//}
//
//class Samochod {
//    String marka;
//    String model;
//    int predkosc = 0;
//
//    Samochod(String marka, String model) {
//        this.marka = marka;
//        this.model = model;
//    }
//}
import java.util.Scanner;

class Uczen {
    String imie;
    String nazwisko;
    int wiek;
    double[] oceny;

    Uczen(String imie, String nazwisko, int wiek, double[] oceny){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek;
        this.oceny;
    }

    double srednia() {
        double suma = 0;

        for (int i = 0; i < oceny.length; i++) {
            suma += oceny[i];
        }
        return suma / oceny.length;
    }
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj liczbe uczniów");
        int liczbaUczniow = scanner.nextInt();

        Uczen[] uczniowie = new Uczen[liczbaUczniow];

        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.println("Uczeń" + (i + 1));

            System.out.print("imię: ");
            String imie = scanner.next();

            System.out.print("Nazwisko: ");
            String nazwisko = scanner.next();

            System.out.print("Wiek: ");
            int wiek = scanner.nextInt();

            double[] oceny = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Podaj ocenę " + (j + 1) + ": ");
                oceny[j] = scanner.nextDouble();
            }

            uczniowie[i] = new Uczen(imie, nazwisko, wiek, oceny);
        }
        System.out.println("Uczniowie");
        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.println(uczniowie[i].imie + " " + uczniowie[i].nazwisko + " średnia " + uczniowie[i].srednia());
        }
        Uczen najlepszy = uczniowie[0];

        for (int i = 1; i < liczbaUczniow; i++) {
            if (uczniowie[i].srednia() > najlepszy.srednia()) {
                najlepszy = uczniowie[i];
            }
        }
System.out.println(" najwyższa średnia ");
        System.out.println(najlepszy.imie + " " + najlepszy.nazwisko + " średnia " + najlepszy.srednia());

    }
}








