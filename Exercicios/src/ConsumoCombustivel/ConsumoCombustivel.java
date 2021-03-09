package ConsumoCombustivel;

public class ConsumoCombustivel {
    private double distancia;
    private double combustivelGasto;
    public double mediaCombustivel;

    public ConsumoCombustivel(double distancia, double combustivelGasto) {
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public void media(double distancia, double combustivelGasto) {
        mediaCombustivel = distancia/combustivelGasto;
        System.out.println("Sua média de combustível é de " + String.format("%.01f",mediaCombustivel) + " km por litro(S)");
    }

}
