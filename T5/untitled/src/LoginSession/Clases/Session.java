package LoginSession.Clases;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Session {
    public String nSession;
    public LocalDateTime lastLogin;
    public LocalDateTime sessionExpires;
    public User usuario;



    public Session (String nSession, User usuario){
        this.nSession = nSession;
        this.usuario = usuario;

    }



}
