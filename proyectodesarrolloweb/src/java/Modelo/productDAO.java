
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class productDAO implements CRUD{

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    conexion conex = new conexion();
    
    @Override
    public List listar() {
       
        List<product>  datos = new ArrayList <>();
        String sql = "select * from productos";
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            
                product u = new product();
                u.setCodigo(rs.getInt("codigo"));
                u.setNombre(rs.getString("nombre"));
                u.setDescripcion(rs.getString("descripcion"));
                u.setCategoria(rs.getString("cateogria"));
                u.setPrecio_unitario(rs.getFloat("precio_unitario"));
                u.setPrecio_mayoreo(rs.getFloat("precio_mayoreo"));
                u.setPrecio_liquidacion(rs.getFloat("precio_liquidacion"));
                u.setPrecio_oferta(rs.getFloat("precio_oferta"));
                u.setProveedor(rs.getNString("proveedor"));
                u.setImagen(rs.getString("imagen"));
                
                datos.add(u);
                
            }
        }catch(Exception e){
        }
        return datos;
    }

    @Override
    public product listarID(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
