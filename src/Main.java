import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tamu> fortamu = new ArrayList<>();
        List<Kamar> forkamar = new ArrayList<>();
        List<jenisKamar> forjeniskamar = new ArrayList<>();
//        Tamu tamu = new Tamu();
//        Kamar kamar = new Kamar();
//        jenisKamar kamarb = new jenisKamar();
        Resepsionis rsp = new Resepsionis();
        Layanan layan = new Layanan();


        do {
            int pilih,brp;
            System.out.println("\nPilih Menu  : ");
            System.out.println("1. Reservasi Mandiri (Online BOOKING)");
            System.out.println("2. Detail Reservasi");
            System.out.println("3. ke Resepsionis");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    layan.cetak();

                    System.out.print("\nBerapa Orang : ");
                    brp= scanner.nextInt();

                    for(int i=0; i<brp; i++) {
                        Tamu tamu = new Tamu();
                        Kamar kamar = new Kamar();
                        jenisKamar kamarb = new jenisKamar();


                        tamu.InputNama();
                        kamarb.Input();
                        System.out.println();

                        fortamu.add(tamu);
                        forjeniskamar.add(kamarb);
                        forkamar.add(kamar);

                        layan.KurangiTersedia();
                    }

                        layan.cetak();
                        System.out.println("\n\nSelamat! Kamu berhasil melakukan reservasi");
                        System.out.println("Berikut data data mu -----------");


                        for(int i=0;i<brp;i++) {
                            fortamu.get(i).cetak();
                            forjeniskamar.get(i).cetak();
                            System.out.println();
                        }
                    break;
                case 2:
                    if(fortamu.size() > 0) {
                        for(int i=0;i<fortamu.size();i++) {
                            System.out.println();
                            fortamu.get(i).cetak();
                            forjeniskamar.get(i).cetak();
                            forjeniskamar.get(i).time();
                            System.out.println();
                        }
                    }else if(rsp.getNama() != null) {
                        System.out.println();
                        rsp.cetak();
                        forjeniskamar.get(0).cetak();
                    }
                    break;
                case 3:
                    jenisKamar kamarbrsp = new jenisKamar();
                    Staff staff = new Staff();
                    staff.input();
                    kamarbrsp.Input();
                    System.out.println("\n\nSelamat! Kamu berhasil melakukan reservasi");
                    System.out.println("Berikut data data mu -----------");
                    staff.cetak();
                    kamarbrsp.cetak();
            }
        }while(true);
    }
}