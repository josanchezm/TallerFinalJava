package com.mycompany.mavenproject1;

public class Operaciones {
    // Atributos
    private double op1;
    private double op2;
    
    // Constructores
    public Operaciones() {
    }

    public Operaciones(double op1, double op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    
    // Metodos
    public double sumar() {
        return this.getOp1() + this.getOp2();
    }
    public double restar() {
        return this.getOp1() - this.getOp2();
    }
    public double multiplicar() {
        return this.getOp1() * this.getOp2();
    }
    public double dividir() {
        return this.getOp1() / this.getOp2();
    }
    public double modulo() {
        return this.getOp1() % this.getOp2();
    }

    /**
     * @return the op1
     */
    public double getOp1() {
        return op1;
    }

    /**
     * @param op1 the op1 to set
     */
    public void setOp1(double op1) {
        this.op1 = op1;
    }

    /**
     * @return the op2
     */
    public double getOp2() {
        return op2;
    }

    /**
     * @param op2 the op2 to set
     */
    public void setOp2(double op2) {
        this.op2 = op2;
    }
}
