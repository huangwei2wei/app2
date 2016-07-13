// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: team/ChangeLeaderReqMsg.proto

package com.chuangyou.common.protobuf.pb.team;

public final class ChangeLeaderReqProto {
  private ChangeLeaderReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChangeLeaderReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeLeaderReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 newLeaderId = 1;</code>
     *
     * <pre>
     *新队长playerID
     * </pre>
     */
    boolean hasNewLeaderId();
    /**
     * <code>required int64 newLeaderId = 1;</code>
     *
     * <pre>
     *新队长playerID
     * </pre>
     */
    long getNewLeaderId();
  }
  /**
   * Protobuf type {@code ChangeLeaderReqMsg}
   *
   * <pre>
   *队长主动移交自己队长的职位
   * </pre>
   */
  public static final class ChangeLeaderReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ChangeLeaderReqMsg)
      ChangeLeaderReqMsgOrBuilder {
    // Use ChangeLeaderReqMsg.newBuilder() to construct.
    private ChangeLeaderReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChangeLeaderReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChangeLeaderReqMsg defaultInstance;
    public static ChangeLeaderReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ChangeLeaderReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeLeaderReqMsg(
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
              newLeaderId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.internal_static_ChangeLeaderReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.internal_static_ChangeLeaderReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.class, com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ChangeLeaderReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<ChangeLeaderReqMsg>() {
      public ChangeLeaderReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeLeaderReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeLeaderReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NEWLEADERID_FIELD_NUMBER = 1;
    private long newLeaderId_;
    /**
     * <code>required int64 newLeaderId = 1;</code>
     *
     * <pre>
     *新队长playerID
     * </pre>
     */
    public boolean hasNewLeaderId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 newLeaderId = 1;</code>
     *
     * <pre>
     *新队长playerID
     * </pre>
     */
    public long getNewLeaderId() {
      return newLeaderId_;
    }

    private void initFields() {
      newLeaderId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNewLeaderId()) {
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
        output.writeInt64(1, newLeaderId_);
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
          .computeInt64Size(1, newLeaderId_);
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

    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg prototype) {
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
     * Protobuf type {@code ChangeLeaderReqMsg}
     *
     * <pre>
     *队长主动移交自己队长的职位
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeLeaderReqMsg)
        com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.internal_static_ChangeLeaderReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.internal_static_ChangeLeaderReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.class, com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.newBuilder()
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
        newLeaderId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.internal_static_ChangeLeaderReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg build() {
        com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg result = new com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.newLeaderId_ = newLeaderId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg.getDefaultInstance()) return this;
        if (other.hasNewLeaderId()) {
          setNewLeaderId(other.getNewLeaderId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasNewLeaderId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.team.ChangeLeaderReqProto.ChangeLeaderReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long newLeaderId_ ;
      /**
       * <code>required int64 newLeaderId = 1;</code>
       *
       * <pre>
       *新队长playerID
       * </pre>
       */
      public boolean hasNewLeaderId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 newLeaderId = 1;</code>
       *
       * <pre>
       *新队长playerID
       * </pre>
       */
      public long getNewLeaderId() {
        return newLeaderId_;
      }
      /**
       * <code>required int64 newLeaderId = 1;</code>
       *
       * <pre>
       *新队长playerID
       * </pre>
       */
      public Builder setNewLeaderId(long value) {
        bitField0_ |= 0x00000001;
        newLeaderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 newLeaderId = 1;</code>
       *
       * <pre>
       *新队长playerID
       * </pre>
       */
      public Builder clearNewLeaderId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        newLeaderId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ChangeLeaderReqMsg)
    }

    static {
      defaultInstance = new ChangeLeaderReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ChangeLeaderReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeLeaderReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChangeLeaderReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035team/ChangeLeaderReqMsg.proto\")\n\022Chang" +
      "eLeaderReqMsg\022\023\n\013newLeaderId\030\001 \002(\003B=\n%co" +
      "m.chuangyou.common.protobuf.pb.teamB\024Cha" +
      "ngeLeaderReqProto"
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
    internal_static_ChangeLeaderReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeLeaderReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChangeLeaderReqMsg_descriptor,
        new java.lang.String[] { "NewLeaderId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}