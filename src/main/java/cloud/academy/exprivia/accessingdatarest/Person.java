package cloud.academy.exprivia.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Questa classe rappresenta un oggetto di tipo Persona.
 */
@Entity
public class Person {

    /**
     * Identificatore univoco della persona.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Nome della persona.
     */
    private String firstName;

    /**
     * Cognome della persona.
     */
    private String lastName;

    /**
     * Ottiene il nome della persona.
     *
     * @return Il nome della persona.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Imposta il nome della persona.
     *
     * @param firstName Il nome della persona da impostare.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Ottiene il cognome della persona.
     *
     * @return Il cognome della persona.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Imposta il cognome della persona.
     *
     * @param lastName Il cognome della persona da impostare.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
