// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: team/TeamUpdateLineRespMsg.proto

package com.chuangyou.common.protobuf.pb.team;

public final class TeamUpdateLineRespProto {
  private TeamUpdateLineRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TeamUpdateLineRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamUpdateLineRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 memberPlayerId = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    boolean hasMemberPlayerId();
    /**
     * <code>required int64 memberPlayerId = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    long getMemberPlayerId();

    /**
     * <code>required bool isOnline = 2;</code>
     *
     * <pre>
     *true：在线  false:离线
     * </pre>
     */
    boolean hasIsOnline();
    /**
     * <code>required bool isOnline = 2;</code>
     *
     * <pre>
     *true：在线  false:离线
     * </pre>
     */
    boolean getIsOnline();
  }
  /**
   * Protobuf type {@code TeamUpdateLineRespMsg}
   *
   * <pre>
   *队员在线状态更新
   * </pre>
   */
  public static final class TeamUpdateLineRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TeamUpdateLineRespMsg)
      TeamUpdateLineRespMsgOrBuilder {
    // Use TeamUpdateLineRespMsg.newBuilder() to construct.
    private TeamUpdateLineRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TeamUpdateLineRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TeamUpdateLineRespMsg defaultInstance;
    public static TeamUpdateLineRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public TeamUpdateLineRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TeamUpdateLineRespMsg(
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
              memberPlayerId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isOnline_ = input.readBool();
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
      return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.internal_static_TeamUpdateLineRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.internal_static_TeamUpdateLineRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.class, com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<TeamUpdateLineRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<TeamUpdateLineRespMsg>() {
      public TeamUpdateLineRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamUpdateLineRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TeamUpdateLineRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MEMBERPLAYERID_FIELD_NUMBER = 1;
    private long memberPlayerId_;
    /**
     * <code>required int64 memberPlayerId = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    public boolean hasMemberPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 memberPlayerId = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    public long getMemberPlayerId() {
      return memberPlayerId_;
    }

    public static final int ISONLINE_FIELD_NUMBER = 2;
    private boolean isOnline_;
    /**
     * <code>required bool isOnline = 2;</code>
     *
     * <pre>
     *true：在线  false:离线
     * </pre>
     */
    public boolean hasIsOnline() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool isOnline = 2;</code>
     *
     * <pre>
     *true：在线  false:离线
     * </pre>
     */
    public boolean getIsOnline() {
      return isOnline_;
    }

    private void initFields() {
      memberPlayerId_ = 0L;
      isOnline_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMemberPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsOnline()) {
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
        output.writeInt64(1, memberPlayerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isOnline_);
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
          .computeInt64Size(1, memberPlayerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOnline_);
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

    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg prototype) {
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
     * Protobuf type {@code TeamUpdateLineRespMsg}
     *
     * <pre>
     *队员在线状态更新
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamUpdateLineRespMsg)
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.internal_static_TeamUpdateLineRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.internal_static_TeamUpdateLineRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.class, com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.newBuilder()
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
        memberPlayerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        isOnline_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.internal_static_TeamUpdateLineRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg build() {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg result = new com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.memberPlayerId_ = memberPlayerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isOnline_ = isOnline_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg.getDefaultInstance()) return this;
        if (other.hasMemberPlayerId()) {
          setMemberPlayerId(other.getMemberPlayerId());
        }
        if (other.hasIsOnline()) {
          setIsOnline(other.getIsOnline());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMemberPlayerId()) {
          
          return false;
        }
        if (!hasIsOnline()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.team.TeamUpdateLineRespProto.TeamUpdateLineRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long memberPlayerId_ ;
      /**
       * <code>required int64 memberPlayerId = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public boolean hasMemberPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 memberPlayerId = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public long getMemberPlayerId() {
        return memberPlayerId_;
      }
      /**
       * <code>required int64 memberPlayerId = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public Builder setMemberPlayerId(long value) {
        bitField0_ |= 0x00000001;
        memberPlayerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 memberPlayerId = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public Builder clearMemberPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        memberPlayerId_ = 0L;
        onChanged();
        return this;
      }

      private boolean isOnline_ ;
      /**
       * <code>required bool isOnline = 2;</code>
       *
       * <pre>
       *true：在线  false:离线
       * </pre>
       */
      public boolean hasIsOnline() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool isOnline = 2;</code>
       *
       * <pre>
       *true：在线  false:离线
       * </pre>
       */
      public boolean getIsOnline() {
        return isOnline_;
      }
      /**
       * <code>required bool isOnline = 2;</code>
       *
       * <pre>
       *true：在线  false:离线
       * </pre>
       */
      public Builder setIsOnline(boolean value) {
        bitField0_ |= 0x00000002;
        isOnline_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isOnline = 2;</code>
       *
       * <pre>
       *true：在线  false:离线
       * </pre>
       */
      public Builder clearIsOnline() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isOnline_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TeamUpdateLineRespMsg)
    }

    static {
      defaultInstance = new TeamUpdateLineRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TeamUpdateLineRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamUpdateLineRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TeamUpdateLineRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n team/TeamUpdateLineRespMsg.proto\"A\n\025Te" +
      "amUpdateLineRespMsg\022\026\n\016memberPlayerId\030\001 " +
      "\002(\003\022\020\n\010isOnline\030\002 \002(\010B@\n%com.chuangyou.c" +
      "ommon.protobuf.pb.teamB\027TeamUpdateLineRe" +
      "spProto"
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
    internal_static_TeamUpdateLineRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamUpdateLineRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TeamUpdateLineRespMsg_descriptor,
        new java.lang.String[] { "MemberPlayerId", "IsOnline", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
