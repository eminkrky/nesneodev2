public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano=0.0;
    private int girisyili=2023;
    private String bolumKodu="141";

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public double getGano() {
        return gano;
    }

    public Ogrenci(Ogrenci ogr) {
        this(ogr.ad,ogr.bolum,ogr.gano,ogr.bolumKodu,ogr.girisyili);
    }

    public Ogrenci() {
    }

    public Ogrenci(String ad,String bolum) {
        this.ad=ad;
        this.bolum=bolum;
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisYili) {
        if (girisYili<1000||girisYili>9999)
            throw new IllegalArgumentException("GirişYılı Geçersiz");
        if (gano<0||gano>4)
            throw new IllegalArgumentException("Gano Geçersiz");
        this.ad=ad;
        this.bolum=bolum;
        this.gano=gano;
        this.bolumKodu=bolumKodu;
        this.girisyili=girisYili;
    }

    public double harcHesapla(int dersSayici) {
        int dersUcreti=500;
        return dersUcreti*dersSayici;
    }

    public double harcHesapla(int dersSayici, double uzatilanYil) {
        int dersUcreti=500;
        return dersUcreti*dersSayici*uzatilanYil;
    }

    public String ogrenciNoOlustur() {
        int bolumKoduInt = Integer.parseInt(bolumKodu);
        return Integer.toString((girisyili * 1000000) + (bolumKoduInt * 1000) + 1);

    }


}
