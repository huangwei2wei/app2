// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pet/PetGetTotalAttRespMsg.proto

package com.chuangyou.common.protobuf.pb.pet;

public final class PetGetTotalAttRespProto {
  private PetGetTotalAttRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PetGetTotalAttRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PetGetTotalAttRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> 
        getAttList();
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg getAtt(int index);
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    int getAttCount();
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder> 
        getAttOrBuilderList();
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder getAttOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PetGetTotalAttRespMsg}
   */
  public static final class PetGetTotalAttRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PetGetTotalAttRespMsg)
      PetGetTotalAttRespMsgOrBuilder {
    // Use PetGetTotalAttRespMsg.newBuilder() to construct.
    private PetGetTotalAttRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PetGetTotalAttRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PetGetTotalAttRespMsg defaultInstance;
    public static PetGetTotalAttRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PetGetTotalAttRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PetGetTotalAttRespMsg(
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
                att_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              att_.add(input.readMessage(com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.PARSER, extensionRegistry));
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
          att_ = java.util.Collections.unmodifiableList(att_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.internal_static_PetGetTotalAttRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.internal_static_PetGetTotalAttRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.class, com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PetGetTotalAttRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<PetGetTotalAttRespMsg>() {
      public PetGetTotalAttRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PetGetTotalAttRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PetGetTotalAttRespMsg> getParserForType() {
      return PARSER;
    }

    public static final int ATT_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> att_;
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> getAttList() {
      return att_;
    }
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder> 
        getAttOrBuilderList() {
      return att_;
    }
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    public int getAttCount() {
      return att_.size();
    }
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg getAtt(int index) {
      return att_.get(index);
    }
    /**
     * <code>repeated .AttributeBeanMsg att = 1;</code>
     *
     * <pre>
     * 宠物属性
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder getAttOrBuilder(
        int index) {
      return att_.get(index);
    }

    private void initFields() {
      att_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < att_.size(); i++) {
        output.writeMessage(1, att_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < att_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, att_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg prototype) {
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
     * Protobuf type {@code PetGetTotalAttRespMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PetGetTotalAttRespMsg)
        com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.internal_static_PetGetTotalAttRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.internal_static_PetGetTotalAttRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.class, com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.newBuilder()
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
          getAttFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (attBuilder_ == null) {
          att_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          attBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.internal_static_PetGetTotalAttRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg build() {
        com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg result = new com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg(this);
        int from_bitField0_ = bitField0_;
        if (attBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            att_ = java.util.Collections.unmodifiableList(att_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.att_ = att_;
        } else {
          result.att_ = attBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg.getDefaultInstance()) return this;
        if (attBuilder_ == null) {
          if (!other.att_.isEmpty()) {
            if (att_.isEmpty()) {
              att_ = other.att_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAttIsMutable();
              att_.addAll(other.att_);
            }
            onChanged();
          }
        } else {
          if (!other.att_.isEmpty()) {
            if (attBuilder_.isEmpty()) {
              attBuilder_.dispose();
              attBuilder_ = null;
              att_ = other.att_;
              bitField0_ = (bitField0_ & ~0x00000001);
              attBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAttFieldBuilder() : null;
            } else {
              attBuilder_.addAllMessages(other.att_);
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
        com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.pet.PetGetTotalAttRespProto.PetGetTotalAttRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> att_ =
        java.util.Collections.emptyList();
      private void ensureAttIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          att_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg>(att_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder> attBuilder_;

      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> getAttList() {
        if (attBuilder_ == null) {
          return java.util.Collections.unmodifiableList(att_);
        } else {
          return attBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public int getAttCount() {
        if (attBuilder_ == null) {
          return att_.size();
        } else {
          return attBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg getAtt(int index) {
        if (attBuilder_ == null) {
          return att_.get(index);
        } else {
          return attBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder setAtt(
          int index, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg value) {
        if (attBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttIsMutable();
          att_.set(index, value);
          onChanged();
        } else {
          attBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder setAtt(
          int index, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder builderForValue) {
        if (attBuilder_ == null) {
          ensureAttIsMutable();
          att_.set(index, builderForValue.build());
          onChanged();
        } else {
          attBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder addAtt(com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg value) {
        if (attBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttIsMutable();
          att_.add(value);
          onChanged();
        } else {
          attBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder addAtt(
          int index, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg value) {
        if (attBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAttIsMutable();
          att_.add(index, value);
          onChanged();
        } else {
          attBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder addAtt(
          com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder builderForValue) {
        if (attBuilder_ == null) {
          ensureAttIsMutable();
          att_.add(builderForValue.build());
          onChanged();
        } else {
          attBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder addAtt(
          int index, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder builderForValue) {
        if (attBuilder_ == null) {
          ensureAttIsMutable();
          att_.add(index, builderForValue.build());
          onChanged();
        } else {
          attBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder addAllAtt(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg> values) {
        if (attBuilder_ == null) {
          ensureAttIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, att_);
          onChanged();
        } else {
          attBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder clearAtt() {
        if (attBuilder_ == null) {
          att_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          attBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public Builder removeAtt(int index) {
        if (attBuilder_ == null) {
          ensureAttIsMutable();
          att_.remove(index);
          onChanged();
        } else {
          attBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder getAttBuilder(
          int index) {
        return getAttFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder getAttOrBuilder(
          int index) {
        if (attBuilder_ == null) {
          return att_.get(index);  } else {
          return attBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder> 
           getAttOrBuilderList() {
        if (attBuilder_ != null) {
          return attBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(att_);
        }
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder addAttBuilder() {
        return getAttFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder addAttBuilder(
          int index) {
        return getAttFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .AttributeBeanMsg att = 1;</code>
       *
       * <pre>
       * 宠物属性
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder> 
           getAttBuilderList() {
        return getAttFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder> 
          getAttFieldBuilder() {
        if (attBuilder_ == null) {
          attBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsg.Builder, com.chuangyou.common.protobuf.pb.AttributeBeanProto.AttributeBeanMsgOrBuilder>(
                  att_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          att_ = null;
        }
        return attBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:PetGetTotalAttRespMsg)
    }

    static {
      defaultInstance = new PetGetTotalAttRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PetGetTotalAttRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PetGetTotalAttRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PetGetTotalAttRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037pet/PetGetTotalAttRespMsg.proto\032\035commo" +
      "n/AttributeBeanMsg.proto\"7\n\025PetGetTotalA" +
      "ttRespMsg\022\036\n\003att\030\001 \003(\0132\021.AttributeBeanMs" +
      "gB?\n$com.chuangyou.common.protobuf.pb.pe" +
      "tB\027PetGetTotalAttRespProto"
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
          com.chuangyou.common.protobuf.pb.AttributeBeanProto.getDescriptor(),
        }, assigner);
    internal_static_PetGetTotalAttRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PetGetTotalAttRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PetGetTotalAttRespMsg_descriptor,
        new java.lang.String[] { "Att", });
    com.chuangyou.common.protobuf.pb.AttributeBeanProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}