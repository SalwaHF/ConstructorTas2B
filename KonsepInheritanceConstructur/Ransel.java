public class Ransel extends Tas{
	public int harga;

	public Ransel(String merk, int harga){
		super(merk);
		this.harga = harga;
	}

	public Ransel(String merk){
		super(merk);
	}

	public void showHarga(){
		System.out.println(harga);
	}
}