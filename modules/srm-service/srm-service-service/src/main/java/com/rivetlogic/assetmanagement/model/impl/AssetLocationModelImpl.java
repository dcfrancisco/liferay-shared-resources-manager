/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.assetmanagement.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rivetlogic.assetmanagement.model.AssetLocation;
import com.rivetlogic.assetmanagement.model.AssetLocationModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AssetLocation service. Represents a row in the &quot;rivetlogic_AssetLocation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AssetLocationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetLocationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocationImpl
 * @see AssetLocation
 * @see AssetLocationModel
 * @generated
 */
@ProviderType
public class AssetLocationModelImpl extends BaseModelImpl<AssetLocation>
	implements AssetLocationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset location model instance should use the {@link AssetLocation} interface instead.
	 */
	public static final String TABLE_NAME = "rivetlogic_AssetLocation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "assetLocationId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assetLocationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table rivetlogic_AssetLocation (uuid_ VARCHAR(75) null,assetLocationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,name VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table rivetlogic_AssetLocation";
	public static final String ORDER_BY_JPQL = " ORDER BY assetLocation.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rivetlogic_AssetLocation.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(srm.service.com.rivetlogic.assetmanagement.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rivetlogic.assetmanagement.model.AssetLocation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(srm.service.com.rivetlogic.assetmanagement.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rivetlogic.assetmanagement.model.AssetLocation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(srm.service.com.rivetlogic.assetmanagement.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rivetlogic.assetmanagement.model.AssetLocation"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long USERID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long NAME_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(srm.service.com.rivetlogic.assetmanagement.service.util.ServiceProps.get(
				"lock.expiration.time.com.rivetlogic.assetmanagement.model.AssetLocation"));

	public AssetLocationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _assetLocationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetLocationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetLocationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AssetLocation.class;
	}

	@Override
	public String getModelClassName() {
		return AssetLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetLocationId", getAssetLocationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetLocationId = (Long)attributes.get("assetLocationId");

		if (assetLocationId != null) {
			setAssetLocationId(assetLocationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getAssetLocationId() {
		return _assetLocationId;
	}

	@Override
	public void setAssetLocationId(long assetLocationId) {
		_assetLocationId = assetLocationId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			AssetLocation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssetLocation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssetLocation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssetLocationImpl assetLocationImpl = new AssetLocationImpl();

		assetLocationImpl.setUuid(getUuid());
		assetLocationImpl.setAssetLocationId(getAssetLocationId());
		assetLocationImpl.setGroupId(getGroupId());
		assetLocationImpl.setCompanyId(getCompanyId());
		assetLocationImpl.setUserId(getUserId());
		assetLocationImpl.setUserName(getUserName());
		assetLocationImpl.setCreateDate(getCreateDate());
		assetLocationImpl.setName(getName());
		assetLocationImpl.setDescription(getDescription());

		assetLocationImpl.resetOriginalValues();

		return assetLocationImpl;
	}

	@Override
	public int compareTo(AssetLocation assetLocation) {
		int value = 0;

		value = getName().compareTo(assetLocation.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLocation)) {
			return false;
		}

		AssetLocation assetLocation = (AssetLocation)obj;

		long primaryKey = assetLocation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AssetLocationModelImpl assetLocationModelImpl = this;

		assetLocationModelImpl._originalUuid = assetLocationModelImpl._uuid;

		assetLocationModelImpl._originalGroupId = assetLocationModelImpl._groupId;

		assetLocationModelImpl._setOriginalGroupId = false;

		assetLocationModelImpl._originalCompanyId = assetLocationModelImpl._companyId;

		assetLocationModelImpl._setOriginalCompanyId = false;

		assetLocationModelImpl._originalUserId = assetLocationModelImpl._userId;

		assetLocationModelImpl._setOriginalUserId = false;

		assetLocationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssetLocation> toCacheModel() {
		AssetLocationCacheModel assetLocationCacheModel = new AssetLocationCacheModel();

		assetLocationCacheModel.uuid = getUuid();

		String uuid = assetLocationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			assetLocationCacheModel.uuid = null;
		}

		assetLocationCacheModel.assetLocationId = getAssetLocationId();

		assetLocationCacheModel.groupId = getGroupId();

		assetLocationCacheModel.companyId = getCompanyId();

		assetLocationCacheModel.userId = getUserId();

		assetLocationCacheModel.userName = getUserName();

		String userName = assetLocationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			assetLocationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			assetLocationCacheModel.createDate = createDate.getTime();
		}
		else {
			assetLocationCacheModel.createDate = Long.MIN_VALUE;
		}

		assetLocationCacheModel.name = getName();

		String name = assetLocationCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			assetLocationCacheModel.name = null;
		}

		assetLocationCacheModel.description = getDescription();

		String description = assetLocationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			assetLocationCacheModel.description = null;
		}

		return assetLocationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assetLocationId=");
		sb.append(getAssetLocationId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.assetmanagement.model.AssetLocation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetLocationId</column-name><column-value><![CDATA[");
		sb.append(getAssetLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AssetLocation.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AssetLocation.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _assetLocationId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private String _name;
	private String _description;
	private long _columnBitmask;
	private AssetLocation _escapedModel;
}