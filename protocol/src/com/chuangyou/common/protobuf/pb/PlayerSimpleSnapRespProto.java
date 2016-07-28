// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player/PlayerSimpleSnapRespMsg.proto

package com.chuangyou.common.protobuf.pb;

public final class PlayerSimpleSnapRespProto {
  private PlayerSimpleSnapRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerSimpleSnapRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerSimpleSnapRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     *要查询玩家的角色ID
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     *要查询玩家的角色ID
     * </pre>
     */
    long getPlayerId();

    /**
     * <code>required int32 teamId = 2;</code>
     */
    boolean hasTeamId();
    /**
     * <code>required int32 teamId = 2;</code>
     */
    int getTeamId();

    /**
     * <code>required int32 level = 3;</code>
     */
    boolean hasLevel();
    /**
     * <code>required int32 level = 3;</code>
     */
    int getLevel();

    /**
     * <code>required int32 job = 4;</code>
     */
    boolean hasJob();
    /**
     * <code>required int32 job = 4;</code>
     */
    int getJob();

    /**
     * <code>required int32 skinId = 5;</code>
     */
    boolean hasSkinId();
    /**
     * <code>required int32 skinId = 5;</code>
     */
    int getSkinId();

    /**
     * <code>required string nickName = 6;</code>
     */
    boolean hasNickName();
    /**
     * <code>required string nickName = 6;</code>
     */
    java.lang.String getNickName();
    /**
     * <code>required string nickName = 6;</code>
     */
    com.google.protobuf.ByteString
        getNickNameBytes();

