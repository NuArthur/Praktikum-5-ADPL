package Model;

import java.util.List;

public interface KendaraanRepository {
        void tambah(Kendaraan kendaraan);

        List<Kendaraan> semua();

        Kendaraan cariByPlat(String platnomor);
}
// [SRP] satu-satunya tanggung jawab: menyimpan & mencari kendaraan di ArrayList
// Jika nanti penyimpanan data diganti, maka cukup class ini saja yang diganti.
