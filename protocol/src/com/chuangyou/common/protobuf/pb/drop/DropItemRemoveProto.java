// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drop/DropItemRemoveMsg.proto

package com.chuangyou.common.protobuf.pb.drop;

public final class DropItemRemoveProto {
  private DropItemRemoveProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DropItemRemoveMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DropItemRemoveMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 packageId = 1;</code>
     *
     * <pre>
     * 掉落包ID
     * </pre>
     */
    boolean hasPackageId();
    /**
     * <code>optional int32 packageId = 1;</code>
     *
     * <pre>
     * 掉落包ID
     * </pre>
     */
    int getPackageId();

    /**
     * <code>optional int64 dropItemId = 2;</code>
     *
     * <pre>
     * 掉落物ID
     * </pre>
     */
    boolean hasDropItemId();
    /**
     * <code>optional int64 dropItemId = 2;</code>
     *
     * <pre>
     * 掉落物ID
     * </pre>
     */
    long getDropItemId();
  }
  /**
   * Protobuf type {@code DropItemRemoveMsg}
   */
  public static final class DropItemRemoveMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DropItemRemoveMsg)
      DropItemRemoveMsgOrBuilder {
    // Use DropItemRemoveMsg.newBuilder() to construct.
    private DropItemRemoveMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DropItemRemoveMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DropItemRemoveMsg defaultInstance;
    public static DropItemRemoveMsg getDefaultInstance() {
      return defaultInstance;
    }

    public DropItemRemoveMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DropItemRemoveMsg(
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
              packageId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dropItemId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.internal_static_DropItemRemoveMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.internal_static_DropItemRemoveMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.class, com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<DropItemRemoveMsg> PARSER =
        new com.google.protobuf.AbstractParser<DropItemRemoveMsg>() {
      public DropItemRemoveMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DropItemRemoveMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DropItemRemoveMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PACKAGEID_FIELD_NUMBER = 1;
    private int packageId_;
    /**
     * <code>optional int32 packageId = 1;</code>
     *
     * <pre>
     * 掉落包ID
     * </pre>
     */
    public boolean hasPackageId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 packageId = 1;</code>
     *
     * <pre>
     * 掉落包ID
     * </pre>
     */
    public int getPackageId() {
      return packageId_;
    }

    public static final int DROPITEMID_FIELD_NUMBER = 2;
    private long dropItemId_;
    /**
     * <code>optional int64 dropItemId = 2;</code>
     *
     * <pre>
     * 掉落物ID
     * </pre>
     */
    public boolean hasDropItemId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 dropItemId = 2;</code>
     *
     * <pre>
     * 掉落物ID
     * </pre>
     */
    public long getDropItemId() {
      return dropItemId_;
    }

    private void initFields() {
      packageId_ = 0;
      dropItemId_ = 0L;
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
        output.writeInt32(1, packageId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, dropItemId_);
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
          .computeInt32Size(1, packageId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, dropItemId_);
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

    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg prototype) {
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
     * Protobuf type {@code DropItemRemoveMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DropItemRemoveMsg)
        com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.internal_static_DropItemRemoveMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.internal_static_DropItemRemoveMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.class, com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.newBuilder()
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
        packageId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        dropItemId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.internal_static_DropItemRemoveMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg build() {
        com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg result = new com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.packageId_ = packageId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dropItemId_ = dropItemId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg.getDefaultInstance()) return this;
        if (other.hasPackageId()) {
          setPackageId(other.getPackageId());
        }
        if (other.hasDropItemId()) {
          setDropItemId(other.getDropItemId());
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
        com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.drop.DropItemRemoveProto.DropItemRemoveMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int packageId_ ;
      /**
       * <code>optional int32 packageId = 1;</code>
       *
       * <pre>
       * 掉落包ID
       * </pre>
       */
      public boolean hasPackageId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 packageId = 1;</code>
       *
       * <pre>
       * 掉落包ID
       * </pre>
       */
      public int getPackageId() {
        return packageId_;
      }
      /**
       * <code>optional int32 packageId = 1;</code>
       *
       * <pre>
       * 掉落包ID
       * </pre>
       */
      public Builder setPackageId(int value) {
        bitField0_ |= 0x00000001;
        packageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 packageId = 1;</code>
       *
       * <pre>
       * 掉落包ID
       * </pre>
       */
      public Builder clearPackageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        packageId_ = 0;
        onChanged();
        return this;
      }

      private long dropItemId_ ;
      /**
       * <code>optional int64 dropItemId = 2;</code>
       *
       * <pre>
       * 掉落物ID
       * </pre>
       */
      public boolean hasDropItemId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 dropItemId = 2;</code>
       *
       * <pre>
       * 掉落物ID
       * </pre>
       */
      public long getDropItemId() {
        return dropItemId_;
      }
      /**
       * <code>optional int64 dropItemId = 2;</code>
       *
       * <pre>
       * 掉落物ID
       * </pre>
       */
      public Builder setDropItemId(long value) {
        bitField0_ |= 0x00000002;
        dropItemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 dropItemId = 2;</code>
       *
       * <pre>
       * 掉落物ID
       * </pre>
       */
      public Builder clearDropItemId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dropItemId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DropItemRemoveMsg)
    }

    static {
      defaultInstance = new DropItemRemoveMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DropItemRemoveMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DropItemRemoveMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DropItemRemoveMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034drop/DropItemRemoveMsg.proto\":\n\021DropIt" +
      "emRemoveMsg\022\021\n\tpackageId\030\001 \001(\005\022\022\n\ndropIt" +
      "emId\030\002 \001(\003B<\n%com.chuangyou.common.proto" +
      "buf.pb.dropB\023DropItemRemoveProto"
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
    internal_static_DropItemRemoveMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DropItemRemoveMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DropItemRemoveMsg_descriptor,
        new java.lang.String[] { "PackageId", "DropItemId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
