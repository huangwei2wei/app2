﻿// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AllWelfareMsg.proto

package com.chuangyou.common.protobuf.pb.welfare;

public final class AllWelfareMsgProto {
  private AllWelfareMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AllWelfareMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AllWelfareMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> 
        getListList();
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg getList(int index);
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    int getListCount();
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder> 
        getListOrBuilderList();
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder getListOrBuilder(
        int index);

    /**
     * <code>optional int32 onlineTime = 2;</code>
     *
     * <pre>
     *达到相应等级以后在线时间
     * </pre>
     */
    boolean hasOnlineTime();
    /**
     * <code>optional int32 onlineTime = 2;</code>
     *
     * <pre>
     *达到相应等级以后在线时间
     * </pre>
     */
    int getOnlineTime();
  }
  /**
   * Protobuf type {@code AllWelfareMsg}
   *
   * <pre>
   *通知客户端玩家某个福利的状态
   * </pre>
   */
  public static final class AllWelfareMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AllWelfareMsg)
      AllWelfareMsgOrBuilder {
    // Use AllWelfareMsg.newBuilder() to construct.
    private AllWelfareMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AllWelfareMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AllWelfareMsg defaultInstance;
    public static AllWelfareMsg getDefaultInstance() {
      return defaultInstance;
    }

    public AllWelfareMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AllWelfareMsg(
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
                list_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              list_.add(input.readMessage(com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              onlineTime_ = input.readInt32();
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
          list_ = java.util.Collections.unmodifiableList(list_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.internal_static_AllWelfareMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.internal_static_AllWelfareMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.class, com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<AllWelfareMsg> PARSER =
        new com.google.protobuf.AbstractParser<AllWelfareMsg>() {
      public AllWelfareMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllWelfareMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AllWelfareMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LIST_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> list_;
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> getListList() {
      return list_;
    }
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder> 
        getListOrBuilderList() {
      return list_;
    }
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    public int getListCount() {
      return list_.size();
    }
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg getList(int index) {
      return list_.get(index);
    }
    /**
     * <code>repeated .OneWelfareMsg list = 1;</code>
     *
     * <pre>
     *所有福利状态信息
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder getListOrBuilder(
        int index) {
      return list_.get(index);
    }

    public static final int ONLINETIME_FIELD_NUMBER = 2;
    private int onlineTime_;
    /**
     * <code>optional int32 onlineTime = 2;</code>
     *
     * <pre>
     *达到相应等级以后在线时间
     * </pre>
     */
    public boolean hasOnlineTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 onlineTime = 2;</code>
     *
     * <pre>
     *达到相应等级以后在线时间
     * </pre>
     */
    public int getOnlineTime() {
      return onlineTime_;
    }

    private void initFields() {
      list_ = java.util.Collections.emptyList();
      onlineTime_ = 0;
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
      for (int i = 0; i < list_.size(); i++) {
        output.writeMessage(1, list_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(2, onlineTime_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < list_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, list_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, onlineTime_);
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

    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg prototype) {
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
     * Protobuf type {@code AllWelfareMsg}
     *
     * <pre>
     *通知客户端玩家某个福利的状态
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AllWelfareMsg)
        com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.internal_static_AllWelfareMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.internal_static_AllWelfareMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.class, com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.newBuilder()
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
          getListFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          listBuilder_.clear();
        }
        onlineTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.internal_static_AllWelfareMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg build() {
        com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg result = new com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (listBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            list_ = java.util.Collections.unmodifiableList(list_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.list_ = list_;
        } else {
          result.list_ = listBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.onlineTime_ = onlineTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg.getDefaultInstance()) return this;
        if (listBuilder_ == null) {
          if (!other.list_.isEmpty()) {
            if (list_.isEmpty()) {
              list_ = other.list_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureListIsMutable();
              list_.addAll(other.list_);
            }
            onChanged();
          }
        } else {
          if (!other.list_.isEmpty()) {
            if (listBuilder_.isEmpty()) {
              listBuilder_.dispose();
              listBuilder_ = null;
              list_ = other.list_;
              bitField0_ = (bitField0_ & ~0x00000001);
              listBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getListFieldBuilder() : null;
            } else {
              listBuilder_.addAllMessages(other.list_);
            }
          }
        }
        if (other.hasOnlineTime()) {
          setOnlineTime(other.getOnlineTime());
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
        com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.welfare.AllWelfareMsgProto.AllWelfareMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> list_ =
        java.util.Collections.emptyList();
      private void ensureListIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          list_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg>(list_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder> listBuilder_;

      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> getListList() {
        if (listBuilder_ == null) {
          return java.util.Collections.unmodifiableList(list_);
        } else {
          return listBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public int getListCount() {
        if (listBuilder_ == null) {
          return list_.size();
        } else {
          return listBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg getList(int index) {
        if (listBuilder_ == null) {
          return list_.get(index);
        } else {
          return listBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder setList(
          int index, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.set(index, value);
          onChanged();
        } else {
          listBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder setList(
          int index, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.set(index, builderForValue.build());
          onChanged();
        } else {
          listBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder addList(com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.add(value);
          onChanged();
        } else {
          listBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder addList(
          int index, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.add(index, value);
          onChanged();
        } else {
          listBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder addList(
          com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.add(builderForValue.build());
          onChanged();
        } else {
          listBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder addList(
          int index, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.add(index, builderForValue.build());
          onChanged();
        } else {
          listBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder addAllList(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg> values) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, list_);
          onChanged();
        } else {
          listBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder clearList() {
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          listBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public Builder removeList(int index) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.remove(index);
          onChanged();
        } else {
          listBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder getListBuilder(
          int index) {
        return getListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder getListOrBuilder(
          int index) {
        if (listBuilder_ == null) {
          return list_.get(index);  } else {
          return listBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder> 
           getListOrBuilderList() {
        if (listBuilder_ != null) {
          return listBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(list_);
        }
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder addListBuilder() {
        return getListFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder addListBuilder(
          int index) {
        return getListFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .OneWelfareMsg list = 1;</code>
       *
       * <pre>
       *所有福利状态信息
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder> 
           getListBuilderList() {
        return getListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder> 
          getListFieldBuilder() {
        if (listBuilder_ == null) {
          listBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsg.Builder, com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.OneWelfareMsgOrBuilder>(
                  list_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          list_ = null;
        }
        return listBuilder_;
      }

      private int onlineTime_ ;
      /**
       * <code>optional int32 onlineTime = 2;</code>
       *
       * <pre>
       *达到相应等级以后在线时间
       * </pre>
       */
      public boolean hasOnlineTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 onlineTime = 2;</code>
       *
       * <pre>
       *达到相应等级以后在线时间
       * </pre>
       */
      public int getOnlineTime() {
        return onlineTime_;
      }
      /**
       * <code>optional int32 onlineTime = 2;</code>
       *
       * <pre>
       *达到相应等级以后在线时间
       * </pre>
       */
      public Builder setOnlineTime(int value) {
        bitField0_ |= 0x00000002;
        onlineTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 onlineTime = 2;</code>
       *
       * <pre>
       *达到相应等级以后在线时间
       * </pre>
       */
      public Builder clearOnlineTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        onlineTime_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AllWelfareMsg)
    }

    static {
      defaultInstance = new AllWelfareMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AllWelfareMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllWelfareMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AllWelfareMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023AllWelfareMsg.proto\032\023OneWelfareMsg.pro" +
      "to\"A\n\rAllWelfareMsg\022\034\n\004list\030\001 \003(\0132\016.OneW" +
      "elfareMsg\022\022\n\nonlineTime\030\002 \001(\005B>\n(com.chu" +
      "angyou.common.protobuf.pb.welfareB\022AllWe" +
      "lfareMsgProto"
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
          com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.getDescriptor(),
        }, assigner);
    internal_static_AllWelfareMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AllWelfareMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AllWelfareMsg_descriptor,
        new java.lang.String[] { "List", "OnlineTime", });
    com.chuangyou.common.protobuf.pb.welfare.OneWelfareMsgProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
