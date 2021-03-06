/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.DynamicSchema;
import io.cattle.platform.core.model.tables.DynamicSchemaTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "dynamic_schema", schema = "cattle")
public class DynamicSchemaRecord extends UpdatableRecordImpl<DynamicSchemaRecord> implements TableRecordJaxb, Record13<Long, String, Long, String, String, String, String, Date, Map<String,Object>, String, String, Long, Date>, DynamicSchema {

    private static final long serialVersionUID = 1052968725;

    /**
     * Setter for <code>cattle.dynamic_schema.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.data</code>.
     */
    @Column(name = "data", length = 65535)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(8);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.parent</code>.
     */
    @Override
    public void setParent(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.parent</code>.
     */
    @Column(name = "parent", length = 255)
    @Override
    public String getParent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.definition</code>.
     */
    @Override
    public void setDefinition(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.definition</code>.
     */
    @Column(name = "definition", length = 16777215)
    @Override
    public String getDefinition() {
        return (String) get(10);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>cattle.dynamic_schema.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.dynamic_schema.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, Long, String, String, String, String, Date, Map<String,Object>, String, String, Long, Date> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, Long, String, String, String, String, Date, Map<String,Object>, String, String, Long, Date> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field9() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field13() {
        return DynamicSchemaTable.DYNAMIC_SCHEMA.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value9() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value13() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value9(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value10(String value) {
        setParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value11(String value) {
        setDefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value12(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord value13(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicSchemaRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Map<String,Object> value9, String value10, String value11, Long value12, Date value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(DynamicSchema from) {
        setId(from.getId());
        setName(from.getName());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setData(from.getData());
        setParent(from.getParent());
        setDefinition(from.getDefinition());
        setServiceId(from.getServiceId());
        setRemoved(from.getRemoved());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends DynamicSchema> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DynamicSchemaRecord
     */
    public DynamicSchemaRecord() {
        super(DynamicSchemaTable.DYNAMIC_SCHEMA);
    }

    /**
     * Create a detached, initialised DynamicSchemaRecord
     */
    public DynamicSchemaRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Map<String,Object> data, String parent, String definition, Long serviceId, Date removed) {
        super(DynamicSchemaTable.DYNAMIC_SCHEMA);

        set(0, id);
        set(1, name);
        set(2, accountId);
        set(3, kind);
        set(4, uuid);
        set(5, description);
        set(6, state);
        set(7, created);
        set(8, data);
        set(9, parent);
        set(10, definition);
        set(11, serviceId);
        set(12, removed);
    }
}
