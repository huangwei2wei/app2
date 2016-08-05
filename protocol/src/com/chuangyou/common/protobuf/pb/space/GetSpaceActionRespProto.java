// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: space/GetSpaceActionRespMsg.proto

package com.chuangyou.common.protobuf.pb.space;

public final class GetSpaceActionRespProto {
  private GetSpaceActionRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetSpaceActionRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetSpaceActionRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    long getPlayerId();

    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> 
        getInfosList();
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg getInfos(int index);
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    int getInfosCount();
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder> 
        getInfosOrBuilderList();
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder getInfosOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetSpaceActionRespMsg}
   *
   * <pre>
   *请求操作日志（点赞。送花，鸡蛋。。。。）
   * </pre>
   */
  public static final class GetSpaceActionRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetSpaceActionRespMsg)
      GetSpaceActionRespMsgOrBuilder {
    // Use GetSpaceActionRespMsg.newBuilder() to construct.
    private GetSpaceActionRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetSpaceActionRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetSpaceActionRespMsg defaultInstance;
    public static GetSpaceActionRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetSpaceActionRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetSpaceActionRespMsg(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                infos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg>();
                mutable_bitField0_ |= 0x00000002;
              }
              infos_.add(input.readMessage(com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          infos_ = java.util.Collections.unmodifiableList(infos_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.internal_static_GetSpaceActionRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.internal_static_GetSpaceActionRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.class, com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetSpaceActionRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetSpaceActionRespMsg>() {
      public GetSpaceActionRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetSpaceActionRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetSpaceActionRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private long playerId_;
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    public long getPlayerId() {
      return playerId_;
    }

    public static final int INFOS_FIELD_NUMBER = 2;
    private java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> infos_;
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> getInfosList() {
      return infos_;
    }
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder> 
        getInfosOrBuilderList() {
      return infos_;
    }
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    public int getInfosCount() {
      return infos_.size();
    }
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg getInfos(int index) {
      return infos_.get(index);
    }
    /**
     * <code>repeated .ActionLogMsg infos = 2;</code>
     *
     * <pre>
     *记录数组
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder getInfosOrBuilder(
        int index) {
      return infos_.get(index);
    }

    private void initFields() {
      playerId_ = 0L;
      infos_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < getInfosCount(); i++) {
        if (!getInfos(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
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
      for (int i = 0; i < infos_.size(); i++) {
        output.writeMessage(2, infos_.get(i));
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
      for (int i = 0; i < infos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, infos_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg prototype) {
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
     * Protobuf type {@code GetSpaceActionRespMsg}
     *
     * <pre>
     *请求操作日志（点赞。送花，鸡蛋。。。。）
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetSpaceActionRespMsg)
        com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.internal_static_GetSpaceActionRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.internal_static_GetSpaceActionRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.class, com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.newBuilder()
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
          getInfosFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          infosBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.internal_static_GetSpaceActionRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg build() {
        com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg result = new com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (infosBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            infos_ = java.util.Collections.unmodifiableList(infos_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.infos_ = infos_;
        } else {
          result.infos_ = infosBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (infosBuilder_ == null) {
          if (!other.infos_.isEmpty()) {
            if (infos_.isEmpty()) {
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureInfosIsMutable();
              infos_.addAll(other.infos_);
            }
            onChanged();
          }
        } else {
          if (!other.infos_.isEmpty()) {
            if (infosBuilder_.isEmpty()) {
              infosBuilder_.dispose();
              infosBuilder_ = null;
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000002);
              infosBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getInfosFieldBuilder() : null;
            } else {
              infosBuilder_.addAllMessages(other.infos_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        for (int i = 0; i < getInfosCount(); i++) {
          if (!getInfos(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.space.GetSpaceActionRespProto.GetSpaceActionRespMsg) e.getUnfinishedMessage();
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
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       * </pre>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
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
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> infos_ =
        java.util.Collections.emptyList();
      private void ensureInfosIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          infos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg>(infos_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder> infosBuilder_;

      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> getInfosList() {
        if (infosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infos_);
        } else {
          return infosBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public int getInfosCount() {
        if (infosBuilder_ == null) {
          return infos_.size();
        } else {
          return infosBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg getInfos(int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);
        } else {
          return infosBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder setInfos(
          int index, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.set(index, value);
          onChanged();
        } else {
          infosBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder setInfos(
          int index, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.set(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder addInfos(com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(value);
          onChanged();
        } else {
          infosBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder addInfos(
          int index, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(index, value);
          onChanged();
        } else {
          infosBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder addInfos(
          com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder addInfos(
          int index, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder addAllInfos(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg> values) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, infos_);
          onChanged();
        } else {
          infosBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder clearInfos() {
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          infosBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public Builder removeInfos(int index) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.remove(index);
          onChanged();
        } else {
          infosBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder getInfosBuilder(
          int index) {
        return getInfosFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder getInfosOrBuilder(
          int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);  } else {
          return infosBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder> 
           getInfosOrBuilderList() {
        if (infosBuilder_ != null) {
          return infosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infos_);
        }
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder addInfosBuilder() {
        return getInfosFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder addInfosBuilder(
          int index) {
        return getInfosFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ActionLogMsg infos = 2;</code>
       *
       * <pre>
       *记录数组
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder> 
           getInfosBuilderList() {
        return getInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder> 
          getInfosFieldBuilder() {
        if (infosBuilder_ == null) {
          infosBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsg.Builder, com.chuangyou.common.protobuf.pb.space.ActionLogProto.ActionLogMsgOrBuilder>(
                  infos_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          infos_ = null;
        }
        return infosBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GetSpaceActionRespMsg)
    }

    static {
      defaultInstance = new GetSpaceActionRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetSpaceActionRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSpaceActionRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetSpaceActionRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!space/GetSpaceActionRespMsg.proto\032\030spa" +
      "ce/ActionLogMsg.proto\"G\n\025GetSpaceActionR" +
      "espMsg\022\020\n\010playerId\030\001 \002(\003\022\034\n\005infos\030\002 \003(\0132" +
      "\r.ActionLogMsgBA\n&com.chuangyou.common.p" +
      "rotobuf.pb.spaceB\027GetSpaceActionRespProt" +
      "o"
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
          com.chuangyou.common.protobuf.pb.space.ActionLogProto.getDescriptor(),
        }, assigner);
    internal_static_GetSpaceActionRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetSpaceActionRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetSpaceActionRespMsg_descriptor,
        new java.lang.String[] { "PlayerId", "Infos", });
    com.chuangyou.common.protobuf.pb.space.ActionLogProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
