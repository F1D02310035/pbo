public  class MotorListrik  extends KendaraanListrik implements KonsumsiEnergi {
    
    public MotorListrik(String nama, double kapasitasBaterai, double dayaSaatini, double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatini, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian(){
        double waktuDasar = (kapasitasBaterai - dayaSaatIni) / kecepatanPengisian;
        return waktuDasar * 1.05;
    }

    @Override
    public double hitungEnergiDibutuhkan(){
        return kapasitasBaterai - dayaSaatIni;
    }
    
}
