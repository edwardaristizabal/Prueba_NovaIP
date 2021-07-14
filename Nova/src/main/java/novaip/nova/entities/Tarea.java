package novaip.nova.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Programacion
 */
@Entity
@Table(name = "tarea")
public class Tarea {
    
    //Atributos
    private String id;
    private String nombre;
    private String descripcion;
    private String alias;
    private String estado;
    private String eliminado;
    private String fecha_inicio;
    private String fecha_fin;
    private String fecha_creacion;
    private String fecha_actualizacion;
    
    public Tarea(){
    
    }
    
    public Tarea(String id){
        this.id = id;
    }
    
    public Tarea(String id, String nombre, String descripcion, String alias, String estado, String eliminado,
            String fecha_inicio, String fecha_fin, String fecha_creacion, String fecha_actualizacion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.alias = alias;
        this.estado = estado;
        this.eliminado = eliminado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId (){
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion (){
        return descripcion;
    }
    
    public void setAlias(String alias){
        this.alias = alias;
    }
    
    public String getAlias (){
        return alias;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado (){
        return estado;
    }
    
    public void setEliminado(String eliminado){
        this.eliminado = eliminado;
    }
    
    public String getEliminado (){
        return eliminado;
    }
    
    public void setFecha_inicio(String fecha_inicio){
        this.fecha_inicio = fecha_inicio;
    }
    
    public String getFecha_inicio (){
        return fecha_inicio;
    }
    
    public void setFecha_fin(String fecha_fin){
        this.fecha_fin = fecha_fin;
    }
    
    public String getFecha_fin (){
        return fecha_fin;
    }
    
    public void setFecha_creacion(String fecha_creacion){
        this.fecha_creacion = fecha_creacion;
    }
    
    public String getFecha_creacion (){
        return fecha_creacion;
    }
    
    public void setFecha_actualizacion(String fecha_actualizacion){
        this.fecha_actualizacion = fecha_actualizacion;
    }
    
    public String getFecha_actualizacion (){
        return fecha_actualizacion;
    }
    
}
