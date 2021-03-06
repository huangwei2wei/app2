// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MagicwpBanLevelSetAutoUpRespMsg.proto

package com.chuangyou.common.protobuf.pb.magicwp;

public final class MagicwpBanLevelSetAutoUpRespProto {
  private MagicwpBanLevelSetAutoUpRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MagicwpBanLevelSetAutoUpRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MagicwpBanLevelSetAutoUpRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 banId = 1;</code>
     *
     * <pre>
     * 禁制ID
     * </pre>
     */
    boolean hasBanId();
    /**
     * <code>optional int32 banId = 1;</code>
     *
     * <pre>
     * 禁制ID
     * </pre>
     */
    int getBanId();

    /**
     * <code>optional int32 isAutoUp = 2;</code>
     *
     * <pre>
     * 是否自动升级 1是，0不是
     * </pre>
     */
    boolean hasIsAutoUp();
    /**
     * <code>optional int32 isAutoUp = 2;</code>
     *
     * <pre>
     * 是否自动升级 1是，0不是
     * </pre>
     */
    int getIsAutoUp();
  }
  /**
   * Protobuf type {@code MagicwpBanLevelSetAutoUpRespMsg}
   */
  public static final class MagicwpBanLevelSetAutoUpRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MagicwpBanLevelSetAutoUpRespMsg)
      MagicwpBanLevelSetAutoUpRespMsgOrBuilder {
    // Use MagicwpBanLevelSetAutoUpRespMsg.newBuilder() to construct.
    private MagicwpBanLevelSetAutoUpRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MagicwpBanLevelSetAutoUpRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MagicwpBanLevelSetAutoUpRespMsg defaultInstance;
    public static MagicwpBanLevelSetAutoUpRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MagicwpBanLevelSetAutoUpRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MagicwpBanLevelSetAutoUpRespMsg(
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
              banId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isAutoUp_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.internal_static_MagicwpBanLevelSetAutoUpRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MagicwpBanLevelSetAutoUpRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<MagicwpBanLevelSetAutoUpRespMsg>() {
      public MagicwpBanLevelSetAutoUpRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MagicwpBanLevelSetAutoUpRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MagicwpBanLevelSetAutoUpRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BANID_FIELD_NUMBER = 1;
    private int banId_;
    /**
     * <code>optional int32 banId = 1;</code>
     *
     * <pre>
     * 禁制ID
     * </pre>
     */
    public boolean hasBanId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 banId = 1;</code>
     *
     * <pre>
     * 禁制ID
     * </pre>
     */
    public int getBanId() {
      return banId_;
    }

    public static final int ISAUTOUP_FIELD_NUMBER = 2;
    private int isAutoUp_;
    /**
     * <code>optional int32 isAutoUp = 2;</code>
     *
     * <pre>
     * 是否自动升级 1是，0不是
     * </pre>
     */
    public boolean hasIsAutoUp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 isAutoUp = 2;</code>
     *
     * <pre>
     * 是否自动升级 1是，0不是
     * </pre>
     */
    public int getIsAutoUp() {
      return isAutoUp_;
    }

    private void initFields() {
      banId_ = 0;
      isAutoUp_ = 0;
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
        output.writeInt32(1, banId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, isAutoUp_);
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
          .computeInt32Size(1, banId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, isAutoUp_);
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

    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg prototype) {
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
     * Protobuf type {@code MagicwpBanLevelSetAutoUpRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MagicwpBanLevelSetAutoUpRespMsg)
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.internal_static_MagicwpBanLevelSetAutoUpRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.newBuilder()
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
        banId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        isAutoUp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg build() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg result = new com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.banId_ = banId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isAutoUp_ = isAutoUp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg.getDefaultInstance()) return this;
        if (other.hasBanId()) {
          setBanId(other.getBanId());
        }
        if (other.hasIsAutoUp()) {
          setIsAutoUp(other.getIsAutoUp());
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
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelSetAutoUpRespProto.MagicwpBanLevelSetAutoUpRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int banId_ ;
      /**
       * <code>optional int32 banId = 1;</code>
       *
       * <pre>
       * 禁制ID
       * </pre>
       */
      public boolean hasBanId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 banId = 1;</code>
       *
       * <pre>
       * 禁制ID
       * </pre>
       */
      public int getBanId() {
        return banId_;
      }
      /**
       * <code>optional int32 banId = 1;</code>
       *
       * <pre>
       * 禁制ID
       * </pre>
       */
      public Builder setBanId(int value) {
        bitField0_ |= 0x00000001;
        banId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 banId = 1;</code>
       *
       * <pre>
       * 禁制ID
       * </pre>
       */
      public Builder clearBanId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        banId_ = 0;
        onChanged();
        return this;
      }

      private int isAutoUp_ ;
      /**
       * <code>optional int32 isAutoUp = 2;</code>
       *
       * <pre>
       * 是否自动升级 1是，0不是
       * </pre>
       */
      public boolean hasIsAutoUp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 isAutoUp = 2;</code>
       *
       * <pre>
       * 是否自动升级 1是，0不是
       * </pre>
       */
      public int getIsAutoUp() {
        return isAutoUp_;
      }
      /**
       * <code>optional int32 isAutoUp = 2;</code>
       *
       * <pre>
       * 是否自动升级 1是，0不是
       * </pre>
       */
      public Builder setIsAutoUp(int value) {
        bitField0_ |= 0x00000002;
        isAutoUp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 isAutoUp = 2;</code>
       *
       * <pre>
       * 是否自动升级 1是，0不是
       * </pre>
       */
      public Builder clearIsAutoUp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAutoUp_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MagicwpBanLevelSetAutoUpRespMsg)
    }

    static {
      defaultInstance = new MagicwpBanLevelSetAutoUpRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MagicwpBanLevelSetAutoUpRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MagicwpBanLevelSetAutoUpRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%MagicwpBanLevelSetAutoUpRespMsg.proto\"" +
      "B\n\037MagicwpBanLevelSetAutoUpRespMsg\022\r\n\005ba" +
      "nId\030\001 \001(\005\022\020\n\010isAutoUp\030\002 \001(\005BM\n(com.chuan" +
      "gyou.common.protobuf.pb.magicwpB!Magicwp" +
      "BanLevelSetAutoUpRespProto"
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
    internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MagicwpBanLevelSetAutoUpRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MagicwpBanLevelSetAutoUpRespMsg_descriptor,
        new java.lang.String[] { "BanId", "IsAutoUp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
