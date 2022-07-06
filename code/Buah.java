import java.util.*; 

public class Buah extends Barang {
    ArrayList<String> idBuah = new ArrayList<String>();
    ArrayList<String> namaBuah = new ArrayList<String>();
    ArrayList<Integer> jumlahBuah = new ArrayList<Integer>();
    ArrayList<String> expiredBuah = new ArrayList<String>();
    
	@Override
	public void tambahData(String IdBarang, String NamaBarang, int JumlahBarang, String ExpiredBarang) {
		// TODO Auto-generated method stub
		this.idBuah.add(IdBarang);
		this.namaBuah.add(NamaBarang);
		this.jumlahBuah.add(JumlahBarang);
		this.expiredBuah.add(ExpiredBarang);
	}
    
	public void cariData(String IdBarang) {
		// TODO Auto-generated method stub
		boolean cari = false;
		for(int i=0;i<idBuah.size();i++) {
			if(idBuah.get(i).equals(IdBarang)) {
				cari = true;
				System.out.println("\n==================================");
				System.out.println("=======SISA BUAH DI GUDANG========");
				System.out.println("ID Buah = "+idBuah.get(i));
				System.out.println("Nama Buah = "+namaBuah.get(i));
				System.out.println("Jumlah Buah = "+jumlahBuah.get(i));
				System.out.println("Tanggal Expired Buah = "+expiredBuah.get(i));
				System.out.println("==================================\n");
			}
		}
		if(cari == false) {
			System.out.println("Data Tidak Ditemukan");
		}
}
	public void showArray() {
	for(int i=0;i<idBuah.size();i++) {
		System.out.println("\n==================================");
		System.out.println("ID Buah = "+idBuah.get(i));
		System.out.println("Nama Buah = "+namaBuah.get(i));
		System.out.println("Jumlah Buah = "+jumlahBuah.get(i));
		System.out.println("Tanggal Expired Buah = "+expiredBuah.get(i));
		System.out.println("==================================\n");
	}
}
	public int kirimBuah(String id, int jumlah) {
		boolean cekbarang = false;
		try {
		for(int i=0;i<idBuah.size();i++){
			if(idBuah.get(i).equals(id)) {
                if(jumlahBuah.get(i)<jumlah){
                int defisit = jumlah-jumlahBuah.get(i);
                jumlah = jumlahBuah.get(i);                
                idBuah.remove(i);
                namaBuah.remove(i);
                jumlahBuah.remove(i);
                expiredBuah.remove(i);
                System.out.println("Pengiriman buah mengalami defisit buah sebanyak "+defisit);
                }
				else if(jumlahBuah.get(i)==jumlah){
                    jumlah = jumlahBuah.get(i);
					
					idBuah.remove(i);
					namaBuah.remove(i);
					jumlahBuah.remove(i);
					expiredBuah.remove(i);
				}
				else if(jumlahBuah.get(i)>jumlah){ 
					jumlahBuah.set(i,jumlahBuah.get(i)-jumlah);
					
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

	
