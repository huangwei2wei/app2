// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttributeBeanMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class AttributeBeanProto {
  private AttributeBeanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AttributeBeanMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttributeBeanMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 attType = 1;</code>
     *
     * <pre>
     * 属性类型
     * </pre>
     */
    boolean hasAttType();
    /**
     * <code>optional int32 attType = 1;</code>
     *
     * <pre>
     * 属性类型
     * </pre>
     */
    int getAttType();

    /**
     * <code>optional int32 attValue = 2;</code>
     *
     * <pre>
     * 属性值
     * </pre>
     */
    boolean hasAttValue();
    /**
     * <code>optional int32 attValue = 2;</code>
     *
     * <pre>
     * 属性值
     * </pre>
     */
    int getAttValue();
  }
  /**
   * Protobuf type {@code AttributeBeanMsg}
   */
  public static final class AttributeBeanMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AttributeBeanMsg)
      AttributeBeanMsgOrBuilder {
    // Use AttributeBeanMsg.newBuilder() to construct.
    private AttributeBeanMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AttributeBeanMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AttributeBeanMsg defaultInstance;
    public static AttributeBeanMsg getDefaultInstance() {
      return defaultInstance;
    }

    public AttributeBeanMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AttributeBeanMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              attType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              attValue_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.AttributeBeanProto.internal_static_AttributeBeanMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.AttributeBeanProto.internal_static_AttributeBeanMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.class, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<AttributeBeanMsg> PARSER =
        new com.google.protobuf.AbstractParser<AttributeBeanMsg>() {
      public AttributeBeanMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttributeBeanMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AttributeBeanMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ATTTYPE_FIELD_NUMBER = 1;
    private int attType_;
    /**
     * <code>optional int32 attType = 1;</code>
     *
     * <pre>
     * 属性类型
     * </pre>
     */
    public boolean hasAttType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 attType = 1;</code>
     *
     * <pre>
     * 属性类型
     * </pre>
     */
    public int getAttType() {
      return attType_;
    }

    public static final int ATTVALUE_FIELD_NUMBER = 2;
    private int attValue_;
    /**
     * <code>optional int32 attValue = 2;</code>
     *
     * <pre>
     * 属性值
     * </pre>
     */
    public boolean hasAttValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 attValue = 2;</code>
     *
     * <pre>
     * 属性值
     * </pre>
     */
    public int getAttValue() {
      return attValue_;
    }

    private void initFields() {
      attType_ = 0;
      attValue_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, attType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, attValue_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, attType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, attValue_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AttributeBeanMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttributeBeanMsg)
        com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.AttributeBeanProto.internal_static_AttributeBeanMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.AttributeBeanProto.internal_static_AttributeBeanMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.class, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        attType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        attValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.AttributeBeanProto.internal_static_AttributeBeanMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg build() {
        com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg result = new com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attType_ = attType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.attValue_ = attValue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.getDefaultInstance()) return this;
        if (other.hasAttType()) {
          setAttType(other.getAttType());
        }
        if (other.hasAttValue()) {
          setAttValue(other.getAttValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int attType_ ;
      /**
       * <code>optional int32 attType = 1;</code>
       *
       * <pre>
       * 属性类型
       * </pre>
       */
      public boolean hasAttType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 attType = 1;</code>
       *
       * <pre>
       * 属性类型
       * </pre>
       */
      public int getAttType() {
        return attType_;
      }
      /**
       * <code>optional int32 attType = 1;</code>
       *
       * <pre>
       * 属性类型
       * </pre>
       */
      public Builder setAttType(int value) {
        bitField0_ |= 0x00000001;
        attType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 attType = 1;</code>
       *
       * <pre>
       * 属性类型
       * </pre>
       */
      public Builder clearAttType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attType_ = 0;
        onChanged();
        return this;
      }

      private int attValue_ ;
      /**
       * <code>optional int32 attValue = 2;</code>
       *
       * <pre>
       * 属性值
       * </pre>
       */
      public boolean hasAttValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 attValue = 2;</code>
       *
       * <pre>
       * 属性值
       * </pre>
       */
      public int getAttValue() {
        return attValue_;
      }
      /**
       * <code>optional int32 attValue = 2;</code>
       *
       * <pre>
       * 属性值
       * </pre>
       */
      public Builder setAttValue(int value) {
        bitField0_ |= 0x00000002;
        attValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 attValue = 2;</code>
       *
       * <pre>
       * 属性值
       * </pre>
       */
      public Builder clearAttValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        attValue_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AttributeBeanMsg)
    }

    static {
      defaultInstance = new AttributeBeanMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AttributeBeanMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttributeBeanMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AttributeBeanMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AttributeBeanMsg.proto\"5\n\020AttributeBea" +
      "nMsg\022\017\n\007attType\030\001 \001(\005\022\020\n\010attValue\030\002 \001(\005B" +
      "6\n com.chuangyou.common.protobuf.pbB\022Att" +
      "ributeBeanProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AttributeBeanMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttributeBeanMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AttributeBeanMsg_descriptor,
        new java.lang.String[] { "AttType", "AttValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
