package entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
public class Etudiant extends User implements Serializable {

	private String cne;
	private static final long serialVersionUID = 1L;
	private String fn;
	private String ln;
	@ManyToOne
	private Filiere f;

	public Etudiant(String lg, String pwd, String cne, String fn, String ln, Filiere f) {
		super(lg, pwd);
		this.cne = cne;
		this.fn = fn;
		this.ln = ln;
		this.f = f;
	}

	public Etudiant(String lg, String pwd, String cne, String fn, String ln) {
		super(lg, pwd);
		this.cne = cne;
		this.fn = fn;
		this.ln = ln;

	}

	public Etudiant() {

	}

	public String getFn() {
		return fn;
	}

	@Override
	public String toString() {
		return "Etudiant [cne=" + cne + ", fn=" + fn + ", ln=" + ln + ", f=" + f + "]";
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getCne() {
		return this.cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Filiere getF() {
		return f;
	}

	public void setF(Filiere f) {
		this.f = f;
	}

}
