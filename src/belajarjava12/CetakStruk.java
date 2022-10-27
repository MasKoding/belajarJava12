package belajarjava12;

public class CetakStruk {
    private String namaProduk,harga,kuantitas,total,
            pembayaran;

    public CetakStruk(String namaProduk, String harga, String kuantitas, String total, String pembayaran) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.kuantitas = kuantitas;
        this.total = total;
        this.pembayaran = pembayaran;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(String kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    @Override
    public String toString() {
        return "CetakStruk \n" 
                + "namaProduk=" 
                + namaProduk + "\n"
                + " harga=" + harga +
                "\n kuantitas=" + kuantitas + ", \n"
                + "total=" + total + ", \n"
                + "pembayaran=" + pembayaran ;
    }
    
    
    
}
