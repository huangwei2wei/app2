// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: boss/WorldBossTreasureMsg.proto

package com.chuangyou.common.protobuf.pb.boss;

public final class WorldBossTreasureProto {
  private WorldBossTreasureProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface WorldBossTreasureMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldBossTreasureMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 playerId = 1;</code>
     *
     * <pre>
     * 玩家ID
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>optional int64 playerId = 1;</code>
     *
     * <pre>
     * 玩家ID
     * </pre>
     */
    long getPlayerId();

    /**
     * <code>optional int32 treasureCount = 2;</code>
     *
     * <pre>
     *夺到宝条数量
     * </pre>
     */
    boolean hasTreasureCount();
    /**
     * <code>optional int32 treasureCount = 2;</code>
     *
     * <pre>
     *夺到宝条数量
     * </pre>
     */
    int getTreasureCount();
  }
  /**
   * Protobuf type {@code WorldBossTreasureMsg}
   *
   * <pre>
   *世界BOSS夺宝活动，玩家奖励信息
   * </pre>
   */
  public static final class WorldBossTreasureMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:WorldBossTreasureMsg)
      WorldBossTreasureMsgOrBuilder {
    // Use WorldBossTreasureMsg.newBuilder() to construct.
    private WorldBossTreasureMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WorldBossTreasureMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WorldBossTreasureMsg defaultInstance;
    public static WorldBossTreasureMsg getDefaultInstance() {
      return defaultInstance;
    }

    public WorldBossTreasureMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WorldBossTreasureMsg(
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
              playerId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              treasureCount_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.internal_static_WorldBossTreasureMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.internal_static_WorldBossTreasureMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.class, com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<WorldBossTreasureMsg> PARSER =
        new com.google.protobuf.AbstractParser<WorldBossTreasureMsg>() {
      public WorldBossTreasureMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldBossTreasureMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WorldBossTreasureMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private long playerId_;
    /**
     * <code>optional int64 playerId = 1;</code>
     *
     * <pre>
     * 玩家ID
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 playerId = 1;</code>
     *
     * <pre>
     * 玩家ID
     * </pre>
     */
    public long getPlayerId() {
      return playerId_;
    }

    public static final int TREASURECOUNT_FIELD_NUMBER = 2;
    private int treasureCount_;
    /**
     * <code>optional int32 treasureCount = 2;</code>
     *
     * <pre>
     *夺到宝条数量
     * </pre>
     */
    public boolean hasTreasureCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 treasureCount = 2;</code>
     *
     * <pre>
     *夺到宝条数量
     * </pre>
     */
    public int getTreasureCount() {
      return treasureCount_;
    }

    private void initFields() {
      playerId_ = 0L;
      treasureCount_ = 0;
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
        output.writeInt64(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, treasureCount_);
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
          .computeInt64Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, treasureCount_);
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

    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg prototype) {
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
     * Protobuf type {@code WorldBossTreasureMsg}
     *
     * <pre>
     *世界BOSS夺宝活动，玩家奖励信息
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldBossTreasureMsg)
        com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.internal_static_WorldBossTreasureMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.internal_static_WorldBossTreasureMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.class, com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.newBuilder()
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
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        treasureCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.internal_static_WorldBossTreasureMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg build() {
        com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg result = new com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.treasureCount_ = treasureCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasTreasureCount()) {
          setTreasureCount(other.getTreasureCount());
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
        com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.boss.WorldBossTreasureProto.WorldBossTreasureMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long playerId_ ;
      /**
       * <code>optional int64 playerId = 1;</code>
       *
       * <pre>
       * 玩家ID
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 playerId = 1;</code>
       *
       * <pre>
       * 玩家ID
       * </pre>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>optional int64 playerId = 1;</code>
       *
       * <pre>
       * 玩家ID
       * </pre>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 playerId = 1;</code>
       *
       * <pre>
       * 玩家ID
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      private int treasureCount_ ;
      /**
       * <code>optional int32 treasureCount = 2;</code>
       *
       * <pre>
       *夺到宝条数量
       * </pre>
       */
      public boolean hasTreasureCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 treasureCount = 2;</code>
       *
       * <pre>
       *夺到宝条数量
       * </pre>
       */
      public int getTreasureCount() {
        return treasureCount_;
      }
      /**
       * <code>optional int32 treasureCount = 2;</code>
       *
       * <pre>
       *夺到宝条数量
       * </pre>
       */
      public Builder setTreasureCount(int value) {
        bitField0_ |= 0x00000002;
        treasureCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 treasureCount = 2;</code>
       *
       * <pre>
       *夺到宝条数量
       * </pre>
       */
      public Builder clearTreasureCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        treasureCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:WorldBossTreasureMsg)
    }

    static {
      defaultInstance = new WorldBossTreasureMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:WorldBossTreasureMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldBossTreasureMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_WorldBossTreasureMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037boss/WorldBossTreasureMsg.proto\"?\n\024Wor" +
      "ldBossTreasureMsg\022\020\n\010playerId\030\001 \001(\003\022\025\n\rt" +
      "reasureCount\030\002 \001(\005B?\n%com.chuangyou.comm" +
      "on.protobuf.pb.bossB\026WorldBossTreasurePr" +
      "oto"
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
    internal_static_WorldBossTreasureMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldBossTreasureMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_WorldBossTreasureMsg_descriptor,
        new java.lang.String[] { "PlayerId", "TreasureCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
