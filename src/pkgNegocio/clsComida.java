/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgNegocio;

/**
 *
 * @author ANGIE GOMEZ
 */
public class clsComida {
    private String codigo;
    private String nombre_producto;
    private String precio;

    public clsComida() {
    }

    public clsComida(String codigo, String nombre_producto, String precio) {
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}
