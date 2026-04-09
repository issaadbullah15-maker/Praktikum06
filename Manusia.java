package Kantor;

public class Manusia {
  private String namaLengkap;
  private boolean laki;
  private String nomorNik;
  private boolean statusMenikah;

  public Manusia() {}

  public Manusia(String nama, boolean jk, String nik, boolean menikah) {
    this.namaLengkap = nama;
    this.laki = jk;
    this.nomorNik = nik;
    this.statusMenikah = menikah;
  }

  public String getNama() {
    return namaLengkap;
  }

  public boolean getJenisKelamin() {
    return laki;
  }

  public String getNik() {
    return nomorNik;
  }

  public boolean getStatusMenikah() {
    return statusMenikah;
  }

  public double getTunjangan() {
    double hasil = 0;
    if (statusMenikah) {
      if (laki) hasil = 25.0;
      else hasil = 20.0;
    } else {
      hasil = 15.0;
    }
    return hasil;
  }

  public double getPendapatan() {
    return this.getTunjangan();
  }

  public String toString() {
    String jk = laki ? "Laki-laki" : "Perempuan";
    return "Nama: " + namaLengkap +
           "\nNIK: " + nomorNik +
           "\nJenis Kelamin: " + jk +
           "\nPendapatan: $" + String.format("%.2f", getPendapatan());
  }
}