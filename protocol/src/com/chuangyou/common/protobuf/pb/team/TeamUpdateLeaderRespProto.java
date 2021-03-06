// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: team/TeamUpdateLeaderRespMsg.proto

package com.chuangyou.common.protobuf.pb.team;

public final class TeamUpdateLeaderRespProto {
  private TeamUpdateLeaderRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TeamUpdateLeaderRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamUpdateLeaderRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 newLeader = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    boolean hasNewLeader();
    /**
     * <code>required int64 newLeader = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    long getNewLeader();

    /**
     * <code>required int32 teamId = 2;</code>
     *
     * <pre>
     *队伍ID
     * </pre>
     */
    boolean hasTeamId();
    /**
     * <code>required int32 teamId = 2;</code>
     *
     * <pre>
     *队伍ID
     * </pre>
     */
    int getTeamId();
  }
  /**
   * Protobuf type {@code TeamUpdateLeaderRespMsg}
   *
   * <pre>
   *队长变更
   * </pre>
   */
  public static final class TeamUpdateLeaderRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TeamUpdateLeaderRespMsg)
      TeamUpdateLeaderRespMsgOrBuilder {
    // Use TeamUpdateLeaderRespMsg.newBuilder() to construct.
    private TeamUpdateLeaderRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TeamUpdateLeaderRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TeamUpdateLeaderRespMsg defaultInstance;
    public static TeamUpdateLeaderRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public TeamUpdateLeaderRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TeamUpdateLeaderRespMsg(
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
              newLeader_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              teamId_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.internal_static_TeamUpdateLeaderRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.internal_static_TeamUpdateLeaderRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.class, com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<TeamUpdateLeaderRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<TeamUpdateLeaderRespMsg>() {
      public TeamUpdateLeaderRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamUpdateLeaderRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TeamUpdateLeaderRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NEWLEADER_FIELD_NUMBER = 1;
    private long newLeader_;
    /**
     * <code>required int64 newLeader = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    public boolean hasNewLeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 newLeader = 1;</code>
     *
     * <pre>
     *新队长ID
     * </pre>
     */
    public long getNewLeader() {
      return newLeader_;
    }

    public static final int TEAMID_FIELD_NUMBER = 2;
    private int teamId_;
    /**
     * <code>required int32 teamId = 2;</code>
     *
     * <pre>
     *队伍ID
     * </pre>
     */
    public boolean hasTeamId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 teamId = 2;</code>
     *
     * <pre>
     *队伍ID
     * </pre>
     */
    public int getTeamId() {
      return teamId_;
    }

    private void initFields() {
      newLeader_ = 0L;
      teamId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNewLeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTeamId()) {
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
        output.writeInt64(1, newLeader_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, teamId_);
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
          .computeInt64Size(1, newLeader_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, teamId_);
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

    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg prototype) {
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
     * Protobuf type {@code TeamUpdateLeaderRespMsg}
     *
     * <pre>
     *队长变更
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamUpdateLeaderRespMsg)
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.internal_static_TeamUpdateLeaderRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.internal_static_TeamUpdateLeaderRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.class, com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.newBuilder()
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
        newLeader_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        teamId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.internal_static_TeamUpdateLeaderRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg build() {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg result = new com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.newLeader_ = newLeader_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.teamId_ = teamId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg.getDefaultInstance()) return this;
        if (other.hasNewLeader()) {
          setNewLeader(other.getNewLeader());
        }
        if (other.hasTeamId()) {
          setTeamId(other.getTeamId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasNewLeader()) {
          
          return false;
        }
        if (!hasTeamId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.team.TeamUpdateLeaderRespProto.TeamUpdateLeaderRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long newLeader_ ;
      /**
       * <code>required int64 newLeader = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public boolean hasNewLeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 newLeader = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public long getNewLeader() {
        return newLeader_;
      }
      /**
       * <code>required int64 newLeader = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public Builder setNewLeader(long value) {
        bitField0_ |= 0x00000001;
        newLeader_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 newLeader = 1;</code>
       *
       * <pre>
       *新队长ID
       * </pre>
       */
      public Builder clearNewLeader() {
        bitField0_ = (bitField0_ & ~0x00000001);
        newLeader_ = 0L;
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>required int32 teamId = 2;</code>
       *
       * <pre>
       *队伍ID
       * </pre>
       */
      public boolean hasTeamId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 teamId = 2;</code>
       *
       * <pre>
       *队伍ID
       * </pre>
       */
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>required int32 teamId = 2;</code>
       *
       * <pre>
       *队伍ID
       * </pre>
       */
      public Builder setTeamId(int value) {
        bitField0_ |= 0x00000002;
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 teamId = 2;</code>
       *
       * <pre>
       *队伍ID
       * </pre>
       */
      public Builder clearTeamId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        teamId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TeamUpdateLeaderRespMsg)
    }

    static {
      defaultInstance = new TeamUpdateLeaderRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TeamUpdateLeaderRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamUpdateLeaderRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TeamUpdateLeaderRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"team/TeamUpdateLeaderRespMsg.proto\"<\n\027" +
      "TeamUpdateLeaderRespMsg\022\021\n\tnewLeader\030\001 \002" +
      "(\003\022\016\n\006teamId\030\002 \002(\005BB\n%com.chuangyou.comm" +
      "on.protobuf.pb.teamB\031TeamUpdateLeaderRes" +
      "pProto"
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
    internal_static_TeamUpdateLeaderRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamUpdateLeaderRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TeamUpdateLeaderRespMsg_descriptor,
        new java.lang.String[] { "NewLeader", "TeamId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
