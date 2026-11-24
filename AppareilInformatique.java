package techstore;
public abstract class AppareilInformatique
        extends Article
        implements Garantissable {

    // 1. Les attributs
    private double resolutionEcran;
    private String processeur;
    private long ram;
    private SystemeExploitation systemeExploitation;

    // 2. Le constructeur (à ajouter ici)
    public AppareilInformatique(
            int id,
            String nom,
            double prix,
            double resolutionEcran,
            String processeur,
            long ram,
            SystemeExploitation systemeExploitation) {

        super(id, nom, prix);
        this.resolutionEcran = resolutionEcran;
        this.processeur = processeur;
        this.ram = ram;
        this.systemeExploitation = systemeExploitation;
    }
    public double getResolutionEcran() {
		return resolutionEcran;
	}
	public void setResolutionEcran(double resolutionEcran) {
		this.resolutionEcran = resolutionEcran;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public long getRam() {
		return ram;
	}
	public void setRam(long ram) {
		this.ram = ram;
	}
	public SystemeExploitation getSystemeExploitation() {
		return systemeExploitation;
	}
	public void setSystemeExploitation(SystemeExploitation systemeExploitation) {
		this.systemeExploitation = systemeExploitation;
	}
	@Override
	public String toString() {
		return "AppareilInformatique [resolutionEcran=" + resolutionEcran + ", processeur=" + processeur + ", ram="
				+ ram + ", systemeExploitation=" + systemeExploitation + "]";
	}
	@Override
    public abstract int garantirAppareil();
}