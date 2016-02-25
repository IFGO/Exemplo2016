package br.edu.ifg.figuras;

/**
 *
 * @author Otavio
 */
public class Circulo extends FiguraGeometrica {
    private Long raio;

    public Circulo(Long raio) {
        this.raio = raio;
    }

    @Override
    public Long getArea() {
        return (long) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public Long getPerimetro() {
        return (long) Math.PI * 2 * raio;
    }
    
        
}
