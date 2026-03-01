package Tema9.Ejercicio24.Clases;

public class Gestismal {

    private String codigo;
    private String desc;
    private double pComp;
    private double pvent;
    private int stock;

    public Gestismal(String codigo, String desc, double pComp, double pvent, int stock) {
        this.codigo = codigo;
        this.desc = desc;
        this.pComp = pComp;
        this.pvent = pvent;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPComp() {
        return pComp;
    }

    public void setPComp(double pComp) {
        this.pComp = pComp;
    }

    public double getPvent() {
        return pvent;
    }

    public void setPvent(double pvent) {
        this.pvent = pvent;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + 
        "\nDescripccion: " + desc + 
        "\nPrecio de compra: " + pComp + 
        "\nPrecio de venta: " + 
        "\nStock: " + stock + " unidades";
    }

}
