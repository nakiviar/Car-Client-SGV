package com.sgvCliente.demo.model;

public class Conductor {

	private String id_empleado;
	private long DNI;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private long telefono_celular;
	private String direccion;
	private String correo;
	private String id_tipoLicen;
	private String cod_licencia;
	private long nro_hijos;
	private long cuenta_ahorros;
	private String foto;
	private long id_dispon;

	public String getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public long getTelefono_celular() {
		return telefono_celular;
	}

	public void setTelefono_celular(long telefono_celular) {
		this.telefono_celular = telefono_celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getId_tipoLicen() {
		return id_tipoLicen;
	}

	public void setId_tipoLicen(String id_tipoLicen) {
		this.id_tipoLicen = id_tipoLicen;
	}

	public String getCod_licencia() {
		return cod_licencia;
	}

	public void setCod_licencia(String cod_licencia) {
		this.cod_licencia = cod_licencia;
	}

	public long getNro_hijos() {
		return nro_hijos;
	}

	public void setNro_hijos(long nro_hijos) {
		this.nro_hijos = nro_hijos;
	}

	public long getCuenta_ahorros() {
		return cuenta_ahorros;
	}

	public void setCuenta_ahorros(long cuenta_ahorros) {
		this.cuenta_ahorros = cuenta_ahorros;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public long getId_dispon() {
		return id_dispon;
	}

	public void setId_dispon(long id_dispon) {
		this.id_dispon = id_dispon;
	}

	public Conductor(String id_empleado, long dNI, String nombre, String primer_apellido, String segundo_apellido,
			long telefono_celular, String direccion, String correo, String id_tipoLicen, String cod_licencia,
			long nro_hijos, long cuenta_ahorros, String foto, long id_dispon) {
		this.id_empleado = id_empleado;
		DNI = dNI;
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.telefono_celular = telefono_celular;
		this.direccion = direccion;
		this.correo = correo;
		this.id_tipoLicen = id_tipoLicen;
		this.cod_licencia = cod_licencia;
		this.nro_hijos = nro_hijos;
		this.cuenta_ahorros = cuenta_ahorros;
		this.foto = foto;
		this.id_dispon = id_dispon;
	}

	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Conductor [id_empleado=" + id_empleado + ", DNI=" + DNI + ", nombre=" + nombre + ", primer_apellido="
				+ primer_apellido + ", segundo_apellido=" + segundo_apellido + ", telefono_celular=" + telefono_celular
				+ ", direccion=" + direccion + ", correo=" + correo + ", id_tipoLicen=" + id_tipoLicen
				+ ", cod_licencia=" + cod_licencia + ", nro_hijos=" + nro_hijos + ", cuenta_ahorros=" + cuenta_ahorros
				+ ", foto=" + foto + ", id_dispon=" + id_dispon + "]";
	}

}

/*
 * CREATE TABLE TB_EMPLEADO ( "id_empleado" VARCHAR2(5) NOT NULL PRIMARY KEY,
 * "DNI" NUMBER(8,0) NOT NULL, "nombre" VARCHAR2(25) NOT NULL, "primer_apellido"
 * VARCHAR2(25) NOT NULL, "segundo_apellido" VARCHAR2(25) NOT NULL,
 * "telefono_celular" NUMBER(9,0) NOT NULL, "direccion" VARCHAR2(150) NOT NULL,
 * "correo" VARCHAR2(150) NOT NULL, "id_tipoLicen" VARCHAR2(6) NOT NULL
 * REFERENCES TB_TIPO_LICENCIA, "cod_licencia" VARCHAR2(9) NOT NULL, "nro_hijos"
 * NUMBER(2,0) NOT NULL, "cuenta_ahorros" NUMBER(25,0) NOT NULL, "foto"
 * VARCHAR2(100), "id_dispon" NUMBER(1,0) NOT NULL REFERENCES TB_DISPONIBILIDAD
 * );
 */