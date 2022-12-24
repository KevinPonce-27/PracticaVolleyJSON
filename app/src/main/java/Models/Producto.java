package Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Producto {

    private String idproduct;
    private String code;
    private String costo;
    private String preciounit;
    private String preciomayo;
    private String categoria;
    private String subcategoria;
    private String descripcion;

    public String getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(String idproduct) {
        this.idproduct = idproduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(String preciounit) {
        this.preciounit = preciounit;
    }

    public String getPreciomayo() {
        return preciomayo;
    }

    public void setPreciomayo(String preciomayo) {
        this.preciomayo = preciomayo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(JSONObject a) throws JSONException {
        idproduct = "Id Producto: " + a.getString("id").toString();
        code = "Barcode: " + a.getString("barcode").toString() ;
        costo = "Costo: " + "$"+a.getString("costo").toString() ;
        preciounit = "Precio de la Unidad: " + "$"+a.getString("precio_unidad").toString() ;
        preciomayo = "Precio Mayorista: " + "$"+a.getString("precio_mayorista").toString() ;
        categoria = "Categoría: " + a.getString("p_categoria").toString();
        subcategoria = "Sub-Categoría: " + a.getString("p_subcategoria").toString();
        descripcion = "Descripción: " + a.getString("descripcion").toString();
   }
    public static ArrayList<Producto> JsonObjectsBuild(JSONArray productos) throws JSONException {
        ArrayList<Producto> productoslist = new ArrayList<>();
        for (int i = 0; i < productos.length(); i++) {
            productoslist.add(new Producto(productos.getJSONObject(i)));
        }
        return productoslist;
    }
}
