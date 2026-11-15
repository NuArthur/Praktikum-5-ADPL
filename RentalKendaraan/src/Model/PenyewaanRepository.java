package Model;

import java.util.List;

public interface PenyewaanRepository {
        String buatIdBaru();

        void tambah(Penyewaan penyewaan);

        List<Penyewaan> semua();

        Penyewaan cariAktifByPlat(String platNomor);
}

// [SRP] satu-satunya tanggung jawab: menyimpan & mencari data Penyewaan di
// ArrayList.
