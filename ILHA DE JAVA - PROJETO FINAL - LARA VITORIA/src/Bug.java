public class Bug implements ElementoDeJogo {

	
	public Bug() {
		super();
	}

	@Override
	public String mostrar() {
		return "B";
	}


	@Override
	public int getTipo() {
		return 2; // representa o Bug
	}

}
