import java.util.*;
public class Gudang{
	ArrayList<String> idsayur = new ArrayList<String>();
    ArrayList<String> namasayur = new ArrayList<String>();
    ArrayList<Integer> jumlahsayur = new ArrayList<Integer>();
    ArrayList<String> expiredsayur = new ArrayList<String>();
    ArrayList<String> idBuah = new ArrayList<String>();
    ArrayList<String> namaBuah = new ArrayList<String>();
    ArrayList<Integer> jumlahBuah = new ArrayList<Integer>();
    ArrayList<String> expiredBuah = new ArrayList<String>();
    
//===========================================================================================================
// Untuk menambah data Sayuran

	public void tambahDataSayur(String IdBarang, String NamaBarang, int JumlahBarang, String ExpiredBarang) {
		// TODO Auto-generated method stub
		this.idsayur.add(IdBarang);
		this.namasayur.add(NamaBarang);
		this.jumlahsayur.add(JumlahBarang);
		this.expiredsayur.add(ExpiredBarang);
	}

	public void showArraySayur() {
		for(int i=0;i<idsayur.size();i++) {
			System.out.println("\n==================================");
			System.out.println("====JUMLAH SAYUR MASUK GUDANG====");
			System.out.println("==================================");
			System.out.println("ID sayur = "+idsayur.get(i));
			System.out.println("Nama sayur = "+namasayur.get(i));
			System.out.println("Jumlah sayur = "+jumlahsayur.get(i));
			System.out.println("Tanggal Expired sayur = "+expiredsayur.get(i));
			System.out.println("==================================\n");
		}	
	}
//===============================================================================================================
// Untuk menambah data buah

	public void tambahDataBuah(String IdBarang, String NamaBarang, int JumlahBarang, String ExpiredBarang) {
		// TODO Auto-generated method stub
		this.idBuah.add(IdBarang);
		this.namaBuah.add(NamaBarang);
		this.jumlahBuah.add(JumlahBarang);
		this.expiredBuah.add(ExpiredBarang);
	}

	public void showArrayBuah() {
	for(int i=0;i<idBuah.size();i++) {
		System.out.println("\n==================================");
		System.out.println("====JUMLAH BUAH MASUK GUDANG====");
		System.out.println("==================================");
		System.out.println("ID Buah = "+idBuah.get(i));
		System.out.println("Nama Buah = "+namaBuah.get(i));
		System.out.println("Jumlah Buah = "+jumlahBuah.get(i));
		System.out.println("Tanggal Expired Buah = "+expiredBuah.get(i));
		System.out.println("==================================\n");
	}
	}
}
	
