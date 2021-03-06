// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: soul/CardPieceMsg.proto

package com.chuangyou.common.protobuf.pb.soul;

public final class CardPieceProto {
  private CardPieceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CardPieceMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CardPieceMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 cardId = 1;</code>
     *
     * <pre>
     *ID
     * </pre>
     */
    boolean hasCardId();
    /**
     * <code>required int32 cardId = 1;</code>
     *
     * <pre>
     *ID
     * </pre>
     */
    int getCardId();

    /**
     * <code>required int32 cardCount = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    boolean hasCardCount();
    /**
     * <code>required int32 cardCount = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    int getCardCount();
  }
  /**
   * Protobuf type {@code CardPieceMsg}
   */
  public static final class CardPieceMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CardPieceMsg)
      CardPieceMsgOrBuilder {
    // Use CardPieceMsg.newBuilder() to construct.
    private CardPieceMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CardPieceMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CardPieceMsg defaultInstance;
    public static CardPieceMsg getDefaultInstance() {
      return defaultInstance;
    }

    public CardPieceMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CardPieceMsg(
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
              cardId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              cardCount_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.internal_static_CardPieceMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.internal_static_CardPieceMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.class, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<CardPieceMsg> PARSER =
        new com.google.protobuf.AbstractParser<CardPieceMsg>() {
      public CardPieceMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CardPieceMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CardPieceMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CARDID_FIELD_NUMBER = 1;
    private int cardId_;
    /**
     * <code>required int32 cardId = 1;</code>
     *
     * <pre>
     *ID
     * </pre>
     */
    public boolean hasCardId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 cardId = 1;</code>
     *
     * <pre>
     *ID
     * </pre>
     */
    public int getCardId() {
      return cardId_;
    }

    public static final int CARDCOUNT_FIELD_NUMBER = 2;
    private int cardCount_;
    /**
     * <code>required int32 cardCount = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    public boolean hasCardCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 cardCount = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    public int getCardCount() {
      return cardCount_;
    }

    private void initFields() {
      cardId_ = 0;
      cardCount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCardId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCardCount()) {
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
        output.writeInt32(1, cardId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, cardCount_);
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
          .computeInt32Size(1, cardId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, cardCount_);
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

    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg prototype) {
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
     * Protobuf type {@code CardPieceMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CardPieceMsg)
        com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.internal_static_CardPieceMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.internal_static_CardPieceMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.class, com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.newBuilder()
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
        cardId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        cardCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.internal_static_CardPieceMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg build() {
        com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg result = new com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cardId_ = cardId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.cardCount_ = cardCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg.getDefaultInstance()) return this;
        if (other.hasCardId()) {
          setCardId(other.getCardId());
        }
        if (other.hasCardCount()) {
          setCardCount(other.getCardCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCardId()) {
          
          return false;
        }
        if (!hasCardCount()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.soul.CardPieceProto.CardPieceMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cardId_ ;
      /**
       * <code>required int32 cardId = 1;</code>
       *
       * <pre>
       *ID
       * </pre>
       */
      public boolean hasCardId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 cardId = 1;</code>
       *
       * <pre>
       *ID
       * </pre>
       */
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>required int32 cardId = 1;</code>
       *
       * <pre>
       *ID
       * </pre>
       */
      public Builder setCardId(int value) {
        bitField0_ |= 0x00000001;
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cardId = 1;</code>
       *
       * <pre>
       *ID
       * </pre>
       */
      public Builder clearCardId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int cardCount_ ;
      /**
       * <code>required int32 cardCount = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public boolean hasCardCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 cardCount = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public int getCardCount() {
        return cardCount_;
      }
      /**
       * <code>required int32 cardCount = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public Builder setCardCount(int value) {
        bitField0_ |= 0x00000002;
        cardCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cardCount = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public Builder clearCardCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cardCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CardPieceMsg)
    }

    static {
      defaultInstance = new CardPieceMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CardPieceMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CardPieceMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CardPieceMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027soul/CardPieceMsg.proto\"1\n\014CardPieceMs" +
      "g\022\016\n\006cardId\030\001 \002(\005\022\021\n\tcardCount\030\002 \002(\005B7\n%" +
      "com.chuangyou.common.protobuf.pb.soulB\016C" +
      "ardPieceProto"
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
    internal_static_CardPieceMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CardPieceMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CardPieceMsg_descriptor,
        new java.lang.String[] { "CardId", "CardCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
