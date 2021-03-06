/**
 * This class is generated by jOOQ
 */
package org.lobobrowser.db.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Permissions extends org.jooq.impl.TableImpl<org.lobobrowser.db.tables.records.PermissionsRecord> {

  private static final long serialVersionUID = -1001981162;

  /**
   * The reference instance of <code>PUBLIC.PERMISSIONS</code>
   */
  public static final org.lobobrowser.db.tables.Permissions PERMISSIONS = new org.lobobrowser.db.tables.Permissions();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<org.lobobrowser.db.tables.records.PermissionsRecord> getRecordType() {
    return org.lobobrowser.db.tables.records.PermissionsRecord.class;
  }

  /**
   * The column <code>PUBLIC.PERMISSIONS.FRAMEHOST</code>.
   */
  public final org.jooq.TableField<org.lobobrowser.db.tables.records.PermissionsRecord, String> FRAMEHOST = createField("FRAMEHOST",
      org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.PERMISSIONS.REQUESTHOST</code>.
   */
  public final org.jooq.TableField<org.lobobrowser.db.tables.records.PermissionsRecord, String> REQUESTHOST = createField(
      "REQUESTHOST", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647).nullable(false), this, "");

  /**
   * The column <code>PUBLIC.PERMISSIONS.PERMISSIONS</code>.
   */
  public final org.jooq.TableField<org.lobobrowser.db.tables.records.PermissionsRecord, Integer> PERMISSIONS_ = createField(
      "PERMISSIONS", org.jooq.impl.SQLDataType.INTEGER, this, "");

  /**
   * Create a <code>PUBLIC.PERMISSIONS</code> table reference
   */
  public Permissions() {
    this("PERMISSIONS", null);
  }

  /**
   * Create an aliased <code>PUBLIC.PERMISSIONS</code> table reference
   */
  public Permissions(final String alias) {
    this(alias, org.lobobrowser.db.tables.Permissions.PERMISSIONS);
  }

  private Permissions(final String alias, final org.jooq.Table<org.lobobrowser.db.tables.records.PermissionsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Permissions(final String alias, final org.jooq.Table<org.lobobrowser.db.tables.records.PermissionsRecord> aliased,
      final org.jooq.Field<?>[] parameters) {
    super(alias, org.lobobrowser.db.Public.PUBLIC, aliased, parameters, "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<org.lobobrowser.db.tables.records.PermissionsRecord> getPrimaryKey() {
    return org.lobobrowser.db.Keys.CONSTRAINT_C;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<org.lobobrowser.db.tables.records.PermissionsRecord>> getKeys() {
    return java.util.Arrays.<org.jooq.UniqueKey<org.lobobrowser.db.tables.records.PermissionsRecord>> asList(org.lobobrowser.db.Keys.CONSTRAINT_C);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.lobobrowser.db.tables.Permissions as(final String alias) {
    return new org.lobobrowser.db.tables.Permissions(alias, this);
  }

  /**
   * Rename this table
   */
  public org.lobobrowser.db.tables.Permissions rename(final String name) {
    return new org.lobobrowser.db.tables.Permissions(name, null);
  }
}
