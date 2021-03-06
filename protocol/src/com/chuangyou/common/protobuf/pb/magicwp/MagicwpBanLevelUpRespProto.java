// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: magicwp/MagicwpBanLevelUpRespMsg.proto

package com.chuangyou.common.protobuf.pb.magicwp;

public final class MagicwpBanLevelUpRespProto {
  private MagicwpBanLevelUpRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MagicwpBanLevelUpRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MagicwpBanLevelUpRespMsg)
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
     * <code>optional int32 level = 2;</code>
     *
     * <pre>
     * 禁制当前等级
     * </pre>
     */
    boolean hasLevel();
    /**
     * <code>optional int32 level = 2;</code>
     *
     * <pre>
     * 禁制当前等级
     * </pre>
     */
    int getLevel();

    /**
     * <code>optional int32 exp = 3;</code>
     *
     * <pre>
     * 当前经验
     * </pre>
     */
    boolean hasExp();
    /**
     * <code>optional int32 exp = 3;</code>
     *
     * <pre>
     * 当前经验
     * </pre>
     */
    int getExp();
  }
  /**
   * Protobuf type {@code MagicwpBanLevelUpRespMsg}
   */
  public static final class MagicwpBanLevelUpRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MagicwpBanLevelUpRespMsg)
      MagicwpBanLevelUpRespMsgOrBuilder {
    // Use MagicwpBanLevelUpRespMsg.newBuilder() to construct.
    private MagicwpBanLevelUpRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MagicwpBanLevelUpRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MagicwpBanLevelUpRespMsg defaultInstance;
    public static MagicwpBanLevelUpRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MagicwpBanLevelUpRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MagicwpBanLevelUpRespMsg(
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
              level_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              exp_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.internal_static_MagicwpBanLevelUpRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.internal_static_MagicwpBanLevelUpRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MagicwpBanLevelUpRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<MagicwpBanLevelUpRespMsg>() {
      public MagicwpBanLevelUpRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MagicwpBanLevelUpRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MagicwpBanLevelUpRespMsg> getParserForType() {
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

    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    /**
     * <code>optional int32 level = 2;</code>
     *
     * <pre>
     * 禁制当前等级
     * </pre>
     */
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 level = 2;</code>
     *
     * <pre>
     * 禁制当前等级
     * </pre>
     */
    public int getLevel() {
      return level_;
    }

    public static final int EXP_FIELD_NUMBER = 3;
    private int exp_;
    /**
     * <code>optional int32 exp = 3;</code>
     *
     * <pre>
     * 当前经验
     * </pre>
     */
    public boolean hasExp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 exp = 3;</code>
     *
     * <pre>
     * 当前经验
     * </pre>
     */
    public int getExp() {
      return exp_;
    }

    private void initFields() {
      banId_ = 0;
      level_ = 0;
      exp_ = 0;
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
        output.writeInt32(2, level_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, exp_);
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
          .computeInt32Size(2, level_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, exp_);
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

    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg prototype) {
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
     * Protobuf type {@code MagicwpBanLevelUpRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MagicwpBanLevelUpRespMsg)
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.internal_static_MagicwpBanLevelUpRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.internal_static_MagicwpBanLevelUpRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.newBuilder()
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
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        exp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.internal_static_MagicwpBanLevelUpRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg build() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg result = new com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.banId_ = banId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.exp_ = exp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg.getDefaultInstance()) return this;
        if (other.hasBanId()) {
          setBanId(other.getBanId());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasExp()) {
          setExp(other.getExp());
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
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.magicwp.MagicwpBanLevelUpRespProto.MagicwpBanLevelUpRespMsg) e.getUnfinishedMessage();
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

      private int level_ ;
      /**
       * <code>optional int32 level = 2;</code>
       *
       * <pre>
       * 禁制当前等级
       * </pre>
       */
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 level = 2;</code>
       *
       * <pre>
       * 禁制当前等级
       * </pre>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <code>optional int32 level = 2;</code>
       *
       * <pre>
       * 禁制当前等级
       * </pre>
       */
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000002;
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 level = 2;</code>
       *
       * <pre>
       * 禁制当前等级
       * </pre>
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>optional int32 exp = 3;</code>
       *
       * <pre>
       * 当前经验
       * </pre>
       */
      public boolean hasExp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 exp = 3;</code>
       *
       * <pre>
       * 当前经验
       * </pre>
       */
      public int getExp() {
        return exp_;
      }
      /**
       * <code>optional int32 exp = 3;</code>
       *
       * <pre>
       * 当前经验
       * </pre>
       */
      public Builder setExp(int value) {
        bitField0_ |= 0x00000004;
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 exp = 3;</code>
       *
       * <pre>
       * 当前经验
       * </pre>
       */
      public Builder clearExp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        exp_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MagicwpBanLevelUpRespMsg)
    }

    static {
      defaultInstance = new MagicwpBanLevelUpRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MagicwpBanLevelUpRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MagicwpBanLevelUpRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MagicwpBanLevelUpRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&magicwp/MagicwpBanLevelUpRespMsg.proto" +
      "\"E\n\030MagicwpBanLevelUpRespMsg\022\r\n\005banId\030\001 " +
      "\001(\005\022\r\n\005level\030\002 \001(\005\022\013\n\003exp\030\003 \001(\005BF\n(com.c" +
      "huangyou.common.protobuf.pb.magicwpB\032Mag" +
      "icwpBanLevelUpRespProto"
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
    internal_static_MagicwpBanLevelUpRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MagicwpBanLevelUpRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MagicwpBanLevelUpRespMsg_descriptor,
        new java.lang.String[] { "BanId", "Level", "Exp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
