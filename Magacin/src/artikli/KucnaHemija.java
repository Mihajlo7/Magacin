package artikli;

import java.time.LocalDate;
import java.util.Objects;

public class KucnaHemija extends Artikal {
	public LocalDate getDatumTrajanja() {
		return datumTrajanja;
	}

	public void setDatumTrajanja(LocalDate datumTrajanja) {
		this.datumTrajanja = datumTrajanja;
	}

	private LocalDate datumTrajanja;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(datumTrajanja);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(datumTrajanja, other.datumTrajanja);
	}

	@Override
	public String toString() {
		
		return super.toString()+"KucnaHemija [datumTrajanja=" + datumTrajanja + "]";
	}
	
}
