/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
/** * VariantAnnotation Start */
@org.apache.avro.specific.AvroGenerated
public class Xref extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Xref\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"doc\":\"* VariantAnnotation Start\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"src\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence id;
  @Deprecated public CharSequence src;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Xref() {}

  /**
   * All-args constructor.
   */
  public Xref(CharSequence id, CharSequence src) {
    this.id = id;
    this.src = src;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return src;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (CharSequence)value$; break;
    case 1: src = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'src' field.
   */
  public CharSequence getSrc() {
    return src;
  }

  /**
   * Sets the value of the 'src' field.
   * @param value the value to set.
   */
  public void setSrc(CharSequence value) {
    this.src = value;
  }

  /** Creates a new Xref RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new Xref RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new Xref RecordBuilder by copying an existing Xref instance */
  public static Builder newBuilder(Xref other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for Xref instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Xref>
    implements org.apache.avro.data.RecordBuilder<Xref> {

    private CharSequence id;
    private CharSequence src;

    /** Creates a new Builder */
    private Builder() {
      super(Xref.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.src)) {
        this.src = data().deepCopy(fields()[1].schema(), other.src);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Xref instance */
    private Builder(Xref other) {
            super(Xref.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.src)) {
        this.src = data().deepCopy(fields()[1].schema(), other.src);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public Builder setId(CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'src' field */
    public CharSequence getSrc() {
      return src;
    }
    
    /** Sets the value of the 'src' field */
    public Builder setSrc(CharSequence value) {
      validate(fields()[1], value);
      this.src = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'src' field has been set */
    public boolean hasSrc() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'src' field */
    public Builder clearSrc() {
      src = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Xref build() {
      try {
        Xref record = new Xref();
        record.id = fieldSetFlags()[0] ? this.id : (CharSequence) defaultValue(fields()[0]);
        record.src = fieldSetFlags()[1] ? this.src : (CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}