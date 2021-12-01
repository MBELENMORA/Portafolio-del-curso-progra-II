public class Salta {
    private double Peso;
    private String Material;
    private double Fuerza;

    public Salta(double peso, String material, double fuerza) {
        setPeso(peso);
        setMaterial(material);
        setFuerza(fuerza);
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        this.Peso = peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        this.Material = material;
    }

    public double getFuerza() {
        return Fuerza;
    }

    public void setFuerza(double fuerza) {
        this.Fuerza = fuerza;
    }

}