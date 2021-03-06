// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vip/ResGetVipInfoMsg.proto

package com.chuangyou.common.protobuf.pb.vip;

public final class ResGetVipInfoMsgProto {
  private ResGetVipInfoMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResGetVipInfoMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResGetVipInfoMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 vipLv = 1;</code>
     *
     * <pre>
     *vip 等级
     * </pre>
     */
    boolean hasVipLv();
    /**
     * <code>required int32 vipLv = 1;</code>
     *
     * <pre>
     *vip 等级
     * </pre>
     */
    int getVipLv();

    /**
     * <code>required int32 vipExp = 2;</code>
     *
     * <pre>
     *vip 经验
     * </pre>
     */
    boolean hasVipExp();
    /**
     * <code>required int32 vipExp = 2;</code>
     *
     * <pre>
     *vip 经验
     * </pre>
     */
    int getVipExp();

    /**
     * <code>required int64 vipTimeLimit = 3;</code>
     *
     * <pre>
     *vip 到期时间 （时间戳
     * </pre>
     */
    boolean hasVipTimeLimit();
    /**
     * <code>required int64 vipTimeLimit = 3;</code>
     *
     * <pre>
     *vip 到期时间 （时间戳
     * </pre>
     */
    long getVipTimeLimit();

    /**
     * <code>required int64 vipInterimTimeLimit = 4;</code>
     *
     * <pre>
     *临时vip 到期时间（时间戳
     * </pre>
     */
    boolean hasVipInterimTimeLimit();
    /**
     * <code>required int64 vipInterimTimeLimit = 4;</code>
     *
     * <pre>
     *临时vip 到期时间（时间戳
     * </pre>
     */
    long getVipInterimTimeLimit();

    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    java.util.List<java.lang.Integer> getBuyList();
    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    int getBuyCount();
    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    int getBuy(int index);

