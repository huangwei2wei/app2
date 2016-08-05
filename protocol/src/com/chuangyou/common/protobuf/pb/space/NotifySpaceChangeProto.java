// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: space/NotifySpaceChangeMsg.proto

package com.chuangyou.common.protobuf.pb.space;

public final class NotifySpaceChangeProto {
  private NotifySpaceChangeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NotifySpaceChangeMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NotifySpaceChangeMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 gift = 1;</code>
     *
     * <pre>
     *礼物
     * </pre>
     */
    boolean hasGift();
    /**
     * <code>required int32 gift = 1;</code>
     *
     * <pre>
     *礼物
     * </pre>
     */
    int getGift();

    /**
     * <code>required int32 likes = 2;</code>
     *
     * <pre>
     *点赞
     * </pre>
     */
    boolean hasLikes();
    /**
     * <code>required int32 likes = 2;</code>
     *
     * <pre>
     *点赞
     * </pre>
     */
    int getLikes();

    /**
     * <code>required int32 flowers = 3;</code>
     *
     * <pre>
     *送花
     * </pre>
     */
    boolean hasFlowers();
    /**
     * <code>required int32 flowers = 3;</code>
     *
     * <pre>
     *送花
     * </pre>
     */
    int getFlowers();

    /**
     * <code>required int32 eggs = 4;</code>
     *
     * <pre>
     *鸡蛋
     * </pre>
     */
    boolean hasEggs();
    /**
     * <code>required int32 eggs = 4;</code>
     *
     * <pre>
     *鸡蛋
     * </pre>
     */
    int getEggs();

    /**
     * <code>required int32 popularity = 5;</code>
     *
     * <pre>
     *人气值
     * </pre>
     */
    boolean hasPopularity();
    /**
     * <code>required int32 popularity = 5;</code>
     *
     * <pre>
     *人气值
     * </pre>
     */
    int getPopularity();

