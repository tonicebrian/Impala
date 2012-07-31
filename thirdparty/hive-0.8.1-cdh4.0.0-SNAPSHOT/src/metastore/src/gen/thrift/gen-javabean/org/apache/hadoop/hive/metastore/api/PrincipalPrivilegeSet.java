/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrincipalPrivilegeSet implements org.apache.thrift.TBase<PrincipalPrivilegeSet, PrincipalPrivilegeSet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrincipalPrivilegeSet");

  private static final org.apache.thrift.protocol.TField USER_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("userPrivileges", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("groupPrivileges", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("rolePrivileges", org.apache.thrift.protocol.TType.MAP, (short)3);

  private Map<String,List<PrivilegeGrantInfo>> userPrivileges; // required
  private Map<String,List<PrivilegeGrantInfo>> groupPrivileges; // required
  private Map<String,List<PrivilegeGrantInfo>> rolePrivileges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_PRIVILEGES((short)1, "userPrivileges"),
    GROUP_PRIVILEGES((short)2, "groupPrivileges"),
    ROLE_PRIVILEGES((short)3, "rolePrivileges");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_PRIVILEGES
          return USER_PRIVILEGES;
        case 2: // GROUP_PRIVILEGES
          return GROUP_PRIVILEGES;
        case 3: // ROLE_PRIVILEGES
          return ROLE_PRIVILEGES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("userPrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    tmpMap.put(_Fields.GROUP_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("groupPrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    tmpMap.put(_Fields.ROLE_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("rolePrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrincipalPrivilegeSet.class, metaDataMap);
  }

  public PrincipalPrivilegeSet() {
  }

  public PrincipalPrivilegeSet(
    Map<String,List<PrivilegeGrantInfo>> userPrivileges,
    Map<String,List<PrivilegeGrantInfo>> groupPrivileges,
    Map<String,List<PrivilegeGrantInfo>> rolePrivileges)
  {
    this();
    this.userPrivileges = userPrivileges;
    this.groupPrivileges = groupPrivileges;
    this.rolePrivileges = rolePrivileges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrincipalPrivilegeSet(PrincipalPrivilegeSet other) {
    if (other.isSetUserPrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.userPrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__userPrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__userPrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>();
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__userPrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__userPrivileges.put(__this__userPrivileges_copy_key, __this__userPrivileges_copy_value);
      }
      this.userPrivileges = __this__userPrivileges;
    }
    if (other.isSetGroupPrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.groupPrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__groupPrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__groupPrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>();
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__groupPrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__groupPrivileges.put(__this__groupPrivileges_copy_key, __this__groupPrivileges_copy_value);
      }
      this.groupPrivileges = __this__groupPrivileges;
    }
    if (other.isSetRolePrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.rolePrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__rolePrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__rolePrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>();
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__rolePrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__rolePrivileges.put(__this__rolePrivileges_copy_key, __this__rolePrivileges_copy_value);
      }
      this.rolePrivileges = __this__rolePrivileges;
    }
  }

  public PrincipalPrivilegeSet deepCopy() {
    return new PrincipalPrivilegeSet(this);
  }

  @Override
  public void clear() {
    this.userPrivileges = null;
    this.groupPrivileges = null;
    this.rolePrivileges = null;
  }

  public int getUserPrivilegesSize() {
    return (this.userPrivileges == null) ? 0 : this.userPrivileges.size();
  }

  public void putToUserPrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.userPrivileges == null) {
      this.userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.userPrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getUserPrivileges() {
    return this.userPrivileges;
  }

  public void setUserPrivileges(Map<String,List<PrivilegeGrantInfo>> userPrivileges) {
    this.userPrivileges = userPrivileges;
  }

  public void unsetUserPrivileges() {
    this.userPrivileges = null;
  }

  /** Returns true if field userPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetUserPrivileges() {
    return this.userPrivileges != null;
  }

  public void setUserPrivilegesIsSet(boolean value) {
    if (!value) {
      this.userPrivileges = null;
    }
  }

  public int getGroupPrivilegesSize() {
    return (this.groupPrivileges == null) ? 0 : this.groupPrivileges.size();
  }

  public void putToGroupPrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.groupPrivileges == null) {
      this.groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.groupPrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getGroupPrivileges() {
    return this.groupPrivileges;
  }

  public void setGroupPrivileges(Map<String,List<PrivilegeGrantInfo>> groupPrivileges) {
    this.groupPrivileges = groupPrivileges;
  }

  public void unsetGroupPrivileges() {
    this.groupPrivileges = null;
  }

  /** Returns true if field groupPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupPrivileges() {
    return this.groupPrivileges != null;
  }

  public void setGroupPrivilegesIsSet(boolean value) {
    if (!value) {
      this.groupPrivileges = null;
    }
  }

  public int getRolePrivilegesSize() {
    return (this.rolePrivileges == null) ? 0 : this.rolePrivileges.size();
  }

  public void putToRolePrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.rolePrivileges == null) {
      this.rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.rolePrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getRolePrivileges() {
    return this.rolePrivileges;
  }

  public void setRolePrivileges(Map<String,List<PrivilegeGrantInfo>> rolePrivileges) {
    this.rolePrivileges = rolePrivileges;
  }

  public void unsetRolePrivileges() {
    this.rolePrivileges = null;
  }

  /** Returns true if field rolePrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetRolePrivileges() {
    return this.rolePrivileges != null;
  }

  public void setRolePrivilegesIsSet(boolean value) {
    if (!value) {
      this.rolePrivileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_PRIVILEGES:
      if (value == null) {
        unsetUserPrivileges();
      } else {
        setUserPrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    case GROUP_PRIVILEGES:
      if (value == null) {
        unsetGroupPrivileges();
      } else {
        setGroupPrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    case ROLE_PRIVILEGES:
      if (value == null) {
        unsetRolePrivileges();
      } else {
        setRolePrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_PRIVILEGES:
      return getUserPrivileges();

    case GROUP_PRIVILEGES:
      return getGroupPrivileges();

    case ROLE_PRIVILEGES:
      return getRolePrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_PRIVILEGES:
      return isSetUserPrivileges();
    case GROUP_PRIVILEGES:
      return isSetGroupPrivileges();
    case ROLE_PRIVILEGES:
      return isSetRolePrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrincipalPrivilegeSet)
      return this.equals((PrincipalPrivilegeSet)that);
    return false;
  }

  public boolean equals(PrincipalPrivilegeSet that) {
    if (that == null)
      return false;

    boolean this_present_userPrivileges = true && this.isSetUserPrivileges();
    boolean that_present_userPrivileges = true && that.isSetUserPrivileges();
    if (this_present_userPrivileges || that_present_userPrivileges) {
      if (!(this_present_userPrivileges && that_present_userPrivileges))
        return false;
      if (!this.userPrivileges.equals(that.userPrivileges))
        return false;
    }

    boolean this_present_groupPrivileges = true && this.isSetGroupPrivileges();
    boolean that_present_groupPrivileges = true && that.isSetGroupPrivileges();
    if (this_present_groupPrivileges || that_present_groupPrivileges) {
      if (!(this_present_groupPrivileges && that_present_groupPrivileges))
        return false;
      if (!this.groupPrivileges.equals(that.groupPrivileges))
        return false;
    }

    boolean this_present_rolePrivileges = true && this.isSetRolePrivileges();
    boolean that_present_rolePrivileges = true && that.isSetRolePrivileges();
    if (this_present_rolePrivileges || that_present_rolePrivileges) {
      if (!(this_present_rolePrivileges && that_present_rolePrivileges))
        return false;
      if (!this.rolePrivileges.equals(that.rolePrivileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PrincipalPrivilegeSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PrincipalPrivilegeSet typedOther = (PrincipalPrivilegeSet)other;

    lastComparison = Boolean.valueOf(isSetUserPrivileges()).compareTo(typedOther.isSetUserPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userPrivileges, typedOther.userPrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupPrivileges()).compareTo(typedOther.isSetGroupPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupPrivileges, typedOther.groupPrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRolePrivileges()).compareTo(typedOther.isSetRolePrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRolePrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rolePrivileges, typedOther.rolePrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // USER_PRIVILEGES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
              this.userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map12.size);
              for (int _i13 = 0; _i13 < _map12.size; ++_i13)
              {
                String _key14; // required
                List<PrivilegeGrantInfo> _val15; // required
                _key14 = iprot.readString();
                {
                  org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                  _val15 = new ArrayList<PrivilegeGrantInfo>(_list16.size);
                  for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                  {
                    PrivilegeGrantInfo _elem18; // required
                    _elem18 = new PrivilegeGrantInfo();
                    _elem18.read(iprot);
                    _val15.add(_elem18);
                  }
                  iprot.readListEnd();
                }
                this.userPrivileges.put(_key14, _val15);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // GROUP_PRIVILEGES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map19 = iprot.readMapBegin();
              this.groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map19.size);
              for (int _i20 = 0; _i20 < _map19.size; ++_i20)
              {
                String _key21; // required
                List<PrivilegeGrantInfo> _val22; // required
                _key21 = iprot.readString();
                {
                  org.apache.thrift.protocol.TList _list23 = iprot.readListBegin();
                  _val22 = new ArrayList<PrivilegeGrantInfo>(_list23.size);
                  for (int _i24 = 0; _i24 < _list23.size; ++_i24)
                  {
                    PrivilegeGrantInfo _elem25; // required
                    _elem25 = new PrivilegeGrantInfo();
                    _elem25.read(iprot);
                    _val22.add(_elem25);
                  }
                  iprot.readListEnd();
                }
                this.groupPrivileges.put(_key21, _val22);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ROLE_PRIVILEGES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map26 = iprot.readMapBegin();
              this.rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map26.size);
              for (int _i27 = 0; _i27 < _map26.size; ++_i27)
              {
                String _key28; // required
                List<PrivilegeGrantInfo> _val29; // required
                _key28 = iprot.readString();
                {
                  org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                  _val29 = new ArrayList<PrivilegeGrantInfo>(_list30.size);
                  for (int _i31 = 0; _i31 < _list30.size; ++_i31)
                  {
                    PrivilegeGrantInfo _elem32; // required
                    _elem32 = new PrivilegeGrantInfo();
                    _elem32.read(iprot);
                    _val29.add(_elem32);
                  }
                  iprot.readListEnd();
                }
                this.rolePrivileges.put(_key28, _val29);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.userPrivileges != null) {
      oprot.writeFieldBegin(USER_PRIVILEGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, this.userPrivileges.size()));
        for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter33 : this.userPrivileges.entrySet())
        {
          oprot.writeString(_iter33.getKey());
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter33.getValue().size()));
            for (PrivilegeGrantInfo _iter34 : _iter33.getValue())
            {
              _iter34.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.groupPrivileges != null) {
      oprot.writeFieldBegin(GROUP_PRIVILEGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, this.groupPrivileges.size()));
        for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter35 : this.groupPrivileges.entrySet())
        {
          oprot.writeString(_iter35.getKey());
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter35.getValue().size()));
            for (PrivilegeGrantInfo _iter36 : _iter35.getValue())
            {
              _iter36.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.rolePrivileges != null) {
      oprot.writeFieldBegin(ROLE_PRIVILEGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, this.rolePrivileges.size()));
        for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter37 : this.rolePrivileges.entrySet())
        {
          oprot.writeString(_iter37.getKey());
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter37.getValue().size()));
            for (PrivilegeGrantInfo _iter38 : _iter37.getValue())
            {
              _iter38.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PrincipalPrivilegeSet(");
    boolean first = true;

    sb.append("userPrivileges:");
    if (this.userPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.userPrivileges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupPrivileges:");
    if (this.groupPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.groupPrivileges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rolePrivileges:");
    if (this.rolePrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.rolePrivileges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
