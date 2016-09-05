// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend/GetRecentlyLinkmansReqMsg.proto

package com.chuangyou.common.protobuf.pb.friend;

public final class GetRecentlyLinkmansReqProto {
  private GetRecentlyLinkmansReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetRecentlyLinkmansReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetRecentlyLinkmansReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    java.util.List<java.lang.Long> getPlayerIdList();
    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    int getPlayerIdCount();
    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    long getPlayerId(int index);
  }
  /**
   * Protobuf type {@code GetRecentlyLinkmansReqMsg}
   *
   * <pre>
   *获取最近联系人列表
   * </pre>
   */
  public static final class GetRecentlyLinkmansReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetRecentlyLinkmansReqMsg)
      GetRecentlyLinkmansReqMsgOrBuilder {
    // Use GetRecentlyLinkmansReqMsg.newBuilder() to construct.
    private GetRecentlyLinkmansReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetRecentlyLinkmansReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetRecentlyLinkmansReqMsg defaultInstance;
    public static GetRecentlyLinkmansReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetRecentlyLinkmansReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetRecentlyLinkmansReqMsg(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                playerId_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerId_.add(input.readInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                playerId_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                playerId_.add(input.readInt64());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          playerId_ = java.util.Collections.unmodifiableList(playerId_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.internal_static_GetRecentlyLinkmansReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.internal_static_GetRecentlyLinkmansReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetRecentlyLinkmansReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetRecentlyLinkmansReqMsg>() {
      public GetRecentlyLinkmansReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetRecentlyLinkmansReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetRecentlyLinkmansReqMsg> getParserForType() {
      return PARSER;
    }

    public static final int PLAYERID_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Long> playerId_;
    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    public java.util.List<java.lang.Long>
        getPlayerIdList() {
      return playerId_;
    }
    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    public int getPlayerIdCount() {
      return playerId_.size();
    }
    /**
     * <code>repeated int64 playerId = 1;</code>
     *
     * <pre>
     *玩家ID
     * </pre>
     */
    public long getPlayerId(int index) {
      return playerId_.get(index);
    }

    private void initFields() {
      playerId_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < playerId_.size(); i++) {
        output.writeInt64(1, playerId_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < playerId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(playerId_.get(i));
        }
        size += dataSize;
        size += 1 * getPlayerIdList().size();
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

    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg prototype) {
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
     * Protobuf type {@code GetRecentlyLinkmansReqMsg}
     *
     * <pre>
     *获取最近联系人列表
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetRecentlyLinkmansReqMsg)
        com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.internal_static_GetRecentlyLinkmansReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.internal_static_GetRecentlyLinkmansReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.class, com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.newBuilder()
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
        playerId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.internal_static_GetRecentlyLinkmansReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg build() {
        com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg result = new com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          playerId_ = java.util.Collections.unmodifiableList(playerId_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.playerId_ = playerId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg.getDefaultInstance()) return this;
        if (!other.playerId_.isEmpty()) {
          if (playerId_.isEmpty()) {
            playerId_ = other.playerId_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlayerIdIsMutable();
            playerId_.addAll(other.playerId_);
          }
          onChanged();
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
        com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.friend.GetRecentlyLinkmansReqProto.GetRecentlyLinkmansReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Long> playerId_ = java.util.Collections.emptyList();
      private void ensurePlayerIdIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          playerId_ = new java.util.ArrayList<java.lang.Long>(playerId_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public java.util.List<java.lang.Long>
          getPlayerIdList() {
        return java.util.Collections.unmodifiableList(playerId_);
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public int getPlayerIdCount() {
        return playerId_.size();
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public long getPlayerId(int index) {
        return playerId_.get(index);
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public Builder setPlayerId(
          int index, long value) {
        ensurePlayerIdIsMutable();
        playerId_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public Builder addPlayerId(long value) {
        ensurePlayerIdIsMutable();
        playerId_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public Builder addAllPlayerId(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensurePlayerIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, playerId_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 playerId = 1;</code>
       *
       * <pre>
       *玩家ID
       * </pre>
       */
      public Builder clearPlayerId() {
        playerId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GetRecentlyLinkmansReqMsg)
    }

    static {
      defaultInstance = new GetRecentlyLinkmansReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetRecentlyLinkmansReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRecentlyLinkmansReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetRecentlyLinkmansReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&friend/GetRecentlyLinkmansReqMsg.proto" +
      "\"-\n\031GetRecentlyLinkmansReqMsg\022\020\n\010playerI" +
      "d\030\001 \003(\003BF\n\'com.chuangyou.common.protobuf" +
      ".pb.friendB\033GetRecentlyLinkmansReqProto"
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
    internal_static_GetRecentlyLinkmansReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetRecentlyLinkmansReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetRecentlyLinkmansReqMsg_descriptor,
        new java.lang.String[] { "PlayerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
