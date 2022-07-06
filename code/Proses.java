import java.util.Scanner;

public class Proses {
	Buah buah = new Buah();
	Sayur sayur = new Sayur();
	Gudang gudang = new Gudang();
	Pengiriman kirim = new Pengiriman();
	Scanner input = new Scanner(System.in);
	int kapasitas=0;
	
	public void dataBuah() {
        buah.tambahData("101", "Pisang", 100, "02-02-2022");
        buah.tambahData("102", "Apel", 100, "02-02-2022");
        buah.tambahData("103", "Alpukat", 100, "02-02-2022");
        buah.tambahData("104", "Nanas", 100, "02-02-2022");
        buah.tambahData("105", "Durian", 100, "02-02-2022");
	}
//========================================================================================
	public void dataSayur() {
        sayur.tambahData("201", "Kol", 100, "02-02-2022");
        sayur.tambahData("202", "Wortel", 100, "02-02-2022");
        sayur.tambahData("203", "Kentang", 100, "02-02-2022");
        sayur.tambahData("204", "Daun Sereh", 100, "02-02-2022");
        sayur.tambahData("205", "Bawang", 100, "02-02-2022");
	}
//========================================================================================
	public void tambahBuah(String id) {
			System.out.println("Masukkan ID Buah : "+id);
			
			System.out.print("Masukan Nama Buah : ");
			String NamaBuah = input.nextLine();
			
			System.out.print("Masukkan Jumlah Buah : ");
			int JumlahBuah = Integer.parseInt(input.nextLine());
			
			System.out.print("Masukkan Tanggal Expired : ");
			String ExpiredBuah = input.nextLine();
			
			buah.tambahData(id, NamaBuah, JumlahBuah, ExpiredBuah);
			gudang.tambahDataBuah(id, NamaBuah, JumlahBuah, ExpiredBuah);
			gudang.showArrayBuah();
			
	}
	public void cariBuah() {
		System.out.println("Mencari Ketersedian Barang");
		System.out.print("Masukkan ID Barang : ");
		String IDBarang = input.nextLine();
		buah.cariData(IDBarang);
	}
	public void reportStokBuah() {
		buah.showArray();
	}
//========================================================================================
	public void tambahSayur(String id) {
		System.out.println("Masukkan ID Sayur : "+id);
		
		System.out.print("Masukan Nama Sayur : ");
		String NamaSayur = input.nextLine();
		
		System.out.print("Masukkan Jumlah Sayur : ");
		int JumlahSayur = Integer.parseInt(input.nextLine());
		
		System.out.print("Masukkan Tanggal Expired : ");
		String ExpiredSayur = input.nextLine();
		
		sayur.tambahData(id, NamaSayur, JumlahSayur, ExpiredSayur);
		gudang.tambahDataSayur(id, NamaSayur, JumlahSayur, ExpiredSayur);
		gudang.showArraySayur();
	
	}
	public void cariSayur() {
		System.out.println("Mencari Ketersedian Barang");
		System.out.print("Masukkan ID Barang : ");
		String IDBarang = input.nextLine();
		sayur.cariData(IDBarang);
	}
	public void reportStokSayur() {
		sayur.showArray();
	}
//========================================================================================
	public void riwayatMasuk() {
		gudang.showArraySayur();
		gudang.showArrayBuah();
	}
//========================================================================================
	public void pengirimanSayur(String id) {
		System.out.println("Pengiriman Sayur Dari Gudang");
		System.out.println("Masukkan ID Pengiriman : "+id);
		System.out.print("Masukkan ID Sayur : ");
		String ID = input.nextLine();
		System.out.print("Masukkan Jumlah Sayur : ");
		int Jumlah = Integer.parseInt(input.nextLine());
		int jumlah = sayur.kirimSayur(ID, Jumlah);
		kirim.pengiriman(id, ID, jumlah);	
	}
	public void pengirimanBuah(String id) {
		System.out.println("Pengiriman Buah Dari Gudang");
		System.out.println("Masukkan ID Pengiriman : "+id);
		System.out.print("Masukkan ID Buah : ");
		String ID = input.nextLine();
		System.out.print("Masukkan Jumlah Buah : ");
		int Jumlah = Integer.parseInt(input.nextLine());
		int jumlah = buah.kirimBuah(ID, Jumlah);
		kirim.pengiriman(id, ID, jumlah);	
	}
	public void cariIdPengiriman() {
		System.out.println("Mencari ID Pengiriman");
		System.out.print("Masukkan ID Pengiriman : ");
		String IDBarang = input.nextLine();
		kirim.cariData(IDBarang);
	}
//========================================================================================	

}
