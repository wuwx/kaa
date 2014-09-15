/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EndpointAttachResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EndpointAttachResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"requestId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"endpointKeyHash\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"result\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String requestId;
   private java.lang.String endpointKeyHash;
   private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EndpointAttachResponse() {}

  /**
   * All-args constructor.
   */
  public EndpointAttachResponse(java.lang.String requestId, java.lang.String endpointKeyHash, org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result) {
    this.requestId = requestId;
    this.endpointKeyHash = endpointKeyHash;
    this.result = result;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return endpointKeyHash;
    case 2: return result;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = (java.lang.String)value$; break;
    case 1: endpointKeyHash = (java.lang.String)value$; break;
    case 2: result = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.String value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'endpointKeyHash' field.
   */
  public java.lang.String getEndpointKeyHash() {
    return endpointKeyHash;
  }

  /**
   * Sets the value of the 'endpointKeyHash' field.
   * @param value the value to set.
   */
  public void setEndpointKeyHash(java.lang.String value) {
    this.endpointKeyHash = value;
  }

  /**
   * Gets the value of the 'result' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
    return result;
  }

  /**
   * Sets the value of the 'result' field.
   * @param value the value to set.
   */
  public void setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
    this.result = value;
  }

  /** Creates a new EndpointAttachResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder();
  }
  
  /** Creates a new EndpointAttachResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder(other);
  }
  
  /** Creates a new EndpointAttachResponse RecordBuilder by copying an existing EndpointAttachResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for EndpointAttachResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EndpointAttachResponse>
    implements org.apache.avro.data.RecordBuilder<EndpointAttachResponse> {

    private java.lang.String requestId;
    private java.lang.String endpointKeyHash;
    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType result;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointKeyHash)) {
        this.endpointKeyHash = data().deepCopy(fields()[1].schema(), other.endpointKeyHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.result)) {
        this.result = data().deepCopy(fields()[2].schema(), other.result);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EndpointAttachResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointKeyHash)) {
        this.endpointKeyHash = data().deepCopy(fields()[1].schema(), other.endpointKeyHash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.result)) {
        this.result = data().deepCopy(fields()[2].schema(), other.result);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'requestId' field */
    public java.lang.String getRequestId() {
      return requestId;
    }
    
    /** Sets the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder setRequestId(java.lang.String value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestId' field has been set */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder clearRequestId() {
      requestId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'endpointKeyHash' field */
    public java.lang.String getEndpointKeyHash() {
      return endpointKeyHash;
    }
    
    /** Sets the value of the 'endpointKeyHash' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder setEndpointKeyHash(java.lang.String value) {
      validate(fields()[1], value);
      this.endpointKeyHash = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'endpointKeyHash' field has been set */
    public boolean hasEndpointKeyHash() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'endpointKeyHash' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder clearEndpointKeyHash() {
      endpointKeyHash = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getResult() {
      return result;
    }
    
    /** Sets the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder setResult(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
      validate(fields()[2], value);
      this.result = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'result' field has been set */
    public boolean hasResult() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'result' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse.Builder clearResult() {
      result = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public EndpointAttachResponse build() {
      try {
        EndpointAttachResponse record = new EndpointAttachResponse();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.String) defaultValue(fields()[0]);
        record.endpointKeyHash = fieldSetFlags()[1] ? this.endpointKeyHash : (java.lang.String) defaultValue(fields()[1]);
        record.result = fieldSetFlags()[2] ? this.result : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
