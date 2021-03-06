package it.polito.tdp.lab04.model;

public class Studente {

    private Integer matricola;
    private String cognome;
    private String nome;
    private String corsoDiStudi;

    /**
     * @param matricola
     * @param cognome
     * @param nome
     * @param corsoDiStudi
     */
    public Studente(Integer matricola, String cognome, String nome, String corsoDiStudi) {
        super();
        this.matricola = matricola;
        this.cognome = cognome;
        this.nome = nome;
        this.corsoDiStudi = corsoDiStudi;
    }

    /**
     * @return the matricola
     */
    public Integer getMatricola() {
        return matricola;
    }

    /**
     * @param matricola the matricola to set
     */
    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the corsoDiStudi
     */
    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    /**
     * @param corsoDiStudi the corsoDiStudi to set
     */
    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Studente other = (Studente) obj;
        if (matricola == null) {
            if (other.matricola != null) {
                return false;
            }
        } else if (!matricola.equals(other.matricola)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return matricola + " " + cognome + " " + nome;
    }

}
