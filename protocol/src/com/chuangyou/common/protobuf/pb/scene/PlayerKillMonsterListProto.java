// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerKillMonsterListMsg.proto

package com.chuangyou.common.protobuf.pb.scene;

public final class PlayerKillMonsterListProto {
  private PlayerKillMonsterListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerKillMonsterListMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerKillMonsterListMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> 
        getKillInfosList();
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg getKillInfos(int index);
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    int getKillInfosCount();
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder> 
        getKillInfosOrBuilderList();
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder getKillInfosOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PlayerKillMonsterListMsg}
   */
  public static final class PlayerKillMonsterListMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerKillMonsterListMsg)
      PlayerKillMonsterListMsgOrBuilder {
    // Use PlayerKillMonsterListMsg.newBuilder() to construct.
    private PlayerKillMonsterListMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerKillMonsterListMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerKillMonsterListMsg defaultInstance;
    public static PlayerKillMonsterListMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerKillMonsterListMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerKillMonsterListMsg(
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
                killInfos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              killInfos_.add(input.readMessage(com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.PARSER, extensionRegistry));
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
          killInfos_ = java.util.Collections.unmodifiableList(killInfos_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.internal_static_PlayerKillMonsterListMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.internal_static_PlayerKillMonsterListMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.class, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerKillMonsterListMsg> PARSER =
        new com.google.protobuf.AbstractParser<PlayerKillMonsterListMsg>() {
      public PlayerKillMonsterListMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerKillMonsterListMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerKillMonsterListMsg> getParserForType() {
      return PARSER;
    }

    public static final int KILLINFOS_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> killInfos_;
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> getKillInfosList() {
      return killInfos_;
    }
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder> 
        getKillInfosOrBuilderList() {
      return killInfos_;
    }
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    public int getKillInfosCount() {
      return killInfos_.size();
    }
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg getKillInfos(int index) {
      return killInfos_.get(index);
    }
    /**
     * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
     */
    public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder getKillInfosOrBuilder(
        int index) {
      return killInfos_.get(index);
    }

    private void initFields() {
      killInfos_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getKillInfosCount(); i++) {
        if (!getKillInfos(i).isInitialized()) {
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
      for (int i = 0; i < killInfos_.size(); i++) {
        output.writeMessage(1, killInfos_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < killInfos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, killInfos_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg prototype) {
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
     * Protobuf type {@code PlayerKillMonsterListMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerKillMonsterListMsg)
        com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.internal_static_PlayerKillMonsterListMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.internal_static_PlayerKillMonsterListMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.class, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.newBuilder()
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
          getKillInfosFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (killInfosBuilder_ == null) {
          killInfos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          killInfosBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.internal_static_PlayerKillMonsterListMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg build() {
        com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg result = new com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg(this);
        int from_bitField0_ = bitField0_;
        if (killInfosBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            killInfos_ = java.util.Collections.unmodifiableList(killInfos_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.killInfos_ = killInfos_;
        } else {
          result.killInfos_ = killInfosBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg.getDefaultInstance()) return this;
        if (killInfosBuilder_ == null) {
          if (!other.killInfos_.isEmpty()) {
            if (killInfos_.isEmpty()) {
              killInfos_ = other.killInfos_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureKillInfosIsMutable();
              killInfos_.addAll(other.killInfos_);
            }
            onChanged();
          }
        } else {
          if (!other.killInfos_.isEmpty()) {
            if (killInfosBuilder_.isEmpty()) {
              killInfosBuilder_.dispose();
              killInfosBuilder_ = null;
              killInfos_ = other.killInfos_;
              bitField0_ = (bitField0_ & ~0x00000001);
              killInfosBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getKillInfosFieldBuilder() : null;
            } else {
              killInfosBuilder_.addAllMessages(other.killInfos_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getKillInfosCount(); i++) {
          if (!getKillInfos(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterListProto.PlayerKillMonsterListMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> killInfos_ =
        java.util.Collections.emptyList();
      private void ensureKillInfosIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          killInfos_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg>(killInfos_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder> killInfosBuilder_;

      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> getKillInfosList() {
        if (killInfosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(killInfos_);
        } else {
          return killInfosBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public int getKillInfosCount() {
        if (killInfosBuilder_ == null) {
          return killInfos_.size();
        } else {
          return killInfosBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg getKillInfos(int index) {
        if (killInfosBuilder_ == null) {
          return killInfos_.get(index);
        } else {
          return killInfosBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder setKillInfos(
          int index, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg value) {
        if (killInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKillInfosIsMutable();
          killInfos_.set(index, value);
          onChanged();
        } else {
          killInfosBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder setKillInfos(
          int index, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder builderForValue) {
        if (killInfosBuilder_ == null) {
          ensureKillInfosIsMutable();
          killInfos_.set(index, builderForValue.build());
          onChanged();
        } else {
          killInfosBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder addKillInfos(com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg value) {
        if (killInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKillInfosIsMutable();
          killInfos_.add(value);
          onChanged();
        } else {
          killInfosBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder addKillInfos(
          int index, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg value) {
        if (killInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKillInfosIsMutable();
          killInfos_.add(index, value);
          onChanged();
        } else {
          killInfosBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder addKillInfos(
          com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder builderForValue) {
        if (killInfosBuilder_ == null) {
          ensureKillInfosIsMutable();
          killInfos_.add(builderForValue.build());
          onChanged();
        } else {
          killInfosBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder addKillInfos(
          int index, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder builderForValue) {
        if (killInfosBuilder_ == null) {
          ensureKillInfosIsMutable();
          killInfos_.add(index, builderForValue.build());
          onChanged();
        } else {
          killInfosBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder addAllKillInfos(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg> values) {
        if (killInfosBuilder_ == null) {
          ensureKillInfosIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, killInfos_);
          onChanged();
        } else {
          killInfosBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder clearKillInfos() {
        if (killInfosBuilder_ == null) {
          killInfos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          killInfosBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public Builder removeKillInfos(int index) {
        if (killInfosBuilder_ == null) {
          ensureKillInfosIsMutable();
          killInfos_.remove(index);
          onChanged();
        } else {
          killInfosBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder getKillInfosBuilder(
          int index) {
        return getKillInfosFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder getKillInfosOrBuilder(
          int index) {
        if (killInfosBuilder_ == null) {
          return killInfos_.get(index);  } else {
          return killInfosBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder> 
           getKillInfosOrBuilderList() {
        if (killInfosBuilder_ != null) {
          return killInfosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(killInfos_);
        }
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder addKillInfosBuilder() {
        return getKillInfosFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder addKillInfosBuilder(
          int index) {
        return getKillInfosFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerKillMonsterMsg killInfos = 1;</code>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder> 
           getKillInfosBuilderList() {
        return getKillInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder> 
          getKillInfosFieldBuilder() {
        if (killInfosBuilder_ == null) {
          killInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsg.Builder, com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.PlayerKillMonsterMsgOrBuilder>(
                  killInfos_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          killInfos_ = null;
        }
        return killInfosBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:PlayerKillMonsterListMsg)
    }

    static {
      defaultInstance = new PlayerKillMonsterListMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerKillMonsterListMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerKillMonsterListMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerKillMonsterListMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerKillMonsterListMsg.proto\032\032Player" +
      "KillMonsterMsg.proto\"D\n\030PlayerKillMonste" +
      "rListMsg\022(\n\tkillInfos\030\001 \003(\0132\025.PlayerKill" +
      "MonsterMsgBD\n&com.chuangyou.common.proto" +
      "buf.pb.sceneB\032PlayerKillMonsterListProto"
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
          com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.getDescriptor(),
        }, assigner);
    internal_static_PlayerKillMonsterListMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerKillMonsterListMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerKillMonsterListMsg_descriptor,
        new java.lang.String[] { "KillInfos", });
    com.chuangyou.common.protobuf.pb.scene.PlayerKillMonsterProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
