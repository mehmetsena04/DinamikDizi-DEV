package MehmetJava;

import java.util.Iterator;

abstract class DinamikDizi implements Iterable<Integer> {
    private int[] dizi = null;
    private int kapasite = 5;
    private int uzunluk = 0;
    private int index = 0;

    public DinamikDizi() {
        dizi = new int[kapasite];

    }

    public DinamikDizi(int kap) {
        kapasite = kap;
        dizi = new int[kapasite];
    }

    public void ekle(int veri) {
        dizi[index] = veri;
        uzunluk++;
        if (iterator().hasNext()) {
            index++;
        } else {
            kapasite = 2 * kapasite;
        }
    }

    public void ekle(int veri, int n) {
        dizi[n] = veri;
        uzunluk++;
    }

    public void sil() {
        dizi[dizi.length] = Integer.parseInt(null);
        kapasite--;
    }

    public void sil(int veri) {
        veri = Integer.parseInt(null);
        kapasite--;
    }

    public void silindex(int index) {
        index = Integer.parseInt(null);
        kapasite--;
    }

    public int getKapasite() {
        return kapasite;
    }

    public int getUzunluk() {
        return dizi.length;
    }

    public int[] getDizi() {
        return dizi;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < uzunluk;

            }

            @Override
            public Integer next() {
                return index++;
            }
        };
    }
}
