package com.example.crud_ciss;


import jakarta.persistence.*;

@Entity
@Table(name="Funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long nis;

    protected Funcionario() {}

    public Funcionario(Long id, String firstName, String lastName, String email, Long nis) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nis = nis;
    }

    public Long getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public Long getNIS(){
        return nis;
    }

    public String toString(){
        return String.format(
            "Funcionario [id=%d, Nome=%s, Sobrenome=%s, email=%s, NIS=%d]",
            id, firstName, lastName, email, nis);
    }

}

