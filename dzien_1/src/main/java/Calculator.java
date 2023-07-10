public class Calculator {

    public static void main(String[] args) {
        System.out.println(Math.PI*9);
    }

    //Zestaw zadan 1

    public static double kwadrat(double liczba) {
        return 0;
    }

    public static double potega(double podstawa, double wykladnik) {
        return 0;
    }

    public static double pierwiastek(double liczba) {
        return 0;
    }

    public static boolean czyParzysta(int liczba) {
        return true;
    }

    public static double objetoscSzescianu(double krawedz) {
        return 0;
    }

    public static int silnia(int liczba) {
        return 0;
    }

    public static String godzinyNaMinuty(double godziny) {
        return "";
        //dla 3 powinno zwrocic napis "180 min"
        //w przypadku negatywnej liczby godzin funcja powinna zwrócić "Liczba godzin musi byc wieksza od zera"
    }

    public static String godzinyNaSekundy(double godziny) {
        return "";
        //dla 3 powinno zwrocic napis "1080 s"
        //w przypadku negatywnej liczby godzin funcja powinna zwrócić "Liczba godzin musi byc wieksza od zera"
    }

    public static String predkoscWKmNaH(double odlegloscWMetrach, double czasWSekundach) {
        return "";
        //dal 1000m i dla 3600s powinno zostac zwrócone "1km/h
        //dla ujemnego czasu powinna zostac zwrocona informacja "czas nie moze byc ujemny"
        //dla ujemnej odleglosci powinna byc zwrocona informacja "odleglosc nie moze byc ujemna"
    }

    public static double poleKola(double promien) {
        //dla ujemnego promienia powinna zostac zwrocona wartosc -1
        return 0;
    }


    //Zestaw 3
    public static int[] dzielniki(int liczba) {
        return new int[1];
        //dla zera powinno stworzyc pusta tablice (int[1] to nie jest pusta tablica tyl
    }

    public static double najwiekszaLiczba(double[] liczby) {
        return 0;
    }

    public static int indexNajwiekszejLiczby(double[] liczby) {
        return 0;
    }

    public static boolean czyZawieraLiczbe(double[] liczby, int liczba) {
        return false;
    }

    public static boolean czyEgzaminZdany(double punkty, int max) {
        //egzamin jest zdany jezeli liczba punktów jest wieksza niz 60 procent maxa
        return false;
    }

    public static int[] zwrocNieparzyste(int[] liczby) {
        //pamietaj aby nie dodac do zbioru z odpowiedzia dwa razy tej samej liczby
        return new int[1];
    }

    //Zestaw 4
    public static int dlugoscLiczby(int liczba) {
        return 0;
    }

    public static String odwrocSlowo(String slowo) {
        return "";
    }
    public static int czasNaDni(int rokStart, int rokKoniec){
        //jezeli start jest wiekszy niz koniec to powinno sie zamienic dane, aby uniknac bledu
        return 0;
    }
    public static int dniOd(int rok, int miesiac,int  dzien){
        return 0;
    }
    public static int NWW(int liczba1, int liczba2){
        return 0;
    }
    public static int NWD(int liczba1, int liczba2){
        return 0;
    }
    public static int dwojkowyNaDziesietny(String liczba ){
        return 0;
    }
    public static String dziesietnyNaDwojkowy(int liczba){
        return "";
    }
    public static String mRNA(String DNA){
        // jak pojawia sie A w ciagu zwracanym w ty miejscu powinno pojawic sie T i na dowrot
        // jak pojawia sie C w ciagu zwracanym w ty miejscu powinno pojawic sie G i na dowrot
        // przykład ATCG powinnno zwrocic TAGC
        return "";
    }
    public static String zakodujSzyfrCezara(String wiadomosc, int przesuniecie){
        return "";
    }
    public static String odkodujSzyfrCezara(String wwiadomosc, int przesuniecie){
        return "";
    }
    public static String podciag(String ciag, int startIndex, int koniecIndex){
        //zwroc podciag skladajacy sie ze znakow ciagu miedzy koncem a startem
        // jezeli index konca jest mniejszy niz startu powinna zostac zwrocona informacja "blad indeksow"
        return "";
    }
    public static int sredniaArytmetyczna(int[] liczby){
        return 0;
    }
    public static boolean trojkaPitagorasa(int liczba1, int liczba2, int liczba3){
        return false;
    }
    public static boolean czyAutomorficzna(int liczba){
        //automorfizm - liczba podniesiona do kwadratu ma na koncu  sama siebie
        // na przuklad 5x5 = 25 i ma na koncu 5 ale tez 76x76 = 5776 wiec tez jest automorficzna
        return false;
    }
    public static int sumaNNajmniejszychLiczb(int[] liczba, int n){
        //jezeli n jest wieksze niz dlugosc tablicy z liczbami powinna byc zwrocona suma wszystkich elementow tablicy
        return 0;
    }
    public static String zamienNaSzesnastkowy(int liczba){
        return "";
    }
    public static int najstepnaLiczbaPierwsza(int liczba){
        //zwroc nastepna liczbe pierwsza po podanej liczbie
        return 0;
    }
    public static boolean czyliczbaHarashada(int liczba){
        //liczba Harashada - liczba, która jest podzielna prez sumę swoich cyfr
        //171 jest taką liczba 1+7+1 = 9 a 171/9 = 19
        return false;
    }

}
