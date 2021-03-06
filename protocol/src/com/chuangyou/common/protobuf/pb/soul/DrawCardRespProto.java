// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: soul/DrawCardRespMsg.proto

package com.chuangyou.common.protobuf.pb.soul;

public final class DrawCardRespProto {
  private DrawCardRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DrawCardRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DrawCardRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
     * </pre>
     */
    int getType();

    /**
     * <code>required int32 time = 2;</code>
     *
     * <pre>
     *已经抽卡次数
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required int32 time = 2;</code>
     *
     * <pre>
     *已经抽卡次数
     * </pre>
     */
    int getTime();

    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> 
        getInfosList();
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg getInfos(int index);
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    int getInfosCount();
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder> 
        getInfosOrBuilderList();
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder getInfosOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DrawCardRespMsg}
   *
   * <pre>
   *请求抽卡
   * </pre>
   */
  public static final class DrawCardRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DrawCardRespMsg)
      DrawCardRespMsgOrBuilder {
    // Use DrawCardRespMsg.newBuilder() to construct.
    private DrawCardRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DrawCardRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DrawCardRespMsg defaultInstance;
    public static DrawCardRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public DrawCardRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DrawCardRespMsg(
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
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              time_ = input.readInt32();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                infos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg>();
                mutable_bitField0_ |= 0x00000004;
              }
              infos_.add(input.readMessage(com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          infos_ = java.util.Collections.unmodifiableList(infos_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.internal_static_DrawCardRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.internal_static_DrawCardRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.class, com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<DrawCardRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<DrawCardRespMsg>() {
      public DrawCardRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DrawCardRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DrawCardRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
     * </pre>
     */
    public int getType() {
      return type_;
    }

    public static final int TIME_FIELD_NUMBER = 2;
    private int time_;
    /**
     * <code>required int32 time = 2;</code>
     *
     * <pre>
     *已经抽卡次数
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 time = 2;</code>
     *
     * <pre>
     *已经抽卡次数
     * </pre>
     */
    public int getTime() {
      return time_;
    }

    public static final int INFOS_FIELD_NUMBER = 3;
    private java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> infos_;
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> getInfosList() {
      return infos_;
    }
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder> 
        getInfosOrBuilderList() {
      return infos_;
    }
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    public int getInfosCount() {
      return infos_.size();
    }
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg getInfos(int index) {
      return infos_.get(index);
    }
    /**
     * <code>repeated .CardPieceMsg infos = 3;</code>
     *
     * <pre>
     *获得的卡牌碎片
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder getInfosOrBuilder(
        int index) {
      return infos_.get(index);
    }

    private void initFields() {
      type_ = 0;
      time_ = 0;
      infos_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
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
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, time_);
      }
      for (int i = 0; i < infos_.size(); i++) {
        output.writeMessage(3, infos_.get(i));
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, time_);
      }
      for (int i = 0; i < infos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, infos_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg prototype) {
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
     * Protobuf type {@code DrawCardRespMsg}
     *
     * <pre>
     *请求抽卡
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DrawCardRespMsg)
        com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.internal_static_DrawCardRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.internal_static_DrawCardRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.class, com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.newBuilder()
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
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
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
        return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.internal_static_DrawCardRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg build() {
        com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg result = new com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.time_ = time_;
        if (infosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            infos_ = java.util.Collections.unmodifiableList(infos_);
            bitField0_ = (bitField0_ & ~0x00000004);
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
        if (other instanceof com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (infosBuilder_ == null) {
          if (!other.infos_.isEmpty()) {
            if (infos_.isEmpty()) {
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000004);
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
              bitField0_ = (bitField0_ & ~0x00000004);
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
        if (!hasType()) {
          
          return false;
        }
        if (!hasTime()) {
          
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
        com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.soul.DrawCardRespProto.DrawCardRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *抽卡类型    1：免费抽卡一次  2：付费抽卡一次   3：付费抽卡10次
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>required int32 time = 2;</code>
       *
       * <pre>
       *已经抽卡次数
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 time = 2;</code>
       *
       * <pre>
       *已经抽卡次数
       * </pre>
       */
      public int getTime() {
        return time_;
      }
      /**
       * <code>required int32 time = 2;</code>
       *
       * <pre>
       *已经抽卡次数
       * </pre>
       */
      public Builder setTime(int value) {
        bitField0_ |= 0x00000002;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 time = 2;</code>
       *
       * <pre>
       *已经抽卡次数
       * </pre>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        time_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> infos_ =
        java.util.Collections.emptyList();
      private void ensureInfosIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          infos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg>(infos_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder> infosBuilder_;

      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> getInfosList() {
        if (infosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infos_);
        } else {
          return infosBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg getInfos(int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);
        } else {
          return infosBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder setInfos(
          int index, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg value) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder setInfos(
          int index, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder builderForValue) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder addInfos(com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg value) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder addInfos(
          int index, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg value) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder addInfos(
          com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder builderForValue) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder addInfos(
          int index, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder builderForValue) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder addAllInfos(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg> values) {
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public Builder clearInfos() {
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          infosBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
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
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder getInfosBuilder(
          int index) {
        return getInfosFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder getInfosOrBuilder(
          int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);  } else {
          return infosBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder> 
           getInfosOrBuilderList() {
        if (infosBuilder_ != null) {
          return infosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infos_);
        }
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder addInfosBuilder() {
        return getInfosFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder addInfosBuilder(
          int index) {
        return getInfosFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .CardPieceMsg infos = 3;</code>
       *
       * <pre>
       *获得的卡牌碎片
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder> 
           getInfosBuilderList() {
        return getInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder> 
          getInfosFieldBuilder() {
        if (infosBuilder_ == null) {
          infosBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder>(
                  infos_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          infos_ = null;
        }
        return infosBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:DrawCardRespMsg)
    }

    static {
      defaultInstance = new DrawCardRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DrawCardRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DrawCardRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DrawCardRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032soul/DrawCardRespMsg.proto\032\027soul/CardP" +
      "ieceMsg.proto\"K\n\017DrawCardRespMsg\022\014\n\004type" +
      "\030\001 \002(\005\022\014\n\004time\030\002 \002(\005\022\034\n\005infos\030\003 \003(\0132\r.Ca" +
      "rdPieceMsgB:\n%com.chuangyou.common.proto" +
      "buf.pb.soulB\021DrawCardRespProto"
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
          com.chuangyou.common.protobuf.pb.soul.CardPieceProto.getDescriptor(),
        }, assigner);
    internal_static_DrawCardRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DrawCardRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DrawCardRespMsg_descriptor,
        new java.lang.String[] { "Type", "Time", "Infos", });
    com.chuangyou.common.protobuf.pb.soul.CardPieceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
