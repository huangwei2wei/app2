// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mount/MountEquipBeanMsg.proto

package com.chuangyou.common.protobuf.pb.mount;

public final class MountEquipBeanProto {
  private MountEquipBeanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MountEquipBeanMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MountEquipBeanMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 equipId = 1;</code>
     *
     * <pre>
     * 装备ID
     * </pre>
     */
    boolean hasEquipId();
    /**
     * <code>optional int32 equipId = 1;</code>
     *
     * <pre>
     * 装备ID
     * </pre>
     */
    int getEquipId();

    /**
     * <code>optional int32 equipLevel = 2;</code>
     *
     * <pre>
     * 装备等级
     * </pre>
     */
    boolean hasEquipLevel();
    /**
     * <code>optional int32 equipLevel = 2;</code>
     *
     * <pre>
     * 装备等级
     * </pre>
     */
    int getEquipLevel();
  }
  /**
   * Protobuf type {@code MountEquipBeanMsg}
   */
  public static final class MountEquipBeanMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MountEquipBeanMsg)
      MountEquipBeanMsgOrBuilder {
    // Use MountEquipBeanMsg.newBuilder() to construct.
    private MountEquipBeanMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MountEquipBeanMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MountEquipBeanMsg defaultInstance;
    public static MountEquipBeanMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MountEquipBeanMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MountEquipBeanMsg(
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
              equipId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              equipLevel_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.internal_static_MountEquipBeanMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.internal_static_MountEquipBeanMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.class, com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MountEquipBeanMsg> PARSER =
        new com.google.protobuf.AbstractParser<MountEquipBeanMsg>() {
      public MountEquipBeanMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MountEquipBeanMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MountEquipBeanMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int EQUIPID_FIELD_NUMBER = 1;
    private int equipId_;
    /**
     * <code>optional int32 equipId = 1;</code>
     *
     * <pre>
     * 装备ID
     * </pre>
     */
    public boolean hasEquipId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 equipId = 1;</code>
     *
     * <pre>
     * 装备ID
     * </pre>
     */
    public int getEquipId() {
      return equipId_;
    }

    public static final int EQUIPLEVEL_FIELD_NUMBER = 2;
    private int equipLevel_;
    /**
     * <code>optional int32 equipLevel = 2;</code>
     *
     * <pre>
     * 装备等级
     * </pre>
     */
    public boolean hasEquipLevel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 equipLevel = 2;</code>
     *
     * <pre>
     * 装备等级
     * </pre>
     */
    public int getEquipLevel() {
      return equipLevel_;
    }

    private void initFields() {
      equipId_ = 0;
      equipLevel_ = 0;
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
        output.writeInt32(1, equipId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, equipLevel_);
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
          .computeInt32Size(1, equipId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, equipLevel_);
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

    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg prototype) {
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
     * Protobuf type {@code MountEquipBeanMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MountEquipBeanMsg)
        com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.internal_static_MountEquipBeanMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.internal_static_MountEquipBeanMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.class, com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.newBuilder()
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
        equipId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        equipLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.internal_static_MountEquipBeanMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg build() {
        com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg result = new com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.equipId_ = equipId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.equipLevel_ = equipLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg.getDefaultInstance()) return this;
        if (other.hasEquipId()) {
          setEquipId(other.getEquipId());
        }
        if (other.hasEquipLevel()) {
          setEquipLevel(other.getEquipLevel());
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
        com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.mount.MountEquipBeanProto.MountEquipBeanMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int equipId_ ;
      /**
       * <code>optional int32 equipId = 1;</code>
       *
       * <pre>
       * 装备ID
       * </pre>
       */
      public boolean hasEquipId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 equipId = 1;</code>
       *
       * <pre>
       * 装备ID
       * </pre>
       */
      public int getEquipId() {
        return equipId_;
      }
      /**
       * <code>optional int32 equipId = 1;</code>
       *
       * <pre>
       * 装备ID
       * </pre>
       */
      public Builder setEquipId(int value) {
        bitField0_ |= 0x00000001;
        equipId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 equipId = 1;</code>
       *
       * <pre>
       * 装备ID
       * </pre>
       */
      public Builder clearEquipId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        equipId_ = 0;
        onChanged();
        return this;
      }

      private int equipLevel_ ;
      /**
       * <code>optional int32 equipLevel = 2;</code>
       *
       * <pre>
       * 装备等级
       * </pre>
       */
      public boolean hasEquipLevel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 equipLevel = 2;</code>
       *
       * <pre>
       * 装备等级
       * </pre>
       */
      public int getEquipLevel() {
        return equipLevel_;
      }
      /**
       * <code>optional int32 equipLevel = 2;</code>
       *
       * <pre>
       * 装备等级
       * </pre>
       */
      public Builder setEquipLevel(int value) {
        bitField0_ |= 0x00000002;
        equipLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 equipLevel = 2;</code>
       *
       * <pre>
       * 装备等级
       * </pre>
       */
      public Builder clearEquipLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        equipLevel_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MountEquipBeanMsg)
    }

    static {
      defaultInstance = new MountEquipBeanMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MountEquipBeanMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MountEquipBeanMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MountEquipBeanMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mount/MountEquipBeanMsg.proto\"8\n\021Mount" +
      "EquipBeanMsg\022\017\n\007equipId\030\001 \001(\005\022\022\n\nequipLe" +
      "vel\030\002 \001(\005B=\n&com.chuangyou.common.protob" +
      "uf.pb.mountB\023MountEquipBeanProto"
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
    internal_static_MountEquipBeanMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MountEquipBeanMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MountEquipBeanMsg_descriptor,
        new java.lang.String[] { "EquipId", "EquipLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}