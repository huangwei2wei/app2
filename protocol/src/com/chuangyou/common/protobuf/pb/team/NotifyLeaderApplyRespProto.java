// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: team/NotifyLeaderApplyRespMsg.proto

package com.chuangyou.common.protobuf.pb.team;

public final class NotifyLeaderApplyRespProto {
  private NotifyLeaderApplyRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NotifyLeaderApplyRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NotifyLeaderApplyRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    boolean hasMember();
    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg getMember();
    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder getMemberOrBuilder();
  }
  /**
   * Protobuf type {@code NotifyLeaderApplyRespMsg}
   *
   * <pre>
   *通知队长有人申请入队
   * </pre>
   */
  public static final class NotifyLeaderApplyRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:NotifyLeaderApplyRespMsg)
      NotifyLeaderApplyRespMsgOrBuilder {
    // Use NotifyLeaderApplyRespMsg.newBuilder() to construct.
    private NotifyLeaderApplyRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NotifyLeaderApplyRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NotifyLeaderApplyRespMsg defaultInstance;
    public static NotifyLeaderApplyRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public NotifyLeaderApplyRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NotifyLeaderApplyRespMsg(
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
              com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = member_.toBuilder();
              }
              member_ = input.readMessage(com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(member_);
                member_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.internal_static_NotifyLeaderApplyRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.internal_static_NotifyLeaderApplyRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.class, com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<NotifyLeaderApplyRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<NotifyLeaderApplyRespMsg>() {
      public NotifyLeaderApplyRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotifyLeaderApplyRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NotifyLeaderApplyRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MEMBER_FIELD_NUMBER = 1;
    private com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg member_;
    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    public boolean hasMember() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg getMember() {
      return member_;
    }
    /**
     * <code>required .TeamMemberInfoMsg member = 1;</code>
     *
     * <pre>
     *申请人
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder getMemberOrBuilder() {
      return member_;
    }

    private void initFields() {
      member_ = com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMember()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getMember().isInitialized()) {
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
        output.writeMessage(1, member_);
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
          .computeMessageSize(1, member_);
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

    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg prototype) {
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
     * Protobuf type {@code NotifyLeaderApplyRespMsg}
     *
     * <pre>
     *通知队长有人申请入队
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NotifyLeaderApplyRespMsg)
        com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.internal_static_NotifyLeaderApplyRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.internal_static_NotifyLeaderApplyRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.class, com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.newBuilder()
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
          getMemberFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (memberBuilder_ == null) {
          member_ = com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.getDefaultInstance();
        } else {
          memberBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.internal_static_NotifyLeaderApplyRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg build() {
        com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg result = new com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (memberBuilder_ == null) {
          result.member_ = member_;
        } else {
          result.member_ = memberBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg.getDefaultInstance()) return this;
        if (other.hasMember()) {
          mergeMember(other.getMember());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMember()) {
          
          return false;
        }
        if (!getMember().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.team.NotifyLeaderApplyRespProto.NotifyLeaderApplyRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg member_ = com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder> memberBuilder_;
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public boolean hasMember() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg getMember() {
        if (memberBuilder_ == null) {
          return member_;
        } else {
          return memberBuilder_.getMessage();
        }
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public Builder setMember(com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg value) {
        if (memberBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          member_ = value;
          onChanged();
        } else {
          memberBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public Builder setMember(
          com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder builderForValue) {
        if (memberBuilder_ == null) {
          member_ = builderForValue.build();
          onChanged();
        } else {
          memberBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public Builder mergeMember(com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg value) {
        if (memberBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              member_ != com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.getDefaultInstance()) {
            member_ =
              com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.newBuilder(member_).mergeFrom(value).buildPartial();
          } else {
            member_ = value;
          }
          onChanged();
        } else {
          memberBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public Builder clearMember() {
        if (memberBuilder_ == null) {
          member_ = com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.getDefaultInstance();
          onChanged();
        } else {
          memberBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder getMemberBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMemberFieldBuilder().getBuilder();
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder getMemberOrBuilder() {
        if (memberBuilder_ != null) {
          return memberBuilder_.getMessageOrBuilder();
        } else {
          return member_;
        }
      }
      /**
       * <code>required .TeamMemberInfoMsg member = 1;</code>
       *
       * <pre>
       *申请人
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder> 
          getMemberFieldBuilder() {
        if (memberBuilder_ == null) {
          memberBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsg.Builder, com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.TeamMemberInfoMsgOrBuilder>(
                  getMember(),
                  getParentForChildren(),
                  isClean());
          member_ = null;
        }
        return memberBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:NotifyLeaderApplyRespMsg)
    }

    static {
      defaultInstance = new NotifyLeaderApplyRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:NotifyLeaderApplyRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotifyLeaderApplyRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_NotifyLeaderApplyRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#team/NotifyLeaderApplyRespMsg.proto\032\034t" +
      "eam/TeamMemberInfoMsg.proto\">\n\030NotifyLea" +
      "derApplyRespMsg\022\"\n\006member\030\001 \002(\0132\022.TeamMe" +
      "mberInfoMsgBC\n%com.chuangyou.common.prot" +
      "obuf.pb.teamB\032NotifyLeaderApplyRespProto"
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
          com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.getDescriptor(),
        }, assigner);
    internal_static_NotifyLeaderApplyRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NotifyLeaderApplyRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_NotifyLeaderApplyRespMsg_descriptor,
        new java.lang.String[] { "Member", });
    com.chuangyou.common.protobuf.pb.team.TeamMemberInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}