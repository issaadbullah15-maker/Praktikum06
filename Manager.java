package Kantor;

import java.time.LocalDate;

public class Manager extends Pekerja {
  private String bagian;

  public Manager() {}

  public Manager(String nama, boolean jk, String nik, boolean menikah,
                 double gaji, LocalDate masuk, int anak, String dept) {
    super(nama, jk, nik, menikah, gaji, masuk, anak);
    this.bagian = dept;
  }

  public String getDepartemen() {
    return bagian;
  }

  public double getTunjangan() {
    double tambahan = 0.10 * getGajiPokok();
    return super.getTunjangan() + tambahan;
  }

  public String toString() {
    return super.toString() +
           "\nDepartemen: " + bagian;
  }
}