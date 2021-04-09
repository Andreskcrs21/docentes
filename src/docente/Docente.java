package docente;


public class Docente {
    
    String id, nombre, username, password;

    public Docente(String id, String nombre, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }
    public Docente(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    

    @Override
    public String toString() {
        return "Docente{" + "id=" + id + ", password=" + password + ", nombre=" + nombre + ", username=" + username + '}';
    }
    
   

    
            
    
    
}
