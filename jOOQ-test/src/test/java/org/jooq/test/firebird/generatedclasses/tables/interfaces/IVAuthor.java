/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR")
public interface IVAuthor extends java.io.Serializable {

	/**
	 * Setter for <code>V_AUTHOR.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>V_AUTHOR.ID</code>.
	 */
	@javax.persistence.Column(name = "ID")
	public java.lang.Integer getId();

	/**
	 * Setter for <code>V_AUTHOR.FIRST_NAME</code>.
	 */
	public void setFirstName(java.lang.String value);

	/**
	 * Getter for <code>V_AUTHOR.FIRST_NAME</code>.
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getFirstName();

	/**
	 * Setter for <code>V_AUTHOR.LAST_NAME</code>.
	 */
	public void setLastName(java.lang.String value);

	/**
	 * Getter for <code>V_AUTHOR.LAST_NAME</code>.
	 */
	@javax.persistence.Column(name = "LAST_NAME", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getLastName();

	/**
	 * Setter for <code>V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public void setDateOfBirth(java.sql.Date value);

	/**
	 * Getter for <code>V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH")
	public java.sql.Date getDateOfBirth();

	/**
	 * Setter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public void setYearOfBirth(java.lang.Integer value);

	/**
	 * Getter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH")
	public java.lang.Integer getYearOfBirth();

	/**
	 * Setter for <code>V_AUTHOR.ADDRESS</code>.
	 */
	public void setAddress(java.lang.String value);

	/**
	 * Getter for <code>V_AUTHOR.ADDRESS</code>.
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getAddress();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVAuthor
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IVAuthor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVAuthor
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IVAuthor> E into(E into);
}
