// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DamageMsg.proto

package com.chuangyou.common.protobuf.pb.battle;

public final class DamageMsgProto {
  private DamageMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DamageMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DamageMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 sourceId = 1;</code>
     *
     * <pre>
     *伤害源ID
     * </pre>
     */
    boolean hasSourceId();
    /**
     * <code>optional int64 sourceId = 1;</code>
     *
     * <pre>
     *伤害源ID
     * </pre>
     */
    long getSourceId();

    /**
     * <code>optional int64 targetId = 2;</code>
     *
     * <pre>
     *目标ID
     * </pre>
     */
    boolean hasTargetId();
    /**
     * <code>optional int64 targetId = 2;</code>
     *
     * <pre>
     *目标ID
     * </pre>
     */
    long getTargetId();

    /**
     * <code>optional int32 damageType = 3;</code>
     *
     * <pre>
     *伤害类型
     * </pre>
     */
    boolean hasDamageType();
    /**
     * <code>optional int32 damageType = 3;</code>
     *
     * <pre>
     *伤害类型
     * </pre>
     */
    int getDamageType();

    /**
     * <code>optional int32 damageValue = 4;</code>
     *
     * <pre>
     *伤害值
     * </pre>
     */
    boolean hasDamageValue();
    /**
     * <code>optional int32 damageValue = 4;</code>
     *
     * <pre>
     *伤害值
     * </pre>
     */
    int getDamageValue();

    /**
     * <code>optional int32 leftValue = 5;</code>
     *
     * <pre>
     *剩余值
     * </pre>
     */
    boolean hasLeftValue();
    /**
     * <code>optional int32 leftValue = 5;</code>
     *
     * <pre>
     *剩余值
     * </pre>
     */
    int getLeftValue();

    /**
     * <code>optional int32 tipType = 6;</code>
     *
     * <pre>
     * 0 正常 1 暴击 2 MISS
     * </pre>
     */
    boolean hasTipType();
    /**
     * <code>optional int32 tipType = 6;</code>
     *
     * <pre>
     * 0 正常 1 暴击 2 MISS
     * </pre>
     */
    int getTipType();

    /**
     * <code>optional int32 fromType = 7;</code>
     *
     * <pre>
     *伤害源类型 1 技能，2 buffer ，3 陷阱
     * </pre>
     */
    boolean hasFromType();
    /**
     * <code>optional int32 fromType = 7;</code>
     *
     * <pre>
     *伤害源类型 1 技能，2 buffer ，3 陷阱
     * </pre>
     */
    int getFromType();

    /**
     * <code>optional int64 fromId = 8;</code>
     *
     * <pre>
     *技能ID
     * </pre>
     */
    boolean hasFromId();
    /**
     * <code>optional int64 fromId = 8;</code>
     *
     * <pre>
     *技能ID
     * </pre>
     */
    long getFromId();

