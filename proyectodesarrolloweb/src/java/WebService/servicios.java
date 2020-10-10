/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.product;
import Modelo.productDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;



@WebService(serviceName = "servicios")
public class servicios {

    productDAO dao = new productDAO();
    
    @WebMethod(operationName = "listar")
    public List<product> listar() {
        
        List datos = dao.listar();
        
        return datos;
        
    }
}
