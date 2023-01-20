public class Main {
    public static void main(String[] args) {
        CompositeCalisan genelMudur = new CompositeCalisan("Ali",enPozisyon.GenelMudur);
        CompositeCalisan mudur = new CompositeCalisan("Ahmet",enPozisyon.Mudur);

        genelMudur.calisanEkle(mudur);
        mudur.calisanEkle(new LeafCalisan("Mehmet",enPozisyon.Isci));
        mudur.calisanEkle(new LeafCalisan("Ayşe",enPozisyon.Isci));

        genelMudur.goster();
        System.out.println("----------");
        mudur.goster();
        


    }
}