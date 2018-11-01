public class TasTest{
	public static void main(String[] args) {
		Ransel a = new Ransel("Merk = Eiger", 300000);
		a.showMerk();
		a.showHarga();

		Ransel b = new Ransel("Merk = Exsport", 200000);
		b.showMerk();
		b.showHarga();

		Ransel c = new Ransel("Merk = Alto", 100000);
		c.showMerk();
		c.showHarga();
	}
}