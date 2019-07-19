// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: siddhi_MI_connect.proto

package io.siddhi.extension.io.grpc.util.service;

/**
 * Protobuf type {@code invokesequence.SequenceCallRequest}
 */
public  final class SequenceCallRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:invokesequence.SequenceCallRequest)
    SequenceCallRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SequenceCallRequest.newBuilder() to construct.
  private SequenceCallRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SequenceCallRequest() {
    sequenceName_ = "";
    payloadAsJSON_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SequenceCallRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            sequenceName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            payloadAsJSON_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SiddhiMicroIntegratorProto.internal_static_invokesequence_SequenceCallRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SiddhiMicroIntegratorProto.internal_static_invokesequence_SequenceCallRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SequenceCallRequest.class, SequenceCallRequest.Builder.class);
  }

  public static final int SEQUENCENAME_FIELD_NUMBER = 1;
  private volatile Object sequenceName_;
  /**
   * <code>string sequenceName = 1;</code>
   */
  public String getSequenceName() {
    Object ref = sequenceName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      sequenceName_ = s;
      return s;
    }
  }
  /**
   * <code>string sequenceName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSequenceNameBytes() {
    Object ref = sequenceName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sequenceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOADASJSON_FIELD_NUMBER = 2;
  private volatile Object payloadAsJSON_;
  /**
   * <pre>
   *json or xml
   * </pre>
   *
   * <code>string payloadAsJSON = 2;</code>
   */
  public String getPayloadAsJSON() {
    Object ref = payloadAsJSON_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      payloadAsJSON_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *json or xml
   * </pre>
   *
   * <code>string payloadAsJSON = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPayloadAsJSONBytes() {
    Object ref = payloadAsJSON_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      payloadAsJSON_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSequenceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sequenceName_);
    }
    if (!getPayloadAsJSONBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, payloadAsJSON_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSequenceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sequenceName_);
    }
    if (!getPayloadAsJSONBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, payloadAsJSON_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SequenceCallRequest)) {
      return super.equals(obj);
    }
    SequenceCallRequest other = (SequenceCallRequest) obj;

    if (!getSequenceName()
        .equals(other.getSequenceName())) return false;
    if (!getPayloadAsJSON()
        .equals(other.getPayloadAsJSON())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEQUENCENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSequenceName().hashCode();
    hash = (37 * hash) + PAYLOADASJSON_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadAsJSON().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SequenceCallRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SequenceCallRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SequenceCallRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SequenceCallRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SequenceCallRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SequenceCallRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SequenceCallRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SequenceCallRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SequenceCallRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SequenceCallRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SequenceCallRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SequenceCallRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SequenceCallRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code invokesequence.SequenceCallRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:invokesequence.SequenceCallRequest)
      SequenceCallRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SiddhiMicroIntegratorProto.internal_static_invokesequence_SequenceCallRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SiddhiMicroIntegratorProto.internal_static_invokesequence_SequenceCallRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SequenceCallRequest.class, SequenceCallRequest.Builder.class);
    }

    // Construct using io.siddhi.extension.io.grpc.util.service.SequenceCallRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      sequenceName_ = "";

      payloadAsJSON_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SiddhiMicroIntegratorProto.internal_static_invokesequence_SequenceCallRequest_descriptor;
    }

    @Override
    public SequenceCallRequest getDefaultInstanceForType() {
      return SequenceCallRequest.getDefaultInstance();
    }

    @Override
    public SequenceCallRequest build() {
      SequenceCallRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SequenceCallRequest buildPartial() {
      SequenceCallRequest result = new SequenceCallRequest(this);
      result.sequenceName_ = sequenceName_;
      result.payloadAsJSON_ = payloadAsJSON_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SequenceCallRequest) {
        return mergeFrom((SequenceCallRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SequenceCallRequest other) {
      if (other == SequenceCallRequest.getDefaultInstance()) return this;
      if (!other.getSequenceName().isEmpty()) {
        sequenceName_ = other.sequenceName_;
        onChanged();
      }
      if (!other.getPayloadAsJSON().isEmpty()) {
        payloadAsJSON_ = other.payloadAsJSON_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SequenceCallRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SequenceCallRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object sequenceName_ = "";
    /**
     * <code>string sequenceName = 1;</code>
     */
    public String getSequenceName() {
      Object ref = sequenceName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sequenceName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string sequenceName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSequenceNameBytes() {
      Object ref = sequenceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sequenceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sequenceName = 1;</code>
     */
    public Builder setSequenceName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      sequenceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sequenceName = 1;</code>
     */
    public Builder clearSequenceName() {

      sequenceName_ = getDefaultInstance().getSequenceName();
      onChanged();
      return this;
    }
    /**
     * <code>string sequenceName = 1;</code>
     */
    public Builder setSequenceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      sequenceName_ = value;
      onChanged();
      return this;
    }

    private Object payloadAsJSON_ = "";
    /**
     * <pre>
     *json or xml
     * </pre>
     *
     * <code>string payloadAsJSON = 2;</code>
     */
    public String getPayloadAsJSON() {
      Object ref = payloadAsJSON_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        payloadAsJSON_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *json or xml
     * </pre>
     *
     * <code>string payloadAsJSON = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPayloadAsJSONBytes() {
      Object ref = payloadAsJSON_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        payloadAsJSON_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *json or xml
     * </pre>
     *
     * <code>string payloadAsJSON = 2;</code>
     */
    public Builder setPayloadAsJSON(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      payloadAsJSON_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *json or xml
     * </pre>
     *
     * <code>string payloadAsJSON = 2;</code>
     */
    public Builder clearPayloadAsJSON() {

      payloadAsJSON_ = getDefaultInstance().getPayloadAsJSON();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *json or xml
     * </pre>
     *
     * <code>string payloadAsJSON = 2;</code>
     */
    public Builder setPayloadAsJSONBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      payloadAsJSON_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:invokesequence.SequenceCallRequest)
  }

  // @@protoc_insertion_point(class_scope:invokesequence.SequenceCallRequest)
  private static final SequenceCallRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SequenceCallRequest();
  }

  public static SequenceCallRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SequenceCallRequest>
      PARSER = new com.google.protobuf.AbstractParser<SequenceCallRequest>() {
    @Override
    public SequenceCallRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SequenceCallRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SequenceCallRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SequenceCallRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public SequenceCallRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

