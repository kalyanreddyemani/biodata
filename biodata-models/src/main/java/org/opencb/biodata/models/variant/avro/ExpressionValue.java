/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.opencb.biodata.models.variant.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ExpressionValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExpressionValue\",\"namespace\":\"org.opencb.biodata.models.variant.avro\",\"fields\":[{\"name\":\"experimentalFactor\",\"type\":[\"null\",\"string\"]},{\"name\":\"factorValue\",\"type\":[\"null\",\"string\"]},{\"name\":\"experimentId\",\"type\":[\"null\",\"string\"]},{\"name\":\"technologyPlatform\",\"type\":[\"null\",\"string\"]},{\"name\":\"expression\",\"type\":{\"type\":\"enum\",\"name\":\"Expression\",\"symbols\":[\"UP\",\"DOWN\"]}},{\"name\":\"pvalue\",\"type\":[\"null\",\"float\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence experimentalFactor;
  @Deprecated public java.lang.CharSequence factorValue;
  @Deprecated public java.lang.CharSequence experimentId;
  @Deprecated public java.lang.CharSequence technologyPlatform;
  @Deprecated public org.opencb.biodata.models.variant.avro.Expression expression;
  @Deprecated public java.lang.Float pvalue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ExpressionValue() {}

  /**
   * All-args constructor.
   */
  public ExpressionValue(java.lang.CharSequence experimentalFactor, java.lang.CharSequence factorValue, java.lang.CharSequence experimentId, java.lang.CharSequence technologyPlatform, org.opencb.biodata.models.variant.avro.Expression expression, java.lang.Float pvalue) {
    this.experimentalFactor = experimentalFactor;
    this.factorValue = factorValue;
    this.experimentId = experimentId;
    this.technologyPlatform = technologyPlatform;
    this.expression = expression;
    this.pvalue = pvalue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return experimentalFactor;
    case 1: return factorValue;
    case 2: return experimentId;
    case 3: return technologyPlatform;
    case 4: return expression;
    case 5: return pvalue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: experimentalFactor = (java.lang.CharSequence)value$; break;
    case 1: factorValue = (java.lang.CharSequence)value$; break;
    case 2: experimentId = (java.lang.CharSequence)value$; break;
    case 3: technologyPlatform = (java.lang.CharSequence)value$; break;
    case 4: expression = (org.opencb.biodata.models.variant.avro.Expression)value$; break;
    case 5: pvalue = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'experimentalFactor' field.
   */
  public java.lang.CharSequence getExperimentalFactor() {
    return experimentalFactor;
  }

  /**
   * Sets the value of the 'experimentalFactor' field.
   * @param value the value to set.
   */
  public void setExperimentalFactor(java.lang.CharSequence value) {
    this.experimentalFactor = value;
  }

  /**
   * Gets the value of the 'factorValue' field.
   */
  public java.lang.CharSequence getFactorValue() {
    return factorValue;
  }

  /**
   * Sets the value of the 'factorValue' field.
   * @param value the value to set.
   */
  public void setFactorValue(java.lang.CharSequence value) {
    this.factorValue = value;
  }

  /**
   * Gets the value of the 'experimentId' field.
   */
  public java.lang.CharSequence getExperimentId() {
    return experimentId;
  }

  /**
   * Sets the value of the 'experimentId' field.
   * @param value the value to set.
   */
  public void setExperimentId(java.lang.CharSequence value) {
    this.experimentId = value;
  }

  /**
   * Gets the value of the 'technologyPlatform' field.
   */
  public java.lang.CharSequence getTechnologyPlatform() {
    return technologyPlatform;
  }

  /**
   * Sets the value of the 'technologyPlatform' field.
   * @param value the value to set.
   */
  public void setTechnologyPlatform(java.lang.CharSequence value) {
    this.technologyPlatform = value;
  }

  /**
   * Gets the value of the 'expression' field.
   */
  public org.opencb.biodata.models.variant.avro.Expression getExpression() {
    return expression;
  }

  /**
   * Sets the value of the 'expression' field.
   * @param value the value to set.
   */
  public void setExpression(org.opencb.biodata.models.variant.avro.Expression value) {
    this.expression = value;
  }

  /**
   * Gets the value of the 'pvalue' field.
   */
  public java.lang.Float getPvalue() {
    return pvalue;
  }

  /**
   * Sets the value of the 'pvalue' field.
   * @param value the value to set.
   */
  public void setPvalue(java.lang.Float value) {
    this.pvalue = value;
  }

  /** Creates a new ExpressionValue RecordBuilder */
  public static org.opencb.biodata.models.variant.avro.ExpressionValue.Builder newBuilder() {
    return new org.opencb.biodata.models.variant.avro.ExpressionValue.Builder();
  }
  
  /** Creates a new ExpressionValue RecordBuilder by copying an existing Builder */
  public static org.opencb.biodata.models.variant.avro.ExpressionValue.Builder newBuilder(org.opencb.biodata.models.variant.avro.ExpressionValue.Builder other) {
    return new org.opencb.biodata.models.variant.avro.ExpressionValue.Builder(other);
  }
  
  /** Creates a new ExpressionValue RecordBuilder by copying an existing ExpressionValue instance */
  public static org.opencb.biodata.models.variant.avro.ExpressionValue.Builder newBuilder(org.opencb.biodata.models.variant.avro.ExpressionValue other) {
    return new org.opencb.biodata.models.variant.avro.ExpressionValue.Builder(other);
  }
  
  /**
   * RecordBuilder for ExpressionValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExpressionValue>
    implements org.apache.avro.data.RecordBuilder<ExpressionValue> {

    private java.lang.CharSequence experimentalFactor;
    private java.lang.CharSequence factorValue;
    private java.lang.CharSequence experimentId;
    private java.lang.CharSequence technologyPlatform;
    private org.opencb.biodata.models.variant.avro.Expression expression;
    private java.lang.Float pvalue;

    /** Creates a new Builder */
    private Builder() {
      super(org.opencb.biodata.models.variant.avro.ExpressionValue.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.opencb.biodata.models.variant.avro.ExpressionValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.experimentalFactor)) {
        this.experimentalFactor = data().deepCopy(fields()[0].schema(), other.experimentalFactor);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.factorValue)) {
        this.factorValue = data().deepCopy(fields()[1].schema(), other.factorValue);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.experimentId)) {
        this.experimentId = data().deepCopy(fields()[2].schema(), other.experimentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.technologyPlatform)) {
        this.technologyPlatform = data().deepCopy(fields()[3].schema(), other.technologyPlatform);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expression)) {
        this.expression = data().deepCopy(fields()[4].schema(), other.expression);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pvalue)) {
        this.pvalue = data().deepCopy(fields()[5].schema(), other.pvalue);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ExpressionValue instance */
    private Builder(org.opencb.biodata.models.variant.avro.ExpressionValue other) {
            super(org.opencb.biodata.models.variant.avro.ExpressionValue.SCHEMA$);
      if (isValidValue(fields()[0], other.experimentalFactor)) {
        this.experimentalFactor = data().deepCopy(fields()[0].schema(), other.experimentalFactor);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.factorValue)) {
        this.factorValue = data().deepCopy(fields()[1].schema(), other.factorValue);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.experimentId)) {
        this.experimentId = data().deepCopy(fields()[2].schema(), other.experimentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.technologyPlatform)) {
        this.technologyPlatform = data().deepCopy(fields()[3].schema(), other.technologyPlatform);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expression)) {
        this.expression = data().deepCopy(fields()[4].schema(), other.expression);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pvalue)) {
        this.pvalue = data().deepCopy(fields()[5].schema(), other.pvalue);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'experimentalFactor' field */
    public java.lang.CharSequence getExperimentalFactor() {
      return experimentalFactor;
    }
    
    /** Sets the value of the 'experimentalFactor' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setExperimentalFactor(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.experimentalFactor = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'experimentalFactor' field has been set */
    public boolean hasExperimentalFactor() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'experimentalFactor' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearExperimentalFactor() {
      experimentalFactor = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'factorValue' field */
    public java.lang.CharSequence getFactorValue() {
      return factorValue;
    }
    
    /** Sets the value of the 'factorValue' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setFactorValue(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.factorValue = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'factorValue' field has been set */
    public boolean hasFactorValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'factorValue' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearFactorValue() {
      factorValue = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'experimentId' field */
    public java.lang.CharSequence getExperimentId() {
      return experimentId;
    }
    
    /** Sets the value of the 'experimentId' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setExperimentId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.experimentId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'experimentId' field has been set */
    public boolean hasExperimentId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'experimentId' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearExperimentId() {
      experimentId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'technologyPlatform' field */
    public java.lang.CharSequence getTechnologyPlatform() {
      return technologyPlatform;
    }
    
    /** Sets the value of the 'technologyPlatform' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setTechnologyPlatform(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.technologyPlatform = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'technologyPlatform' field has been set */
    public boolean hasTechnologyPlatform() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'technologyPlatform' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearTechnologyPlatform() {
      technologyPlatform = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'expression' field */
    public org.opencb.biodata.models.variant.avro.Expression getExpression() {
      return expression;
    }
    
    /** Sets the value of the 'expression' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setExpression(org.opencb.biodata.models.variant.avro.Expression value) {
      validate(fields()[4], value);
      this.expression = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'expression' field has been set */
    public boolean hasExpression() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'expression' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearExpression() {
      expression = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pvalue' field */
    public java.lang.Float getPvalue() {
      return pvalue;
    }
    
    /** Sets the value of the 'pvalue' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder setPvalue(java.lang.Float value) {
      validate(fields()[5], value);
      this.pvalue = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pvalue' field has been set */
    public boolean hasPvalue() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pvalue' field */
    public org.opencb.biodata.models.variant.avro.ExpressionValue.Builder clearPvalue() {
      pvalue = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public ExpressionValue build() {
      try {
        ExpressionValue record = new ExpressionValue();
        record.experimentalFactor = fieldSetFlags()[0] ? this.experimentalFactor : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.factorValue = fieldSetFlags()[1] ? this.factorValue : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.experimentId = fieldSetFlags()[2] ? this.experimentId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.technologyPlatform = fieldSetFlags()[3] ? this.technologyPlatform : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.expression = fieldSetFlags()[4] ? this.expression : (org.opencb.biodata.models.variant.avro.Expression) defaultValue(fields()[4]);
        record.pvalue = fieldSetFlags()[5] ? this.pvalue : (java.lang.Float) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
