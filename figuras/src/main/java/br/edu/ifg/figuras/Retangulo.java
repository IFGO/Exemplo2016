package br.edu.ifg.figuras;

/**
 *
 * @author Otavio
 */
public class Retangulo extends FiguraGeometrica {
    private Long ladoA;
    private Long ladoB;

    public Retangulo(Long ladoA, Long ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
    public Long getArea() {
        return ladoA*ladoB;
    }

    @Override
    public Long getPerimetro() {
        return 2*(ladoA+ladoB);
    }
    
}
