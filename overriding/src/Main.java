public class Main {

    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        double sonuc = ogretmenKrediManager.hesapla(1000);
//        System.out.println(sonuc); //Yada direk aşağıdaki satırda olduğu gibide yazabilirdik.
        //System.out.println(ogretmenKrediManager.hesapla(1000)); //Yada aşağıdaki gibide yazılabilir.

        BaseKrediManager[] krediManagers=new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}
