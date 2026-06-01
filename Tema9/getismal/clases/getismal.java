package Tema9.getismal.clases;

public class getismal {

    private String codigo;
    private String descripcion;
    private float precioCom;
    private float precioVen;
    private int stock;

    public getismal(String codigo, String descripcion, float precioCom, float precioVen, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCom = precioCom;
        this.precioVen = precioVen;
        this.stock = stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCom(float precioCom) {
        this.precioCom = precioCom;
    }

    public void setPrecioVen(float precioVen) {
        this.precioVen = precioVen;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecioCom() {
        return precioCom;
    }

    public float getPrecioVen() {
        return precioVen;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + "\nPrecio de compra: " + this.precioCom + "\nPrecio de venta: " + precioVen + "\nStock: " + this.stock + " unidades";
    }
}
