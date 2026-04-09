package Kantor;

import java.time.LocalDate;

public class MainKantor {
  public static void main(String[] args) {

    System.out.println("===== 1. Manusia =====");

    Manusia m1 = new Manusia("Tama", true, "3501010101010001", true);
    Manusia m2 = new Manusia("Mamoy", false, "3501010101010002", true);
    Manusia m3 = new Manusia("Gondrong", true, "3501010101010003", false);

    System.out.println("\na. Laki-laki telah menikah");
    System.out.println(m1.toString());

    System.out.println("\nb. Perempuan telah menikah");
    System.out.println(m2.toString());

    System.out.println("\nc. Belum menikah");
    System.out.println(m3.toString());


    System.out.println("\n===== 2. Mahasiswa FILKOM =====");

    String contohNim = "225150400111111";

    MahasiswaFILKOM a = new MahasiswaFILKOM("Hardi", true, "3501010101011001", false, contohNim, 2.80);
    MahasiswaFILKOM b = new MahasiswaFILKOM("Kahfi", true, "3501010101011002", false, contohNim, 3.20);
    MahasiswaFILKOM c = new MahasiswaFILKOM("Nares", true, "3501010101011003", false, contohNim, 3.80);

    System.out.println("\na. IPK < 3");
    System.out.println(a);

    System.out.println("\nb. IPK 3 - 3.5");
    System.out.println(b);

    System.out.println("\nc. IPK 3.5 - 4");
    System.out.println(c);


    System.out.println("\n===== 3. Pekerja =====");

    Pekerja p1 = new Pekerja("Rico", true, "3501010101012001",
            true, 3000, LocalDate.now().minusYears(2), 2);

    Pekerja p2 = new Pekerja("Nahar", false, "3501010101012002",
            true, 3000, LocalDate.now().minusYears(9), 0);

    Pekerja p3 = new Pekerja("Raka", true, "3501010101012003",
            true, 3000, LocalDate.now().minusYears(20), 10);

    System.out.println("\na. Lama bekerja 2 tahun, anak 2");
    System.out.println(p1);

    System.out.println("\nb. Lama bekerja 9 tahun");
    System.out.println(p2);

    System.out.println("\nc. Lama bekerja 20 tahun, anak 10");
    System.out.println(p3);


    System.out.println("\n===== 4. Manager =====");

    Manager mgr = new Manager("Issa", false, "3501010101013001",
            true, 7500, LocalDate.now().minusYears(15), 0, "Human Resource");

    System.out.println("Manager, lama bekerja 15 tahun dengan gaji $7500");
    System.out.println(mgr);
  }
}