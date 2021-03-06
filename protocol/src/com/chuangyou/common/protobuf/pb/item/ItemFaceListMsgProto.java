// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item/ItemFaceListMsg.proto

package com.chuangyou.common.protobuf.pb.item;

public final class ItemFaceListMsgProto {
  private ItemFaceListMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ItemFaceListMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemFaceListMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> 
        getItemFaceList();
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg getItemFace(int index);
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    int getItemFaceCount();
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder> 
        getItemFaceOrBuilderList();
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder getItemFaceOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ItemFaceListMsg}
   */
  public static final class ItemFaceListMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ItemFaceListMsg)
      ItemFaceListMsgOrBuilder {
    // Use ItemFaceListMsg.newBuilder() to construct.
    private ItemFaceListMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ItemFaceListMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ItemFaceListMsg defaultInstance;
    public static ItemFaceListMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ItemFaceListMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ItemFaceListMsg(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                itemFace_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemFace_.add(input.readMessage(com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.PARSER, extensionRegistry));
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
          itemFace_ = java.util.Collections.unmodifiableList(itemFace_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.internal_static_ItemFaceListMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.internal_static_ItemFaceListMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.class, com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ItemFaceListMsg> PARSER =
        new com.google.protobuf.AbstractParser<ItemFaceListMsg>() {
      public ItemFaceListMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemFaceListMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ItemFaceListMsg> getParserForType() {
      return PARSER;
    }

    public static final int ITEMFACE_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> itemFace_;
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> getItemFaceList() {
      return itemFace_;
    }
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder> 
        getItemFaceOrBuilderList() {
      return itemFace_;
    }
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    public int getItemFaceCount() {
      return itemFace_.size();
    }
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg getItemFace(int index) {
      return itemFace_.get(index);
    }
    /**
     * <code>repeated .ItemFaceMsg itemFace = 1;</code>
     *
     * <pre>
     * 物品外观
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder getItemFaceOrBuilder(
        int index) {
      return itemFace_.get(index);
    }

    private void initFields() {
      itemFace_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < itemFace_.size(); i++) {
        output.writeMessage(1, itemFace_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < itemFace_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, itemFace_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg prototype) {
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
     * Protobuf type {@code ItemFaceListMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemFaceListMsg)
        com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.internal_static_ItemFaceListMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.internal_static_ItemFaceListMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.class, com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.newBuilder()
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
          getItemFaceFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (itemFaceBuilder_ == null) {
          itemFace_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemFaceBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.internal_static_ItemFaceListMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg build() {
        com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg result = new com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg(this);
        int from_bitField0_ = bitField0_;
        if (itemFaceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            itemFace_ = java.util.Collections.unmodifiableList(itemFace_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemFace_ = itemFace_;
        } else {
          result.itemFace_ = itemFaceBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg.getDefaultInstance()) return this;
        if (itemFaceBuilder_ == null) {
          if (!other.itemFace_.isEmpty()) {
            if (itemFace_.isEmpty()) {
              itemFace_ = other.itemFace_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemFaceIsMutable();
              itemFace_.addAll(other.itemFace_);
            }
            onChanged();
          }
        } else {
          if (!other.itemFace_.isEmpty()) {
            if (itemFaceBuilder_.isEmpty()) {
              itemFaceBuilder_.dispose();
              itemFaceBuilder_ = null;
              itemFace_ = other.itemFace_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemFaceBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getItemFaceFieldBuilder() : null;
            } else {
              itemFaceBuilder_.addAllMessages(other.itemFace_);
            }
          }
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
        com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.item.ItemFaceListMsgProto.ItemFaceListMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> itemFace_ =
        java.util.Collections.emptyList();
      private void ensureItemFaceIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          itemFace_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg>(itemFace_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder> itemFaceBuilder_;

      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> getItemFaceList() {
        if (itemFaceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemFace_);
        } else {
          return itemFaceBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public int getItemFaceCount() {
        if (itemFaceBuilder_ == null) {
          return itemFace_.size();
        } else {
          return itemFaceBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg getItemFace(int index) {
        if (itemFaceBuilder_ == null) {
          return itemFace_.get(index);
        } else {
          return itemFaceBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder setItemFace(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg value) {
        if (itemFaceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemFaceIsMutable();
          itemFace_.set(index, value);
          onChanged();
        } else {
          itemFaceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder setItemFace(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder builderForValue) {
        if (itemFaceBuilder_ == null) {
          ensureItemFaceIsMutable();
          itemFace_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemFaceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder addItemFace(com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg value) {
        if (itemFaceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemFaceIsMutable();
          itemFace_.add(value);
          onChanged();
        } else {
          itemFaceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder addItemFace(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg value) {
        if (itemFaceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemFaceIsMutable();
          itemFace_.add(index, value);
          onChanged();
        } else {
          itemFaceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder addItemFace(
          com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder builderForValue) {
        if (itemFaceBuilder_ == null) {
          ensureItemFaceIsMutable();
          itemFace_.add(builderForValue.build());
          onChanged();
        } else {
          itemFaceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder addItemFace(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder builderForValue) {
        if (itemFaceBuilder_ == null) {
          ensureItemFaceIsMutable();
          itemFace_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemFaceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder addAllItemFace(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg> values) {
        if (itemFaceBuilder_ == null) {
          ensureItemFaceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemFace_);
          onChanged();
        } else {
          itemFaceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder clearItemFace() {
        if (itemFaceBuilder_ == null) {
          itemFace_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemFaceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public Builder removeItemFace(int index) {
        if (itemFaceBuilder_ == null) {
          ensureItemFaceIsMutable();
          itemFace_.remove(index);
          onChanged();
        } else {
          itemFaceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder getItemFaceBuilder(
          int index) {
        return getItemFaceFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder getItemFaceOrBuilder(
          int index) {
        if (itemFaceBuilder_ == null) {
          return itemFace_.get(index);  } else {
          return itemFaceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder> 
           getItemFaceOrBuilderList() {
        if (itemFaceBuilder_ != null) {
          return itemFaceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemFace_);
        }
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder addItemFaceBuilder() {
        return getItemFaceFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder addItemFaceBuilder(
          int index) {
        return getItemFaceFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemFaceMsg itemFace = 1;</code>
       *
       * <pre>
       * 物品外观
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder> 
           getItemFaceBuilderList() {
        return getItemFaceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder> 
          getItemFaceFieldBuilder() {
        if (itemFaceBuilder_ == null) {
          itemFaceBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.ItemFaceMsgOrBuilder>(
                  itemFace_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          itemFace_ = null;
        }
        return itemFaceBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:ItemFaceListMsg)
    }

    static {
      defaultInstance = new ItemFaceListMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ItemFaceListMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemFaceListMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ItemFaceListMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032item/ItemFaceListMsg.proto\032\026item/ItemF" +
      "aceMsg.proto\"1\n\017ItemFaceListMsg\022\036\n\010itemF" +
      "ace\030\001 \003(\0132\014.ItemFaceMsgB=\n%com.chuangyou" +
      ".common.protobuf.pb.itemB\024ItemFaceListMs" +
      "gProto"
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
          com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.getDescriptor(),
        }, assigner);
    internal_static_ItemFaceListMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemFaceListMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ItemFaceListMsg_descriptor,
        new java.lang.String[] { "ItemFace", });
    com.chuangyou.common.protobuf.pb.item.ItemFaceMsgProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
