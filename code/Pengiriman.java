import java.util.*;
public class Pengiriman implements Toko{

	ArrayList<String>IdPengiriman = new ArrayList<String>();
	ArrayList<String>IdBarang = new ArrayList<String>();
	ArrayList<Integer>JumlahBarang = new ArrayList<Integer>();
	
	
	public void pengiriman(String ID, String Idbarang, int JumlahBarang) {
		this.IdPengiriman.add(ID);
		this.IdBarang.add(Idbarang);
		this.JumlahBarang.add(JumlahBarang);
		
	}
public void cariData(String Idbarang) {
		// TODO Auto-generated method stub
		boolean cari = false;
		for(int i=0;i<IdPengiriman.size();i++) {
			if(IdPengiriman.get(i).equals(Idbarang)) {
				cari = true;
				System.out.println("\n==================================");
				System.out.println("Status Barang : "+Toko.Kirim);
				System.out.println("ID Pengiriman = "+IdPengiriman.get(i));
				System.out.println("ID Barang = "+IdBarang.get(i));
				System.out.println("Jumlah Barang = "+JumlahBarang.get(i));
				System.out.println("==================================\n");
			}
		}
		if(cari == false) {
			System.out.println("Data Tidak Ditemukan");
		}
}
public void showArray() {
	for(int i=0;i<IdPengiriman.size();i++) {
		System.out.println("\n==================================");
		System.out.println("Status Barang : "+Toko.pesan);
		System.out.println("ID Pengiriman = "+IdPengiriman.get(i));
		System.out.println("ID Barang = "+IdBarang.get(i));
		System.out.println("Jumlah Barang = "+JumlahBarang.get(i));
		System.out.println("==================================\n");
	}
}
	
}
