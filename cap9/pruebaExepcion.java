public class pruebaExepcion {

	public static void main(String[] args) {
		try {
			throw new SegExepcion("Segunda Exepcion ");
		} catch (PrimExepcion e) {
			e.printStackTrace();
		}

		try {
			throw new TerExepcion("Tercer Exepcion ");
		} catch (PrimExepcion e) {
			e.printStackTrace();
		}
	}

}