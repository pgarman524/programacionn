package ProyectoUser.model;

import java.util.Objects;

public class Usuario {
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;

    public Usuario(String id, String name, String password, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    // ----------------------------------


    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return isAdmin == usuario.isAdmin && Objects.equals(id, usuario.id) && Objects.equals(name, usuario.name) && Objects.equals(password, usuario.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, isAdmin);
    }

// -----------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
