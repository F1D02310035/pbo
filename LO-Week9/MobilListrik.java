public class MobilListrik extends KendaraanListrik implements KonsumsiEnergi {

    public MobilListrik(String nama, double kapasitasBaterai, double dayaSaatini, double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatini, kecepatanPengisian);
    }
    
    @Override
    public double hitungWaktuPengisian(){
        double waktuDasar = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktuDasar * 1.1;
    }

    @Override
    public double hitungEnergiDibutuhkan(){
        return kapasitasBaterai - dayaSaatIni;
    }
}
