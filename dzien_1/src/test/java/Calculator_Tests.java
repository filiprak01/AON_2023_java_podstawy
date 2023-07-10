import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class Calculator_Tests {


    @Test
    void kwadratTest(){
        Assertions.assertEquals(4, Calculator.kwadrat(2));
        Assertions.assertEquals(0, Calculator.kwadrat(0));
        Assertions.assertEquals(49, Calculator.kwadrat(-7));
        Assertions.assertEquals(0.125, Calculator.kwadrat(0.25));
    }

    @Test
    void potegaTest(){
        Assertions.assertEquals(0.25,Calculator.potega(0.5,2));
        Assertions.assertEquals(2,Calculator.potega(4,0.5));
        Assertions.assertEquals(0.5,Calculator.potega(0.25,0.5));
        Assertions.assertEquals(8,Calculator.potega(0.5,-3));
        Assertions.assertEquals(1,Calculator.potega(5,0));
    }

    @Test
    void pierwiastekTest(){
        Assertions.assertEquals(3,Calculator.pierwiastek(9));
        Assertions.assertEquals(0.5,Calculator.pierwiastek(0.25));
    }

    @Test
    void czyParzystaTest(){
        Assertions.assertTrue(Calculator.czyParzysta(12));
        Assertions.assertTrue(Calculator.czyParzysta(0));
        Assertions.assertFalse(Calculator.czyParzysta(-5));
        Assertions.assertTrue(Calculator.czyParzysta(-6));
        Assertions.assertFalse(Calculator.czyParzysta(7));
    }

    @Test
    void objetoscSzescianuTest(){
        Assertions.assertEquals(-1, Calculator.objetoscSzescianu(-5));//jezeli nie działa to dla ujemnych licznb objetosc szescianu ma zwracac -1
        Assertions.assertEquals(0.125, Calculator.objetoscSzescianu(0.5));
        Assertions.assertEquals(216, Calculator.objetoscSzescianu(6));
    }
    @Test
    void silniaTest(){
        Assertions.assertEquals(6,Calculator.silnia(3));
        Assertions.assertEquals(-1,Calculator.silnia(-10));//jezeli nie działa to dla ujemnych licznb silnia ma zwracac -1
        Assertions.assertEquals(6,Calculator.silnia(3));
    }
    @Test
    void godzinyNaMinutyTest(){
        Assertions.assertEquals("180 min",Calculator.godzinyNaMinuty(3));
        Assertions.assertEquals("Liczba godzin musi byc wieksza od zera",Calculator.godzinyNaMinuty(-2));
        Assertions.assertEquals("30 min",Calculator.godzinyNaMinuty(0.5));
    }
    @Test
    void godzinyNaSekundyTest(){
        Assertions.assertEquals("3600 s",Calculator.godzinyNaSekundy(1));
        Assertions.assertEquals("Liczba godzin musi byc wieksza od zera",Calculator.godzinyNaMinuty(-2));
        Assertions.assertEquals("360 s",Calculator.godzinyNaMinuty(0.1));
    }
    @Test
    void predkoscWKmNaHTest(){
        Assertions.assertEquals("czas nie moze byc ujemny", Calculator.predkoscWKmNaH(10,-2));
        Assertions.assertEquals("odleglosc nie moze byc ujemna", Calculator.predkoscWKmNaH(-10,-2));
        Assertions.assertEquals("72km/h", Calculator.predkoscWKmNaH(2,1));
        Assertions.assertEquals("2.5km/h", Calculator.predkoscWKmNaH(5000,1800));
    }
    @Test
    void poleKola(){
        Assertions.assertEquals(28.274333882308138, Calculator.poleKola(3));
        Assertions.assertEquals(0, Calculator.poleKola(0));
        Assertions.assertEquals(-1, Calculator.poleKola(-3));
    }
    @Test
    void dzielniki(){
        int[] ans1 = {1,2,3,6,-1,-2,-3,-6};
        int[] ans2 = {1,3,9,27, -1,-3,-9,-27};
        int[] ans3 = {};
        Assertions.assertArrayEquals(ans1, Calculator.dzielniki(6));
        Assertions.assertArrayEquals(ans2, Calculator.dzielniki(-27));
        Assertions.assertArrayEquals(ans3, Calculator.dzielniki(6));
    }
    @Test
    void najwiekszaLiczbaTest(){
        double[] liczby = {1,4,12.56, 12.12, 3, -12,0};
        Assertions.assertEquals(12.56, Calculator.najwiekszaLiczba(liczby));
    }
    @Test
    void indexNajwiekszejLiczbyTest(){
        double[] liczby = {1,4,12.56, 12.12, 3, -12,0};
        Assertions.assertEquals(2, Calculator.indexNajwiekszejLiczby(liczby));
    }
    @Test
    void czyZawieraLiczbe(){
        double[] liczby = {1,4,12.56, 12.12, 3, -12,0};
        Assertions.assertTrue(Calculator.czyZawieraLiczbe(liczby,4));
        Assertions.assertFalse(Calculator.czyZawieraLiczbe(liczby,7));
    }
    @Test
    void czyEgzaminZdanyTest(){
        Assertions.assertFalse(Calculator.czyEgzaminZdany(6,10));
        Assertions.assertTrue(Calculator.czyEgzaminZdany(16,17));
        Assertions.assertTrue(Calculator.czyEgzaminZdany(601,1000));
    }
    @Test
    void zwrocNieparzysteTest(){
        int[] liczby = {1,6,7,12,3,5,7,10};
        int[] ans = {1,7,3,5};
        Assertions.assertArrayEquals(ans, Calculator.zwrocNieparzyste(liczby));
    }
    @Test
    void dlugoscLiczbyTest(){
        Assertions.assertEquals(4,Calculator.dlugoscLiczby(1743));
        Assertions.assertEquals(6,Calculator.dlugoscLiczby(-234324));
        Assertions.assertEquals(1,Calculator.dlugoscLiczby(0));
    }
    @Test
    void odwrocSlowoTest(){
        Assertions.assertEquals("1234554321", Calculator.odwrocSlowo("12345431"));
        Assertions.assertEquals("tset", Calculator.odwrocSlowo("test"));
        Assertions.assertEquals("imajcaps ez tset", Calculator.odwrocSlowo("test ze spacjami"));
    }
    @Test
    void rokNaDniTest(){
        Assertions.assertEquals(4018,Calculator.czasNaDni(2012,2021));
        Assertions.assertEquals(4018,Calculator.czasNaDni(2021,2012));
    }
    @Test
    void dniOdTest(){
//        Assertions.assertEquals(4018,Calculator.dniOd(2019, 4,4));
        //do edycji dla dnia w którym bedzie to zrobione
    }
    @Test
    void NWWTest(){
        Assertions.assertEquals(11,Calculator.NWW(11,11));
        Assertions.assertEquals(11,Calculator.NWW(1,11));
        Assertions.assertEquals(36,Calculator.NWW(12,36));
        Assertions.assertEquals(36,Calculator.NWW(36,12));
        Assertions.assertEquals(42,Calculator.NWW(14,21));
        Assertions.assertEquals(42,Calculator.NWW(21,14));
        Assertions.assertEquals(42,Calculator.NWW(6,7));
        Assertions.assertEquals(42,Calculator.NWW(7,6));
    }
    @Test
    void NWDTest(){
        Assertions.assertEquals(1, Calculator.NWD(121, 14));
        Assertions.assertEquals(11, Calculator.NWD(121, 11));
        Assertions.assertEquals(7, Calculator.NWD(14, 21));
        Assertions.assertEquals(7, Calculator.NWD(21, 14));
    }
    @Test
    void dwojkowyNaDziesietnyTest(){
        Assertions.assertEquals(9, Calculator.dwojkowyNaDziesietny("1001"));
        Assertions.assertEquals(31, Calculator.dwojkowyNaDziesietny("11111"));
        Assertions.assertEquals(0, Calculator.dwojkowyNaDziesietny("000000"));
        Assertions.assertEquals(64, Calculator.dwojkowyNaDziesietny("1000000"));
    }
    @Test
    void dziesietnyNaDwojkowyTest(){
        Assertions.assertEquals("1001", Calculator.dziesietnyNaDwojkowy(9));
        Assertions.assertEquals("11111", Calculator.dziesietnyNaDwojkowy(31));
        Assertions.assertEquals("000000", Calculator.dziesietnyNaDwojkowy(0));
        Assertions.assertEquals("1000000", Calculator.dziesietnyNaDwojkowy(64));
    }
    @Test
    void mRNATest(){
        Assertions.assertEquals("TAGGC",Calculator.mRNA("ATCG"));
        Assertions.assertEquals("TTATGCCGAGC",Calculator.mRNA("AATACGGCTCG"));
    }
    @Test
    void szyfrCezaraTest(){
        Assertions.assertEquals("Upkftuuftupxbxjbepnptd", Calculator.zakodujSzyfrCezara("Tojesttestowawiadomosc",1));
        Assertions.assertEquals("jjkkll", Calculator.zakodujSzyfrCezara("xxyyzz",12));
        Assertions.assertEquals("JjKkLl", Calculator.zakodujSzyfrCezara("XxYyZz",12));
    }
    @Test
    void odszyfrujCezaraTest(){
        Assertions.assertEquals("Tojesttestowawiadomosc", Calculator.odkodujSzyfrCezara("Upkftuuftupxbxjbepnptd",1));
        Assertions.assertEquals("xxyyzz", Calculator.odkodujSzyfrCezara("jjkkll",12));
        Assertions.assertEquals("XxYyZz", Calculator.odkodujSzyfrCezara("JjKkLl",12));
    }
    @Test
    void podciagTest(){
        Assertions.assertEquals("tojest", Calculator.podciag("tojesttestowawiadomosc", 0,6));
        Assertions.assertEquals("jesttestowawiad", Calculator.podciag("tojesttestowawiadomosc", 2,17));
        Assertions.assertEquals("blad indeksow", Calculator.podciag("tojesttestowawiadomosc", 12,6));
    }
    @Test
    void sredniaArytmetycznaTest(){
        int[] liczby = {1,2,5,4,3,4,2};
        int[] liczby2 = {1,-1,2,-2,4,-4};
        Assertions.assertEquals(7, Calculator.sredniaArytmetyczna(liczby));
        Assertions.assertEquals(0, Calculator.sredniaArytmetyczna(liczby2));
    }
    @Test
    void trojkaPitagorasaTest(){
        Assertions.assertTrue(Calculator.trojkaPitagorasa(4,5,6));
        Assertions.assertTrue(Calculator.trojkaPitagorasa(4,6,5));
        Assertions.assertTrue(Calculator.trojkaPitagorasa(6,5,4));
        Assertions.assertFalse(Calculator.trojkaPitagorasa(8,5,4));
    }
    @Test
    void czyAutomorficznaTest(){
        Assertions.assertTrue(Calculator.czyAutomorficzna(5));
        Assertions.assertTrue(Calculator.czyAutomorficzna(76));
        Assertions.assertTrue(Calculator.czyAutomorficzna(6));
        Assertions.assertFalse(Calculator.czyAutomorficzna(17));
        Assertions.assertFalse(Calculator.czyAutomorficzna(132));
    }
    @Test
    void sumaNajmniejszychLiczb(){
        int[] liczby1 = {1,5,4,3,5,6,43,3,3,5,6,67,7,6,4,3,6,6,4,3};//8,2,20,24
        Assertions.assertEquals(24, Calculator.sumaNNajmniejszychLiczb(liczby1, 8));
        Assertions.assertEquals(4, Calculator.sumaNNajmniejszychLiczb(liczby1, 2));
        Assertions.assertEquals(190, Calculator.sumaNNajmniejszychLiczb(liczby1, 40));
    }
    @Test
    void zamienNaSzesnastkowyTest(){
        Assertions.assertEquals("B6BF", Calculator.zamienNaSzesnastkowy(46783));
        Assertions.assertEquals("F", Calculator.zamienNaSzesnastkowy(15));
        Assertions.assertEquals("1BB", Calculator.zamienNaSzesnastkowy(443));
    }
    @Test
    void nastepnaLiczbaPierwszaTest(){
        Assertions.assertEquals(17, Calculator.najstepnaLiczbaPierwsza(13));
        Assertions.assertEquals(1033307, Calculator.najstepnaLiczbaPierwsza(103292));
    }
    @Test
    void liczbyHarshadaTest(){
        Assertions.assertTrue(Calculator.czyliczbaHarashada(300));
        Assertions.assertTrue(Calculator.czyliczbaHarashada(372));
        Assertions.assertTrue(Calculator.czyliczbaHarashada(288));
        Assertions.assertFalse(Calculator.czyliczbaHarashada(301));
        Assertions.assertFalse(Calculator.czyliczbaHarashada(319));
        Assertions.assertFalse(Calculator.czyliczbaHarashada(136));
    }
}
