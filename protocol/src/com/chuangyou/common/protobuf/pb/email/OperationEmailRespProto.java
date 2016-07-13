// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: email/OperationEmailRespMsg.proto

package com.chuangyou.common.protobuf.pb.email;

public final class OperationEmailRespProto {
  private OperationEmailRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OperationEmailRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OperationEmailRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *	1:增加邮件 2：更新邮件  3：删除邮件
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *	1:增加邮件 2：更新邮件  3：删除邮件
     * </pre>
     */
    int getType();

    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> 
        getEmailsList();
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo getEmails(int index);
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    int getEmailsCount();
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder> 
        getEmailsOrBuilderList();
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder getEmailsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code OperationEmailRespMsg}
   *
   * <pre>
   *通知邮件变更
   * </pre>
   */
  public static final class OperationEmailRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:OperationEmailRespMsg)
      OperationEmailRespMsgOrBuilder {
    // Use OperationEmailRespMsg.newBuilder() to construct.
    private OperationEmailRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OperationEmailRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OperationEmailRespMsg defaultInstance;
    public static OperationEmailRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public OperationEmailRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OperationEmailRespMsg(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                emails_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo>();
                mutable_bitField0_ |= 0x00000002;
              }
              emails_.add(input.readMessage(com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.PARSER, extensionRegistry));
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
          emails_ = java.util.Collections.unmodifiableList(emails_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.internal_static_OperationEmailRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.internal_static_OperationEmailRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.class, com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<OperationEmailRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<OperationEmailRespMsg>() {
      public OperationEmailRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OperationEmailRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OperationEmailRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *	1:增加邮件 2：更新邮件  3：删除邮件
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *	1:增加邮件 2：更新邮件  3：删除邮件
     * </pre>
     */
    public int getType() {
      return type_;
    }

    public static final int EMAILS_FIELD_NUMBER = 2;
    private java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> emails_;
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> getEmailsList() {
      return emails_;
    }
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder> 
        getEmailsOrBuilderList() {
      return emails_;
    }
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    public int getEmailsCount() {
      return emails_.size();
    }
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo getEmails(int index) {
      return emails_.get(index);
    }
    /**
     * <code>repeated .EmailInfo emails = 2;</code>
     *
     * <pre>
     *邮件列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder getEmailsOrBuilder(
        int index) {
      return emails_.get(index);
    }

    private void initFields() {
      type_ = 0;
      emails_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < getEmailsCount(); i++) {
        if (!getEmails(i).isInitialized()) {
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
      for (int i = 0; i < emails_.size(); i++) {
        output.writeMessage(2, emails_.get(i));
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
      for (int i = 0; i < emails_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, emails_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg prototype) {
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
     * Protobuf type {@code OperationEmailRespMsg}
     *
     * <pre>
     *通知邮件变更
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OperationEmailRespMsg)
        com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.internal_static_OperationEmailRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.internal_static_OperationEmailRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.class, com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.newBuilder()
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
          getEmailsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (emailsBuilder_ == null) {
          emails_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          emailsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.internal_static_OperationEmailRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg build() {
        com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg result = new com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (emailsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            emails_ = java.util.Collections.unmodifiableList(emails_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.emails_ = emails_;
        } else {
          result.emails_ = emailsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (emailsBuilder_ == null) {
          if (!other.emails_.isEmpty()) {
            if (emails_.isEmpty()) {
              emails_ = other.emails_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEmailsIsMutable();
              emails_.addAll(other.emails_);
            }
            onChanged();
          }
        } else {
          if (!other.emails_.isEmpty()) {
            if (emailsBuilder_.isEmpty()) {
              emailsBuilder_.dispose();
              emailsBuilder_ = null;
              emails_ = other.emails_;
              bitField0_ = (bitField0_ & ~0x00000002);
              emailsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEmailsFieldBuilder() : null;
            } else {
              emailsBuilder_.addAllMessages(other.emails_);
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
        for (int i = 0; i < getEmailsCount(); i++) {
          if (!getEmails(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.email.OperationEmailRespProto.OperationEmailRespMsg) e.getUnfinishedMessage();
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
       *	1:增加邮件 2：更新邮件  3：删除邮件
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *	1:增加邮件 2：更新邮件  3：删除邮件
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *	1:增加邮件 2：更新邮件  3：删除邮件
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
       *	1:增加邮件 2：更新邮件  3：删除邮件
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> emails_ =
        java.util.Collections.emptyList();
      private void ensureEmailsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          emails_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo>(emails_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder> emailsBuilder_;

      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> getEmailsList() {
        if (emailsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(emails_);
        } else {
          return emailsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public int getEmailsCount() {
        if (emailsBuilder_ == null) {
          return emails_.size();
        } else {
          return emailsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo getEmails(int index) {
        if (emailsBuilder_ == null) {
          return emails_.get(index);
        } else {
          return emailsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder setEmails(
          int index, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo value) {
        if (emailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEmailsIsMutable();
          emails_.set(index, value);
          onChanged();
        } else {
          emailsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder setEmails(
          int index, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder builderForValue) {
        if (emailsBuilder_ == null) {
          ensureEmailsIsMutable();
          emails_.set(index, builderForValue.build());
          onChanged();
        } else {
          emailsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder addEmails(com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo value) {
        if (emailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEmailsIsMutable();
          emails_.add(value);
          onChanged();
        } else {
          emailsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder addEmails(
          int index, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo value) {
        if (emailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEmailsIsMutable();
          emails_.add(index, value);
          onChanged();
        } else {
          emailsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder addEmails(
          com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder builderForValue) {
        if (emailsBuilder_ == null) {
          ensureEmailsIsMutable();
          emails_.add(builderForValue.build());
          onChanged();
        } else {
          emailsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder addEmails(
          int index, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder builderForValue) {
        if (emailsBuilder_ == null) {
          ensureEmailsIsMutable();
          emails_.add(index, builderForValue.build());
          onChanged();
        } else {
          emailsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder addAllEmails(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo> values) {
        if (emailsBuilder_ == null) {
          ensureEmailsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, emails_);
          onChanged();
        } else {
          emailsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder clearEmails() {
        if (emailsBuilder_ == null) {
          emails_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          emailsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public Builder removeEmails(int index) {
        if (emailsBuilder_ == null) {
          ensureEmailsIsMutable();
          emails_.remove(index);
          onChanged();
        } else {
          emailsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder getEmailsBuilder(
          int index) {
        return getEmailsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder getEmailsOrBuilder(
          int index) {
        if (emailsBuilder_ == null) {
          return emails_.get(index);  } else {
          return emailsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder> 
           getEmailsOrBuilderList() {
        if (emailsBuilder_ != null) {
          return emailsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(emails_);
        }
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder addEmailsBuilder() {
        return getEmailsFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder addEmailsBuilder(
          int index) {
        return getEmailsFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EmailInfo emails = 2;</code>
       *
       * <pre>
       *邮件列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder> 
           getEmailsBuilderList() {
        return getEmailsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder> 
          getEmailsFieldBuilder() {
        if (emailsBuilder_ == null) {
          emailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfo.Builder, com.chuangyou.common.protobuf.pb.email.EmailInfoProto.EmailInfoOrBuilder>(
                  emails_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          emails_ = null;
        }
        return emailsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:OperationEmailRespMsg)
    }

    static {
      defaultInstance = new OperationEmailRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:OperationEmailRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OperationEmailRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OperationEmailRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!email/OperationEmailRespMsg.proto\032\025ema" +
      "il/EmailInfo.proto\"A\n\025OperationEmailResp" +
      "Msg\022\014\n\004type\030\001 \002(\005\022\032\n\006emails\030\002 \003(\0132\n.Emai" +
      "lInfoBA\n&com.chuangyou.common.protobuf.p" +
      "b.emailB\027OperationEmailRespProto"
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
          com.chuangyou.common.protobuf.pb.email.EmailInfoProto.getDescriptor(),
        }, assigner);
    internal_static_OperationEmailRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OperationEmailRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_OperationEmailRespMsg_descriptor,
        new java.lang.String[] { "Type", "Emails", });
    com.chuangyou.common.protobuf.pb.email.EmailInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}