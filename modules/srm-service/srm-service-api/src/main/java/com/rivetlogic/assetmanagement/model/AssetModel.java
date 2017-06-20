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

package com.rivetlogic.assetmanagement.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;

/**
 * The base model interface for the Asset service. Represents a row in the &quot;rivetlogic_Asset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.assetmanagement.model.impl.AssetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @see com.rivetlogic.assetmanagement.model.impl.AssetImpl
 * @see com.rivetlogic.assetmanagement.model.impl.AssetModelImpl
 * @generated
 */
@ProviderType
public interface AssetModel extends BaseModel<Asset>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset model instance should use the {@link Asset} interface instead.
	 */

	/**
	 * Returns the primary key of this asset.
	 *
	 * @return the primary key of this asset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset.
	 *
	 * @param primaryKey the primary key of this asset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this asset.
	 *
	 * @return the uuid of this asset
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this asset.
	 *
	 * @param uuid the uuid of this asset
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the asset ID of this asset.
	 *
	 * @return the asset ID of this asset
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this asset.
	 *
	 * @param assetId the asset ID of this asset
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the group ID of this asset.
	 *
	 * @return the group ID of this asset
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this asset.
	 *
	 * @param groupId the group ID of this asset
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this asset.
	 *
	 * @return the company ID of this asset
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset.
	 *
	 * @param companyId the company ID of this asset
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset.
	 *
	 * @return the user ID of this asset
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset.
	 *
	 * @param userId the user ID of this asset
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset.
	 *
	 * @return the user uuid of this asset
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this asset.
	 *
	 * @param userUuid the user uuid of this asset
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset.
	 *
	 * @return the user name of this asset
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset.
	 *
	 * @param userName the user name of this asset
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset.
	 *
	 * @return the create date of this asset
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset.
	 *
	 * @param createDate the create date of this asset
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset.
	 *
	 * @return the modified date of this asset
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset.
	 *
	 * @param modifiedDate the modified date of this asset
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this asset.
	 *
	 * @return the name of this asset
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset.
	 *
	 * @param name the name of this asset
	 */
	public void setName(String name);

	/**
	 * Returns the description of this asset.
	 *
	 * @return the description of this asset
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this asset.
	 *
	 * @param description the description of this asset
	 */
	public void setDescription(String description);

	/**
	 * Returns the location of this asset.
	 *
	 * @return the location of this asset
	 */
	public long getLocation();

	/**
	 * Sets the location of this asset.
	 *
	 * @param location the location of this asset
	 */
	public void setLocation(long location);

	/**
	 * Returns the active of this asset.
	 *
	 * @return the active of this asset
	 */
	public Boolean getActive();

	/**
	 * Sets the active of this asset.
	 *
	 * @param active the active of this asset
	 */
	public void setActive(Boolean active);

	/**
	 * Returns the category of this asset.
	 *
	 * @return the category of this asset
	 */
	public long getCategory();

	/**
	 * Sets the category of this asset.
	 *
	 * @param category the category of this asset
	 */
	public void setCategory(long category);

	/**
	 * Returns the status of this asset.
	 *
	 * @return the status of this asset
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this asset.
	 *
	 * @param status the status of this asset
	 */
	public void setStatus(String status);

	/**
	 * Returns the mime type of this asset.
	 *
	 * @return the mime type of this asset
	 */
	@AutoEscape
	public String getMimeType();

	/**
	 * Sets the mime type of this asset.
	 *
	 * @param mimeType the mime type of this asset
	 */
	public void setMimeType(String mimeType);

	/**
	 * Returns the photo of this asset.
	 *
	 * @return the photo of this asset
	 */
	public Blob getPhoto();

	/**
	 * Sets the photo of this asset.
	 *
	 * @param photo the photo of this asset
	 */
	public void setPhoto(Blob photo);

	/**
	 * Returns the current user ID of this asset.
	 *
	 * @return the current user ID of this asset
	 */
	public Long getCurrentUserId();

	/**
	 * Sets the current user ID of this asset.
	 *
	 * @param currentUserId the current user ID of this asset
	 */
	public void setCurrentUserId(Long currentUserId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Asset asset);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Asset> toCacheModel();

	@Override
	public Asset toEscapedModel();

	@Override
	public Asset toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}