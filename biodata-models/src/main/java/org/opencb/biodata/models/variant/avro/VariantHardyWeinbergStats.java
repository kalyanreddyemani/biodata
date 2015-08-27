/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VariantHardyWeinbergStats extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VariantHardyWeinbergStats\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"chi2\",\"type\":[\"null\",\"float\"]},{\"name\":\"pValue\",\"type\":[\"null\",\"float\"]},{\"name\":\"n\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_AA_11\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_Aa_10\",\"type\":[\"null\",\"int\"]},{\"name\":\"n_aa_00\",\"type\":[\"null\",\"int\"]},{\"name\":\"e_AA_11\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_Aa_10\",\"type\":[\"null\",\"float\"]},{\"name\":\"e_aa_00\",\"type\":[\"null\",\"float\"]},{\"name\":\"p\",\"type\":[\"null\",\"float\"]},{\"name\":\"q\",\"type\":[\"null\",\"float\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public Float chi2;
  @Deprecated public Float pValue;
  @Deprecated public Integer n;
  @Deprecated public Integer n_AA_11;
  @Deprecated public Integer n_Aa_10;
  @Deprecated public Integer n_aa_00;
  @Deprecated public Float e_AA_11;
  @Deprecated public Float e_Aa_10;
  @Deprecated public Float e_aa_00;
  @Deprecated public Float p;
  @Deprecated public Float q;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VariantHardyWeinbergStats() {}

  /**
   * All-args constructor.
   */
  public VariantHardyWeinbergStats(Float chi2, Float pValue, Integer n, Integer n_AA_11, Integer n_Aa_10, Integer n_aa_00, Float e_AA_11, Float e_Aa_10, Float e_aa_00, Float p, Float q) {
    this.chi2 = chi2;
    this.pValue = pValue;
    this.n = n;
    this.n_AA_11 = n_AA_11;
    this.n_Aa_10 = n_Aa_10;
    this.n_aa_00 = n_aa_00;
    this.e_AA_11 = e_AA_11;
    this.e_Aa_10 = e_Aa_10;
    this.e_aa_00 = e_aa_00;
    this.p = p;
    this.q = q;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return chi2;
    case 1: return pValue;
    case 2: return n;
    case 3: return n_AA_11;
    case 4: return n_Aa_10;
    case 5: return n_aa_00;
    case 6: return e_AA_11;
    case 7: return e_Aa_10;
    case 8: return e_aa_00;
    case 9: return p;
    case 10: return q;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: chi2 = (Float)value$; break;
    case 1: pValue = (Float)value$; break;
    case 2: n = (Integer)value$; break;
    case 3: n_AA_11 = (Integer)value$; break;
    case 4: n_Aa_10 = (Integer)value$; break;
    case 5: n_aa_00 = (Integer)value$; break;
    case 6: e_AA_11 = (Float)value$; break;
    case 7: e_Aa_10 = (Float)value$; break;
    case 8: e_aa_00 = (Float)value$; break;
    case 9: p = (Float)value$; break;
    case 10: q = (Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'chi2' field.
   */
  public Float getChi2() {
    return chi2;
  }

  /**
   * Sets the value of the 'chi2' field.
   * @param value the value to set.
   */
  public void setChi2(Float value) {
    this.chi2 = value;
  }

  /**
   * Gets the value of the 'pValue' field.
   */
  public Float getPValue() {
    return pValue;
  }

  /**
   * Sets the value of the 'pValue' field.
   * @param value the value to set.
   */
  public void setPValue(Float value) {
    this.pValue = value;
  }

  /**
   * Gets the value of the 'n' field.
   */
  public Integer getN() {
    return n;
  }

  /**
   * Sets the value of the 'n' field.
   * @param value the value to set.
   */
  public void setN(Integer value) {
    this.n = value;
  }

  /**
   * Gets the value of the 'n_AA_11' field.
   */
  public Integer getNAA11() {
    return n_AA_11;
  }

  /**
   * Sets the value of the 'n_AA_11' field.
   * @param value the value to set.
   */
  public void setNAA11(Integer value) {
    this.n_AA_11 = value;
  }

  /**
   * Gets the value of the 'n_Aa_10' field.
   */
  public Integer getNAa10() {
    return n_Aa_10;
  }

  /**
   * Sets the value of the 'n_Aa_10' field.
   * @param value the value to set.
   */
  public void setNAa10(Integer value) {
    this.n_Aa_10 = value;
  }

  /**
   * Gets the value of the 'n_aa_00' field.
   */
  public Integer getNAa00() {
    return n_aa_00;
  }

  /**
   * Sets the value of the 'n_aa_00' field.
   * @param value the value to set.
   */
  public void setNAa00(Integer value) {
    this.n_aa_00 = value;
  }

  /**
   * Gets the value of the 'e_AA_11' field.
   */
  public Float getEAA11() {
    return e_AA_11;
  }

  /**
   * Sets the value of the 'e_AA_11' field.
   * @param value the value to set.
   */
  public void setEAA11(Float value) {
    this.e_AA_11 = value;
  }

  /**
   * Gets the value of the 'e_Aa_10' field.
   */
  public Float getEAa10() {
    return e_Aa_10;
  }

  /**
   * Sets the value of the 'e_Aa_10' field.
   * @param value the value to set.
   */
  public void setEAa10(Float value) {
    this.e_Aa_10 = value;
  }

  /**
   * Gets the value of the 'e_aa_00' field.
   */
  public Float getEAa00() {
    return e_aa_00;
  }

  /**
   * Sets the value of the 'e_aa_00' field.
   * @param value the value to set.
   */
  public void setEAa00(Float value) {
    this.e_aa_00 = value;
  }

  /**
   * Gets the value of the 'p' field.
   */
  public Float getP() {
    return p;
  }

  /**
   * Sets the value of the 'p' field.
   * @param value the value to set.
   */
  public void setP(Float value) {
    this.p = value;
  }

  /**
   * Gets the value of the 'q' field.
   */
  public Float getQ() {
    return q;
  }

  /**
   * Sets the value of the 'q' field.
   * @param value the value to set.
   */
  public void setQ(Float value) {
    this.q = value;
  }

  /** Creates a new VariantHardyWeinbergStats RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /** Creates a new VariantHardyWeinbergStats RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /** Creates a new VariantHardyWeinbergStats RecordBuilder by copying an existing VariantHardyWeinbergStats instance */
  public static Builder newBuilder(VariantHardyWeinbergStats other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for VariantHardyWeinbergStats instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VariantHardyWeinbergStats>
    implements org.apache.avro.data.RecordBuilder<VariantHardyWeinbergStats> {

    private Float chi2;
    private Float pValue;
    private Integer n;
    private Integer n_AA_11;
    private Integer n_Aa_10;
    private Integer n_aa_00;
    private Float e_AA_11;
    private Float e_Aa_10;
    private Float e_aa_00;
    private Float p;
    private Float q;

    /** Creates a new Builder */
    private Builder() {
      super(VariantHardyWeinbergStats.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.chi2)) {
        this.chi2 = data().deepCopy(fields()[0].schema(), other.chi2);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pValue)) {
        this.pValue = data().deepCopy(fields()[1].schema(), other.pValue);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.n)) {
        this.n = data().deepCopy(fields()[2].schema(), other.n);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.n_AA_11)) {
        this.n_AA_11 = data().deepCopy(fields()[3].schema(), other.n_AA_11);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.n_Aa_10)) {
        this.n_Aa_10 = data().deepCopy(fields()[4].schema(), other.n_Aa_10);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.n_aa_00)) {
        this.n_aa_00 = data().deepCopy(fields()[5].schema(), other.n_aa_00);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.e_AA_11)) {
        this.e_AA_11 = data().deepCopy(fields()[6].schema(), other.e_AA_11);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.e_Aa_10)) {
        this.e_Aa_10 = data().deepCopy(fields()[7].schema(), other.e_Aa_10);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.e_aa_00)) {
        this.e_aa_00 = data().deepCopy(fields()[8].schema(), other.e_aa_00);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.p)) {
        this.p = data().deepCopy(fields()[9].schema(), other.p);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.q)) {
        this.q = data().deepCopy(fields()[10].schema(), other.q);
        fieldSetFlags()[10] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VariantHardyWeinbergStats instance */
    private Builder(VariantHardyWeinbergStats other) {
            super(VariantHardyWeinbergStats.SCHEMA$);
      if (isValidValue(fields()[0], other.chi2)) {
        this.chi2 = data().deepCopy(fields()[0].schema(), other.chi2);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pValue)) {
        this.pValue = data().deepCopy(fields()[1].schema(), other.pValue);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.n)) {
        this.n = data().deepCopy(fields()[2].schema(), other.n);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.n_AA_11)) {
        this.n_AA_11 = data().deepCopy(fields()[3].schema(), other.n_AA_11);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.n_Aa_10)) {
        this.n_Aa_10 = data().deepCopy(fields()[4].schema(), other.n_Aa_10);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.n_aa_00)) {
        this.n_aa_00 = data().deepCopy(fields()[5].schema(), other.n_aa_00);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.e_AA_11)) {
        this.e_AA_11 = data().deepCopy(fields()[6].schema(), other.e_AA_11);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.e_Aa_10)) {
        this.e_Aa_10 = data().deepCopy(fields()[7].schema(), other.e_Aa_10);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.e_aa_00)) {
        this.e_aa_00 = data().deepCopy(fields()[8].schema(), other.e_aa_00);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.p)) {
        this.p = data().deepCopy(fields()[9].schema(), other.p);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.q)) {
        this.q = data().deepCopy(fields()[10].schema(), other.q);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'chi2' field */
    public Float getChi2() {
      return chi2;
    }
    
    /** Sets the value of the 'chi2' field */
    public Builder setChi2(Float value) {
      validate(fields()[0], value);
      this.chi2 = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'chi2' field has been set */
    public boolean hasChi2() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'chi2' field */
    public Builder clearChi2() {
      chi2 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'pValue' field */
    public Float getPValue() {
      return pValue;
    }
    
    /** Sets the value of the 'pValue' field */
    public Builder setPValue(Float value) {
      validate(fields()[1], value);
      this.pValue = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'pValue' field has been set */
    public boolean hasPValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'pValue' field */
    public Builder clearPValue() {
      pValue = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'n' field */
    public Integer getN() {
      return n;
    }
    
    /** Sets the value of the 'n' field */
    public Builder setN(Integer value) {
      validate(fields()[2], value);
      this.n = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'n' field has been set */
    public boolean hasN() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'n' field */
    public Builder clearN() {
      n = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'n_AA_11' field */
    public Integer getNAA11() {
      return n_AA_11;
    }
    
    /** Sets the value of the 'n_AA_11' field */
    public Builder setNAA11(Integer value) {
      validate(fields()[3], value);
      this.n_AA_11 = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'n_AA_11' field has been set */
    public boolean hasNAA11() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'n_AA_11' field */
    public Builder clearNAA11() {
      n_AA_11 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'n_Aa_10' field */
    public Integer getNAa10() {
      return n_Aa_10;
    }
    
    /** Sets the value of the 'n_Aa_10' field */
    public Builder setNAa10(Integer value) {
      validate(fields()[4], value);
      this.n_Aa_10 = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'n_Aa_10' field has been set */
    public boolean hasNAa10() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'n_Aa_10' field */
    public Builder clearNAa10() {
      n_Aa_10 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'n_aa_00' field */
    public Integer getNAa00() {
      return n_aa_00;
    }
    
    /** Sets the value of the 'n_aa_00' field */
    public Builder setNAa00(Integer value) {
      validate(fields()[5], value);
      this.n_aa_00 = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'n_aa_00' field has been set */
    public boolean hasNAa00() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'n_aa_00' field */
    public Builder clearNAa00() {
      n_aa_00 = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'e_AA_11' field */
    public Float getEAA11() {
      return e_AA_11;
    }
    
    /** Sets the value of the 'e_AA_11' field */
    public Builder setEAA11(Float value) {
      validate(fields()[6], value);
      this.e_AA_11 = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'e_AA_11' field has been set */
    public boolean hasEAA11() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'e_AA_11' field */
    public Builder clearEAA11() {
      e_AA_11 = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'e_Aa_10' field */
    public Float getEAa10() {
      return e_Aa_10;
    }
    
    /** Sets the value of the 'e_Aa_10' field */
    public Builder setEAa10(Float value) {
      validate(fields()[7], value);
      this.e_Aa_10 = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'e_Aa_10' field has been set */
    public boolean hasEAa10() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'e_Aa_10' field */
    public Builder clearEAa10() {
      e_Aa_10 = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'e_aa_00' field */
    public Float getEAa00() {
      return e_aa_00;
    }
    
    /** Sets the value of the 'e_aa_00' field */
    public Builder setEAa00(Float value) {
      validate(fields()[8], value);
      this.e_aa_00 = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'e_aa_00' field has been set */
    public boolean hasEAa00() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'e_aa_00' field */
    public Builder clearEAa00() {
      e_aa_00 = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'p' field */
    public Float getP() {
      return p;
    }
    
    /** Sets the value of the 'p' field */
    public Builder setP(Float value) {
      validate(fields()[9], value);
      this.p = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'p' field has been set */
    public boolean hasP() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'p' field */
    public Builder clearP() {
      p = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'q' field */
    public Float getQ() {
      return q;
    }
    
    /** Sets the value of the 'q' field */
    public Builder setQ(Float value) {
      validate(fields()[10], value);
      this.q = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'q' field has been set */
    public boolean hasQ() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'q' field */
    public Builder clearQ() {
      q = null;
      fieldSetFlags()[10] = false;
      return this;
    }

   
    public VariantHardyWeinbergStats build() {
      try {
        VariantHardyWeinbergStats record = new VariantHardyWeinbergStats();
        record.chi2 = fieldSetFlags()[0] ? this.chi2 : (Float) defaultValue(fields()[0]);
        record.pValue = fieldSetFlags()[1] ? this.pValue : (Float) defaultValue(fields()[1]);
        record.n = fieldSetFlags()[2] ? this.n : (Integer) defaultValue(fields()[2]);
        record.n_AA_11 = fieldSetFlags()[3] ? this.n_AA_11 : (Integer) defaultValue(fields()[3]);
        record.n_Aa_10 = fieldSetFlags()[4] ? this.n_Aa_10 : (Integer) defaultValue(fields()[4]);
        record.n_aa_00 = fieldSetFlags()[5] ? this.n_aa_00 : (Integer) defaultValue(fields()[5]);
        record.e_AA_11 = fieldSetFlags()[6] ? this.e_AA_11 : (Float) defaultValue(fields()[6]);
        record.e_Aa_10 = fieldSetFlags()[7] ? this.e_Aa_10 : (Float) defaultValue(fields()[7]);
        record.e_aa_00 = fieldSetFlags()[8] ? this.e_aa_00 : (Float) defaultValue(fields()[8]);
        record.p = fieldSetFlags()[9] ? this.p : (Float) defaultValue(fields()[9]);
        record.q = fieldSetFlags()[10] ? this.q : (Float) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}