    /**
     * <code>required int32 isReceive = 6;</code>
     *
     * <pre>
     *是否已经领取了周奖励
     * </pre>
     */
    boolean hasIsReceive();
    /**
     * <code>required int32 isReceive = 6;</code>
     *
     * <pre>
     *是否已经领取了周奖励
     * </pre>
     */
    int getIsReceive();
  }
  /**
   * Protobuf type {@code ResGetVipInfoMsg}
   *
   * <pre>
   * 获取vip 信息
   * </pre>
   */
  public static final class ResGetVipInfoMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ResGetVipInfoMsg)
      ResGetVipInfoMsgOrBuilder {
    // Use ResGetVipInfoMsg.newBuilder() to construct.
    private ResGetVipInfoMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResGetVipInfoMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResGetVipInfoMsg defaultInstance;
    public static ResGetVipInfoMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ResGetVipInfoMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResGetVipInfoMsg(
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
              vipLv_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              vipExp_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              vipTimeLimit_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              vipInterimTimeLimit_ = input.readInt64();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                buy_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              buy_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
                buy_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              while (input.getBytesUntilLimit() > 0) {
                buy_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              isReceive_ = input.readInt32();
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
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          buy_ = java.util.Collections.unmodifiableList(buy_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.internal_static_ResGetVipInfoMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.internal_static_ResGetVipInfoMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.class, com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ResGetVipInfoMsg> PARSER =
        new com.google.protobuf.AbstractParser<ResGetVipInfoMsg>() {
      public ResGetVipInfoMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResGetVipInfoMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResGetVipInfoMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int VIPLV_FIELD_NUMBER = 1;
    private int vipLv_;
    /**
     * <code>required int32 vipLv = 1;</code>
     *
     * <pre>
     *vip 等级
     * </pre>
     */
    public boolean hasVipLv() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 vipLv = 1;</code>
     *
     * <pre>
     *vip 等级
     * </pre>
     */
    public int getVipLv() {
      return vipLv_;
    }

    public static final int VIPEXP_FIELD_NUMBER = 2;
    private int vipExp_;
    /**
     * <code>required int32 vipExp = 2;</code>
     *
     * <pre>
     *vip 经验
     * </pre>
     */
    public boolean hasVipExp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 vipExp = 2;</code>
     *
     * <pre>
     *vip 经验
     * </pre>
     */
    public int getVipExp() {
      return vipExp_;
    }

    public static final int VIPTIMELIMIT_FIELD_NUMBER = 3;
    private long vipTimeLimit_;
    /**
     * <code>required int64 vipTimeLimit = 3;</code>
     *
     * <pre>
     *vip 到期时间 （时间戳
     * </pre>
     */
    public boolean hasVipTimeLimit() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 vipTimeLimit = 3;</code>
     *
     * <pre>
     *vip 到期时间 （时间戳
     * </pre>
     */
    public long getVipTimeLimit() {
      return vipTimeLimit_;
    }

    public static final int VIPINTERIMTIMELIMIT_FIELD_NUMBER = 4;
    private long vipInterimTimeLimit_;
    /**
     * <code>required int64 vipInterimTimeLimit = 4;</code>
     *
     * <pre>
     *临时vip 到期时间（时间戳
     * </pre>
     */
    public boolean hasVipInterimTimeLimit() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 vipInterimTimeLimit = 4;</code>
     *
     * <pre>
     *临时vip 到期时间（时间戳
     * </pre>
     */
    public long getVipInterimTimeLimit() {
      return vipInterimTimeLimit_;
    }

    public static final int BUY_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> buy_;
    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getBuyList() {
      return buy_;
    }
    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    public int getBuyCount() {
      return buy_.size();
    }
    /**
     * <code>repeated int32 buy = 5;</code>
     *
     * <pre>
     *购买过的礼包
     * </pre>
     */
    public int getBuy(int index) {
      return buy_.get(index);
    }

    public static final int ISRECEIVE_FIELD_NUMBER = 6;
    private int isReceive_;
    /**
     * <code>required int32 isReceive = 6;</code>
     *
     * <pre>
     *是否已经领取了周奖励
     * </pre>
     */
    public boolean hasIsReceive() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 isReceive = 6;</code>
     *
     * <pre>
     *是否已经领取了周奖励
     * </pre>
     */
    public int getIsReceive() {
      return isReceive_;
    }

    private void initFields() {
      vipLv_ = 0;
      vipExp_ = 0;
      vipTimeLimit_ = 0L;
      vipInterimTimeLimit_ = 0L;
      buy_ = java.util.Collections.emptyList();
      isReceive_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasVipLv()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVipExp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVipTimeLimit()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVipInterimTimeLimit()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsReceive()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, vipLv_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, vipExp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, vipTimeLimit_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, vipInterimTimeLimit_);
      }
      for (int i = 0; i < buy_.size(); i++) {
        output.writeInt32(5, buy_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, isReceive_);
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
          .computeInt32Size(1, vipLv_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, vipExp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, vipTimeLimit_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, vipInterimTimeLimit_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < buy_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(buy_.get(i));
        }
        size += dataSize;
        size += 1 * getBuyList().size();
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, isReceive_);
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

    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg prototype) {
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
     * Protobuf type {@code ResGetVipInfoMsg}
     *
     * <pre>
     * 获取vip 信息
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResGetVipInfoMsg)
        com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.internal_static_ResGetVipInfoMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.internal_static_ResGetVipInfoMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.class, com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.newBuilder()
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
        vipLv_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        vipExp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        vipTimeLimit_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        vipInterimTimeLimit_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        buy_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        isReceive_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.internal_static_ResGetVipInfoMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg build() {
        com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg result = new com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.vipLv_ = vipLv_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.vipExp_ = vipExp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.vipTimeLimit_ = vipTimeLimit_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.vipInterimTimeLimit_ = vipInterimTimeLimit_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          buy_ = java.util.Collections.unmodifiableList(buy_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.buy_ = buy_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.isReceive_ = isReceive_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg.getDefaultInstance()) return this;
        if (other.hasVipLv()) {
          setVipLv(other.getVipLv());
        }
        if (other.hasVipExp()) {
          setVipExp(other.getVipExp());
        }
        if (other.hasVipTimeLimit()) {
          setVipTimeLimit(other.getVipTimeLimit());
        }
        if (other.hasVipInterimTimeLimit()) {
          setVipInterimTimeLimit(other.getVipInterimTimeLimit());
        }
        if (!other.buy_.isEmpty()) {
          if (buy_.isEmpty()) {
            buy_ = other.buy_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureBuyIsMutable();
            buy_.addAll(other.buy_);
          }
          onChanged();
        }
        if (other.hasIsReceive()) {
          setIsReceive(other.getIsReceive());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasVipLv()) {
          
          return false;
        }
        if (!hasVipExp()) {
          
          return false;
        }
        if (!hasVipTimeLimit()) {
          
          return false;
        }
        if (!hasVipInterimTimeLimit()) {
          
          return false;
        }
        if (!hasIsReceive()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.vip.ResGetVipInfoMsgProto.ResGetVipInfoMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int vipLv_ ;
      /**
       * <code>required int32 vipLv = 1;</code>
       *
       * <pre>
       *vip 等级
       * </pre>
       */
      public boolean hasVipLv() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 vipLv = 1;</code>
       *
       * <pre>
       *vip 等级
       * </pre>
       */
      public int getVipLv() {
        return vipLv_;
      }
      /**
       * <code>required int32 vipLv = 1;</code>
       *
       * <pre>
       *vip 等级
       * </pre>
       */
      public Builder setVipLv(int value) {
        bitField0_ |= 0x00000001;
        vipLv_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 vipLv = 1;</code>
       *
       * <pre>
       *vip 等级
       * </pre>
       */
      public Builder clearVipLv() {
        bitField0_ = (bitField0_ & ~0x00000001);
        vipLv_ = 0;
        onChanged();
        return this;
      }

      private int vipExp_ ;
      /**
       * <code>required int32 vipExp = 2;</code>
       *
       * <pre>
       *vip 经验
       * </pre>
       */
      public boolean hasVipExp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 vipExp = 2;</code>
       *
       * <pre>
       *vip 经验
       * </pre>
       */
      public int getVipExp() {
        return vipExp_;
      }
      /**
       * <code>required int32 vipExp = 2;</code>
       *
       * <pre>
       *vip 经验
       * </pre>
       */
      public Builder setVipExp(int value) {
        bitField0_ |= 0x00000002;
        vipExp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 vipExp = 2;</code>
       *
       * <pre>
       *vip 经验
       * </pre>
       */
      public Builder clearVipExp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        vipExp_ = 0;
        onChanged();
        return this;
      }

      private long vipTimeLimit_ ;
      /**
       * <code>required int64 vipTimeLimit = 3;</code>
       *
       * <pre>
       *vip 到期时间 （时间戳
       * </pre>
       */
      public boolean hasVipTimeLimit() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 vipTimeLimit = 3;</code>
       *
       * <pre>
       *vip 到期时间 （时间戳
       * </pre>
       */
      public long getVipTimeLimit() {
        return vipTimeLimit_;
      }
      /**
       * <code>required int64 vipTimeLimit = 3;</code>
       *
       * <pre>
       *vip 到期时间 （时间戳
       * </pre>
       */
      public Builder setVipTimeLimit(long value) {
        bitField0_ |= 0x00000004;
        vipTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 vipTimeLimit = 3;</code>
       *
       * <pre>
       *vip 到期时间 （时间戳
       * </pre>
       */
      public Builder clearVipTimeLimit() {
        bitField0_ = (bitField0_ & ~0x00000004);
        vipTimeLimit_ = 0L;
        onChanged();
        return this;
      }

      private long vipInterimTimeLimit_ ;
      /**
       * <code>required int64 vipInterimTimeLimit = 4;</code>
       *
       * <pre>
       *临时vip 到期时间（时间戳
       * </pre>
       */
      public boolean hasVipInterimTimeLimit() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int64 vipInterimTimeLimit = 4;</code>
       *
       * <pre>
       *临时vip 到期时间（时间戳
       * </pre>
       */
      public long getVipInterimTimeLimit() {
        return vipInterimTimeLimit_;
      }
      /**
       * <code>required int64 vipInterimTimeLimit = 4;</code>
       *
       * <pre>
       *临时vip 到期时间（时间戳
       * </pre>
       */
      public Builder setVipInterimTimeLimit(long value) {
        bitField0_ |= 0x00000008;
        vipInterimTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 vipInterimTimeLimit = 4;</code>
       *
       * <pre>
       *临时vip 到期时间（时间戳
       * </pre>
       */
      public Builder clearVipInterimTimeLimit() {
        bitField0_ = (bitField0_ & ~0x00000008);
        vipInterimTimeLimit_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> buy_ = java.util.Collections.emptyList();
      private void ensureBuyIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          buy_ = new java.util.ArrayList<java.lang.Integer>(buy_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getBuyList() {
        return java.util.Collections.unmodifiableList(buy_);
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public int getBuyCount() {
        return buy_.size();
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public int getBuy(int index) {
        return buy_.get(index);
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public Builder setBuy(
          int index, int value) {
        ensureBuyIsMutable();
        buy_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public Builder addBuy(int value) {
        ensureBuyIsMutable();
        buy_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public Builder addAllBuy(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBuyIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, buy_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 buy = 5;</code>
       *
       * <pre>
       *购买过的礼包
       * </pre>
       */
      public Builder clearBuy() {
        buy_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      private int isReceive_ ;
      /**
       * <code>required int32 isReceive = 6;</code>
       *
       * <pre>
       *是否已经领取了周奖励
       * </pre>
       */
      public boolean hasIsReceive() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 isReceive = 6;</code>
       *
       * <pre>
       *是否已经领取了周奖励
       * </pre>
       */
      public int getIsReceive() {
        return isReceive_;
      }
      /**
       * <code>required int32 isReceive = 6;</code>
       *
       * <pre>
       *是否已经领取了周奖励
       * </pre>
       */
      public Builder setIsReceive(int value) {
        bitField0_ |= 0x00000020;
        isReceive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 isReceive = 6;</code>
       *
       * <pre>
       *是否已经领取了周奖励
       * </pre>
       */
      public Builder clearIsReceive() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isReceive_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ResGetVipInfoMsg)
    }

    static {
      defaultInstance = new ResGetVipInfoMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ResGetVipInfoMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResGetVipInfoMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResGetVipInfoMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032vip/ResGetVipInfoMsg.proto\"\204\001\n\020ResGetV" +
      "ipInfoMsg\022\r\n\005vipLv\030\001 \002(\005\022\016\n\006vipExp\030\002 \002(\005" +
      "\022\024\n\014vipTimeLimit\030\003 \002(\003\022\033\n\023vipInterimTime" +
      "Limit\030\004 \002(\003\022\013\n\003buy\030\005 \003(\005\022\021\n\tisReceive\030\006 " +
      "\002(\005B=\n$com.chuangyou.common.protobuf.pb." +
      "vipB\025ResGetVipInfoMsgProto"
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
    internal_static_ResGetVipInfoMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResGetVipInfoMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ResGetVipInfoMsg_descriptor,
        new java.lang.String[] { "VipLv", "VipExp", "VipTimeLimit", "VipInterimTimeLimit", "Buy", "IsReceive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
