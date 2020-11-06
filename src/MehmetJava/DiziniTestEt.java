package MehmetJava;


public class DiziniTestEt {
    public static void main(String[] args) {
        DinamikDizi dinamikDizi=new DinamikDizi() {

        };


        for (Integer n:dinamikDizi){
          System.out.println(n);
      }
        dinamikDizi.ekle(19);
        dinamikDizi.ekle(79);
        dinamikDizi.ekle(149);  dinamikDizi.ekle(19);
        dinamikDizi.ekle(79);
        dinamikDizi.ekle(149);

        dinamikDizi.ekle(19);
        dinamikDizi.ekle(79);
        dinamikDizi.ekle(149);  dinamikDizi.ekle(19);
        dinamikDizi.ekle(79);
        dinamikDizi.ekle(149);
        for (int i=0;i< dinamikDizi.getUzunluk();i++) System.out.println(dinamikDizi.getDizi()[i]);
        dinamikDizi.sil(19);
        for (int i=0;i< dinamikDizi.getUzunluk();i++) System.out.println(dinamikDizi.getDizi()[i]);

        System.out.println(dinamikDizi.getKapasite());
        System.out.println(dinamikDizi.getUzunluk());
        System.out.println(dinamikDizi.getDizi());
    }


}
