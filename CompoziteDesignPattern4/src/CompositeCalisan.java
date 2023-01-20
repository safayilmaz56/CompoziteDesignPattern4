import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends Calisan{

    private List<Calisan> calisanList;

    public CompositeCalisan(String ad, enPozisyon pozisyon) {
        super(ad, pozisyon);
        calisanList = new ArrayList<>();
    }

    public void calisanEkle(Calisan calisan){
        calisanList.add(calisan);
    }
    public void calisanSil(Calisan calisan){
        calisanList.remove(calisan);
    }

    @Override
    public void goster() {
        System.out.println(super.pozisyon + " " + super.ad);
        for (Calisan calisan : calisanList){
            calisan.goster();
        }
    }
}
