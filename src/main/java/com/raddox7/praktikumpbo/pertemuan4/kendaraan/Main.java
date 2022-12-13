package com.raddox7.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        // Pembuatan object
        // Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        
        // Memamsukkan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kanan");
        mb.belok();
        
        kn.showInfo();
    }
}
