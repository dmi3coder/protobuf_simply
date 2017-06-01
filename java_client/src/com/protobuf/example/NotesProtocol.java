// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notes.proto

package com.protobuf.example;

public final class NotesProtocol {
  private NotesProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code protocol.NoteType}
   */
  public enum NoteType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BASIC = 0;</code>
     */
    BASIC(0),
    /**
     * <code>REMINDER = 1;</code>
     */
    REMINDER(1),
    /**
     * <code>SCRATCH = 2;</code>
     */
    SCRATCH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BASIC = 0;</code>
     */
    public static final int BASIC_VALUE = 0;
    /**
     * <code>REMINDER = 1;</code>
     */
    public static final int REMINDER_VALUE = 1;
    /**
     * <code>SCRATCH = 2;</code>
     */
    public static final int SCRATCH_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NoteType valueOf(int value) {
      return forNumber(value);
    }

    public static NoteType forNumber(int value) {
      switch (value) {
        case 0: return BASIC;
        case 1: return REMINDER;
        case 2: return SCRATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NoteType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NoteType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NoteType>() {
            public NoteType findValueByNumber(int number) {
              return NoteType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.protobuf.example.NotesProtocol.getDescriptor().getEnumTypes().get(0);
    }

    private static final NoteType[] VALUES = values();

    public static NoteType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NoteType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.NoteType)
  }

  public interface NoteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.Note)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int64 time = 3;</code>
     */
    long getTime();

    /**
     * <code>string content = 5;</code>
     */
    java.lang.String getContent();
    /**
     * <code>string content = 5;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>.protocol.NoteType type = 4;</code>
     */
    int getTypeValue();
    /**
     * <code>.protocol.NoteType type = 4;</code>
     */
    com.protobuf.example.NotesProtocol.NoteType getType();
  }
  /**
   * Protobuf type {@code protocol.Note}
   */
  public  static final class Note extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.Note)
      NoteOrBuilder {
    // Use Note.newBuilder() to construct.
    private Note(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Note() {
      id_ = 0;
      name_ = "";
      time_ = 0L;
      content_ = "";
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Note(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 24: {

              time_ = input.readInt64();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.protobuf.example.NotesProtocol.internal_static_protocol_Note_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.protobuf.example.NotesProtocol.internal_static_protocol_Note_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.protobuf.example.NotesProtocol.Note.class, com.protobuf.example.NotesProtocol.Note.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 3;
    private long time_;
    /**
     * <code>int64 time = 3;</code>
     */
    public long getTime() {
      return time_;
    }

    public static final int CONTENT_FIELD_NUMBER = 5;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 5;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 5;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>.protocol.NoteType type = 4;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.protocol.NoteType type = 4;</code>
     */
    public com.protobuf.example.NotesProtocol.NoteType getType() {
      com.protobuf.example.NotesProtocol.NoteType result = com.protobuf.example.NotesProtocol.NoteType.valueOf(type_);
      return result == null ? com.protobuf.example.NotesProtocol.NoteType.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (time_ != 0L) {
        output.writeInt64(3, time_);
      }
      if (type_ != com.protobuf.example.NotesProtocol.NoteType.BASIC.getNumber()) {
        output.writeEnum(4, type_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, content_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, time_);
      }
      if (type_ != com.protobuf.example.NotesProtocol.NoteType.BASIC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, content_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.protobuf.example.NotesProtocol.Note)) {
        return super.equals(obj);
      }
      com.protobuf.example.NotesProtocol.Note other = (com.protobuf.example.NotesProtocol.Note) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && getName()
          .equals(other.getName());
      result = result && (getTime()
          == other.getTime());
      result = result && getContent()
          .equals(other.getContent());
      result = result && type_ == other.type_;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.protobuf.example.NotesProtocol.Note parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.protobuf.example.NotesProtocol.Note parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.protobuf.example.NotesProtocol.Note parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.protobuf.example.NotesProtocol.Note prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.Note}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.Note)
        com.protobuf.example.NotesProtocol.NoteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.protobuf.example.NotesProtocol.internal_static_protocol_Note_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.protobuf.example.NotesProtocol.internal_static_protocol_Note_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.protobuf.example.NotesProtocol.Note.class, com.protobuf.example.NotesProtocol.Note.Builder.class);
      }

      // Construct using com.protobuf.example.NotesProtocol.Note.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = 0;

        name_ = "";

        time_ = 0L;

        content_ = "";

        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.protobuf.example.NotesProtocol.internal_static_protocol_Note_descriptor;
      }

      public com.protobuf.example.NotesProtocol.Note getDefaultInstanceForType() {
        return com.protobuf.example.NotesProtocol.Note.getDefaultInstance();
      }

      public com.protobuf.example.NotesProtocol.Note build() {
        com.protobuf.example.NotesProtocol.Note result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.protobuf.example.NotesProtocol.Note buildPartial() {
        com.protobuf.example.NotesProtocol.Note result = new com.protobuf.example.NotesProtocol.Note(this);
        result.id_ = id_;
        result.name_ = name_;
        result.time_ = time_;
        result.content_ = content_;
        result.type_ = type_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.protobuf.example.NotesProtocol.Note) {
          return mergeFrom((com.protobuf.example.NotesProtocol.Note)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.protobuf.example.NotesProtocol.Note other) {
        if (other == com.protobuf.example.NotesProtocol.Note.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.protobuf.example.NotesProtocol.Note parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.protobuf.example.NotesProtocol.Note) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <code>int64 time = 3;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>int64 time = 3;</code>
       */
      public Builder setTime(long value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 time = 3;</code>
       */
      public Builder clearTime() {
        
        time_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 5;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 5;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 5;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.protocol.NoteType type = 4;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.protocol.NoteType type = 4;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.protocol.NoteType type = 4;</code>
       */
      public com.protobuf.example.NotesProtocol.NoteType getType() {
        com.protobuf.example.NotesProtocol.NoteType result = com.protobuf.example.NotesProtocol.NoteType.valueOf(type_);
        return result == null ? com.protobuf.example.NotesProtocol.NoteType.UNRECOGNIZED : result;
      }
      /**
       * <code>.protocol.NoteType type = 4;</code>
       */
      public Builder setType(com.protobuf.example.NotesProtocol.NoteType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.protocol.NoteType type = 4;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protocol.Note)
    }

    // @@protoc_insertion_point(class_scope:protocol.Note)
    private static final com.protobuf.example.NotesProtocol.Note DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.protobuf.example.NotesProtocol.Note();
    }

    public static com.protobuf.example.NotesProtocol.Note getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Note>
        PARSER = new com.google.protobuf.AbstractParser<Note>() {
      public Note parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Note(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Note> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Note> getParserForType() {
      return PARSER;
    }

    public com.protobuf.example.NotesProtocol.Note getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_Note_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_Note_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013notes.proto\022\010protocol\"a\n\004Note\022\n\n\002id\030\001 " +
      "\001(\005\022\014\n\004name\030\002 \001(\t\022\014\n\004time\030\003 \001(\003\022\017\n\007conte" +
      "nt\030\005 \001(\t\022 \n\004type\030\004 \001(\0162\022.protocol.NoteTy" +
      "pe*0\n\010NoteType\022\t\n\005BASIC\020\000\022\014\n\010REMINDER\020\001\022" +
      "\013\n\007SCRATCH\020\002B%\n\024com.protobuf.exampleB\rNo" +
      "tesProtocolb\006proto3"
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
    internal_static_protocol_Note_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_Note_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_Note_descriptor,
        new java.lang.String[] { "Id", "Name", "Time", "Content", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}