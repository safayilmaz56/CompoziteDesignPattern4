public class LeafCalisan extends Calisan{

    public LeafCalisan(String ad, enPozisyon pozisyon) {
        super(ad, pozisyon);
    }

    @Override
    public void goster() {
        System.out.println(super.pozisyon + " " + super.ad);
    }
}