    /**
     * <code>required bool isOnline = 7;</code>
     *
     * <pre>
     *true：在线
     * </pre>
     */
    boolean hasIsOnline();
    /**
     * <code>required bool isOnline = 7;</code>
     *
     * <pre>
     *true：在线
     * </pre>
     */
    boolean getIsOnline();
  }
  /**
   * Protobuf type {@code PlayerSimpleSnapRespMsg}
   */
  public static final class PlayerSimpleSnapRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerSimpleSnapRespMsg)
      PlayerSimpleSnapRespMsgOrBuilder {
    // Use PlayerSimpleSnapRespMsg.newBuilder() to construct.
    private PlayerSimpleSnapRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerSimpleSnapRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerSimpleSnapRespMsg defaultInstance;
    public static PlayerSimpleSnapRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerSimpleSnapRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerSimpleSnapRespMsg(
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
              teamId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              level_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              job_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              skinId_ = input.readInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              nickName_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              isOnline_ = input.readBool();
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
      return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.internal_static_PlayerSimpleSnapRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.internal_static_PlayerSimpleSnapRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.class, com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerSimpleSnapRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerSimpleSnapRespMsg>() {
      public PlayerSimpleSnapRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerSimpleSnapRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerSimpleSnapRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private long playerId_;
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     *要查询玩家的角色ID
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     *要查询玩家的角色ID
     * </pre>
     */
    public long getPlayerId() {
      return playerId_;
    }

    public static final int TEAMID_FIELD_NUMBER = 2;
    private int teamId_;
    /**
     * <code>required int32 teamId = 2;</code>
     */
    public boolean hasTeamId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 teamId = 2;</code>
     */
    public int getTeamId() {
      return teamId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    /**
     * <code>required int32 level = 3;</code>
     */
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 level = 3;</code>
     */
    public int getLevel() {
      return level_;
    }

    public static final int JOB_FIELD_NUMBER = 4;
    private int job_;
    /**
     * <code>required int32 job = 4;</code>
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 job = 4;</code>
     */
    public int getJob() {
      return job_;
    }

    public static final int SKINID_FIELD_NUMBER = 5;
    private int skinId_;
    /**
     * <code>required int32 skinId = 5;</code>
     */
    public boolean hasSkinId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 skinId = 5;</code>
     */
    public int getSkinId() {
      return skinId_;
    }

    public static final int NICKNAME_FIELD_NUMBER = 6;
    private java.lang.Object nickName_;
    /**
     * <code>required string nickName = 6;</code>
     */
    public boolean hasNickName() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required string nickName = 6;</code>
     */
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nickName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string nickName = 6;</code>
     */
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISONLINE_FIELD_NUMBER = 7;
    private boolean isOnline_;
    /**
     * <code>required bool isOnline = 7;</code>
     *
     * <pre>
     *true：在线
     * </pre>
     */
    public boolean hasIsOnline() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required bool isOnline = 7;</code>
     *
     * <pre>
     *true：在线
     * </pre>
     */
    public boolean getIsOnline() {
      return isOnline_;
    }

    private void initFields() {
      playerId_ = 0L;
      teamId_ = 0;
      level_ = 0;
      job_ = 0;
      skinId_ = 0;
      nickName_ = "";
      isOnline_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTeamId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasJob()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSkinId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNickName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsOnline()) {
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
        output.writeInt64(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, teamId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, job_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, skinId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getNickNameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, isOnline_);
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
          .computeInt32Size(2, teamId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, job_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, skinId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getNickNameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isOnline_);
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

    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg prototype) {
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
     * Protobuf type {@code PlayerSimpleSnapRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerSimpleSnapRespMsg)
        com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.internal_static_PlayerSimpleSnapRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.internal_static_PlayerSimpleSnapRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.class, com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.newBuilder()
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
        teamId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        job_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        skinId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        nickName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        isOnline_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.internal_static_PlayerSimpleSnapRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg build() {
        com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg result = new com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.teamId_ = teamId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.job_ = job_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.skinId_ = skinId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.nickName_ = nickName_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.isOnline_ = isOnline_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasTeamId()) {
          setTeamId(other.getTeamId());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasJob()) {
          setJob(other.getJob());
        }
        if (other.hasSkinId()) {
          setSkinId(other.getSkinId());
        }
        if (other.hasNickName()) {
          bitField0_ |= 0x00000020;
          nickName_ = other.nickName_;
          onChanged();
        }
        if (other.hasIsOnline()) {
          setIsOnline(other.getIsOnline());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasTeamId()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasJob()) {
          
          return false;
        }
        if (!hasSkinId()) {
          
          return false;
        }
        if (!hasNickName()) {
          
          return false;
        }
        if (!hasIsOnline()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.PlayerSimpleSnapRespProto.PlayerSimpleSnapRespMsg) e.getUnfinishedMessage();
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
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       *要查询玩家的角色ID
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       *要查询玩家的角色ID
       * </pre>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       *要查询玩家的角色ID
       * </pre>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       *要查询玩家的角色ID
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>required int32 teamId = 2;</code>
       */
      public boolean hasTeamId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 teamId = 2;</code>
       */
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>required int32 teamId = 2;</code>
       */
      public Builder setTeamId(int value) {
        bitField0_ |= 0x00000002;
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 teamId = 2;</code>
       */
      public Builder clearTeamId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        teamId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>required int32 level = 3;</code>
       */
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 level = 3;</code>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <code>required int32 level = 3;</code>
       */
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000004;
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 level = 3;</code>
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }

      private int job_ ;
      /**
       * <code>required int32 job = 4;</code>
       */
      public boolean hasJob() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 job = 4;</code>
       */
      public int getJob() {
        return job_;
      }
      /**
       * <code>required int32 job = 4;</code>
       */
      public Builder setJob(int value) {
        bitField0_ |= 0x00000008;
        job_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 job = 4;</code>
       */
      public Builder clearJob() {
        bitField0_ = (bitField0_ & ~0x00000008);
        job_ = 0;
        onChanged();
        return this;
      }

      private int skinId_ ;
      /**
       * <code>required int32 skinId = 5;</code>
       */
      public boolean hasSkinId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 skinId = 5;</code>
       */
      public int getSkinId() {
        return skinId_;
      }
      /**
       * <code>required int32 skinId = 5;</code>
       */
      public Builder setSkinId(int value) {
        bitField0_ |= 0x00000010;
        skinId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 skinId = 5;</code>
       */
      public Builder clearSkinId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        skinId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object nickName_ = "";
      /**
       * <code>required string nickName = 6;</code>
       */
      public boolean hasNickName() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required string nickName = 6;</code>
       */
      public java.lang.String getNickName() {
        java.lang.Object ref = nickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nickName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string nickName = 6;</code>
       */
      public com.google.protobuf.ByteString
          getNickNameBytes() {
        java.lang.Object ref = nickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string nickName = 6;</code>
       */
      public Builder setNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        nickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string nickName = 6;</code>
       */
      public Builder clearNickName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        nickName_ = getDefaultInstance().getNickName();
        onChanged();
        return this;
      }
      /**
       * <code>required string nickName = 6;</code>
       */
      public Builder setNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        nickName_ = value;
        onChanged();
        return this;
      }

      private boolean isOnline_ ;
      /**
       * <code>required bool isOnline = 7;</code>
       *
       * <pre>
       *true：在线
       * </pre>
       */
      public boolean hasIsOnline() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required bool isOnline = 7;</code>
       *
       * <pre>
       *true：在线
       * </pre>
       */
      public boolean getIsOnline() {
        return isOnline_;
      }
      /**
       * <code>required bool isOnline = 7;</code>
       *
       * <pre>
       *true：在线
       * </pre>
       */
      public Builder setIsOnline(boolean value) {
        bitField0_ |= 0x00000040;
        isOnline_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isOnline = 7;</code>
       *
       * <pre>
       *true：在线
       * </pre>
       */
      public Builder clearIsOnline() {
        bitField0_ = (bitField0_ & ~0x00000040);
        isOnline_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PlayerSimpleSnapRespMsg)
    }

    static {
      defaultInstance = new PlayerSimpleSnapRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerSimpleSnapRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerSimpleSnapRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerSimpleSnapRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$player/PlayerSimpleSnapRespMsg.proto\"\213" +
      "\001\n\027PlayerSimpleSnapRespMsg\022\020\n\010playerId\030\001" +
      " \002(\003\022\016\n\006teamId\030\002 \002(\005\022\r\n\005level\030\003 \002(\005\022\013\n\003j" +
      "ob\030\004 \002(\005\022\016\n\006skinId\030\005 \002(\005\022\020\n\010nickName\030\006 \002" +
      "(\t\022\020\n\010isOnline\030\007 \002(\010B=\n com.chuangyou.co" +
      "mmon.protobuf.pbB\031PlayerSimpleSnapRespPr" +
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
    internal_static_PlayerSimpleSnapRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerSimpleSnapRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerSimpleSnapRespMsg_descriptor,
        new java.lang.String[] { "PlayerId", "TeamId", "Level", "Job", "SkinId", "NickName", "IsOnline", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}