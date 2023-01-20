public enum enPozisyon {
    GenelMudur(1),
    Mudur(2),
    DepertmanSorumlusu(3),
    Isci(4);

private int enPozisyon;
    enPozisyon(int i) {
        this.enPozisyon = i;
    }
    public int getPozisyon(){
        return enPozisyon;
    }
}
