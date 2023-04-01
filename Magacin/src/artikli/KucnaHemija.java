package artikli;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {
	public LocalDate getDatumTrajanja() {
		return datumTrajanja;
	}

	public void setDatumTrajanja(LocalDate datumTrajanja) {
		this.datumTrajanja = datumTrajanja;
	}

	private LocalDate datumTrajanja;
}
