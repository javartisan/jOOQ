/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_UNSIGNED")
public interface ITUnsigned extends java.io.Serializable {

	/**
	 * Setter for <code>T_UNSIGNED.U_BYTE</code>.
	 */
	public void setUByte(org.jooq.types.UByte value);

	/**
	 * Getter for <code>T_UNSIGNED.U_BYTE</code>.
	 */
	@javax.persistence.Column(name = "U_BYTE")
	public org.jooq.types.UByte getUByte();

	/**
	 * Setter for <code>T_UNSIGNED.U_SHORT</code>.
	 */
	public void setUShort(org.jooq.types.UShort value);

	/**
	 * Getter for <code>T_UNSIGNED.U_SHORT</code>.
	 */
	@javax.persistence.Column(name = "U_SHORT")
	public org.jooq.types.UShort getUShort();

	/**
	 * Setter for <code>T_UNSIGNED.U_INT</code>.
	 */
	public void setUInt(org.jooq.types.UInteger value);

	/**
	 * Getter for <code>T_UNSIGNED.U_INT</code>.
	 */
	@javax.persistence.Column(name = "U_INT")
	public org.jooq.types.UInteger getUInt();

	/**
	 * Setter for <code>T_UNSIGNED.U_LONG</code>.
	 */
	public void setULong(org.jooq.types.ULong value);

	/**
	 * Getter for <code>T_UNSIGNED.U_LONG</code>.
	 */
	@javax.persistence.Column(name = "U_LONG", length = 20)
	public org.jooq.types.ULong getULong();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITUnsigned from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITUnsigned> E into(E into);
}
