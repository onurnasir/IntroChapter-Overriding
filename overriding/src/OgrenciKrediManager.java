public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double ttar){ //Burada BaseKrediManager'da bulunan operasyonu ezip öğrenciye özel kredi oranı sağlamış olduk.Burda önemli olarak foksiyon isminin(hesapla) aynı olması gerek ki main sayfasında array yapısı kızmasın.Üzerine yazılabilir işlemine overridable denir.
        /*Eğer ki referans BaseKrediManager class'ı bu class'taki gibi kesinlikle hiç bir class'tan ezmesin istiyorsak referans class olan BaseKrediManager'a
            public final double hesapla(double tutar) dememiz gerekmektedir.*/

        return ttar*1.10;
    }
}
