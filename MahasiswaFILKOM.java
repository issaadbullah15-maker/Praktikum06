package Kantor;

public class MahasiswaFILKOM extends Manusia {
  private String nomorInduk;
  private double nilaiIpk;

  public MahasiswaFILKOM() {}

  public MahasiswaFILKOM(String nama, boolean jk, String nik, boolean menikah,
                         String nim, double ipk) {
    super(nama, jk, nik, menikah);
    this.nomorInduk = nim;
    this.nilaiIpk = ipk;
  }

  public String getNim() {
    return nomorInduk;
  }

  public double getIpk() {
    return nilaiIpk;
  }

  public String getStatus() {
    if (nomorInduk == null || nomorInduk.length() < 7) {
      return "Status tidak valid";
    }

    int angkatan = 2000 + Integer.parseInt(nomorInduk.substring(0, 2));
    char kode = nomorInduk.charAt(6);
    String jurusan;

    if (kode == '2') jurusan = "Teknik Informatika";
    else if (kode == '3') jurusan = "Teknik Komputer";
    else if (kode == '4') jurusan = "Sistem Informasi";
    else if (kode == '6') jurusan = "Pendidikan Teknologi Informasi";
    else if (kode == '7') jurusan = "Teknologi Informasi";
    else jurusan = "Prodi tidak diketahui";

    return jurusan + ", " + angkatan;
  }

  public double getBeasiswa() {
    double bea = 0;
    if (nilaiIpk >= 3.0 && nilaiIpk < 3.5) bea = 50;
    else if (nilaiIpk >= 3.5) bea = 75;
    return bea;
  }

  public double getPendapatan() {
    return super.getPendapatan() + getBeasiswa();
  }

  public String toString() {
    return super.toString() +
           "\nNIM: " + nomorInduk +
           "\nIPK: " + String.format("%.2f", nilaiIpk) +
           "\nStatus: " + getStatus();
  }
}