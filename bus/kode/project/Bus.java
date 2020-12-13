package kode.project;

import java.util.ArrayList;

public class Bus{
	//instance atribut
	private ArrayList<Penumpang> penumpangBiasa;
	private ArrayList<Penumpang> penumpangPrioritas;
	public Bus(){
		penumpangBiasa = new ArrayList<>();
		penumpangPrioritas = new ArrayList<>();
	}
	//penumpang biasa
	public ArrayList<Penumpang> getPenumpangBiasa(){
		return penumpangBiasa;
	}
	public int getJumlahPenumpangBiasa(){
		return penumpangBiasa.size();
	}

	//penumpang prioritas
	public ArrayList<Penumpang> getPenumpangPrioritas(){
		return penumpangPrioritas;
	}
	public int getJumlahPenumpangPrioritas(){
		return penumpangPrioritas.size();
	}

	//naik penumpang
	public boolean naik(Penumpang penumpang){
        if(penumpang.getPrioritas() && getJumlahPenumpangPrioritas() < 2){
                penumpangPrioritas.add(penumpang);
                return true;
        }else if(getJumlahPenumpangBiasa()  < 4){
                penumpangBiasa.add(penumpang);
                return true;
        }
        return false;
    }

	// turun penumpang
	public boolean turun(String nama){
		for(int i=0; i < penumpangBiasa.size(); i++){
			if(penumpangBiasa.get(i).getNama().equals(nama)){
				penumpangBiasa.remove(i);
				System.out.println("\n++Berhasil Dihapus++");		
			}
		}
		for(int j=0; j < penumpangPrioritas.size(); j++){
			if(penumpangPrioritas.get(j).getNama().equals(nama)){
				penumpangPrioritas.remove(j);
				System.out.println("\n++Berhasil Dihapus++");			
			}		
		}return true;
	}

	//display
	public void display(){
		
		if ( getJumlahPenumpangBiasa() == 0) {
			System.out.println("\nPenumpang Biasa Belum Ada");
		}
		else{
			System.out.println("\n===Penumpang Biasa===\n");
			for(int i=0; i < getJumlahPenumpangBiasa(); i++){
			System.out.println(penumpangBiasa.get(i));
			}
		}
		System.out.println("-------------------------------");

		if ( getJumlahPenumpangPrioritas() == 0){
			System.out.println("\nPenumpang Prioritas Belum Ada");
		}
		else{	
			System.out.println("\n===Penumpang Prioritas===\n");
			for(int i=0; i < getJumlahPenumpangPrioritas(); i++){
				System.out.println(penumpangPrioritas.get(i));
			}
		}
		int jmlh = getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas();
		System.out.println("\nJumlah Penumpang : "+jmlh);
	}
}	