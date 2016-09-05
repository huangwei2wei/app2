// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item/ItemListMsg.proto

package com.chuangyou.common.protobuf.pb.item;

public final class ItemListProto {
  private ItemListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ItemListMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemListMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> 
        getItemList();
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg getItem(int index);
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    int getItemCount();
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder> 
        getItemOrBuilderList();
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder getItemOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ItemListMsg}
   */
  public static final class ItemListMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ItemListMsg)
      ItemListMsgOrBuilder {
    // Use ItemListMsg.newBuilder() to construct.
    private ItemListMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ItemListMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ItemListMsg defaultInstance;
    public static ItemListMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ItemListMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ItemListMsg(
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
                item_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              item_.add(input.readMessage(com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.PARSER, extensionRegistry));
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
          item_ = java.util.Collections.unmodifiableList(item_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.item.ItemListProto.internal_static_ItemListMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.item.ItemListProto.internal_static_ItemListMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.class, com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ItemListMsg> PARSER =
        new com.google.protobuf.AbstractParser<ItemListMsg>() {
      public ItemListMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemListMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ItemListMsg> getParserForType() {
      return PARSER;
    }

    public static final int ITEM_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> item_;
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> getItemList() {
      return item_;
    }
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder> 
        getItemOrBuilderList() {
      return item_;
    }
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    public int getItemCount() {
      return item_.size();
    }
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg getItem(int index) {
      return item_.get(index);
    }
    /**
     * <code>repeated .ItemFullInfoMsg item = 1;</code>
     *
     * <pre>
     * 物品详情
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder getItemOrBuilder(
        int index) {
      return item_.get(index);
    }

    private void initFields() {
      item_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < item_.size(); i++) {
        output.writeMessage(1, item_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < item_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, item_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg prototype) {
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
     * Protobuf type {@code ItemListMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemListMsg)
        com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.item.ItemListProto.internal_static_ItemListMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.item.ItemListProto.internal_static_ItemListMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.class, com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.newBuilder()
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
          getItemFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (itemBuilder_ == null) {
          item_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemListProto.internal_static_ItemListMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg build() {
        com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg result = new com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg(this);
        int from_bitField0_ = bitField0_;
        if (itemBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            item_ = java.util.Collections.unmodifiableList(item_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.item_ = item_;
        } else {
          result.item_ = itemBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg.getDefaultInstance()) return this;
        if (itemBuilder_ == null) {
          if (!other.item_.isEmpty()) {
            if (item_.isEmpty()) {
              item_ = other.item_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemIsMutable();
              item_.addAll(other.item_);
            }
            onChanged();
          }
        } else {
          if (!other.item_.isEmpty()) {
            if (itemBuilder_.isEmpty()) {
              itemBuilder_.dispose();
              itemBuilder_ = null;
              item_ = other.item_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getItemFieldBuilder() : null;
            } else {
              itemBuilder_.addAllMessages(other.item_);
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
        com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.item.ItemListProto.ItemListMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> item_ =
        java.util.Collections.emptyList();
      private void ensureItemIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          item_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg>(item_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder> itemBuilder_;

      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> getItemList() {
        if (itemBuilder_ == null) {
          return java.util.Collections.unmodifiableList(item_);
        } else {
          return itemBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public int getItemCount() {
        if (itemBuilder_ == null) {
          return item_.size();
        } else {
          return itemBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg getItem(int index) {
        if (itemBuilder_ == null) {
          return item_.get(index);
        } else {
          return itemBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder setItem(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg value) {
        if (itemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemIsMutable();
          item_.set(index, value);
          onChanged();
        } else {
          itemBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder setItem(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder builderForValue) {
        if (itemBuilder_ == null) {
          ensureItemIsMutable();
          item_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder addItem(com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg value) {
        if (itemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemIsMutable();
          item_.add(value);
          onChanged();
        } else {
          itemBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder addItem(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg value) {
        if (itemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemIsMutable();
          item_.add(index, value);
          onChanged();
        } else {
          itemBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder addItem(
          com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder builderForValue) {
        if (itemBuilder_ == null) {
          ensureItemIsMutable();
          item_.add(builderForValue.build());
          onChanged();
        } else {
          itemBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder addItem(
          int index, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder builderForValue) {
        if (itemBuilder_ == null) {
          ensureItemIsMutable();
          item_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder addAllItem(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg> values) {
        if (itemBuilder_ == null) {
          ensureItemIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, item_);
          onChanged();
        } else {
          itemBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder clearItem() {
        if (itemBuilder_ == null) {
          item_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public Builder removeItem(int index) {
        if (itemBuilder_ == null) {
          ensureItemIsMutable();
          item_.remove(index);
          onChanged();
        } else {
          itemBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder getItemBuilder(
          int index) {
        return getItemFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder getItemOrBuilder(
          int index) {
        if (itemBuilder_ == null) {
          return item_.get(index);  } else {
          return itemBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder> 
           getItemOrBuilderList() {
        if (itemBuilder_ != null) {
          return itemBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(item_);
        }
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder addItemBuilder() {
        return getItemFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder addItemBuilder(
          int index) {
        return getItemFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemFullInfoMsg item = 1;</code>
       *
       * <pre>
       * 物品详情
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder> 
           getItemBuilderList() {
        return getItemFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder> 
          getItemFieldBuilder() {
        if (itemBuilder_ == null) {
          itemBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsg.Builder, com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.ItemFullInfoMsgOrBuilder>(
                  item_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          item_ = null;
        }
        return itemBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:ItemListMsg)
    }

    static {
      defaultInstance = new ItemListMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ItemListMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemListMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ItemListMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026item/ItemListMsg.proto\032\032item/ItemFullI" +
      "nfoMsg.proto\"-\n\013ItemListMsg\022\036\n\004item\030\001 \003(" +
      "\0132\020.ItemFullInfoMsgB6\n%com.chuangyou.com" +
      "mon.protobuf.pb.itemB\rItemListProto"
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
          com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.getDescriptor(),
        }, assigner);
    internal_static_ItemListMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemListMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ItemListMsg_descriptor,
        new java.lang.String[] { "Item", });
    com.chuangyou.common.protobuf.pb.item.ItemFullInfoMsgProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
