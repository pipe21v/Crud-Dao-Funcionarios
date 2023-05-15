
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Luis Felipe
 */
public class DAOFuncionarios implements Operaciones{
    
    Database db = new Database();
    Funcionarios fun = new Funcionarios();
    
    @Override
    public boolean insertar(Object obj) {
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql="insert into funcionario values (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsername(),
                    db.getPassword()
            );
            pst=con.prepareStatement(sql);
            pst.setInt(1, fun.getCodFuncionario());
            pst.setString(2, fun.getTipoIdentificacion());
            pst.setInt(3, fun.getNumeroIdentificacion());
            pst.setString(4, fun.getNombre());
            pst.setString(5, fun.getApellido());
            pst.setString(6, fun.getEstadoCivil());
            pst.setString(7, fun.getSexo());
            pst.setString(8, fun.getDireccion());
            pst.setString(9, fun.getTelefono());
            pst.setString(10, fun.getFechaNacimiento());
            pst.setInt(11, fun.getCodFormacion());
            pst.setInt(12, fun.getCodGrupoFamiliar());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
            
        }catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean eliminar(Object obj) {
        
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql="delete from funcionario  where codFuncionario = ?";
        
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsername(),
                    db.getPassword()
            );
            pst=con.prepareStatement(sql);
            pst.setInt(1, fun.getCodFuncionario());
            pst.setString(2, fun.getTipoIdentificacion());
            pst.setInt(3, fun.getNumeroIdentificacion());
            pst.setString(4, fun.getNombre());
            pst.setString(5, fun.getApellido());
            pst.setString(6, fun.getEstadoCivil());
            pst.setString(7, fun.getSexo());
            pst.setString(8, fun.getDireccion());
            pst.setString(9, fun.getTelefono());
            pst.setString(10, fun.getFechaNacimiento());
            pst.setInt(11, fun.getCodFormacion());
            pst.setInt(12, fun.getCodGrupoFamiliar());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
            
        }catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean modificar(Object obj) {
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql="update funcionarios set  tipoIdentifacion=?, numeroIdentificacion=?, nombre=?, apellido=?, estadoCivil=?, sexo=?, direccion=?, telefono=?, fechaNacimiento=?, codFormacion=?, codGrupoFamiliar where codFuncionario=?";
        
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsername(),
                    db.getPassword()
            );
            pst=con.prepareStatement(sql);
            pst.setString(1, fun.getTipoIdentificacion());
            pst.setInt(2, fun.getNumeroIdentificacion());
            pst.setString(3, fun.getNombre());
            pst.setString(4, fun.getApellido());
            pst.setString(5, fun.getEstadoCivil());
            pst.setString(6, fun.getSexo());
            pst.setString(7, fun.getDireccion());
            pst.setString(8, fun.getTelefono());
            pst.setString(9, fun.getFechaNacimiento());
            pst.setInt(10, fun.getCodFormacion());
            pst.setInt(11, fun.getCodGrupoFamiliar());
            pst.setInt(12, fun.getCodFuncionario());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
            
        }catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from funcionario";
        
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsername(),
                    db.getPassword()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                Object[] fila = new Object [12];
                for(int i=0; i<=11; i++){
                    fila[i]=rs .getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
            
        }catch (SQLException| ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, 
                    "Ocurrio este error" + e.getMessage());
        }finally{
            return data;
            }
    }
    
}
