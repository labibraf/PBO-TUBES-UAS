import java.util.*; 

public class Sayur extends Barang {
    ArrayList<String> idSayur = new ArrayList<String>();
    ArrayList<String> namaSayur = new ArrayList<String>();
    ArrayList<Integer> jumlahSayur = new ArrayList<Integer>();
    ArrayList<String> expiredSayur = new ArrayList<String>();
    
	@Override
	public void tambahData(String IdBarang, String NamaBarang, int JumlahBarang, String ExpiredBarang) {
		// TODO Auto-generated method stub
		this.idSayur.add(IdBarang);
		this.namaSayur.add(NamaBarang);
		this.jumlahSayur.add(JumlahBarang);
		this.expiredSayur.add(ExpiredBarang);
	}

	public void cariData(String IdBarang) {
		// TODO Auto-generated method stub
		boolean cari = false;
		for(int i=0;i<idSayur.size();i++) {
			if(idSayur.get(i).equals(IdBarang)) {
				cari = true;
				System.out.println("\n==================================");
				System.out.println("=======SISA Sayur DI GUDANG=======");
				System.out.println("ID Sayur = "+idSayur.get(i));
				System.out.println("Nama Sayur = "+namaSayur.get(i));
				System.out.println("Jumlah Sayur = "+jumlahSayur.get(i));
				System.out.println("Tanggal Expired Sayur = "+expiredSayur.get(i));
				System.out.println("==================================\n");
			}
		}
		if(cari == false) {
			System.out.println("Data Tidak Ditemukan");
		}
}
	public void showArray() {
		for(int i=0;i<idSayur.size();i++) {
			System.out.println("\n==================================");
			System.out.println("ID Sayur = "+idSayur.get(i));
			System.out.println("Nama Sayur = "+namaSayur.get(i));
			System.out.println("Jumlah Sayur = "+jumlahSayur.get(i));
			System.out.println("Tanggal Expired Sayur = "+expiredSayur.get(i));
			System.out.println("==================================\n");
		}
	}
	public int kirimSayur(String id, int jumlah) {
		boolean cekbarang = false;
		try {
		for(int i=0;i<idSayur.size();i++){
			if(idSayur.get(i).equals(id)) {
				if(jumlahSayur.get(i)>jumlah){
					jumlahSayur.set(i,jumlahSayur.get(i)-jumlah);
				}
				else if(jumlahSayur.get(i)==jumlah){
                    jumlah = jumlahSayur.get(i);
					idSayur.remove(i);
					namaSayur.remove(i);
					jumlahSayur.remove(i);
					expiredSayur.remove(i);
				}
				else if(jumlahSayur.get(i)<jumlah){
					int defisit = jumlah-jumlahSayur.get(i);
                    jumlah = jumlahSayur.get(i);
					idSayur.remove(i);
					namaSayur.remove(i);
					jumlahSayur.remove(i);
					expiredSayur.remove(i);
					System.out.println("Pengiriman Sayur mengalami defisit Sayur sebanyak "+defisit);
				}
			
			cekbarang=true;

			System.out.println("\n++ UNTUK UPDATE BARANG CEK DI GUDANG ++\n");
			
			}
		}
        if(cekbarang == false){
            System.out.println("Barang tidak ditemukan!");
        }
		}catch(Exception e) {
			System.out.println(e.getMessage());
	        System.out.println("Error");
		}
        return jumlah;
	}
}