    /**
     * <code>required int64 playerId = 6;</code>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 playerId = 6;</code>
     */
    long getPlayerId();
  }
  /**
   * Protobuf type {@code NotifySpaceChangeMsg}
   *
   * <pre>
   *通知空间主人。属性发生变更
   * </pre>
   */
  public static final class NotifySpaceChangeMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:NotifySpaceChangeMsg)
      NotifySpaceChangeMsgOrBuilder {
    // Use NotifySpaceChangeMsg.newBuilder() to construct.
    private NotifySpaceChangeMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NotifySpaceChangeMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NotifySpaceChangeMsg defaultInstance;
    public static NotifySpaceChangeMsg getDefaultInstance() {
      return defaultInstance;
    }

    public NotifySpaceChangeMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NotifySpaceChangeMsg(
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
              gift_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              likes_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              flowers_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              eggs_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              popularity_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              playerId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.internal_static_NotifySpaceChangeMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.internal_static_NotifySpaceChangeMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.class, com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<NotifySpaceChangeMsg> PARSER =
        new com.google.protobuf.AbstractParser<NotifySpaceChangeMsg>() {
      public NotifySpaceChangeMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotifySpaceChangeMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NotifySpaceChangeMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int GIFT_FIELD_NUMBER = 1;
    private int gift_;
    /**
     * <code>required int32 gift = 1;</code>
     *
     * <pre>
     *礼物
     * </pre>
     */
    public boolean hasGift() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 gift = 1;</code>
     *
     * <pre>
     *礼物
     * </pre>
     */
    public int getGift() {
      return gift_;
    }

    public static final int LIKES_FIELD_NUMBER = 2;
    private int likes_;
    /**
     * <code>required int32 likes = 2;</code>
     *
     * <pre>
     *点赞
     * </pre>
     */
    public boolean hasLikes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 likes = 2;</code>
     *
     * <pre>
     *点赞
     * </pre>
     */
    public int getLikes() {
      return likes_;
    }

    public static final int FLOWERS_FIELD_NUMBER = 3;
    private int flowers_;
    /**
     * <code>required int32 flowers = 3;</code>
     *
     * <pre>
     *送花
     * </pre>
     */
    public boolean hasFlowers() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 flowers = 3;</code>
     *
     * <pre>
     *送花
     * </pre>
     */
    public int getFlowers() {
      return flowers_;
    }

    public static final int EGGS_FIELD_NUMBER = 4;
    private int eggs_;
    /**
     * <code>required int32 eggs = 4;</code>
     *
     * <pre>
     *鸡蛋
     * </pre>
     */
    public boolean hasEggs() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 eggs = 4;</code>
     *
     * <pre>
     *鸡蛋
     * </pre>
     */
    public int getEggs() {
      return eggs_;
    }

    public static final int POPULARITY_FIELD_NUMBER = 5;
    private int popularity_;
    /**
     * <code>required int32 popularity = 5;</code>
     *
     * <pre>
     *人气值
     * </pre>
     */
    public boolean hasPopularity() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 popularity = 5;</code>
     *
     * <pre>
     *人气值
     * </pre>
     */
    public int getPopularity() {
      return popularity_;
    }

    public static final int PLAYERID_FIELD_NUMBER = 6;
    private long playerId_;
    /**
     * <code>required int64 playerId = 6;</code>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int64 playerId = 6;</code>
     */
    public long getPlayerId() {
      return playerId_;
    }

    private void initFields() {
      gift_ = 0;
      likes_ = 0;
      flowers_ = 0;
      eggs_ = 0;
      popularity_ = 0;
      playerId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasGift()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLikes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFlowers()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEggs()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPopularity()) {
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
        output.writeInt32(1, gift_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, likes_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, flowers_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, eggs_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, popularity_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, playerId_);
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
          .computeInt32Size(1, gift_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, likes_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, flowers_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, eggs_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, popularity_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, playerId_);
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

    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg prototype) {
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
     * Protobuf type {@code NotifySpaceChangeMsg}
     *
     * <pre>
     *通知空间主人。属性发生变更
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NotifySpaceChangeMsg)
        com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.internal_static_NotifySpaceChangeMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.internal_static_NotifySpaceChangeMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.class, com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.newBuilder()
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
        gift_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        likes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        flowers_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        eggs_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        popularity_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.internal_static_NotifySpaceChangeMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg build() {
        com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg result = new com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.gift_ = gift_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.likes_ = likes_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.flowers_ = flowers_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.eggs_ = eggs_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.popularity_ = popularity_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg.getDefaultInstance()) return this;
        if (other.hasGift()) {
          setGift(other.getGift());
        }
        if (other.hasLikes()) {
          setLikes(other.getLikes());
        }
        if (other.hasFlowers()) {
          setFlowers(other.getFlowers());
        }
        if (other.hasEggs()) {
          setEggs(other.getEggs());
        }
        if (other.hasPopularity()) {
          setPopularity(other.getPopularity());
        }
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGift()) {
          
          return false;
        }
        if (!hasLikes()) {
          
          return false;
        }
        if (!hasFlowers()) {
          
          return false;
        }
        if (!hasEggs()) {
          
          return false;
        }
        if (!hasPopularity()) {
          
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
        com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.space.NotifySpaceChangeProto.NotifySpaceChangeMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int gift_ ;
      /**
       * <code>required int32 gift = 1;</code>
       *
       * <pre>
       *礼物
       * </pre>
       */
      public boolean hasGift() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 gift = 1;</code>
       *
       * <pre>
       *礼物
       * </pre>
       */
      public int getGift() {
        return gift_;
      }
      /**
       * <code>required int32 gift = 1;</code>
       *
       * <pre>
       *礼物
       * </pre>
       */
      public Builder setGift(int value) {
        bitField0_ |= 0x00000001;
        gift_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 gift = 1;</code>
       *
       * <pre>
       *礼物
       * </pre>
       */
      public Builder clearGift() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gift_ = 0;
        onChanged();
        return this;
      }

      private int likes_ ;
      /**
       * <code>required int32 likes = 2;</code>
       *
       * <pre>
       *点赞
       * </pre>
       */
      public boolean hasLikes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 likes = 2;</code>
       *
       * <pre>
       *点赞
       * </pre>
       */
      public int getLikes() {
        return likes_;
      }
      /**
       * <code>required int32 likes = 2;</code>
       *
       * <pre>
       *点赞
       * </pre>
       */
      public Builder setLikes(int value) {
        bitField0_ |= 0x00000002;
        likes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 likes = 2;</code>
       *
       * <pre>
       *点赞
       * </pre>
       */
      public Builder clearLikes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        likes_ = 0;
        onChanged();
        return this;
      }

      private int flowers_ ;
      /**
       * <code>required int32 flowers = 3;</code>
       *
       * <pre>
       *送花
       * </pre>
       */
      public boolean hasFlowers() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 flowers = 3;</code>
       *
       * <pre>
       *送花
       * </pre>
       */
      public int getFlowers() {
        return flowers_;
      }
      /**
       * <code>required int32 flowers = 3;</code>
       *
       * <pre>
       *送花
       * </pre>
       */
      public Builder setFlowers(int value) {
        bitField0_ |= 0x00000004;
        flowers_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 flowers = 3;</code>
       *
       * <pre>
       *送花
       * </pre>
       */
      public Builder clearFlowers() {
        bitField0_ = (bitField0_ & ~0x00000004);
        flowers_ = 0;
        onChanged();
        return this;
      }

      private int eggs_ ;
      /**
       * <code>required int32 eggs = 4;</code>
       *
       * <pre>
       *鸡蛋
       * </pre>
       */
      public boolean hasEggs() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 eggs = 4;</code>
       *
       * <pre>
       *鸡蛋
       * </pre>
       */
      public int getEggs() {
        return eggs_;
      }
      /**
       * <code>required int32 eggs = 4;</code>
       *
       * <pre>
       *鸡蛋
       * </pre>
       */
      public Builder setEggs(int value) {
        bitField0_ |= 0x00000008;
        eggs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 eggs = 4;</code>
       *
       * <pre>
       *鸡蛋
       * </pre>
       */
      public Builder clearEggs() {
        bitField0_ = (bitField0_ & ~0x00000008);
        eggs_ = 0;
        onChanged();
        return this;
      }

      private int popularity_ ;
      /**
       * <code>required int32 popularity = 5;</code>
       *
       * <pre>
       *人气值
       * </pre>
       */
      public boolean hasPopularity() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 popularity = 5;</code>
       *
       * <pre>
       *人气值
       * </pre>
       */
      public int getPopularity() {
        return popularity_;
      }
      /**
       * <code>required int32 popularity = 5;</code>
       *
       * <pre>
       *人气值
       * </pre>
       */
      public Builder setPopularity(int value) {
        bitField0_ |= 0x00000010;
        popularity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 popularity = 5;</code>
       *
       * <pre>
       *人气值
       * </pre>
       */
      public Builder clearPopularity() {
        bitField0_ = (bitField0_ & ~0x00000010);
        popularity_ = 0;
        onChanged();
        return this;
      }

      private long playerId_ ;
      /**
       * <code>required int64 playerId = 6;</code>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int64 playerId = 6;</code>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 playerId = 6;</code>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000020;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 playerId = 6;</code>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:NotifySpaceChangeMsg)
    }

    static {
      defaultInstance = new NotifySpaceChangeMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:NotifySpaceChangeMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifySpaceChangeMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_NotifySpaceChangeMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n space/NotifySpaceChangeMsg.proto\"x\n\024No" +
      "tifySpaceChangeMsg\022\014\n\004gift\030\001 \002(\005\022\r\n\005like" +
      "s\030\002 \002(\005\022\017\n\007flowers\030\003 \002(\005\022\014\n\004eggs\030\004 \002(\005\022\022" +
      "\n\npopularity\030\005 \002(\005\022\020\n\010playerId\030\006 \002(\003B@\n&" +
      "com.chuangyou.common.protobuf.pb.spaceB\026" +
      "NotifySpaceChangeProto"
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
    internal_static_NotifySpaceChangeMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NotifySpaceChangeMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_NotifySpaceChangeMsg_descriptor,
        new java.lang.String[] { "Gift", "Likes", "Flowers", "Eggs", "Popularity", "PlayerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
