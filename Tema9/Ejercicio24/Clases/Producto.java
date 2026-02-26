package Tema9.Ejercicio24.Clases;

public class Producto {
    
    private String codigo;
    private String desc;
    private float precioCom;
    private float precioVent;
    private int stock;

    public Producto(){

    }

    public Producto(String codigo, String desc, float precioCom, float precioVent, int stock){
        this.codigo = codigo;
        this.desc = desc;
        this.precioCom = precioCom;
        this.precioVent = precioVent;
        this.stock = stock;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDesc(){
        return desc;
    }
    
    public float getPrecioCom(){
        return precioCom;
    }

    public float getPrecioVen(){
        return precioVent;
    }

    public int getStock(){
        return stock;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public void setPrecioCom(float precioCom){
        this.precioCom = precioCom;
    }

    public void setPrecioVent(float precioVent){
        this.precioVent = precioVent;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + 
               "\nDescripccion: " + desc + 
               "\nPrecio de compra: " + precioCom + 
               "\nPrecio de venta: " + precioVent + 
               "\nStock: " + stock;
    }



}
