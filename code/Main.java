
import java.util.*;

public class Main {
    //Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    	try (Scanner scan = new Scanner(System.in)) {
			Proses gudang = new Proses();
			String idBuah = "106"; //ID Buah Masuk
			String idSayur = "206"; //ID Sayur Masuk
			String idKirim = "301"; //ID Pengiriman
			gudang.dataBuah();
			gudang.dataSayur();
			boolean finish = false;
			do {
			    System.out.println("\n--- MAIN MENU ---");
			    System.out.println("1. Penambahan Stok Buah di Gudang");
			    System.out.println("2. Penambahan Stok Sayuran di Gudang");
			    System.out.println("3. Pengiriman Stok Buah ke Cabang");
			    System.out.println("4. Pengiriman Stok Sayuran ke Cabang");
			    System.out.println("5. Cek Stok Buah di Gudang");
			    System.out.println("6. Cek Stok Sayur di Gudang");
			    System.out.println("7. Cari Buah di Gudang");
			    System.out.println("8. Cari Sayur di Gudang");
			    System.out.println("9. Riwayat Masuk Barang");
			    System.out.println("10. Pelacakan Pengiriman Barang Pada Toko Cabang");
			    System.out.println("11. Keluar");
			    System.out.print("Enter your Choice : ");
   
			    int option = scan.nextInt();
			    
			    switch(option){
			        case 1:
			        	gudang.tambahBuah(idBuah);
			        	int a = Integer.parseInt(idBuah)+1;
			        	idBuah = Integer.toString(a);
			            break;
//                	gudang.tambahBuah();
//                    break;
			        case 2:
			        	gudang.tambahSayur(idSayur);
			        	int b = Integer.parseInt(idSayur)+1;
			        	idSayur = Integer.toString(b);
			            break;
			        case 3:
			        	gudang.pengirimanBuah(idKirim);
			            int c = Integer.parseInt(idKirim)+1;
			        	idKirim = Integer.toString(c);
			            break;
			        case 4: 
			            gudang.pengirimanSayur(idKirim);
			            int d = Integer.parseInt(idKirim)+1;
			        	idKirim = Integer.toString(d);
			            break;
			        case 5:
			        	gudang.reportStokBuah();
			        	break;
			        case 6:
			        	gudang.reportStokSayur();
			        	break;
			        case 7:
			        	gudang.cariBuah();
			        	break;
			        case 8:	
			        	gudang.cariSayur();
			        	break;
			        case 9:  
			        	gudang.riwayatMasuk();
			        	break;
			        case 10:  
			        	gudang.cariIdPengiriman();
			        	break;
			        case 11:  
			        	finish = true;
			        
			        	break;
			        default:
			            System.out.println("Invalid option!");
			    }  
			} while (!finish);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    }
}