    /**
     * <code>optional int32 order = 9;</code>
     *
     * <pre>
     *第几段伤害
     * </pre>
     */
    boolean hasOrder();
    /**
     * <code>optional int32 order = 9;</code>
     *
     * <pre>
     *第几段伤害
     * </pre>
     */
    int getOrder();
  }
  /**
   * Protobuf type {@code DamageMsg}
   */
  public static final class DamageMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DamageMsg)
      DamageMsgOrBuilder {
    // Use DamageMsg.newBuilder() to construct.
    private DamageMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DamageMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DamageMsg defaultInstance;
    public static DamageMsg getDefaultInstance() {
      return defaultInstance;
    }

    public DamageMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DamageMsg(
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
              sourceId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              targetId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              damageType_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              damageValue_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              leftValue_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              tipType_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              fromType_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              fromId_ = input.readInt64();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              order_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.internal_static_DamageMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.internal_static_DamageMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.class, com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<DamageMsg> PARSER =
        new com.google.protobuf.AbstractParser<DamageMsg>() {
      public DamageMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DamageMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DamageMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SOURCEID_FIELD_NUMBER = 1;
    private long sourceId_;
    /**
     * <code>optional int64 sourceId = 1;</code>
     *
     * <pre>
     *伤害源ID
     * </pre>
     */
    public boolean hasSourceId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 sourceId = 1;</code>
     *
     * <pre>
     *伤害源ID
     * </pre>
     */
    public long getSourceId() {
      return sourceId_;
    }

    public static final int TARGETID_FIELD_NUMBER = 2;
    private long targetId_;
    /**
     * <code>optional int64 targetId = 2;</code>
     *
     * <pre>
     *目标ID
     * </pre>
     */
    public boolean hasTargetId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 targetId = 2;</code>
     *
     * <pre>
     *目标ID
     * </pre>
     */
    public long getTargetId() {
      return targetId_;
    }

    public static final int DAMAGETYPE_FIELD_NUMBER = 3;
    private int damageType_;
    /**
     * <code>optional int32 damageType = 3;</code>
     *
     * <pre>
     *伤害类型
     * </pre>
     */
    public boolean hasDamageType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 damageType = 3;</code>
     *
     * <pre>
     *伤害类型
     * </pre>
     */
    public int getDamageType() {
      return damageType_;
    }

    public static final int DAMAGEVALUE_FIELD_NUMBER = 4;
    private int damageValue_;
    /**
     * <code>optional int32 damageValue = 4;</code>
     *
     * <pre>
     *伤害值
     * </pre>
     */
    public boolean hasDamageValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 damageValue = 4;</code>
     *
     * <pre>
     *伤害值
     * </pre>
     */
    public int getDamageValue() {
      return damageValue_;
    }

    public static final int LEFTVALUE_FIELD_NUMBER = 5;
    private int leftValue_;
    /**
     * <code>optional int32 leftValue = 5;</code>
     *
     * <pre>
     *剩余值
     * </pre>
     */
    public boolean hasLeftValue() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 leftValue = 5;</code>
     *
     * <pre>
     *剩余值
     * </pre>
     */
    public int getLeftValue() {
      return leftValue_;
    }

    public static final int TIPTYPE_FIELD_NUMBER = 6;
    private int tipType_;
    /**
     * <code>optional int32 tipType = 6;</code>
     *
     * <pre>
     * 0 正常 1 暴击 2 MISS
     * </pre>
     */
    public boolean hasTipType() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 tipType = 6;</code>
     *
     * <pre>
     * 0 正常 1 暴击 2 MISS
     * </pre>
     */
    public int getTipType() {
      return tipType_;
    }

    public static final int FROMTYPE_FIELD_NUMBER = 7;
    private int fromType_;
    /**
     * <code>optional int32 fromType = 7;</code>
     *
     * <pre>
     *伤害源类型 1 技能，2 buffer ，3 陷阱
     * </pre>
     */
    public boolean hasFromType() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 fromType = 7;</code>
     *
     * <pre>
     *伤害源类型 1 技能，2 buffer ，3 陷阱
     * </pre>
     */
    public int getFromType() {
      return fromType_;
    }

    public static final int FROMID_FIELD_NUMBER = 8;
    private long fromId_;
    /**
     * <code>optional int64 fromId = 8;</code>
     *
     * <pre>
     *技能ID
     * </pre>
     */
    public boolean hasFromId() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int64 fromId = 8;</code>
     *
     * <pre>
     *技能ID
     * </pre>
     */
    public long getFromId() {
      return fromId_;
    }

    public static final int ORDER_FIELD_NUMBER = 9;
    private int order_;
    /**
     * <code>optional int32 order = 9;</code>
     *
     * <pre>
     *第几段伤害
     * </pre>
     */
    public boolean hasOrder() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional int32 order = 9;</code>
     *
     * <pre>
     *第几段伤害
     * </pre>
     */
    public int getOrder() {
      return order_;
    }

    private void initFields() {
      sourceId_ = 0L;
      targetId_ = 0L;
      damageType_ = 0;
      damageValue_ = 0;
      leftValue_ = 0;
      tipType_ = 0;
      fromType_ = 0;
      fromId_ = 0L;
      order_ = 0;
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
        output.writeInt64(1, sourceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, targetId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, damageType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, damageValue_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, leftValue_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, tipType_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, fromType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt64(8, fromId_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, order_);
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
          .computeInt64Size(1, sourceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, targetId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, damageType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, damageValue_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, leftValue_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, tipType_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, fromType_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, fromId_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, order_);
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

    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg prototype) {
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
     * Protobuf type {@code DamageMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DamageMsg)
        com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.internal_static_DamageMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.internal_static_DamageMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.class, com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.newBuilder()
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
        sourceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        targetId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        damageType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        damageValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        leftValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        tipType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        fromType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        fromId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        order_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.internal_static_DamageMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg build() {
        com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg result = new com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sourceId_ = sourceId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.targetId_ = targetId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.damageType_ = damageType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.damageValue_ = damageValue_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.leftValue_ = leftValue_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.tipType_ = tipType_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.fromType_ = fromType_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.fromId_ = fromId_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.order_ = order_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg.getDefaultInstance()) return this;
        if (other.hasSourceId()) {
          setSourceId(other.getSourceId());
        }
        if (other.hasTargetId()) {
          setTargetId(other.getTargetId());
        }
        if (other.hasDamageType()) {
          setDamageType(other.getDamageType());
        }
        if (other.hasDamageValue()) {
          setDamageValue(other.getDamageValue());
        }
        if (other.hasLeftValue()) {
          setLeftValue(other.getLeftValue());
        }
        if (other.hasTipType()) {
          setTipType(other.getTipType());
        }
        if (other.hasFromType()) {
          setFromType(other.getFromType());
        }
        if (other.hasFromId()) {
          setFromId(other.getFromId());
        }
        if (other.hasOrder()) {
          setOrder(other.getOrder());
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
        com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.battle.DamageMsgProto.DamageMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long sourceId_ ;
      /**
       * <code>optional int64 sourceId = 1;</code>
       *
       * <pre>
       *伤害源ID
       * </pre>
       */
      public boolean hasSourceId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 sourceId = 1;</code>
       *
       * <pre>
       *伤害源ID
       * </pre>
       */
      public long getSourceId() {
        return sourceId_;
      }
      /**
       * <code>optional int64 sourceId = 1;</code>
       *
       * <pre>
       *伤害源ID
       * </pre>
       */
      public Builder setSourceId(long value) {
        bitField0_ |= 0x00000001;
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 sourceId = 1;</code>
       *
       * <pre>
       *伤害源ID
       * </pre>
       */
      public Builder clearSourceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sourceId_ = 0L;
        onChanged();
        return this;
      }

      private long targetId_ ;
      /**
       * <code>optional int64 targetId = 2;</code>
       *
       * <pre>
       *目标ID
       * </pre>
       */
      public boolean hasTargetId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 targetId = 2;</code>
       *
       * <pre>
       *目标ID
       * </pre>
       */
      public long getTargetId() {
        return targetId_;
      }
      /**
       * <code>optional int64 targetId = 2;</code>
       *
       * <pre>
       *目标ID
       * </pre>
       */
      public Builder setTargetId(long value) {
        bitField0_ |= 0x00000002;
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 targetId = 2;</code>
       *
       * <pre>
       *目标ID
       * </pre>
       */
      public Builder clearTargetId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetId_ = 0L;
        onChanged();
        return this;
      }

      private int damageType_ ;
      /**
       * <code>optional int32 damageType = 3;</code>
       *
       * <pre>
       *伤害类型
       * </pre>
       */
      public boolean hasDamageType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 damageType = 3;</code>
       *
       * <pre>
       *伤害类型
       * </pre>
       */
      public int getDamageType() {
        return damageType_;
      }
      /**
       * <code>optional int32 damageType = 3;</code>
       *
       * <pre>
       *伤害类型
       * </pre>
       */
      public Builder setDamageType(int value) {
        bitField0_ |= 0x00000004;
        damageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 damageType = 3;</code>
       *
       * <pre>
       *伤害类型
       * </pre>
       */
      public Builder clearDamageType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        damageType_ = 0;
        onChanged();
        return this;
      }

      private int damageValue_ ;
      /**
       * <code>optional int32 damageValue = 4;</code>
       *
       * <pre>
       *伤害值
       * </pre>
       */
      public boolean hasDamageValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 damageValue = 4;</code>
       *
       * <pre>
       *伤害值
       * </pre>
       */
      public int getDamageValue() {
        return damageValue_;
      }
      /**
       * <code>optional int32 damageValue = 4;</code>
       *
       * <pre>
       *伤害值
       * </pre>
       */
      public Builder setDamageValue(int value) {
        bitField0_ |= 0x00000008;
        damageValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 damageValue = 4;</code>
       *
       * <pre>
       *伤害值
       * </pre>
       */
      public Builder clearDamageValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        damageValue_ = 0;
        onChanged();
        return this;
      }

      private int leftValue_ ;
      /**
       * <code>optional int32 leftValue = 5;</code>
       *
       * <pre>
       *剩余值
       * </pre>
       */
      public boolean hasLeftValue() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 leftValue = 5;</code>
       *
       * <pre>
       *剩余值
       * </pre>
       */
      public int getLeftValue() {
        return leftValue_;
      }
      /**
       * <code>optional int32 leftValue = 5;</code>
       *
       * <pre>
       *剩余值
       * </pre>
       */
      public Builder setLeftValue(int value) {
        bitField0_ |= 0x00000010;
        leftValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 leftValue = 5;</code>
       *
       * <pre>
       *剩余值
       * </pre>
       */
      public Builder clearLeftValue() {
        bitField0_ = (bitField0_ & ~0x00000010);
        leftValue_ = 0;
        onChanged();
        return this;
      }

      private int tipType_ ;
      /**
       * <code>optional int32 tipType = 6;</code>
       *
       * <pre>
       * 0 正常 1 暴击 2 MISS
       * </pre>
       */
      public boolean hasTipType() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 tipType = 6;</code>
       *
       * <pre>
       * 0 正常 1 暴击 2 MISS
       * </pre>
       */
      public int getTipType() {
        return tipType_;
      }
      /**
       * <code>optional int32 tipType = 6;</code>
       *
       * <pre>
       * 0 正常 1 暴击 2 MISS
       * </pre>
       */
      public Builder setTipType(int value) {
        bitField0_ |= 0x00000020;
        tipType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 tipType = 6;</code>
       *
       * <pre>
       * 0 正常 1 暴击 2 MISS
       * </pre>
       */
      public Builder clearTipType() {
        bitField0_ = (bitField0_ & ~0x00000020);
        tipType_ = 0;
        onChanged();
        return this;
      }

      private int fromType_ ;
      /**
       * <code>optional int32 fromType = 7;</code>
       *
       * <pre>
       *伤害源类型 1 技能，2 buffer ，3 陷阱
       * </pre>
       */
      public boolean hasFromType() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 fromType = 7;</code>
       *
       * <pre>
       *伤害源类型 1 技能，2 buffer ，3 陷阱
       * </pre>
       */
      public int getFromType() {
        return fromType_;
      }
      /**
       * <code>optional int32 fromType = 7;</code>
       *
       * <pre>
       *伤害源类型 1 技能，2 buffer ，3 陷阱
       * </pre>
       */
      public Builder setFromType(int value) {
        bitField0_ |= 0x00000040;
        fromType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 fromType = 7;</code>
       *
       * <pre>
       *伤害源类型 1 技能，2 buffer ，3 陷阱
       * </pre>
       */
      public Builder clearFromType() {
        bitField0_ = (bitField0_ & ~0x00000040);
        fromType_ = 0;
        onChanged();
        return this;
      }

      private long fromId_ ;
      /**
       * <code>optional int64 fromId = 8;</code>
       *
       * <pre>
       *技能ID
       * </pre>
       */
      public boolean hasFromId() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int64 fromId = 8;</code>
       *
       * <pre>
       *技能ID
       * </pre>
       */
      public long getFromId() {
        return fromId_;
      }
      /**
       * <code>optional int64 fromId = 8;</code>
       *
       * <pre>
       *技能ID
       * </pre>
       */
      public Builder setFromId(long value) {
        bitField0_ |= 0x00000080;
        fromId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 fromId = 8;</code>
       *
       * <pre>
       *技能ID
       * </pre>
       */
      public Builder clearFromId() {
        bitField0_ = (bitField0_ & ~0x00000080);
        fromId_ = 0L;
        onChanged();
        return this;
      }

      private int order_ ;
      /**
       * <code>optional int32 order = 9;</code>
       *
       * <pre>
       *第几段伤害
       * </pre>
       */
      public boolean hasOrder() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional int32 order = 9;</code>
       *
       * <pre>
       *第几段伤害
       * </pre>
       */
      public int getOrder() {
        return order_;
      }
      /**
       * <code>optional int32 order = 9;</code>
       *
       * <pre>
       *第几段伤害
       * </pre>
       */
      public Builder setOrder(int value) {
        bitField0_ |= 0x00000100;
        order_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 order = 9;</code>
       *
       * <pre>
       *第几段伤害
       * </pre>
       */
      public Builder clearOrder() {
        bitField0_ = (bitField0_ & ~0x00000100);
        order_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DamageMsg)
    }

    static {
      defaultInstance = new DamageMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DamageMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DamageMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DamageMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017DamageMsg.proto\"\255\001\n\tDamageMsg\022\020\n\010sourc" +
      "eId\030\001 \001(\003\022\020\n\010targetId\030\002 \001(\003\022\022\n\ndamageTyp" +
      "e\030\003 \001(\005\022\023\n\013damageValue\030\004 \001(\005\022\021\n\tleftValu" +
      "e\030\005 \001(\005\022\017\n\007tipType\030\006 \001(\005\022\020\n\010fromType\030\007 \001" +
      "(\005\022\016\n\006fromId\030\010 \001(\003\022\r\n\005order\030\t \001(\005B9\n\'com" +
      ".chuangyou.common.protobuf.pb.battleB\016Da" +
      "mageMsgProto"
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
    internal_static_DamageMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DamageMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DamageMsg_descriptor,
        new java.lang.String[] { "SourceId", "TargetId", "DamageType", "DamageValue", "LeftValue", "TipType", "FromType", "FromId", "Order", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
