import java.util.Arrays;

public class DynamicArray<T> {
    static final int DEFAULT_CAPACITY = 10; // Varsayılan kapasite değeri.
    private T[] array; // Generic bir dizi.
    private int size; // Dizideki mevcut öğe sayısı.

    public DynamicArray(int capacity) {
        array = (T[]) new Object[capacity]; // Belirtilen kapasiteye sahip bir dizi oluşturur.
        size = 0; // Başlangıçta dizi boş olduğu için boyutu sıfır yapar.
    }

    public int size() {
        return size; // Dizideki mevcut öğe sayısını döndürür.
    }

    public int getCapacity() {
        return array.length; // Dizinin toplam kapasitesini döndürür.
    }

    public void add(T data) {
        if (size == array.length) { // Eğer dizi dolu ise...
            resizeArray(); // Diziyi yeniden boyutlandırır.
        }
        array[size++] = data; // Yeni öğeyi diziye ekler.
    }

    public T get(int index) {
        if (index >= 0 && index < size) { // Geçerli bir dizin değeri ise...
            return array[index]; // Belirtilen dizindeki öğeyi döndürür.
        }
        return null; // Geçersiz dizin indeksi ise null döndürür.
    }

    public T remove(int index) {
        if (index >= 0 && index < size) { // Geçerli bir dizin değeri ise...
            T removedElement = array[index]; // Kaldırılan öğeyi saklar.
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1]; // Kaldırılan öğeden sonraki öğeleri bir sola kaydırır.
            }
            array[--size] = null; // Son öğeyi null yaparak kaldırır.
            return removedElement; // Kaldırılan öğeyi döndürür.
        }
        return null; // Geçersiz dizin indeksi ise null döndürür.
    }

    public T set(int index, T data) {
        if (index >= 0 && index < size) { // Geçerli bir dizin değeri ise...
            T oldValue = array[index]; // Eski değeri saklar.
            array[index] = data; // Belirtilen dizindeki öğeyi değiştirir.
            return oldValue; // Eski değeri döndürür.
        }
        return null; // Geçersiz dizin indeksi ise null döndürür.
    }

    public String toString() {
        if (size == 0) {
            return "[]"; // Dizi boşsa boş bir string döndürür.
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString(); // Dizinin string değerini döndürür.
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) { // Belirtilen öğe bulunduğunda indeksi döndürür.
                return i;
            }
        }
        return -1; // Öğe bulunamazsa -1 döndürür.
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) { // Belirtilen öğenin son indeksini döndürür.
                return i;
            }
        }
        return -1; // Öğe bulunamazsa -1 döndürür.
    }

    public boolean isEmpty() {
        return size == 0; // Dizi boşsa true, değilse false döndürür.
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size); // Diziyi belirtilen boyutta bir kopyası olarak döndürür.
    }

    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY]; // Diziyi varsayılan boyutta boş bir diziyle temizler.
        size = 0; // Öğe sayısını sıfırlar.
    }

    private void resizeArray() {
        array = Arrays.copyOf(array, array.length * 2); // Diziyi iki katına genişletir.
    }

    public boolean contains(T data) {
        return indexOf(data) != -1; // Öğe dizide bulunuyorsa true, değilse false döndürür.
    }
}

