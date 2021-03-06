// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item/ItemDeleteMsg.proto

package com.chuangyou.common.protobuf.pb.item;

public final class ItemDeleteMsgProto {
  private ItemDeleteMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ItemDeleteMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemDeleteMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 pos = 1;</code>
     *
     * <pre>
     * 位置
     * </pre>
     */
    boolean hasPos();
    /**
     * <code>optional int32 pos = 1;</code>
     *
     * <pre>
     * 位置
     * </pre>
     */
    int getPos();

    /**
     * <code>optional int32 bagType = 2;</code>
     *
     * <pre>
     * 背包类型
     * </pre>
     */
    boolean hasBagType();
    /**
     * <code>optional int32 bagType = 2;</code>
     *
     * <pre>
     * 背包类型
     * </pre>
     */
    int getBagType();
  }
  /**
   * Protobuf type {@code ItemDeleteMsg}
   */
  public static final class ItemDeleteMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ItemDeleteMsg)
      ItemDeleteMsgOrBuilder {
    // Use ItemDeleteMsg.newBuilder() to construct.
    private ItemDeleteMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ItemDeleteMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ItemDeleteMsg defaultInstance;
    public static ItemDeleteMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ItemDeleteMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ItemDeleteMsg(
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
              pos_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              bagType_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.internal_static_ItemDeleteMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.internal_static_ItemDeleteMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.class, com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ItemDeleteMsg> PARSER =
        new com.google.protobuf.AbstractParser<ItemDeleteMsg>() {
      public ItemDeleteMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemDeleteMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ItemDeleteMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int POS_FIELD_NUMBER = 1;
    private int pos_;
    /**
     * <code>optional int32 pos = 1;</code>
     *
     * <pre>
     * 位置
     * </pre>
     */
    public boolean hasPos() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 pos = 1;</code>
     *
     * <pre>
     * 位置
     * </pre>
     */
    public int getPos() {
      return pos_;
    }

    public static final int BAGTYPE_FIELD_NUMBER = 2;
    private int bagType_;
    /**
     * <code>optional int32 bagType = 2;</code>
     *
     * <pre>
     * 背包类型
     * </pre>
     */
    public boolean hasBagType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 bagType = 2;</code>
     *
     * <pre>
     * 背包类型
     * </pre>
     */
    public int getBagType() {
      return bagType_;
    }

    private void initFields() {
      pos_ = 0;
      bagType_ = 0;
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
        output.writeInt32(1, pos_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, bagType_);
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
          .computeInt32Size(1, pos_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, bagType_);
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

    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg prototype) {
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
     * Protobuf type {@code ItemDeleteMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemDeleteMsg)
        com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.internal_static_ItemDeleteMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.internal_static_ItemDeleteMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.class, com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.newBuilder()
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
        pos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        bagType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.internal_static_ItemDeleteMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg build() {
        com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg result = new com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.pos_ = pos_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.bagType_ = bagType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg.getDefaultInstance()) return this;
        if (other.hasPos()) {
          setPos(other.getPos());
        }
        if (other.hasBagType()) {
          setBagType(other.getBagType());
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
        com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.item.ItemDeleteMsgProto.ItemDeleteMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int pos_ ;
      /**
       * <code>optional int32 pos = 1;</code>
       *
       * <pre>
       * 位置
       * </pre>
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 pos = 1;</code>
       *
       * <pre>
       * 位置
       * </pre>
       */
      public int getPos() {
        return pos_;
      }
      /**
       * <code>optional int32 pos = 1;</code>
       *
       * <pre>
       * 位置
       * </pre>
       */
      public Builder setPos(int value) {
        bitField0_ |= 0x00000001;
        pos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 pos = 1;</code>
       *
       * <pre>
       * 位置
       * </pre>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pos_ = 0;
        onChanged();
        return this;
      }

      private int bagType_ ;
      /**
       * <code>optional int32 bagType = 2;</code>
       *
       * <pre>
       * 背包类型
       * </pre>
       */
      public boolean hasBagType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 bagType = 2;</code>
       *
       * <pre>
       * 背包类型
       * </pre>
       */
      public int getBagType() {
        return bagType_;
      }
      /**
       * <code>optional int32 bagType = 2;</code>
       *
       * <pre>
       * 背包类型
       * </pre>
       */
      public Builder setBagType(int value) {
        bitField0_ |= 0x00000002;
        bagType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 bagType = 2;</code>
       *
       * <pre>
       * 背包类型
       * </pre>
       */
      public Builder clearBagType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bagType_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ItemDeleteMsg)
    }

    static {
      defaultInstance = new ItemDeleteMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ItemDeleteMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemDeleteMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ItemDeleteMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030item/ItemDeleteMsg.proto\"-\n\rItemDelete" +
      "Msg\022\013\n\003pos\030\001 \001(\005\022\017\n\007bagType\030\002 \001(\005B;\n%com" +
      ".chuangyou.common.protobuf.pb.itemB\022Item" +
      "DeleteMsgProto"
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
    internal_static_ItemDeleteMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemDeleteMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ItemDeleteMsg_descriptor,
        new java.lang.String[] { "Pos", "BagType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
