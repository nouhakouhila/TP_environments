package metier;

public interface ImcMetierImpl implements IImcMetier {
	
	@Override
	public double calculerImc(int poids, double taille) {
	double imc = poids/(taille*taille);
	// TODO Auto-generated method stub
	return imc;
	}
}
