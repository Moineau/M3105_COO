
public interface Sujet 
{
	public abstract void enregistrerObservateur(Observateur o);
	
	public abstract void supprimerObservateur(Observateur o);
	
	public abstract void notifierObservateurs();
}