// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: email/GetEmailAttachmentBatchRespMsg.proto

package com.chuangyou.common.protobuf.pb.email;

public final class GetEmailAttachmentBatchRespProto {
  private GetEmailAttachmentBatchRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetEmailAttachmentBatchRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetEmailAttachmentBatchRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 resultType = 1;</code>
     *
     * <pre>
     *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
     * </pre>
     */
    boolean hasResultType();
    /**
     * <code>required int32 resultType = 1;</code>
     *
     * <pre>
     *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
     * </pre>
     */
    int getResultType();
  }
  /**
   * Protobuf type {@code GetEmailAttachmentBatchRespMsg}
   *
   * <pre>
   *一键提取所有附件
   * </pre>
   */
  public static final class GetEmailAttachmentBatchRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetEmailAttachmentBatchRespMsg)
      GetEmailAttachmentBatchRespMsgOrBuilder {
    // Use GetEmailAttachmentBatchRespMsg.newBuilder() to construct.
    private GetEmailAttachmentBatchRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetEmailAttachmentBatchRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetEmailAttachmentBatchRespMsg defaultInstance;
    public static GetEmailAttachmentBatchRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetEmailAttachmentBatchRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetEmailAttachmentBatchRespMsg(
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
              resultType_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.internal_static_GetEmailAttachmentBatchRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.internal_static_GetEmailAttachmentBatchRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.class, com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetEmailAttachmentBatchRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetEmailAttachmentBatchRespMsg>() {
      public GetEmailAttachmentBatchRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetEmailAttachmentBatchRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetEmailAttachmentBatchRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESULTTYPE_FIELD_NUMBER = 1;
    private int resultType_;
    /**
     * <code>required int32 resultType = 1;</code>
     *
     * <pre>
     *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
     * </pre>
     */
    public boolean hasResultType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 resultType = 1;</code>
     *
     * <pre>
     *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
     * </pre>
     */
    public int getResultType() {
      return resultType_;
    }

    private void initFields() {
      resultType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasResultType()) {
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
        output.writeInt32(1, resultType_);
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
          .computeInt32Size(1, resultType_);
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

    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg prototype) {
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
     * Protobuf type {@code GetEmailAttachmentBatchRespMsg}
     *
     * <pre>
     *一键提取所有附件
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetEmailAttachmentBatchRespMsg)
        com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.internal_static_GetEmailAttachmentBatchRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.internal_static_GetEmailAttachmentBatchRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.class, com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.newBuilder()
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
        resultType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.internal_static_GetEmailAttachmentBatchRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg build() {
        com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg result = new com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.resultType_ = resultType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg.getDefaultInstance()) return this;
        if (other.hasResultType()) {
          setResultType(other.getResultType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResultType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.email.GetEmailAttachmentBatchRespProto.GetEmailAttachmentBatchRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int resultType_ ;
      /**
       * <code>required int32 resultType = 1;</code>
       *
       * <pre>
       *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
       * </pre>
       */
      public boolean hasResultType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 resultType = 1;</code>
       *
       * <pre>
       *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
       * </pre>
       */
      public int getResultType() {
        return resultType_;
      }
      /**
       * <code>required int32 resultType = 1;</code>
       *
       * <pre>
       *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
       * </pre>
       */
      public Builder setResultType(int value) {
        bitField0_ |= 0x00000001;
        resultType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 resultType = 1;</code>
       *
       * <pre>
       *	返回结果（1：成功提取所有附件 2：提取部分邮件的附件，因背包满中断）
       * </pre>
       */
      public Builder clearResultType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resultType_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GetEmailAttachmentBatchRespMsg)
    }

    static {
      defaultInstance = new GetEmailAttachmentBatchRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetEmailAttachmentBatchRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetEmailAttachmentBatchRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetEmailAttachmentBatchRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*email/GetEmailAttachmentBatchRespMsg.p" +
      "roto\"4\n\036GetEmailAttachmentBatchRespMsg\022\022" +
      "\n\nresultType\030\001 \002(\005BJ\n&com.chuangyou.comm" +
      "on.protobuf.pb.emailB GetEmailAttachment" +
      "BatchRespProto"
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
    internal_static_GetEmailAttachmentBatchRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetEmailAttachmentBatchRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetEmailAttachmentBatchRespMsg_descriptor,
        new java.lang.String[] { "ResultType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}