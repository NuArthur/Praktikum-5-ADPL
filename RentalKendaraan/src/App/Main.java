package App;

// import model.Kendaraan;
import Controller.RentalController;
import Model.Mobil;
import Model.Motor;
import Model.PenyewaanRepository;
import Model.PenyewaanRepositoryArrayList;
import View.RentalView;
import View.RentalViewCli;
import View.StrukView;
import View.StrukViewCli;
import Model.KendaraanFactory;
import Model.KendaraanFactoryDefault;
import Model.KendaraanRepository;
import Model.KendaraanRepositoryArrayList;


public class Main {
        public static void main(String[] args) {
                KendaraanRepository kendaraanRepository = new KendaraanRepositoryArrayList();
                PenyewaanRepository penyewaanRepository = new PenyewaanRepositoryArrayList();
                KendaraanFactory kendaraanFactory = new KendaraanFactoryDefault();
                RentalView view = new RentalViewCli();
                StrukView strukView = new StrukViewCli();
                RentalController controller = new RentalController(kendaraanRepository, penyewaanRepository, view, strukView, kendaraanFactory);

                // Data awal/dummy data
                controller.tambahDataAwal(new Mobil(
                                "TY 1986 TP",
                                "Toyota AE86",
                                350000));
                controller.tambahDataAwal(new Mobil(
                                "DR 2014 TS",
                                "Toyota NSX",
                                300000));
                controller.tambahDataAwal(new Motor(
                                "MT 2026 SO",
                                "Honda XL750 Transalp",
                                75000));
                controller.jalankan();
        }
}
