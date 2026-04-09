package Kantor;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
  private double gajiDasar;
  private LocalDate masukKerja;
  private int anak;

  public Pekerja() {}

  public Pekerja(String nama, boolean jk, String nik, boolean menikah,
                 double gaji, LocalDate masuk, int jumlahAnak) {
    super(nama, jk, nik, menikah);
    this.gajiDasar = gaji;
    this.masukKerja = masuk;
    this.anak = jumlahAnak;
  }

  public double getGajiPokok() {
    return gajiDasar;
  }

  public int hitungLamaKerja() {
    if (masukKerja == null) return 0;
    int lama = Period.between(masukKerja, LocalDate.now()).getYears();
    return (lama < 0) ? 0 : lama;
  }

  public double getBonus() {
    int lama = hitungLamaKerja();

    if (lama <= 5) return gajiDasar * 0.05;
    else if (lama <= 10) return gajiDasar * 0.10;
    else return gajiDasar * 0.15;
  }

  public double getGaji() {
    return gajiDasar + getBonus();
  }

  public double getTunjangan() {
    return super.getTunjangan() + (anak * 20.0);
  }

  public double getPendapatan() {
    return getGaji() + getTunjangan();
  }

  public String toString() {
    return super.toString() +
           "\nTahun Masuk: " + masukKerja +
           "\nJumlah Anak: " + anak +
           "\nGaji: $" + String.format("%.2f", getGaji());
  }
}