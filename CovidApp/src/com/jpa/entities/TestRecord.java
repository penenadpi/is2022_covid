package com.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
@Entity
@Table(name = "covid_test")
public class TestRecord {
	@TableGenerator(name = "test_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "test_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "test_gen")
	private int testid;

	@Column(name = "ime")
	private String ime;	
	
	@Column(name = "prezime")
	private String prezime;
	
	@Column(name = "datum")
	private String datum;

	@Column(name = "JMBG")
	private String jmbg;	

	@Column(name = "ishod")
	private int ishod;	

	public int getTest() {
		return testid;
	}	
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getJmbg() {
		return this.jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	
	public String getDatum() {
		return this.jmbg;
	}
	
	public void setDatum(String datum) {
		this.datum = datum;
	}

	public int getIshod() {
		return this.ishod;
	}
	
	public void setIshod(int ishod) {
		this.ishod = ishod;
	}	
	
	
}

