public class MyListTest {
    public static void test() {
        MyList<Integer> liste = new MyList<>(); // Integer tipinde bir MyList nesnesi oluşturur.
        System.out.println("Dizideki Eleman Sayısı : " + liste.size()); // Listenin eleman sayısını ekrana yazdırır.
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity()); // Listenin kapasitesini ekrana yazdırır.
        liste.add(10); // Liste sonuna 10 ekler.
        liste.add(20); // Liste sonuna 20 ekler.
        liste.add(30); // Liste sonuna 30 ekler.
        liste.add(40); // Liste sonuna 40 ekler.
        System.out.println("Dizideki Eleman Sayısı : " + liste.size()); // Listenin eleman sayısını ekrana yazdırır.
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity()); // Listenin kapasitesini ekrana yazdırır.
        liste.add(50); // Liste sonuna 50 ekler.
        liste.add(60); // Liste sonuna 60 ekler.
        liste.add(70); // Liste sonuna 70 ekler.
        liste.add(80); // Liste sonuna 80 ekler.
        liste.add(90); // Liste sonuna 90 ekler.
        liste.add(100); // Liste sonuna 100 ekler.
        liste.add(110); // Liste sonuna 110 ekler.
        System.out.println("Dizideki Eleman Sayısı : " + liste.size()); // Listenin eleman sayısını ekrana yazdırır.
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity()); // Listenin kapasitesini ekrana yazdırır.

        System.out.println("2. indisteki değer : " + liste.get(2)); // İndex 2'deki değeri ekrana yazdırır.
        liste.remove(2); // İndex 2'deki değeri listeden kaldırır.
        liste.add(40); // Liste sonuna 40 ekler.
        liste.set(0, 100); // İndex 0'deki değeri 100 olarak değiştirir.
        System.out.println("2. indisteki değer : " + liste.get(2)); // İndex 2'deki değeri ekrana yazdırır.
        System.out.println(liste.toString()); // Listenin string temsilini ekrana yazdırır.

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu")); // Listenin boş olup olmadığını kontrol eder ve sonucu ekrana yazdırır.
        liste.add(20); // Liste sonuna 20 ekler.
        liste.add(30); // Liste sonuna 30 ekler.
        liste.add(40); // Liste sonuna 40 ekler.
        liste.add(20); // Liste sonuna 20 ekler.
        liste.add(50); // Liste sonuna 50 ekler.
        liste.add(60); // Liste sonuna 60 ekler.
        liste.add(70); // Liste sonuna 70 ekler.

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu")); // Listenin boş olup olmadığını kontrol eder ve sonucu ekrana yazdırır.

        System.out.println("Indeks : " + liste.indexOf(20)); // 20 değerinin indeksini ekrana yazdırır.
        System.out.println("Indeks : " + liste.indexOf(100)); // 100 değerinin indeksini ekrana yazdırır.
        System.out.println("Indeks : " + liste.lastIndexOf(20)); // 20 değerinin son indeksini ekrana yazdırır.

        Object[] dizi = liste.toArray(); // Listenin bir dizisini alır.
        System.out.println("Object dizisinin ilk elemanı : " + dizi[0]); // Dizinin ilk elemanını ekrana yazdırır.

        MyList<Integer> altListem = liste.subList(0, 3); // Liste üzerinde belirli bir aralıkta alt bir liste oluşturur.
        System.out.println(altListem.toString()); // Alt listenin string temsilini ekrana yazdırır.

        System.out.println("Listemde 20 değeri : " + liste.contains(20)); // 20 değerinin listemizde olup olmadığını kontrol eder ve sonucu ekrana yazdırır.
        System.out.println("Listemde 120 değeri : " + liste.contains(120)); // 120 değerinin listemizde olup olmadığını kontrol eder ve sonucu ekrana yazdırır.

        liste.clear(); // Listeyi temizler.
        System.out.println(liste.toString()); // Listenin string temsilini ekrana yazdırır.
    }
}
