package View;

import Model.Penyewaan;

//[SRP] satu tanggung jawab: format tampilan struk sewa.
public interface  StrukView {
        void cetak(Penyewaan p);
}
