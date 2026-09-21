
class Osoba {
    String imie;
    int wiek;

Osoba(String imie, int wiek) {
    this.imie = imie;
    this.wiek = wiek;
}

void przedstaw() {
    System.out.println("jestem " + imie + " mam " + wiek + " lat");
}
    public static void main(String[] args) {
Osoba osoba1 = new Osoba("alicja",13);
        Osoba osoba2 = new Osoba("Dawid",17);

        osoba1.przedstaw();
        osoba2.przedstaw();
    }
}

class Samochod {
    String marka;
    String model;
    int predkosc = 0;

    Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
}









