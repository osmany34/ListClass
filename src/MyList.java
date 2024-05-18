public class MyList<T> {
    private DynamicArray<T> array; // Dinamik diziyi depolamak için kullanılan özel bir sınıf olan DynamicArray nesnesi.

    public MyList() {
        this(DynamicArray.DEFAULT_CAPACITY); // Varsayılan kapasiteyle bir MyList nesnesi oluşturur.
    }

    public MyList(int capacity) {
        array = new DynamicArray<>(capacity); // Belirtilen kapasiteyle bir MyList nesnesi oluşturur.
    }

    public int size() {
        return array.size(); // Listenin mevcut boyutunu döndürür.
    }

    public int getCapacity() {
        return array.getCapacity(); // Listenin kapasitesini döndürür.
    }

    public void add(T data) {
        array.add(data); // Listenin sonuna yeni bir öğe ekler.
    }

    public T get(int index) {
        return array.get(index); // Belirtilen dizindeki öğeyi döndürür.
    }

    public T remove(int index) {
        return array.remove(index); // Belirtilen dizindeki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
    }

    public T set(int index, T data) {
        return array.set(index, data); // Belirtilen dizindeki öğeyi verilen yeni öğeyle değiştirir ve değiştirilen öğeyi döndürür.
    }

    public String toString() {
        return array.toString(); // Listenin string değerini döndürür.
    }

    public int indexOf(T data) {
        return array.indexOf(data); // Belirtilen öğenin dizindeki ilk indeksini döndürür.
    }

    public int lastIndexOf(T data) {
        return array.lastIndexOf(data); // Belirtilen öğenin dizindeki son indeksini döndürür.
    }

    public boolean isEmpty() {
        return array.isEmpty(); // Listenin boş olup olmadığını kontrol eder.
    }

    public T[] toArray() {
        return array.toArray(); // Listenin bir dizisini döndürür.
    }

    public void clear() {
        array.clear(); // Listeyi temizler.
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subList = new MyList<>(finish - start); // Belirtilen aralıktaki alt listeyi oluşturur.
        for (int i = start; i < finish; i++) {
            subList.add(array.get(i)); // Alt liste için elemanları ekler.
        }
        return subList; // Alt listeyi döndürür.
    }

    public boolean contains(T data) {
        return array.contains(data); // Listenin belirli bir öğeyi içerip içermediğini kontrol eder.
    }
}
