// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vip/ReqBuyVipMsg.proto

package com.chuangyou.common.protobuf.pb.vip;

public final class ReqBuyVipMsgProto {
  private ReqBuyVipMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReqBuyVipMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReqBuyVipMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 VipId = 1;</code>
     *
     * <pre>
     *要购买的vip id
     * </pre>
     */
    boolean hasVipId();
    /**
     * <code>required int32 VipId = 1;</code>
     *
     * <pre>
     *要购买的vip id
     * </pre>
     */
    int getVipId();

    /**
     * <code>required int64 playerId = 2;</code>
     *
     * <pre>
     *购买者玩家id
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 playerId = 2;</code>
     *
     * <pre>
     *购买者玩家id
     * </pre>
     */
    long getPlayerId();

    /**
     * <code>optional int64 handselPlayerId = 3;</code>
     *
     * <pre>
     *被赠送者玩家id 不填写为自己购买
     * </pre>
     */
    boolean hasHandselPlayerId();
    /**
     * <code>optional int64 handselPlayerId = 3;</code>
     *
     * <pre>
     *被赠送者玩家id 不填写为自己购买
     * </pre>
     */
    long getHandselPlayerId();
  }
  /**
   * Protobuf type {@code ReqBuyVipMsg}
   *
   * <pre>
   *购买vip
   * </pre>
   */
  public static final class ReqBuyVipMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReqBuyVipMsg)
      ReqBuyVipMsgOrBuilder {
    // Use ReqBuyVipMsg.newBuilder() to construct.
    private ReqBuyVipMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReqBuyVipMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReqBuyVipMsg defaultInstance;
    public static ReqBuyVipMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ReqBuyVipMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReqBuyVipMsg(
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
              vipId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              playerId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              handselPlayerId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.internal_static_ReqBuyVipMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.internal_static_ReqBuyVipMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.class, com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ReqBuyVipMsg> PARSER =
        new com.google.protobuf.AbstractParser<ReqBuyVipMsg>() {
      public ReqBuyVipMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqBuyVipMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReqBuyVipMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int VIPID_FIELD_NUMBER = 1;
    private int vipId_;
    /**
     * <code>required int32 VipId = 1;</code>
     *
     * <pre>
     *要购买的vip id
     * </pre>
     */
    public boolean hasVipId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 VipId = 1;</code>
     *
     * <pre>
     *要购买的vip id
     * </pre>
     */
    public int getVipId() {
      return vipId_;
    }

    public static final int PLAYERID_FIELD_NUMBER = 2;
    private long playerId_;
    /**
     * <code>required int64 playerId = 2;</code>
     *
     * <pre>
     *购买者玩家id
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 playerId = 2;</code>
     *
     * <pre>
     *购买者玩家id
     * </pre>
     */
    public long getPlayerId() {
      return playerId_;
    }

    public static final int HANDSELPLAYERID_FIELD_NUMBER = 3;
    private long handselPlayerId_;
    /**
     * <code>optional int64 handselPlayerId = 3;</code>
     *
     * <pre>
     *被赠送者玩家id 不填写为自己购买
     * </pre>
     */
    public boolean hasHandselPlayerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 handselPlayerId = 3;</code>
     *
     * <pre>
     *被赠送者玩家id 不填写为自己购买
     * </pre>
     */
    public long getHandselPlayerId() {
      return handselPlayerId_;
    }

    private void initFields() {
      vipId_ = 0;
      playerId_ = 0L;
      handselPlayerId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasVipId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPlayerId()) {
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
        output.writeInt32(1, vipId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, playerId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, handselPlayerId_);
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
          .computeInt32Size(1, vipId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, playerId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, handselPlayerId_);
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

    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg prototype) {
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
     * Protobuf type {@code ReqBuyVipMsg}
     *
     * <pre>
     *购买vip
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReqBuyVipMsg)
        com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.internal_static_ReqBuyVipMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.internal_static_ReqBuyVipMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.class, com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.newBuilder()
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
        vipId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        handselPlayerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.internal_static_ReqBuyVipMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg build() {
        com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg result = new com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.vipId_ = vipId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.handselPlayerId_ = handselPlayerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg.getDefaultInstance()) return this;
        if (other.hasVipId()) {
          setVipId(other.getVipId());
        }
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasHandselPlayerId()) {
          setHandselPlayerId(other.getHandselPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasVipId()) {
          
          return false;
        }
        if (!hasPlayerId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.vip.ReqBuyVipMsgProto.ReqBuyVipMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int vipId_ ;
      /**
       * <code>required int32 VipId = 1;</code>
       *
       * <pre>
       *要购买的vip id
       * </pre>
       */
      public boolean hasVipId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 VipId = 1;</code>
       *
       * <pre>
       *要购买的vip id
       * </pre>
       */
      public int getVipId() {
        return vipId_;
      }
      /**
       * <code>required int32 VipId = 1;</code>
       *
       * <pre>
       *要购买的vip id
       * </pre>
       */
      public Builder setVipId(int value) {
        bitField0_ |= 0x00000001;
        vipId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 VipId = 1;</code>
       *
       * <pre>
       *要购买的vip id
       * </pre>
       */
      public Builder clearVipId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        vipId_ = 0;
        onChanged();
        return this;
      }

      private long playerId_ ;
      /**
       * <code>required int64 playerId = 2;</code>
       *
       * <pre>
       *购买者玩家id
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 playerId = 2;</code>
       *
       * <pre>
       *购买者玩家id
       * </pre>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 playerId = 2;</code>
       *
       * <pre>
       *购买者玩家id
       * </pre>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000002;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 playerId = 2;</code>
       *
       * <pre>
       *购买者玩家id
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      private long handselPlayerId_ ;
      /**
       * <code>optional int64 handselPlayerId = 3;</code>
       *
       * <pre>
       *被赠送者玩家id 不填写为自己购买
       * </pre>
       */
      public boolean hasHandselPlayerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 handselPlayerId = 3;</code>
       *
       * <pre>
       *被赠送者玩家id 不填写为自己购买
       * </pre>
       */
      public long getHandselPlayerId() {
        return handselPlayerId_;
      }
      /**
       * <code>optional int64 handselPlayerId = 3;</code>
       *
       * <pre>
       *被赠送者玩家id 不填写为自己购买
       * </pre>
       */
      public Builder setHandselPlayerId(long value) {
        bitField0_ |= 0x00000004;
        handselPlayerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 handselPlayerId = 3;</code>
       *
       * <pre>
       *被赠送者玩家id 不填写为自己购买
       * </pre>
       */
      public Builder clearHandselPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        handselPlayerId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReqBuyVipMsg)
    }

    static {
      defaultInstance = new ReqBuyVipMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReqBuyVipMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReqBuyVipMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReqBuyVipMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026vip/ReqBuyVipMsg.proto\"H\n\014ReqBuyVipMsg" +
      "\022\r\n\005VipId\030\001 \002(\005\022\020\n\010playerId\030\002 \002(\003\022\027\n\017han" +
      "dselPlayerId\030\003 \001(\003B9\n$com.chuangyou.comm" +
      "on.protobuf.pb.vipB\021ReqBuyVipMsgProto"
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
    internal_static_ReqBuyVipMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReqBuyVipMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReqBuyVipMsg_descriptor,
        new java.lang.String[] { "VipId", "PlayerId", "HandselPlayerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}