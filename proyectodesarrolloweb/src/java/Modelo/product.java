
package Modelo;


public class product {
    
    int codigo;
    String nombre;
    String descripcion;
    String categoria;
    float precio_unitario;
    float precio_mayoreo;
    float precio_liquidacion;
    float precio_oferta;
    String proveedor;
    String imagen;
    
    public product(){
        
    }

    public product(int codigo, String nombre, String descripcion, String categoria, float precio_unitario, float precio_mayoreo, float precio_liquidacion, float precio_oferta, String proveedor, String imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio_unitario = precio_unitario;
        this.precio_mayoreo = precio_mayoreo;
        this.precio_liquidacion = precio_liquidacion;
        this.precio_oferta = precio_oferta;
        this.proveedor = proveedor;
        this.imagen = imagen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPrecio_mayoreo() {
        return precio_mayoreo;
    }

    public void setPrecio_mayoreo(float precio_mayoreo) {
        this.precio_mayoreo = precio_mayoreo;
    }

    public float getPrecio_liquidacion() {
        return precio_liquidacion;
    }

    public void setPrecio_liquidacion(float precio_liquidacion) {
        this.precio_liquidacion = precio_liquidacion;
    }

    public float getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(float precio_oferta) {
        this.precio_oferta = precio_oferta;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
