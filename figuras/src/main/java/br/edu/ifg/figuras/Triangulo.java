package br.edu.ifg.figuras;

/**
 *
 * @author Otavio
 */
public class Triangulo extends FiguraGeometrica {
    private Long ladoA;
    private Long ladoB;
    private Long ladoC;

    public Triangulo(Long ladoA, Long ladoB, Long ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public Long getArea() {
        Long p = getPerimetro()/2;
        return (long) Math.pow(p*(p-ladoA)*(p-ladoB)*(p-ladoC), 0.5);
    }

    @Override
    public Long getPerimetro() {
        return ladoA + ladoB + ladoC;        
    }
    
}
